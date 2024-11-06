/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    
    /* 1) Create Department make sure to pass the name of the department
       2) Use the person directory to create persons some will play students role, some will play faculty role, etc
       3) Use the Course Catalog to creat some courses
       4) Create a course schedule for a semester (ex: spring 2025
       5) Use the course schedule to create some classes (course offer)
       6) Search for a person by ssn and assign as faculty (faculty profile)
       7) Search for person and assign as student (student profile)
       8) Register student for scheduled classes
    
    
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // New Department Created 
        Department department  = new Department("Information Systems");
        
        CourseCatalog coursecatalog = department.getCourseCatalog();
        // Creation of the core course
        Course coreCourse = coursecatalog.newCourse("App Engineering", "info 5100", 4);
        // Creation of 5 elective courses
        Course electiveCourse1 = coursecatalog.newCourse("Machine Learning", "info 6100", 4);
        Course electiveCourse2 = coursecatalog.newCourse("Cloud Computing", "info 6205", 4);
        Course electiveCourse3 = coursecatalog.newCourse("Cybersecurity Fundamentals", "info 6300", 4);
        Course electiveCourse4 = coursecatalog.newCourse("Artificial Intelligence", "info 6400", 4);
        Course electiveCourse5 = coursecatalog.newCourse("Big Data Analytics", "info 6500", 4);
        
        // Creation of schedule for the semester
        CourseSchedule courseschedule = department.newCourseSchedule("Fall 2024");

        // Offering two courses for Spring 2024 semester
        CourseOffer coreCourseoffer = courseschedule.newCourseOffer("info 5100");
        CourseOffer electiveCourseOffer1 = courseschedule.newCourseOffer("info 6100");
        CourseOffer electiveCourseOffer2 = courseschedule.newCourseOffer("info 6205");
        CourseOffer electiveCourseOffer3 = courseschedule.newCourseOffer("info 6300");
        CourseOffer electiveCourseOffer4 = courseschedule.newCourseOffer("info 6400");
        CourseOffer electiveCourseOffer5 = courseschedule.newCourseOffer("info 6500");

        if (coreCourseoffer==null)return; 
        
        coreCourseoffer.generatSeats(20);      // allow for 20 open seats in the class
        electiveCourseOffer1.generatSeats(20); // allow for 20 open seats in the class
        electiveCourseOffer2.generatSeats(20); // allow for 20 open seats in the class
        electiveCourseOffer3.generatSeats(20); // allow for 20 open seats in the class
        electiveCourseOffer4.generatSeats(20); // allow for 20 open seats in the class
        electiveCourseOffer5.generatSeats(20); // allow for 20 open seats in the class
        
        // Getting the empty person directory list 
        PersonDirectory persondirectory = department.getPersonDirectory();
        
        // Creation of teachers
        Person person1 = persondirectory.newPerson("Alice Smith");               
        Person person2 = persondirectory.newPerson("Bob Johnson");
        Person person3 = persondirectory.newPerson("Catherine Lee");
        Person person4 = persondirectory.newPerson("David Brown");
        Person person5 = persondirectory.newPerson("Evelyn Davis");
        Person person6 = persondirectory.newPerson("Frank Wilson");
        
        FacultyDirectory facultydirectory = department.getFacultyDirectory();
        FacultyProfile teacher1 = facultydirectory.newFacultyProfile(person1);
        FacultyProfile teacher2 = facultydirectory.newFacultyProfile(person2);
        FacultyProfile teacher3 = facultydirectory.newFacultyProfile(person3);
        FacultyProfile teacher4 = facultydirectory.newFacultyProfile(person4);
        FacultyProfile teacher5 = facultydirectory.newFacultyProfile(person5);
        FacultyProfile teacher6 = facultydirectory.newFacultyProfile(person6);
        
        // Assignment of Faculties to the courses that are created above
        // Core Course has been assigned two teachers
        coreCourseoffer.AssignAsTeacher(teacher1);
        coreCourseoffer.AssignAsTeacher(teacher2);
        
        electiveCourseOffer1.AssignAsTeacher(teacher2);
        electiveCourseOffer2.AssignAsTeacher(teacher3);
        electiveCourseOffer3.AssignAsTeacher(teacher3);
        electiveCourseOffer4.AssignAsTeacher(teacher4);
        electiveCourseOffer5.AssignAsTeacher(teacher5);
        electiveCourseOffer4.AssignAsTeacher(teacher1);
        electiveCourseOffer3.AssignAsTeacher(teacher4);
        electiveCourseOffer2.AssignAsTeacher(teacher6);
        electiveCourseOffer1.AssignAsTeacher(teacher5);
        
        
        
        // Creating Student Profiles
        Person stu1 = persondirectory.newPerson("John Doe");
        Person stu2 = persondirectory.newPerson("Jane Smith");
        Person stu3 = persondirectory.newPerson("Alex Johnson");
        Person stu4 = persondirectory.newPerson("Emily Brown");
        Person stu5 = persondirectory.newPerson("Michael Lee");
        Person stu6 = persondirectory.newPerson("Sarah Davis");
        Person stu7 = persondirectory.newPerson("Daniel Wilson");
        Person stu8 = persondirectory.newPerson("Olivia Taylor");
        Person stu9 = persondirectory.newPerson("Chris Anderson");
        Person stu10 = persondirectory.newPerson("Sophia Martinez");
        
        // Getting the student directory 
        StudentDirectory sd = department.getStudentDirectory();
        // Populating the student directory with 10 students
        StudentProfile student1 = sd.newStudentProfile(stu1);
        StudentProfile student2 = sd.newStudentProfile(stu2);
        StudentProfile student3 = sd.newStudentProfile(stu3);
        StudentProfile student4 = sd.newStudentProfile(stu4);
        StudentProfile student5 = sd.newStudentProfile(stu5);
        StudentProfile student6 = sd.newStudentProfile(stu6);
        StudentProfile student7 = sd.newStudentProfile(stu7);
        StudentProfile student8 = sd.newStudentProfile(stu8);
        StudentProfile student9 = sd.newStudentProfile(stu9);
        StudentProfile student10 = sd.newStudentProfile(stu10);
        
        // Registering the student for the courseLoad for the Fall semester
        // Course Load for each student created
        CourseLoad courseLoad1 = student1.newCourseLoad("Fall 2024");
        CourseLoad courseLoad2 = student2.newCourseLoad("Fall 2024");
        CourseLoad courseLoad3 = student3.newCourseLoad("Fall 2024");
        CourseLoad courseLoad4 = student4.newCourseLoad("Fall 2024");
        CourseLoad courseLoad5 = student5.newCourseLoad("Fall 2024");
        CourseLoad courseLoad6 = student6.newCourseLoad("Fall 2024");
        CourseLoad courseLoad7 = student7.newCourseLoad("Fall 2024");
        CourseLoad courseLoad8 = student8.newCourseLoad("Fall 2024");
        CourseLoad courseLoad9 = student9.newCourseLoad("Fall 2024");
        CourseLoad courseLoad10 = student10.newCourseLoad("Fall 2024");
        
        // Assignment of seat to a student for a particular course offering
        // Student 1 course assignment
        courseLoad1.registerStudentInClass(coreCourseoffer);      //register student in class Info 5100
        courseLoad1.registerStudentInClass(electiveCourseOffer1); //same student signed up for 2 classes
        // Student 2 course assignment
        courseLoad2.registerStudentInClass(coreCourseoffer);
        courseLoad2.registerStudentInClass(electiveCourseOffer5);
        // Student 3 course assignment
        courseLoad3.registerStudentInClass(coreCourseoffer);
        courseLoad3.registerStudentInClass(electiveCourseOffer3);
        // Student 4 course assignment
        courseLoad4.registerStudentInClass(coreCourseoffer);
        courseLoad4.registerStudentInClass(electiveCourseOffer2);
        // Student 5 course assignment
        courseLoad5.registerStudentInClass(coreCourseoffer);
        courseLoad5.registerStudentInClass(electiveCourseOffer4);
        // Student 6 course assignment
        courseLoad6.registerStudentInClass(coreCourseoffer);
        courseLoad6.registerStudentInClass(electiveCourseOffer1);
        // Student 7 course assignment
        courseLoad7.registerStudentInClass(coreCourseoffer);
        courseLoad7.registerStudentInClass(electiveCourseOffer3);
        // Student 8 course assignment
        courseLoad8.registerStudentInClass(coreCourseoffer);
        courseLoad8.registerStudentInClass(electiveCourseOffer5);
        // Student 9 course assignment
        courseLoad9.registerStudentInClass(coreCourseoffer);
        courseLoad9.registerStudentInClass(electiveCourseOffer2);
        // Student 10 course assignment
        courseLoad10.registerStudentInClass(coreCourseoffer);
        courseLoad10.registerStudentInClass(electiveCourseOffer3);
        // 20 course REgistrations
        
        System.out.println("Fall 2024 Report");
        for(StudentProfile student : sd.getStudentList()){
            // Detail of inidividual Student
            System.out.println(student.getPerson().getPersonId());
            
            // To calculate GPA, and fees paid by student
            int totalCredits = 0;
            
            // Retreive the courseLoad for a particular student
            CourseLoad courseLoad = student.getCourseLoadBySemester("Fall 2024");
            
            if(courseLoad != null){
                System.out.println("Courses Enrolled for Fall 2024");
                
                for(CourseOffer courseOffer : courseLoad.getCourseOffers()){
                    System.out.println("Course : " + courseOffer.getSubjectCourse().getCOurseNumber());
                    System.out.println("Faculty Assigned to this course : " + courseOffer.getAssignedTeacher().getPerson().getPersonId());
                    totalCredits += courseOffer.getCreditHours();
                }
                System.out.println("Fees Paid by " + student.getPerson().getPersonId() + " is " + totalCredits*1500 + "$");
                System.out.println("GPA for " + student.getPerson().getPersonId() + " is " + courseLoad.getSemesterScore());
            }
        }
        
        int total = department.calculateRevenuesBySemester("Fall 2024");
        System.out.print("Total Revenue of the Department is :  " + total+"$   ");
    }

}
