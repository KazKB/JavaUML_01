public class Driver {
    public static void main(String[] args) {
        Course course = new Course("Physics", "P012");
        Course english = new Course("English", "E092");
        Course math = new Course("Mathematics", "M084");
        Course socialStudies = new Course("Social Studies", "SS63");
        Course writing = new Course("Writing", "W053");
        Student John = new Student("John", "Antigua", "S023");
        Student Jack = new Student("Jack", "Antigua", "S023");
        Student Joseph = new Student("Joseph", "Antigua", "S023");
        Student Jason = new Student("Jason", "Antigua", "S023");
        Student Johnny = new Student("Johnny", "Antigua", "S023");
        Faculty Jane = new Faculty("Jane", "Barbuda", "F045");

        //Course Test
        System.out.println("Course Test");
        course.addStudent(John);
        course.addStudent(Jack);
        course.addStudent(Joseph);
        course.addStudent(Jason);
        course.addStudent(Johnny);

        course.getStudents();

        System.out.println();
        course.dropStudent(Johnny);
        course.dropStudent(Joseph);
        System.out.println();

        course.getStudents();

        //Student test
        System.out.println();
        System.out.println("Student Test");
        John.addCourse(course);
        John.addCourse(english);
        John.addCourse(math);
        John.addCourse(socialStudies);

        John.getCourseList();

        System.out.println();
        John.dropCourse(writing);
        John.dropCourse(math);
        System.out.println();

        John.getCourseList();

        //Faculty test
        System.out.println();
        System.out.println("Faculty Test");
        Jane.addCourse(course);
        Jane.addCourse(english);
        Jane.addCourse(writing);
        Jane.addCourse(socialStudies);

        Jane.getCourseList();

        System.out.println();
        Jane.dropCourse(math);
        Jane.dropCourse(writing);
        System.out.println();

        Jane.getCourseList();


    }
}