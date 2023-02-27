package Serviceimpl;

import Service.CourseInterface;
import java.util.ArrayList;

public class CourseServiceimpl implements CourseInterface {
    
    private ArrayList<StudentServiceimpl> studentsOfCourse = new ArrayList() {
    };

    @Override
    public void addStudentToCourse(StudentServiceimpl student) {
        studentsOfCourse.add(student);
    }

    @Override
    public void showStudentsOfCourse() {
        System.out.println("Students of Courses : " + studentsOfCourse);
    }

    
}
