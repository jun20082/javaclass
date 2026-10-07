import java.util.Scanner;

class Student {
    private long studentId;
    private String name;
    private String major;
    private long phone;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getFormattedPhone() {
        String s = "0" + Long.toString(phone);
        return s.substring(0, 3) + "-" + s.substring(3, 7) + "-" + s.substring(7);
    }
}

class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            long studentId = Long.parseLong(sc.next());
            String name = sc.next();
            String major = sc.next();
            long phone = Long.parseLong(sc.next());

            Student student = new Student();
            student.setStudentId(studentId);
            student.setName(name);
            student.setMajor(major);
            student.setPhone(phone);

            students[i] = student;
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println((i + 1) + "번째 학생: " + student.getStudentId() + " " + student.getName()
                    + " " + student.getMajor() + " " + student.getFormattedPhone());
        }

        sc.close();
    }
}
