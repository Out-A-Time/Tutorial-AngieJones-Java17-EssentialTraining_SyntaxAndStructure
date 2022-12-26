package arrays_introduction;

public class ArrayIntro {
    public static void main(String[] args) {
        // One way to initialize array
        String[] players1 = new String[3];
        players1[0] = "Bob";
        players1[1] = "John";
        players1[2] = "Henry";

        boolean isHenryThere = false;

        // Other way to initialize
        String[] players2 = { "Luke", "Tom", "George" };

        System.out.println("First player from the team is " + players1[0]); // Bob
        System.out.println(players2); // String;@2d363fb3

        for (int i = 0; i < players1.length; i++) {
            if (players1[i].equals("Henry")) {
                isHenryThere = true;
            }
        }
        System.out.println("Is Henry there? " + isHenryThere); // Is Henry there? true

    }

}
