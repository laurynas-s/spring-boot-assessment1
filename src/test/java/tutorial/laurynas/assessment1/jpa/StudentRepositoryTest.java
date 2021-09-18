package tutorial.laurynas.assessment1.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void testCRUD() {

        // Test create

        Student aStudent = new Student();
        aStudent.setId(1);
        aStudent.setName("John");
        aStudent.setScore(95);

        studentRepository.save(aStudent);

        Optional<Student> savedStudentOpt = studentRepository.findById(1l);
        assertNotNull(savedStudentOpt.orElse(null), "Student was not saved");
        assertEquals("John", savedStudentOpt.map(Student::getName).orElse(null), "Incorrect name");
        assertEquals(95, savedStudentOpt.map(Student::getScore).orElse(null), "Incorrect score");

        // Created

        // Test update

        Student theStudent = savedStudentOpt.get();
        theStudent.setScore(100);
        studentRepository.save(theStudent);

        Student updatedStudent = studentRepository.findById(1l).get();
        assertEquals(100, updatedStudent.getScore(), "Incorrect score");

        // Updated

        // Test delete

        studentRepository.deleteById(1l);
        assertFalse(studentRepository.findById(1l).isPresent(), "Student entry should be deleted");

        // deleted
    }
}
