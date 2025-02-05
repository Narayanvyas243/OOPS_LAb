class Course {
    String CourseName;
    String CourseCode;

    Course(String courseName, String courseCode) {
        this.CourseName = courseName; 
        this.CourseCode = courseCode; 
    }

    void ShowCourseDetails() {
        System.out.println("Course Name: " + this.CourseName); 
        System.out.println("Course Code: " + this.CourseCode); 
    }

    public static void main(String[] args) {
        Course firstCourse = new Course("OOPS", "CSEG175");
        firstCourse.ShowCourseDetails();

        Course secondCourse = new Course("Linear Algebra", "CS2021");
        secondCourse.ShowCourseDetails();
    }
}