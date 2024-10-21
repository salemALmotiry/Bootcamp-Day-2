import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// run each exercise separately
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        * 1. Develop a program that takes the weight (in kilograms) and height (in meters)
         as input and calculates the BMI, then prints it.  */

        System.out.println("------------Exercise 01------------");
        System.out.print("Enter weight in kilograms: ");
        float weight = input.nextFloat();

        System.out.print("Enter height in meters: ");
        float height = input.nextFloat();

        float squaring_height = height*height;
        System.out.println("BMI is "+ weight/squaring_height);


//        /*2. Write a program that takes the obtained marks and total marks as input and
//             calculates the percentage, then prints it. */

//        System.out.println("------------Exercise 02------------");
//
//        System.out.print("Enter obtained marks: ");
//        float obtained_marks = input.nextFloat();
//
//        System.out.print("Enter total marks: ");
//        float total_marks = input.nextFloat();
//
//        float percentage = (obtained_marks/total_marks)*100;
//
//        System.out.println("Percentage = " + percentage+"%");

         /*3. Create a program that takes an amount in one currency and an exchange rate
           as input, then converts and prints the amount in another currency. */

//        System.out.println("------------Exercise 03------------");
//
//        System.out.print("Enter an amount in USD or any: ");
//        float amount = input.nextFloat();
//
//        System.out.print("Enter an exchange rate ex(USD to EUP): ");
//        float exchange_rate = input.nextFloat();
//
//        System.out.println("Amount in new currency = " + amount*exchange_rate);

        /*4. Create a program that takes a string as input, calculates its length, and then
             reverses the string using the StringBuilder class, finally printing both the length and
             reversed string. */

//        System.out.println("------------Exercise 04------------");
//
//        System.out.print("Enter any string: ");
//        String received_string = input.nextLine();
//        StringBuilder str = new StringBuilder();
//
//        System.out.println("Length of the string: "+ received_string.length()
//                          + " Reversed string: "+ str.append(received_string).reverse());


        /*5. Develop a program that takes a sentence as input and extracts a substring from
             it, then prints the extracted substring*/
//        System.out.println("------------Exercise 05------------");
//
//        System.out.print("Enter any sentence: ");
//        String sentence = input.nextLine();
//
//        System.out.print("Enter the start loc of substring: ");
//        int start_indx = input.nextInt();
//
//        System.out.print("Enter the end loc of substring: ");
//        int end_indx = input.nextInt();
//
//        System.out.println(sentence.substring(start_indx,end_indx));

        /*6. Write a program that takes a sentence and a keyword as input, then check if
             the keyword is present in the sentence and prints the result.
        */
//            System.out.println("------------Exercise 06------------");
//
//            System.out.print("Enter any sentence: ");
//            String sentence2 = input.nextLine();
//
//            System.out.print("Enter keyword: ");
//            String keyword = input.nextLine();
//
//            System.out.println("is "+keyword +" present in the sentence: " +sentence2.contains(keyword));


            /*
            * 7. Develop a program that takes a sentence and a word to replace as input, then
                 replace all occurrences of the word with another word and prints the modified
                 sentence. */
//            System.out.println("------------Exercise 07------------");
//
//            System.out.print("Enter any sentence: ");
//            String sentence3 = input.nextLine();
//
//            System.out.print("Enter word to replace: ");
//            String replace_word = input.nextLine();
//
//            System.out.print("Enter Replacement word: ");
//            String replacement_word = input.nextLine();
//
//
//            System.out.println("new sentence: "+ sentence3.replace(replacement_word,replace_word));


              /*8. Write a program that takes two strings as input and check if they are equal,
                   ignoring the case, then prints whether they are equal or not. */

//            System.out.println("------------Exercise 08------------");
//
//            System.out.print("Enter first word: ");
//            String first_word = input.nextLine();
//
//            System.out.print("Enter second word: ");
//            String second_word = input.nextLine();
//
//            System.out.println("The first word is equal to second word: "
//                          + first_word.equalsIgnoreCase(second_word));


    }
    }
