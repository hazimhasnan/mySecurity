package github.hazimhasnan.myHelp.repository;

import github.hazimhasnan.myHelp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> { //The second generic argument is the type of our entity ID

    public UserEntity findByName(String name);

    // can use jpql if we disable the nativeQuery
    @Query(value = "select * from users where users.id = %?1", nativeQuery = true)
    public UserEntity findByIdNative(Long id);
}
