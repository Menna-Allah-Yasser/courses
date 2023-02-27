package Model;

import java.util.ArrayList;
import java.util.Vector;

public class Teacher implements SetCourse{

    private int id;
    private String teacherName;
    private ArrayList<Course> teacherCourses = new ArrayList();

    public Teacher() {
    }

    public Teacher(int id, String teacherName, Course course) {
        setId(id);
        setName(teacherName);
        setCourse(course);
        course.setTeacher(this);
    }

    public Teacher(int id, String teacherName, ArrayList<Course> list) {
        setId(id);
        setName(teacherName);
        setCourse(list);
        
    }
     @Override
    public void setCourse(Course course) {
       this.teacherCourses.add(course);
    }
    @Override
    public void setCourse(ArrayList<Course> list) {
        Course course = new Course();
        for (int i = 0; i < list.size(); i++) {
            course = list.get(i);
            this.setCourse(course);
            course.setTeacher(this);
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String teacherName) {
        this.teacherName = teacherName;
    }

    
    public int getId() {
        
        return id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    @Override
    public void getCourses() {
        System.out.println("Teacher Courses : " + teacherCourses.toArray());
    }

    @Override
    public String toString() {

        System.out.print("Teacher { Teacher Courses : ");
        for (Course i : teacherCourses) {
            System.out.println(i.getCode() + "   " + i.getName());
        }
        return "id = " + id + " , teacherName = " + teacherName + '}';
    }

   

}
