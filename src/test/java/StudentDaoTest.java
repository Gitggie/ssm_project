import com.wlj.domain.Student;
import com.wlj.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@ContextConfiguration(locations = "classpath:spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentDaoTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void getAll() {

//        for (int i = 0; i < 100; i++) {
        List<Student> allStudent = studentService.getAll();
        for (Student student : allStudent) {
            System.out.println(student);
        }

//        }
    }

    @Test
    public void selectById() {
        Student student = studentService.selectById(1);
        System.out.println(student);
    }


    /*@Test
    public void insert() {
        Student student = new Student();
        student.setId(4);
        student.setUser_name("wlj");
        studentService.insert(student);
        System.out.println(student.getId());
    }*/

    @Test
    public void delete() {
        studentService.delete(3);
    }

    @Test
    public void update() {
        Student student = new Student();
        student.setId(3);
        student.setUser_name("随");
        studentService.update(student);
        System.out.println(student);
    }

    @Test
    public void lll() {
        System.out.println("wljjjjj");
    }
}