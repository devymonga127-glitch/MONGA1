public class Product implements IProduct {
    private String[] productNames;
    private int[][] salesData;

    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    @Override
    public int getTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double getAverageProductSold() {
        int total = getTotalProductsSold();
        int count = 0;
        for (int i = 0; i < salesData.length; i++) {
            count += salesData[i].length;
        }
        return count == 0 ? 0.0 : (double) total / count;
    }

    @Override
    public int getProductTotal(int productIndex) {
        int total = 0;
        for (int j = 0; j < salesData[productIndex].length; j++) {
            total += salesData[productIndex][j];
        }
        return total;
    }

    @Override
    public String getMostPopularProduct() {
        int maxSales = -1;
        int maxIndex = 0;
        for (int i = 0; i < productNames.length; i++) {
            int currentTotal = getProductTotal(i);
            if (currentTotal > maxSales) {
                maxSales = currentTotal;
                maxIndex = i;
            }
        }
        return productNames[maxIndex] + " (" + maxSales + ")";
    }
}
