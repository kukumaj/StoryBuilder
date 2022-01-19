import java.util.Scanner;

public class TeacherSolution {
        public static boolean isUpperCase(char character) {
            return ("" + character).toUpperCase().charAt(0) == ("" + character).charAt(0);
        }

        public static void main(String[] args) {
            StringBuilder story = new StringBuilder();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                String nextPart = scanner.nextLine();
                if (nextPart.contains(" ")) {
                    System.err.println("You can only add one word at a time");
                    continue;
                }
                if (nextPart.equals(".")) {
                    if (story.isEmpty()) {
                        System.err.println("Cannot end without any words");
                        continue;
                    }
                    story.append(".");
                    System.out.println(story.substring(1));
                    System.exit(0);
                }

                if (story.isEmpty() && !isUpperCase(nextPart.charAt(0))) {
                    System.err.println("Story must start from an uppercase character");
                    continue;
                }
                story.append(" ").append(nextPart);
            }
        }
    }

