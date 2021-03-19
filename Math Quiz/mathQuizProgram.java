package Task03_2;

import java.util.*;

/**
 *
 * @Daniel Kathiresan | 18027516| 17/03/21
 */
public class mathQuizProgram {
    public static void main(String[] args){
        //Initializing Variables
        int progRun = 0;
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        String operand = "";
        int result = 0;
        int userPoints = 0;

        
        //Start Program
        System.out.println("Welcome to the maths program");
        System.out.println("What is your name?: ");
        String userName = userInput.nextLine();
        
        //Start Main Loop
        while (progRun == 0){
            boolean validInput = false;
            //Randomly Generate Both Numbers
            int firstNum = rand.nextInt((100 - 1) + 1)+1;
            int secondNum = rand.nextInt((100 - 1) + 1)+1;
            int index = rand.nextInt((4 - 1) + 1)+1;
            //Randomly generating operand with switch, built in equation
            switch(index){
                case 1:
                     result = firstNum + secondNum;
                     operand = "+";
                     break;
                case 2:
                    result = firstNum - secondNum;
                    operand = "-";
                    break;
                case 3: 
                    result = firstNum * secondNum;
                    operand = "*";
                    break;
                case 4:
                    result = firstNum / secondNum;
                    operand = "/";
                    System.out.println("For dividing questions please round to 0dp");
                    break;

            }//end of switch
            while(validInput == false){
                try{
                    //Accept result as string, then change to int if not x
                    System.out.println(userName + ", your question is: " + firstNum + operand + secondNum);
                    System.out.println("Enter your answer (or enter x to exit): ");
                    
                    String ogInput = userInput.nextLine();
                    
                    if (ogInput.equals("x")){
                        System.out.println("=====FINAL SCORE=====");
                        System.out.println("Name: " + userName);
                        System.out.println("Score: " + userPoints);
                        progRun += 1;
                    } 
                    
                    else {
                        int userResult = Integer.parseInt(ogInput);
                        if (userResult == result){
                            System.out.println("Well done " + userName + " thats correct!");
                            userPoints += 10;
                        }
                    
                        else {
                            System.out.println("Oh no! " + userName + " thats incorrect :(");
                            userPoints -= 10;
                        }
                    }
                    validInput = true;
                }
                
                catch(NumberFormatException e){
                     System.out.println("Please enter a number only");  
                     validInput = false;
                }
            }
        }
        
    }
    
}


        