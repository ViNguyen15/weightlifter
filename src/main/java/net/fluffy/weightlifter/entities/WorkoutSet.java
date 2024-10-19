package net.fluffy.weightlifter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WorkoutSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String date;
    String time;
    int weight;
    int reps;
    String stage;
    String max;

    public WorkoutSet(){}

    public WorkoutSet(long id, String name, String date, String time, int weight, int reps, String stage, String max) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
        this.weight = weight;
        this.reps = reps;
        this.stage = stage;
        this.max = max;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String oneRepMax(){
//        int oneRep = (int)(weight * (1 + ((double)reps/30)));
        int oneRep = (int)(( weight * reps * 0.0333 ) + weight);
        return ""+oneRep;
    }


    @Override
    public String toString() {
        return "WorkoutSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", weight=" + weight +
                ", reps=" + reps +
                ", stage='" + stage + '\'' +
                ", max='" + max + '\'' +
                '}';
    }
}
