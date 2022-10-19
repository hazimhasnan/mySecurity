package github.hazimhasnan.myHelp.repository;

import github.hazimhasnan.myHelp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> { //The second generic argument is the type of our entity ID
}
