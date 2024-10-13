package net.fluffy.weightlifter.repo;
import net.fluffy.weightlifter.entities.WorkoutSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkoutSetRepo extends JpaRepository<WorkoutSet, Long>{

    @Query(nativeQuery = true, value = "SELECT * FROM workoutset WHERE title LIKE ?1%")
    List<WorkoutSet> getWorkoutSetsByName(String name);
}
