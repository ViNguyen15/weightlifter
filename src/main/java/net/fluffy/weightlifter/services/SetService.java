package net.fluffy.weightlifter.services;

import net.fluffy.weightlifter.entities.WorkoutSet;

import java.util.List;

public interface SetService {

    public WorkoutSet createSet(WorkoutSet set);
    public List<WorkoutSet> getAllSet();
    public List<WorkoutSet> getSetByName(String name);
    public void deleteSetById(Long id);

}
