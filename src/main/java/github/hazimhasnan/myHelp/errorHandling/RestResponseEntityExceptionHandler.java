package github.hazimhasnan.myHelp.errorHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    /***
     *
     * @param exception
     * @param webRequest
     * @return ResponseEntity
     *
     * General error handling
     */
    @ExceptionHandler
    public ResponseEntity<ErrorMessage> restControllerException(Exception exception, WebRequest webRequest) {
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(errorMessage);
    }

    /***
     *
     * @param userNotFoundException
     * @param webRequest
     * @return
     */
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorMessage> departmentNotFoundException(UserNotFoundException userNotFoundException, WebRequest webRequest) {

        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, userNotFoundException.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(errorMessage);
    }
}
