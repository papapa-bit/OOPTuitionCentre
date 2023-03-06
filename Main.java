import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String tutorName = " ", tutorIC = " ", tutorAdd = " ", tutorQualification = " ", yearExp = " ", dateJoined = " ", yearsInCentre = " ";

        StudentBio student1 = new StudentBio();
        student1.setName("Dzulfan Mohd Noor");

        StudentBio student2 = new StudentBio();
        student2.setName("Muhammad Haiqal Zulkifli");

        StudentBio student3 = new StudentBio();
        student3.setName("Wan Mohd Ashraf");


        //Creating a Batch Object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.AddStudent(student1);
        sb2023.AddStudent(student2);
        sb2023.AddStudent(student3);

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());


        //Methode to determine if the student in a list
        Boolean isIn = sb2023.find("Syafiq");
        System.out.println("IS Student is in batch03: " + isIn);


        //Set Mark for the student for 3 Test
        try {
            for (int i=0; i<3; i++){
                student1.setMark(90,i);
                student2.setMark(78,i);
                student3.setMark(73,i);
            }
        }catch (Exception ex){
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }
        student1.displayMark();
        student2.displayMark();
        student3.displayMark();

        //Calculate average each student
        float avg1 = student1.calcAvg();
        float avg2 = student2.calcAvg();
        float avg3 = student3.calcAvg();

        System.out.print("Average mark for students: " + avg1 + " " + avg2 + " " + avg3 + "\n" + "\n");

        Tutor firstTutor = new Tutor(tutorName, tutorIC, tutorAdd, tutorQualification, yearExp, dateJoined, yearsInCentre);
        System.out.println(firstTutor.toString_tutor());


    }
}