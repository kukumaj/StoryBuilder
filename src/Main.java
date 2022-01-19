import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        StringBuilder story = new StringBuilder();

        while (!input.equals(".")) {

            input = scanner.nextLine().trim();

            if (input.isBlank()) {
                continue;
            }


            if (input.equals(".") && story.toString().equals("")) {
                System.out.println("Cannot start with dot");
                input = "";
                continue;
            }

            if (story.toString().equals("") && !input.substring(0,1).equals(input.toUpperCase().substring(0,1))) {
                System.out.println("Story must start from an uppercase character");
                continue;
            }
            if (input.contains(" ")) {
                System.out.println("To many words in one line only 1 permitted");
            } else {
                if (!input.equals(".")) {
                    story.append(input).append(" ");
                } else {
                    story.append(input);
                }
            }

        }

        System.out.println(story.toString().replace(" .", "."));
    }

}