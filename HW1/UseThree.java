public class UseThree {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java UseThree name1 name2 name3");
            return;
        }


        String name1 = args[2];
        String name2 = args[1];
        String name3 = args[0];

        // Print the sentence
        System.out.println("Hi " + name1 + ", " + name2 + ", and " + name3 + ".");
    }
}
