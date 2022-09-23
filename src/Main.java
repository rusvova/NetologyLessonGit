public class Main {

    public static void main(String[] args) {
        long [] sales = {100, 200, 300};
        SalesManager salesManager = new SalesManager(sales);
        long max = salesManager.max();
        System.out.println(max);
    }


}


