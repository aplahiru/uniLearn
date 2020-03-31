package lk.UniLearn.studentlearning.repositories;

import lk.UniLearn.studentlearning.Models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course,Integer> {
}
