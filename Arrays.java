import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Array Assignment");
        Scanner inputs=new Scanner(System.in);
        String again;

        do{
            System.out.print("Please select a question from 1-5: ");
            int question=inputs.nextInt();
            System.out.println("-------------------");
            if (question==1){
                String word="String";
                System.out.println(word);
                System.out.println("Using string, I am able to create a variable and given a value into it and this value will also be together");
                char[] breakdown=word.toCharArray();
                System.out.format("%c%c%c%c%c\n",breakdown[0],breakdown[4],breakdown[2],breakdown[3],breakdown[1]);
                System.out.println("Using arrays, I am able to seperate the string into individual letters/char and isolate them");
                //Difference between a string and an array
                //both string and arrays are ways to store data. Arrays allows the user to store multiple data of a specific datatype(int, char, float, double, etc) and contains many elements within it; however, string will convert whatever the user stores in it into string (""). Srting is technically an array for one type which is a character.
            }
            else if (question==2){
                System.out.println("Please input your four marks: ");
                int[] marks=new int[4]; 
                int sum=0;
                for (int i=0;i<4;i++){
                    //int coursemark=inputs.nextInt();
                    marks[i]=inputs.nextInt();
                }

                for (int i=0;i<marks.length;i++){
                    sum+=marks[i];
                }

                double average=(double)(sum/marks.length);
                System.out.println("The average mark is "+average);
            }
            else if (question==3){////Declare an array of your favourite people then display them in alphabetical order. There are many ways of doing this. Feel free to do some research before you start. 

                System.out.print("How many people would you like to input: "); //use this for the loop later
                int numOfPeople=inputs.nextInt();

                String peoples[]=new String[numOfPeople]; //declare a array with the length that was input by user
                for (int x=0; x<numOfPeople;x++){
                    System.out.print("please enter name# "+(x+1)+": ");
                    String name=inputs.next(); //prompt user x amount of times
                    peoples[x]=name; //store the name into the arrays
                }
                Arrays.sort(peoples);
                System.out.println("Your favourite people sorting from alphabetical order is "+Arrays.toString(peoples));


            }
            else if (question==4){
                //Declare an array that holds the following phone number 6473217654. Replace all the numbers that are less than 5 with an *.
                
                char[] number={'6','4','7','3','2','1','7','6','5','4'}; //declare the array

                for (int x=0;x<number.length;x++){ // loop x amount of time
                    if (number[x]<53){ //check using ascii value
                        number[x]='*'; //replace if the number is less than 5
                    }
                }
                System.out.print(number); //output the new array

            }
            else if (question==5){
                //Declare the following array 4213. Traverse the array and display them from smallest to largest. This can be done in many ways, feel free to do some research before you attempt. 
                System.out.println("Display the array 4213 from smallest to largest");
                int[] numbers={4,2,1,3};
                int min;
                
                for (int bigLoop=0;bigLoop<numbers.length;bigLoop++){
                    for (int smallLoop=0;smallLoop<numbers.length;smallLoop++){//for each number, compare to the value of all other numbers
                        if (numbers[bigLoop]<numbers[smallLoop]){ //if the number is smaller
                            min=numbers[bigLoop]; //update all the values for the next check if the number is smaller
                            numbers[bigLoop]=numbers[smallLoop]; //substitute this number into the array 
                            numbers[smallLoop]=min; //switch the values
                        }
                    }
                }
                for (int i=0;i<numbers.length;i++){ 
                    System.out.print(numbers[i]);
                }
            }
            else {
                System.out.println("Invaid input, please input again");
            }
            System.out.print("\nWould you like to try another question(Y/N): ");
            again=inputs.next();
            while (!again.equalsIgnoreCase("Y")&&!again.equalsIgnoreCase("N")){
                System.out.print("Invalid input, please input again: ");
                again=inputs.next();
            }
        }
        while (again.equalsIgnoreCase("Y"));

        if (again.equalsIgnoreCase("N")){
            System.out.println("Thank you");
        }
    }

}
