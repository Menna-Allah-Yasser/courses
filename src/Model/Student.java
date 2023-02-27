package Model;

import java.util.ArrayList;

public class Student implements SetCourse{

    private String id;
    private String name;
    private ArrayList<Course> studentCourses = new ArrayList();

    
    public Student() {
    }

    public Student(String id, String name) {
        setId(id);
        setName(name);
    }

    public Student(String id, String name, ArrayList<Course> list) {
        setId(id);
        setName(name);
        setCourse(list);
        
    }
     @Override
    public void setCourse(Course course) {
         studentCourses.add(course);
        course.addStudentToCourse(this);
    }
    
    @Override
    public void setCourse(ArrayList<Course> list) {
        Course course = new Course();
        for (int i = 0; i < list.size(); i++) {
            course = list.get(i);
            this.setCourse(course);
        }

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    
    

    @Override
    public String toString() {
        System.out.print("Student { Student Courses : ");
        for (Course i : studentCourses) {
            System.out.println(i.getCode() + "   " + i.getName());
        }
        return "id=" + id + ", name=" + name + '}';
    }

    @Override
    public void getCourses() {
        System.out.println("Student Courses : " + studentCourses.toArray());
    }

    
}
