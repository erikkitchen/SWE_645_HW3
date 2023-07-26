package Erik.Kitchen.studentsurvey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Erik.Kitchen.studentsurvey.entity.StudentSurvey;

public interface StudentSurveyRepository extends JpaRepository<StudentSurvey, Long> {
    // You can define custom query methods here if needed
}