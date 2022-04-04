package com.meli.obterdiploma;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.service.ObterDiplomaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ObterDiplonaServiceTest {
    @Mock
    private IStudentDAO studentDAO;

    @InjectMocks
    private ObterDiplomaService obterDiplomaService;

    @BeforeEach
    public void before() {
        StudentDTO luizinho = new StudentDTO(
                131L,
                "Luizinho",
                "",
                0D,
                Arrays.asList(
                        new SubjectDTO("Matemática", 10D),
                        new SubjectDTO("Fisica", 9.4D),
                        new SubjectDTO("Geografia", 10D)
                ));
        StudentDTO jairzinho = new StudentDTO(
                171L,
                "Jairzinho",
                "",
                0D,
                Arrays.asList(
                        new SubjectDTO("Matemática", 7D),
                        new SubjectDTO("Fisica", 6.5D),
                        new SubjectDTO("Geografia", 8D)
                ));

        when(studentDAO.findById(131L)).thenReturn(luizinho);
        when(studentDAO.findById(171L)).thenReturn(jairzinho);
    }

    @Test
    void testAverageCalculation() {
        // Setup test
        StudentDTO approvedStudentReturned = obterDiplomaService.analyzeScores(131L);
        StudentDTO disapprovedStudentReturned = obterDiplomaService.analyzeScores(171L);
        Double expectAverageApproved = (10D + 9.4D + 10D)/3D;
        Double expectAverageDisapproved = (7D + 6.5D + 8D)/3D;
        // Make assertion
        assertEquals(expectAverageApproved, approvedStudentReturned.getAverageScore());
        assertEquals(expectAverageDisapproved, disapprovedStudentReturned.getAverageScore());
    }


    @Test
    void testIfAnalyzeScoresReturnsRigthGreeting() {
        // Setup test
        StudentDTO approvedStudentReturned = obterDiplomaService.analyzeScores(131L);
        StudentDTO disapprovedStudentReturned = obterDiplomaService.analyzeScores(171L);
        String messageExpectedApproved = "O aluno Luizinho obteve uma média de 9,8. Parabéns!";
        String messageExpectedDisapproved = "O aluno Jairzinho obteve uma média de 7,17. Você pode melhorar.";
        // Make assertion
        assertEquals(messageExpectedApproved, approvedStudentReturned.getMessage());
        assertEquals(messageExpectedDisapproved, disapprovedStudentReturned.getMessage());
    }

}
