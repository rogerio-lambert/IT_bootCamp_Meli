package com.meli.obterdiploma;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.repository.IStudentRepository;
import com.meli.obterdiploma.service.ObterDiplomaService;
import com.meli.obterdiploma.service.StudentService;
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
public class StudentServiceTest {
    @Mock
    private IStudentDAO studentDAO;

    @Mock
    private IStudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

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

}
