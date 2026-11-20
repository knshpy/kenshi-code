public class sabioSariSari {

    // TODO 1: return the total of all the sales
    public static int total(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) { // A
            sum = sum + sales[i]; // B
        }
        return sum;
    }
    // TODO 2: return the INDEX of the day with the highest sales
    public static int bestDay(int[] sales) {
        int best = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[best]) { // C
                best = i; // D
            }
        }
        return best;
    }
    // TODO 3: add amount to every element of the array
    public static void addToAll(int[] sales, int amount) {
        for (int i = 0; i < sales.length; i++) {
            sales[i] += amount; // E
        }
    }
    public static void main(String[] args) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] sales = {1250, 980, 1430, 1100, 1675, 2210, 1890};

        int week = total(sales); // F
        System.out.println("Weekly total: " + week);

        System.out.println("Daily average: " + (double) week / sales.length);

        int b = bestDay(sales);
        System.out.println("Best day: " + days[b] + " (" + sales[b] + ")");

        addToAll(sales, 100); // G
        System.out.println("Total after adding 100: " + total(sales));
    }
}
