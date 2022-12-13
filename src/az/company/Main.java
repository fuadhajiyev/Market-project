package az.company;

import az.company.enums.Category;
import az.company.models.Product;
import az.company.models.Sale;
import az.company.models.SaleProduct;
import az.company.service.ProductService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        ProductService productService = new ProductService();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;

        while (!exit) {
            boolean exitProductMenu = false;
            System.out.println();
            System.out.println("Press 1 Mehsullar uzerinde emeliyyat aparmaq");
            System.out.println("Press 2 Satislar uzerinde emeliyyat aparmaq");
            System.out.println("Press 3 anything else to exit");
            System.out.print("Type (waiting...): ");


            int code = Integer.parseInt(reader.readLine());
            if (code == 1) {
                while (!exitProductMenu) {
                    System.out.println();
                    System.out.println("Press 1 Yeni mehsul elave et ");
                    System.out.println("Press 2 Mehsul uzerinde duzelis et ");
                    System.out.println("Press 3 Mehsulu sil");
                    System.out.print("Type (waiting...): ");
                    int codeProduct = Integer.parseInt(reader.readLine());

                    switch (codeProduct) {
                        case 1:

                            System.out.print("add product code :");

                            int productCode = Integer.parseInt(reader.readLine());
                            System.out.print("add product name :");
                            String productName = reader.readLine();
                            System.out.print("add product  cost :");
                            double productCost = Double.parseDouble(reader.readLine());
                            System.out.print("add product count ");
                            int productCount = Integer.parseInt(reader.readLine());
                            String[] array = Arrays.stream(Category.values()).map(Enum::name).toArray(String[]::new);
                            String categories = String.join(",", array);
                            System.out.print("add product category ("+categories +") :");

                            Category productCategory = Category.valueOf(reader.readLine());

                            productService.addNewProduct(productCode, productName, productCost, productCount, productCategory);
                            break;
                        case 2:
                            // code block
                            break;
                        default:
                            // code block
                    }
                }
            } else if (code == 2) {

            } else {
                exit = true;
            }
        }

    }
}
