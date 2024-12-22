package se.lexicon;


public class Main {
    public static void main(String[] args) {



        /*
         * 1. What is the length of the String: "Java" ?
         */
        String input = "Java";
        System.out.println("The lenght of Java is: "+ input.length());

        System.out.println("-------------------------------------------------------------------------");


        /*
         * 1. What char is at index position 6 in the following String:
         * "Long example sentence" ?
         */
        String text = "Long example sentence";
        System.out.println("Char at index position 6 is: "+ text.charAt(6));

        System.out.println("-------------------------------------------------------------------------");


        /*
         * 2. What is the index position of 'o' in the following String:
         * "Even longer example sentence" ?
         */
        String text1 = "Even longer example sentence";
        System.out.println("The index position of 'o' is: "+ text1.indexOf('o'));

        System.out.println("-------------------------------------------------------------------------");


        /*
         * 3. Given the following String: "Ok this is not as long!"
         * create a substring of only "not as long" (excluding the
         * exclamation point) and print it out.
         */
        String text2 = "Ok this is not as long!";
        System.out.println(text2.substring("not as long".length()));

        System.out.println("-------------------------------------------------------------------------");

        /*
         * 4. Convert the following String: "CAPS EQUALS SCREAMING" to
         * lowercase and print it out. Then convert it back to
         * uppercase and print it out again.
         */
        String text3 = "CAPS EQUALS SCREAMING";
        System.out.println("In lowercase: "+text3.toLowerCase()+"\nIn uppercase again: "+text3.toUpperCase());

        System.out.println("-------------------------------------------------------------------------");

        /*
         *  5. Correct the following String: "Java is the worst
         * programming language!" by replacing the (obviously
         * incorrect) word "worst" with the word "best". Then print
         * out the sentence.
         */
        String text4 = "Java is the worst programming language!";
        System.out.println("Replace word worst with best: "+ text4.replace("worst", "best"));

        System.out.println("-------------------------------------------------------------------------");

        /*
         *  6. What is the output of the following String:
         * "\tJ\ta\tv\ta\t" after you trim it?
         */
        String text5 = "\tJ\ta\tv\ta\t";
        System.out.println(text5+"\n"+text5.trim());

        System.out.println("-------------------------------------------------------------------------");

        /*
         *  7. Parse the following int: 20 to a String and add a 20 to the
         * end of the String. Printing it out should return: "2020".
         */
        int number = 20;
        String numberString = "20";
        System.out.println(number + numberString);

        System.out.println("-------------------------------------------------------------------------");

        /*
         *  8. Oil and water don't go well together. Given the String:
         * "Oil and Water", split them up into the words "Oil","Water"
         * and store them in a String array
         */
        String text6 = "Oil and Water";
        String[] splitText6 = text6.split("and ");
        for(String x : splitText6){
            System.out.println(x);
        }

        System.out.println("-------------------------------------------------------------------------");

        /*
         *  9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
         * into an array. Print out all names separately.
         */
        String text7 = "Carl,Susie,Fredrick,Bob,Erik";
        String [] myArrayText7 = text7.split(",");
        for (String s : myArrayText7) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------------------------------------------");

        /*
         *  10. Convert the following String: "ThisShouldBeConverted" to
         * a char array. Iterate through the char array and print out
         * each element.
         */
        String text8 = "ThisShouldBeConverted";
        char[] myCharArrayText8 = text8.toCharArray();
        for (char c : myCharArrayText8) {
            System.out.println(c);
        }

        System.out.println("-------------------------------------------------------------------------");


        /*
         * 11. Convert the following char[]: {'J','a','v','a'} to a
         * String and print it out
         */
        char[] myChar = {'J','a','v','a'};
        String myCharString = String.valueOf(myChar);
        System.out.println(myCharString);

        System.out.println("-------------------------------------------------------------------------");



    }
}
