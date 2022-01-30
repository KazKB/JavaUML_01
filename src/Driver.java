public class Driver {
    public static void main(String[] args) {
        Course course = new Course("Physics", "P012");
        Course english = new Course("English", "E092");
        Course math = new Course("Mathematics", "M084");
        Course socialStudies = new Course("Social Studies", "SS63");
        Course writing = new Course("Writing", "W053");
        Student student = new Student("John", "Antigua", "S023");
        Faculty faculty = new Faculty("Jane", "Barbuda", "F045");

        //Course Test
        System.out.println("Course Test");
        course.addStudent("Michael");
        course.addStudent("Josh");
        course.addStudent("Richard");
        course.addStudent("Tang");
        course.addStudent("Weasel");

        course.getStudents();

        System.out.println();
        course.dropStudent("Linken");
        course.dropStudent("Richard");
        System.out.println();

        course.getStudents();

        //Student test
        System.out.println();
        System.out.println("Student Test");
        student.addCourse(course);
        student.addCourse(english);
        student.addCourse(math);
        student.addCourse(socialStudies);

        student.getCourseList();

        System.out.println();
        student.dropCourse(writing);
        student.dropCourse(math);
        System.out.println();

        student.getCourseList();

        //Faculty test
        System.out.println();
        System.out.println("Faculty Test");
        faculty.addCourse(course);
        faculty.addCourse(english);
        faculty.addCourse(writing);
        faculty.addCourse(socialStudies);

        faculty.getCourseList();

        System.out.println();
        faculty.dropCourse(math);
        faculty.dropCourse(writing);
        System.out.println();

        faculty.getCourseList();


    }
}