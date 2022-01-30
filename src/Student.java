import java.util.Arrays;

public class Student {
    private String studentName, studentAddress, studentID;
    private Course[] courseList = new Course[20];
    private int courseNum = 0;

    public Student() {
    }

    public Student(String studentName, String studentAddress, String studentID) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    //Cycles through all the courses and prints them
    public void getCourseList() {
        for(int i = 0; i < courseNum; i++) {
            System.out.println(courseList[i].getCourseName());
        }
    }

    public void addCourse(Course course) {
        if(courseNum <= 19) {
            courseList[courseNum] = course;
            courseNum++;
        }
        else
            System.out.println("No more courses can be taught");
    }

    public void dropCourse(Course course) {
        int i = 0;
        Course[] temp;
        Course[] temp2;

        if(courseNum >= 1) {
            while(course != courseList[i] && i < courseNum) {
                i++;
            }
            //Copies students array to two temporary arrays except for the course that is being dropped
            if(courseList[i] == course) {
                //Copies until it reaches the target to be removed
                temp = Arrays.copyOfRange(courseList, 0, i);
                //Copies from after the target till end
                temp2 = Arrays.copyOfRange(courseList, i+1, courseNum+1);
                //Assigns first temp to the original array
                courseList = Arrays.copyOf(temp, courseNum--);
                //Adds second temp to original array from where the target was removed
                System.arraycopy(temp2, 0, courseList, i, courseNum-i);
            }
            else
                System.out.println(course.getCourseName() + " does not exist");
        }
        else
            System.out.println("No more courses can be removed");
    }
}
