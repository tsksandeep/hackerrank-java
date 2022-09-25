import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _29_sort {
    static class Student implements Comparable<Student> {
        Long id;
        String name;
        Float cgpa;

        public Student(Long id, String name, Float cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        @Override
        public int compareTo(Student s) {
            if (this.cgpa.equals(s.cgpa)) {
                if (this.name.equals(s.name)) {
                    return s.id.compareTo(this.id);
                }
                return s.name.compareTo(this.name);
            }
            return this.cgpa.compareTo(s.cgpa);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        var studentList = new ArrayList<Student>();

        for (int i = 0; i < n; i++) {
            var studentStringArr = bufferedReader.readLine().trim().split(" ");

            var student = new Student(Long.parseLong(studentStringArr[0]), studentStringArr[1],
                    Float.parseFloat(studentStringArr[2]));

            studentList.add(student);
        }

        Collections.sort(studentList);
        Collections.reverse(studentList);

        studentList.forEach(student -> System.out.println(student.name));

        bufferedReader.close();
    }
}
