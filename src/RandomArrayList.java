import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayList {
    public static void main(String[] args) {
        /*
            Create 3 array list: subject, verb, and object.
            Prompt user to populate each array list with 5 words.
            Prompt user if they want to generate a sentence.
            If user says "yes" then create a sentence by randomly selecting one
            word from subject, verb and object array list.
            Finally, print out the content of your array lists.

            case :
                Populate the verb arraylist.
                Enter []1:eat
                Enter [eat]2:drink
                Enter [eat, drink]3:play
                Enter [eat, drink, play]4:hit
                Enter [eat, drink, play, hit]5:kick
                [eat, drink, play, hit, kick]
                ----------------------------
                Populate the subject arraylist.
                Enter []1:woman
                Enter [woman]2:man
                Enter [woman, man]3:boy
                Enter [woman, man, boy]4:girl
                Enter [woman, man, boy, girl]5:boy
                [woman, man, boy, girl, boy]
                ----------------------------
                Populate the object arraylist.
                Enter []1:orange
                Enter [orange]2:ball
                Enter [orange, ball]3:chocolate
                Enter [orange, ball, chocolate]4:coffee
                Enter [orange, ball, chocolate, coffee]5:wall
                [orange, ball, chocolate, coffee, wall]
                ----------------------------
                Do you want want to generate a sentence?(yes/no)
                yes
                Sentence created by the Random Generator: boy drink orange
                Have good day!!


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
        System.out.println("Populate the verb arraylist.");
        populate(verb,in);
        System.out.println(verb);
        System.out.println("----------------------------");

        // adding subject to the subject array list.
        // Woman,man, boy,child,girl
        System.out.println("Populate the subject arraylist.");
        populate(subject,in);
        System.out.println(subject);
        System.out.println("----------------------------");

        // adding words to the object array list.
        // chocolate,orange,coffee,ball,wall
        System.out.println("Populate the object arraylist.");
        populate(object,in);
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

    public static void populate (ArrayList<String> name, Scanner sc) {

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter " + name + i +":");
            name.add(sc.nextLine());
        }

    }
}
