package Erik.Kitchen.studentsurvey.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "studentForm")
public class StudentSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "street_name", nullable = false)
    private String streetAddress;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Column(name = "city", nullable = false)
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "state", nullable = false)
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "zip", nullable = false)
    private String zip;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Column(name = "telephone_number", nullable = false)
    private String telephoneNumber;

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Column(name = "email", nullable = false)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "like_most", nullable = false)
    private String likedMostAboutCampus;

    public String getLikedMostAboutCampus() {
        return likedMostAboutCampus;
    }

    public void setLikedMostAboutCampus(String likedMostAboutCampus) {
        this.likedMostAboutCampus = likedMostAboutCampus;
    }

    @Column(name = "interest", nullable = false)
    private String interestInUniversity;

    public String getInterestInUniversity() {
        return interestInUniversity;
    }

    public void setInterestInUniversity(String interestInUniversity) {
        this.interestInUniversity = interestInUniversity;
    }

    @Column(name = "recommend", nullable = false)
    private String likelihoodOfRecommendation;

    public String getLikelihoodOfRecommendation() {
        return likelihoodOfRecommendation;
    }

    public void setLikelihoodOfRecommendation(String likelihoodOfRecommendation) {
        this.likelihoodOfRecommendation = likelihoodOfRecommendation;
    }

    @Column(name = "date_of_survey", nullable = false)
    private Date dateOfSurvey;

    public Date getDateOfSurvey() {
        return dateOfSurvey;
    }

    public void setDateOfSurvey(Date dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    // Constructors
    public StudentSurvey() {
    }

    public StudentSurvey(String firstName, String lastName, String streetAddress, String city, String state, String zip,
            String telephoneNumber, String email, Date dateOfSurvey) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", likedMostAboutCampus='" + likedMostAboutCampus + '\'' +
                ", interestInUniversity='" + interestInUniversity + '\'' +
                ", likelihoodOfRecommendation='" + likelihoodOfRecommendation + '\'' +
                ", dateOfSurvey='" + dateOfSurvey + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, streetAddress, city, state, zip, telephoneNumber, email,
                likedMostAboutCampus, interestInUniversity, likelihoodOfRecommendation, dateOfSurvey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        StudentSurvey student = (StudentSurvey) obj;
        return Objects.equals(id, student.id) &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(streetAddress, student.streetAddress) &&
                Objects.equals(city, student.city) &&
                Objects.equals(state, student.state) &&
                Objects.equals(zip, student.zip) &&
                Objects.equals(telephoneNumber, student.telephoneNumber) &&
                Objects.equals(email, student.email) &&
                Objects.equals(likedMostAboutCampus, student.likedMostAboutCampus) &&
                Objects.equals(interestInUniversity, student.interestInUniversity) &&
                Objects.equals(likelihoodOfRecommendation, student.likelihoodOfRecommendation) &&
                Objects.equals(dateOfSurvey, student.dateOfSurvey);
    }
}
