public class TableMaker {
    private int number; // Each object gets its own 'number' variable

    public TableMaker(int input) {
        this.number = input;
    }

    public void display() {
        System.out.println("Printing the " + number + " table:");
        for (int i = 1; i <= 3; i++) { // Keeping it short for the example
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println(); // Space between tables
    }

    public static void main(String[] args) {
        // We build TWO separate machines from ONE blueprint
        TableMaker tableFive = new TableMaker(5);
        TableMaker tableTen = new TableMaker(10);

        // They run independently
        tableFive.display();
        tableTen.display();
    }
}