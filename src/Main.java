public class Main {
    public static void main(String[] args) {
        String[] products = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };

        int[][] sales = {
                {25, 18, 20}, // Cozy Nights Monarch (Months 1, 2, 3)
                {15, 12, 10}, // Restonic Barbados (Months 1, 2, 3)
                {18, 14, 15}  // Sealy Phuket (Months 1, 2, 3)
        };

        Product productApp = new Product(products, sales);
        PrintProduct printer = new PrintProduct();
        printer.printReport(productApp);
    }
}
