// Question 7
// CP - Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percentmark in PCM
// I/P => NONE
// O/P => Sam’s average mark in PCM is __


public class Que7 {
    public static void main(String [] args){
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int totalMarks = mathsMarks + chemistryMarks + physicsMarks;
        double averageMarks = totalMarks / 3.0;
        System.out.println("Sam's average marks in PCM is " + averageMarks);
    }
}
