import java.util.Arrays;

public class Course {
    private String courseName, courseID;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course() {
    }

    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    //Cycles through all the students and prints them
    public void getStudents() {
        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    void addStudent (String student) {
        if(numberOfStudents <= 99) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        }
        else
            System.out.println("No more students can be held");
    }

    void dropStudent (String student) {
        int i = 0;
        String[] temp, temp2;

        if(numberOfStudents >= 1) {
            while(student != students[i] && i < numberOfStudents) {
                i++;
            }
            //Copies students array to two temporary arrays except for the student that is being dropped
            if(students[i] == student) {
                //Copies until it reaches the target to be removed
                temp = Arrays.copyOfRange(students, 0, i);
                //Copies from after the target till end
                temp2 = Arrays.copyOfRange(students, i+1, numberOfStudents+1);
                //Assigns first temp to the original array
                students = Arrays.copyOf(temp, numberOfStudents--);
                //Adds second temp to original array from where the target was removed
                System.arraycopy(temp2, 0, students, i, numberOfStudents-i);
            }
            else
                System.out.println(student + " does not exist");
        }
        else
            System.out.println("No more students can be removed");
    }
}
