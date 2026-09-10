public class conditionals {


    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int x = 30;
        int y = 30;

        // Simple example if conditionals
        if (a != b) {
            System.out.println("Example 1:");
            System.out.println("yes");
        } else {
            System.out.println("Example 1:");
            System.out.println("no");
        }
        System.out.println(); // New line

        // Example switch case
        int car = 2;

        switch (car) {
            case 1:
                System.out.println("Switch case:");
                System.out.print("Toyota");
                break;
            case 2:
                System.out.println("Switch case:");
                System.out.println("Lexus");
                break;
            case 3:
                System.out.println("Switch case:");
                System.out.println("Ferrari");
                break;
            default:
                System.out.println("Switch case:");
                System.out.println("N/A");
                break;
        }
        System.out.println(); // New line

        // Nested if else
        // nested if is like outer is connected and inner is connected
        boolean qualifying = true;
        boolean semiFinals = true;
        boolean finals = true;

        if (qualifying) { // 3
            if (semiFinals) { //2
                if (finals) { // 1
                    System.out.println("Champion!"); // 1
                } else {
                    System.out.println("finals"); // 1
                }
            } else {
                System.out.println("semi-finals"); // 2
            }
        } else {
            System.out.println("DNQ"); // 3
        }
        System.out.println(); // new line

        // another example
        boolean hasTicket = true;
        boolean hasPassport = true;

        if (hasTicket) {
            if (hasPassport) {
                System.out.println("Board on gate 6");
            } else {
                System.out.println("Need passport");
            }
        } else {
            System.out.println("Need ticket");
        }
        System.out.println(); // new line

        // nested switch
        int earth = 1;
        int nation = 2;

        switch (earth) {
            case 1:
                switch (nation) {
                    case 1:
                        System.out.println("USA");
                        break;
                    case 2:
                        System.out.println("GBR");
                        break;
                }
                break;
            case 2:
                switch (nation) {
                    case 1:
                        System.out.println("RUS");
                        break;
                    case 2:
                        System.out.println("CHN");
                        break;
                }
                break;
            default:
                break;
        }
    }
}
