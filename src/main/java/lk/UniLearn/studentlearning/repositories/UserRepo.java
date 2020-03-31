package lk.UniLearn.studentlearning.repositories;

import lk.UniLearn.studentlearning.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,String>{

    User findByUserId(String userId);
}
