package lk.UniLearn.studentlearning.repositories;

import lk.UniLearn.studentlearning.Models.Department;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Department, Integer> {
}
