package day07.Course;

public class Main {
    public static void main(String[] args) {
        // 모든 사람이 신청 가능
        Course.registerCourse1(new Application<Person>(new Person()));
        Course.registerCourse1(new Application<Worker>(new Worker()));
        Course.registerCourse1(new Application<Student>(new HighStudent()));
        Course.registerCourse1(new Application<Student>(new Student()));
        Course.registerCourse1(new Application<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // 학생만 신청 가능
        Course.registerCourse2(new Application<Student>(new HighStudent()));
        Course.registerCourse2(new Application<Student>(new Student()));
        Course.registerCourse2(new Application<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // 직장인과 일반인만 신청 가능
        Course.registerCourse3(new Application<Person>(new Person()));
        Course.registerCourse3(new Application<Worker>(new Worker()));
    }
}
