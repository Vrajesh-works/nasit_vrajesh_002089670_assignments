/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatassignments;
    
    public CourseLoad(String s){
        seatassignments = new ArrayList();
        semester = s;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        
        
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }
    
    public float getSemesterScore(){ //total score for a full semeter
        float sum = 0;
        for (SeatAssignment sa: seatassignments){
            sum = sum + sa.GetCourseStudentScore();
        }
        return sum;
    }
        public ArrayList<SeatAssignment> getSeatAssignments(){
            return seatassignments;
        }
    public float getSemesterGPA() {
        float totalScore = 0;
        int totalCourses = 0;

        // Loop through each seat assignment to calculate the total score
        for (SeatAssignment sa : seatassignments) {
            float score = sa.GetCourseStudentScore(); // Get the score for the student in the course
            if (score >= 0) { // Ensure that the score is valid
                totalScore += score;
                totalCourses++;
            }
        }

        // Return the GPA, which is the average score for the semester
        if (totalCourses == 0) {
            return 0; // Avoid division by zero if no courses
        } else {
            return totalScore / totalCourses;
        }
    }
}
