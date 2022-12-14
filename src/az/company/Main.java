package az.company;

import az.company.service.ProductService;
import az.company.service.SaleService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static az.company.utils.PrintSale.*;
import static az.company.utils.PrintProduct.*;

public class Main {
    public static void main(String[] args) throws IOException {

        ProductService productService = new ProductService();
        SaleService saleService = new SaleService();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;

        while (!exit) {
            boolean exitProductMenu = false;
            System.out.println();
            System.out.println("Press 1 To operate on products");
            System.out.println("Press 2 To operate on sales");
            System.out.println("Press 3 anything else to exit");
            System.out.print("Type (waiting...): ");

            int code = Integer.parseInt(reader.readLine());
            if (code == 1) {
                while (!exitProductMenu) {
                    System.out.println();
                    System.out.println("Press 1 add new product ");
                    System.out.println("Press 2 edit product ");
                    System.out.println("Press 3 remove product");
                    System.out.println("Press 4 show all products");
                    System.out.println("Press 5 show products by category");
                    System.out.println("Press 6 show products by range cost");
                    System.out.println("Press 7 show products by name");
                    System.out.println("Press 8 anything else to back");
                    System.out.print("Type (waiting...): ");
                    int codeProduct = Integer.parseInt(reader.readLine());

                    switch (codeProduct) {
                        case 1:
                            addNewProduct(reader, productService);
                            break;
                        case 2:
                            updateProduct(reader, productService);
                            // code block
                            break;
                        case 3:
                            deleteProduct(reader, productService);
                            // code block
                            break;
                        case 4:
                            showAllProducts(productService);
                            // code block
                            break;
                        case 5:
                            showProductsByCategory(reader, productService);
                            // code block
                            break;
                        case 6:
                            showProductsByCostRange(reader, productService);
                            // code block
                        case 7:
                            showProductsByName(reader, productService);
                            // code block
                        default:
                            exitProductMenu = true;
                    }
                }
            } else if (code == 2) {
                while (!exitProductMenu) {
                    System.out.println();
                    System.out.println("Press 1 add new sale ");
                    System.out.println("Press 2 Returning any product on sale");
                    System.out.println("Press 3 remove sale");
                    System.out.println("Press 4 show all sales");
                    System.out.println("Press 5 show sales range by date");
                    System.out.println("Press 6 show sale by cost");
                    System.out.println("Press 7 show sale by date");
                    System.out.println("Press 8 show sale by id");
                    System.out.println("Press 9 anything else to back");
                    System.out.print("Type (waiting...): ");
                    int codeSale = Integer.parseInt(reader.readLine());

                    switch (codeSale) {
                        case 1:
                            addNewSale(reader, saleService);
                            break;
                        case 2:
                            removeProductFromSale(reader, saleService);
                            // code block
                            break;
                        case 3:
                            deleteSale(reader, saleService);
                            // code block
                            break;
                        case 4:
                            showAllSales(saleService);
                            break;
                        case 5:
                            getDateRangeSales(reader, saleService);
                            break;
                        case 6:
                            getCostRangeSales(reader, saleService);
                            break;
                        case 7:
                            getDateSale(reader, saleService);
                            break;
                        case 8:
                            getSaleById(reader, saleService);
                            break;

                        default:
                            exitProductMenu = true;
                    }
                }

            } else {

                exit = true;
            }
        }

    }

}
