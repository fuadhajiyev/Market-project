package az.company.utils;

import az.company.models.Product;
import az.company.models.Sale;
import az.company.models.SaleProduct;
import az.company.service.SaleService;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintSale {
    /**
     * Not Completed
     *
     * @param reader
     * @param saleService
     * @throws IOException
     */
    public static void addNewSale(BufferedReader reader, SaleService saleService) throws IOException {
        List<SaleProduct> sale = new ArrayList<>();
        Product product = new Product();
        System.out.print("add sale id :");
        int saleId = Integer.parseInt(reader.readLine());
        // 1- id
        // 2- product
        // 3 -count
        saleService.addNewSale(sale);
    }

    public static void removeProductFromSale(BufferedReader reader, SaleService saleService) throws IOException {
        System.out.print("add sale id  :");
        String saleId = reader.readLine();
        System.out.print("add product id  :");
        int productId = Integer.parseInt(reader.readLine());
        System.out.print("add count of product to delete :");
        int count = Integer.parseInt(reader.readLine());
        saleService.removeProductFromSale(saleId, productId, count);
    }

    public static void showAllSales(SaleService saleService) {
        List<Sale> sales = saleService.getSales();

        for (Sale sale : sales) {
            System.out.println(sale);
        }
        ;

    }

    public static void deleteSale(BufferedReader reader, SaleService saleService) throws IOException {
        System.out.print("remove sale to code :");
        String saleCode = reader.readLine();
        saleService.deleteSale(saleCode);

    }

    /**
     * Not Completed
     *
     * @param reader
     * @param saleService
     * @throws IOException
     */
    public static void getDateRangeSales(BufferedReader reader, SaleService saleService) throws IOException {
        System.out.print("add first date:");
        String firstDate = reader.readLine();
        System.out.print("add second date:");
        String secondDate = reader.readLine();
        // saleService.getDateRangeSales();
    }

    public static void getCostRangeSales(BufferedReader reader, SaleService saleService) throws IOException {
        System.out.print("add min cost:");
        int min = Integer.parseInt(reader.readLine());
        System.out.print("add max cost:");
        int max = Integer.parseInt(reader.readLine());
        saleService.getCostRangeSales(min, max);
    }

    /**
     * Not Completed
     *
     * @param reader
     * @param saleService
     * @throws IOException
     */
    public static void getDateSale(BufferedReader reader, SaleService saleService) throws IOException {
        System.out.print("add date of sale ");
        String date = reader.readLine();
    }

    public static void getSaleById(BufferedReader reader, SaleService saleService) throws IOException {
        System.out.print("add  id of sale:");
        String id = reader.readLine();

        saleService.getSaleById(id);

    }


}
