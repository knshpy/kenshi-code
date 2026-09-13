public class looping {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {      // Increment
            System.out.println(i);
        }
        System.out.println();               // New line

        for (int i = 10; i > 0; i--) {      // Decrement
            System.out.println(i);
        }
        System.out.println();               // New line

        // Nested loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();               // New line

        // while loop - check first then run
        int life = 3;
            while (life >= 0) {
                System.out.println("Life left:" + life);
                life--;
            }
            System.out.println("game over!");

            System.out.println();           // New line

        int count = 1;
            while (true) {
                if (count == 68){
                    break;
                }
                System.out.print(count + " ");
                count++;
            }
            System.out.println();           // New line

        // do while loop - run first then check
        int pizza = 8;

        do {
            System.out.println("Pizza left: " + pizza);
            pizza--;
        } while (pizza >= 0);

    }
}