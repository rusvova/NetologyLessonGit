public class Main {

    public static void main(String[] args) {
        int[] sales = {100, 200, 300};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println(max);
    }


}


