package day07.Course;

public class Course {
    // 모든 사람이 들을 수 있는 과정 등록
    // Person(사람)이면 가능
    static void registerCourse1(Application<?> application) {
        // application 객체의 kind 필드에서 해당 객체를 가져옴
        System.out.println(application.kind
                // kind 객체의 클래스 정보를 가져옴
                .getClass()
                // 클래스의 간단한 이름(패키지명 제외)을 문자열로 반환
                .getSimpleName());
    }

    // 학생만 과정 등록 (상한 제한)
    // Student(학생)이면 가능 - 고등학생, 중학생 포함 (Student 혹은 Student의 서브 객체만 가능하도록, Person은 불가)
    static void registerCourse2(Application<? extends Student> application) {
        System.out.println(application.kind.getClass().getSimpleName() + "이 Course2을 등록");
    }

    // 직장인과 일반인만 과정 등록 (하한 제한)
    // Student(학생)만 제외 - (Worker 혹은 Worker의 상위 클래스만 가능)
    static void registerCourse3(Application<? super Worker> application) {
        System.out.println(application.kind.getClass().getSimpleName() + "이 Course3을 등록");
    }
}
