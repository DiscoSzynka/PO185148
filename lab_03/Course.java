public class Course {
    private String name;
    static final int maxStudents = 300;

    static int numberOfCreatedCourses = 0;

    public Course(){
        if(name != null && !name.isEmpty()) {
            this.name = name;
            numberOfCreatedCourses++;
        }
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
}
