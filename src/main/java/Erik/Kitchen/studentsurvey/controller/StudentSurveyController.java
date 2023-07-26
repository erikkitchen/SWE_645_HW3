package Erik.Kitchen.studentsurvey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Erik.Kitchen.studentsurvey.entity.StudentSurvey;
import Erik.Kitchen.studentsurvey.service.StudentSurveyService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentSurvey")
public class StudentSurveyController {
    private final StudentSurveyService studentSurveyService;

    @Autowired
    public StudentSurveyController(StudentSurveyService studentSurveyService) {
        this.studentSurveyService = studentSurveyService;
    }

    @GetMapping
    public List<StudentSurvey> getAllSurveys() {
        return studentSurveyService.getAllSurveys();
    }

    @GetMapping("/{id}")
    public Optional<StudentSurvey> getSurveyById(@PathVariable Long id) {
        return studentSurveyService.getSurveyById(id);
    }

    @PostMapping
    public StudentSurvey saveSurvey(@RequestBody StudentSurvey survey) {
        return studentSurveyService.saveSurvey(survey);
    }

    @PutMapping("/{id}")
    public StudentSurvey updateSurvey(@PathVariable Long id, @RequestBody StudentSurvey survey) {
        survey.setId(id);
        return studentSurveyService.saveSurvey(survey);
    }

    @DeleteMapping("/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        studentSurveyService.deleteSurvey(id);
    }
}
