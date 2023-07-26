package Erik.Kitchen.studentsurvey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Erik.Kitchen.studentsurvey.entity.StudentSurvey;
import Erik.Kitchen.studentsurvey.repository.StudentSurveyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentSurveyService {
    private final StudentSurveyRepository studentSurveyRepository;

    @Autowired
    public StudentSurveyService(StudentSurveyRepository studentSurveyRepository) {
        this.studentSurveyRepository = studentSurveyRepository;
    }

    public List<StudentSurvey> getAllSurveys() {
        return studentSurveyRepository.findAll();
    }

    public Optional<StudentSurvey> getSurveyById(Long id) {
        return studentSurveyRepository.findById(id);
    }

    public StudentSurvey saveSurvey(StudentSurvey survey) {
        return studentSurveyRepository.save(survey);
    }

    public void deleteSurvey(Long id) {
        studentSurveyRepository.deleteById(id);
    }
}
