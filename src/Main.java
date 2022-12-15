import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------Quiz----------------------------------");
        System.out.println("1. Space Quiz");
        Scanner quizoption = new Scanner(System.in);
        int Quizoption = quizoption.nextInt();
        if (Quizoption==1){
            spacequiz();
        }

    }
    public static void spacequiz(){
        System.out.println("---------------------------Space Quiz-------------------------------");
        //---------------------------------Question 1------------------------------------
        System.out.println("Question 1: What is the name of the force which keeps the planets in orbit around the sun? ");
        System.out.println("Option 1: Gravitational Force");
        System.out.println("Option 2: Magnetic Force");
        System.out.println("Option 3: Nuclear Force");
        System.out.println("Enter the option: ");
        Scanner answer = new Scanner(System.in);
        int Answer= answer.nextInt();

        if (Answer==1){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Gravitational Force");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //----------------------------------------Question 2--------------------------------------
        System.out.println("Question 2: Which planet is covered by clouds of sulphuric acid? ");
        System.out.println("Option 1: Mars");
        System.out.println("Option 2: Venus");
        System.out.println("Option 3: Pluto");
        System.out.println("Enter the option: ");
        int Answer2= answer.nextInt();

        if (Answer2==2){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Venus");
        }
        System.out.println("-----------------------------------------------------------------------------------");


        //---------------------------------------Question 3-------------------------------------------
        System.out.println("Question 3: Which planet is named after the Roman god of war?");
        System.out.println("Option 1: Mars");
        System.out.println("Option 2: Jupiter");
        System.out.println("Option 3: Neptune");
        System.out.println("Enter the option: ");
        int Answer3= answer.nextInt();

        if (Answer3==1){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Venus");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------------Question 4--------------------------------------------
        System.out.println("Question 4: Which planet is closest to the sun?");
        System.out.println("Option 1: Mars");
        System.out.println("Option 2: Mercury");
        System.out.println("Option 3: Saturn");
        System.out.println("Enter the option: ");
        int Answer4= answer.nextInt();

        if (Answer4==2){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Mercury");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-------------------------------------Question 5---------------------------------------
        System.out.println("Question 5: Which planet has a day which lasts eight months?");
        System.out.println("Option 1: Earth");
        System.out.println("Option 2: Mercury");
        System.out.println("Option 3: Venus");
        System.out.println("Enter the option: ");
        int Answer5= answer.nextInt();

        if (Answer5==3){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Venus");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 6--------------------------------------
        System.out.println("Question 6: Who was the first man in space?");
        System.out.println("Option 1: Rakesh Sharma");
        System.out.println("Option 2: Yuri Gagarin");
        System.out.println("Option 3: Neil Armstrong");
        System.out.println("Enter the option: ");
        int Answer6= answer.nextInt();

        if (Answer6==2){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Yuri Gagarin");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 7---------------------------------------
        System.out.println("Question 7: Which was the first space probe to leave the solar system?");
        System.out.println("Option 1: Pioneer 10");
        System.out.println("Option 2: Voyager 1");
        System.out.println("Option 3: Voyager 2");
        System.out.println("Enter the option: ");
        int Answer7= answer.nextInt();

        if (Answer7==1){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Pioneer 10");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 8---------------------------------------
        System.out.println("Question 8: What is the approximate temperature at the surface of the Sun?");
        System.out.println("Option 1: 4110 C");
        System.out.println("Option 2: 5530 C");
        System.out.println("Option 3: 6000 C");
        System.out.println("Enter the option: ");
        int Answer8= answer.nextInt();

        if (Answer8==2){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: 5530 C");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 9---------------------------------------
        System.out.println("Question 9: What force bends light rays travelling though the universe?");
        System.out.println("Option 1: Magnetic Force");
        System.out.println("Option 2: Wind Force");
        System.out.println("Option 3: Gravitational Force");
        System.out.println("Enter the option: ");
        int Answer9= answer.nextInt();

        if (Answer9==3){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Gravitational Force");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 10---------------------------------------
        System.out.println("Question 10: Which planet orbits the Sun four times in the time it takes the Earth to go round once?");
        System.out.println("Option 1: Mercury");
        System.out.println("Option 2: Venus");
        System.out.println("Option 3: Uranus");
        System.out.println("Enter the option: ");
        int Answer10= answer.nextInt();

        if (Answer10==3){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Mercury");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 11---------------------------------------
        System.out.println("Question 11: Which is the largest moon in the solar system?");
        System.out.println("Option 1: Titan");
        System.out.println("Option 2: Ganymede");
        System.out.println("Option 3: Triton");
        System.out.println("Enter the option: ");
        int Answer11= answer.nextInt();

        if (Answer11==2){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Ganymede");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 12---------------------------------------
        System.out.println("Question 12: Which is the largest moon of Saturn?");
        System.out.println("Option 1: Titan");
        System.out.println("Option 2: Ganymede");
        System.out.println("Option 3: Triton");
        System.out.println("Enter the option: ");
        int Answer12= answer.nextInt();

        if (Answer12==1){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Titan");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 13---------------------------------------
        System.out.println("Question 13: Which is the largest planet in the solar system?");
        System.out.println("Option 1: Earth");
        System.out.println("Option 2: Jupiter");
        System.out.println("Option 3: Saturn");
        System.out.println("Enter the option: ");
        int Answer13= answer.nextInt();

        if (Answer13==2){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Jupiter");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 14---------------------------------------
        System.out.println("Question 14: What is the smallest planet in the solar system?");
        System.out.println("Option 1: Mercury");
        System.out.println("Option 2: Jupiter");
        System.out.println("Option 3: Saturn");
        System.out.println("Enter the option: ");
        int Answer14= answer.nextInt();

        if (Answer14==1){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: Mercury");
        }
        System.out.println("-----------------------------------------------------------------------------------");

        //-----------------------------------Question 15---------------------------------------
        System.out.println("Question 15: How many planets are there in the solar system?");
        System.out.println("Option 1: 7");
        System.out.println("Option 2: 9");
        System.out.println("Option 3: 8");
        System.out.println("Enter the option: ");
        int Answer15= answer.nextInt();

        if (Answer15==3){
            System.out.println("Correct Answer");
        }
        else {
            System.out.println("Wrong Answer. Correct Answer: 8");
        }
        System.out.println("-----------------------------------------------------------------------------------");









    }
}
