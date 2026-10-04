package taco_cloud.data;

import org.springframework.data.repository.CrudRepository;

import taco_cloud.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
