import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayList {
    public static void main(String[] args) {
        /*
            How would you return a random item from an ArrayList?

            Create 3 array list: subject, verb, and object.
            Ask a user to populate each array list with 3 to 10 words.
            As an example, ask a user to enter 4 subject word, 5 verb words,
            and 9 object words. Ask a user if they want to generate a sentence.
            If user says "yes" then create a sentence by randomly selecting one
            word from subject, verb and object array list.
            Finally, print out the content of your array lists.

            case 1:
                Enter verb 1:eat
                Enter verb 2:drink
                Enter verb 3:play
                Enter verb 4:hit
                Enter verb 5:kick
                [eat, drink, play, hit, kick]
                ----------------------------
                Enter subject 1:woman
                Enter subject 2:man
                Enter subject 3:boy
                Enter subject 4:girl
                Enter subject 5:child
                [woman, man, boy, girl, child]
                ----------------------------
                Enter object 1:orange
                Enter object 2:ball
                Enter object 3:chocolate
                Enter object 4:coffee
                Enter object 5:wall
                [orange, ball, chocolate, coffee, wall]
                ----------------------------
                Do you want want to generate a sentence?(yes/no)
                yes
                Sentence created by the Random Generator: man kick orange
                Have good day!!
            case 2:

         */

        int randomVerb;
        int randomSubject;
        int randomObject;
        String replay;

        ArrayList<String> verb = new ArrayList<>();
        ArrayList<String> subject = new ArrayList<>();
        ArrayList<String> object = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        Random run = new Random();

        randomVerb = run.nextInt(5);
        randomSubject = run.nextInt(5);
        randomObject = run.nextInt(5);

        // adding verbs to the verb array list.
        //built,eat,throw,hit,drink
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter verb " + i +":");
            verb.add(in.nextLine());
        }
        System.out.println(verb);
        System.out.println("----------------------------");

        // adding subject to the subject array list.
        // Woman,man, boy,child,girl
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter subject " + i +":");
            subject.add(in.nextLine());
        }
        System.out.println(subject);
        System.out.println("----------------------------");

        // adding words to the object array list.
        // chocolate,orange,coffee,ball,wall
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter object " + i +":");
            object.add(in.nextLine());
        }
        System.out.println(object);

        System.out.println("----------------------------");

        System.out.println("Do you want want to generate a sentence?(yes/no)");
        replay = in.nextLine();

        if (replay.equalsIgnoreCase("yes")) {
            // Sentence Structure of English is subject + verb + object
            System.out.println("Sentence created by the Random Generator: "
                    + subject.get(randomSubject) + " " + verb.get(randomVerb) + " " + object.get(randomObject));
        }
        System.out.println("Have good day!!");

    }
}
