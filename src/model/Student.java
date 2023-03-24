package model;

import lombok.AllArgsConstructor;
import lombok.Getter;


import Gender.Gender;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String fullName;
    private int age;
    private Gender gender;

    @Override
    public String toString() {
        return "Student{" +"id="+id+
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
