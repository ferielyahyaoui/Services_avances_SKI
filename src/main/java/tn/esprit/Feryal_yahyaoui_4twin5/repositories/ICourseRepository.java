package tn.esprit.Feryal_yahyaoui_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.Feryal_yahyaoui_4twin5.entities.Course;

import java.util.List;

public interface ICourseRepository extends CrudRepository<Course, Long> {
    Course findByNumcourse(Long numcourse);

}
