package az.company.utils;

import az.company.enums.Category;
import az.company.models.Product;
import az.company.service.ProductService;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PrintProduct {

    public static void showProductsByName(BufferedReader reader, ProductService productService) throws IOException {
        System.out.print("search products by name ");
        String name = reader.readLine();
        productService.showProductsByName(name);
    }

    public static void showProductsByCostRange(BufferedReader reader, ProductService productService) throws IOException {

        System.out.print("add min cost ");
        int min = Integer.parseInt(reader.readLine());
        System.out.print("add max cost ");
        int max = Integer.parseInt(reader.readLine());
        productService.showProductsByCostRange(min, max);
    }

    public static void showProductsByCategory(BufferedReader reader, ProductService productService) throws IOException {
        String[] array = Arrays.stream(Category.values()).map(Enum::name).toArray(String[]::new);
        String categories = String.join(",", array);
        System.out.print("search product by category (" + categories + ") :");
        Category productCategory = Category.valueOf(reader.readLine());
        productService.showProductsByCategory(productCategory);
    }

    public static void showAllProducts(ProductService productService) {
        List<Product> products = productService.getProducts();

        for (Product product : products) {
            System.out.println(product);
        }

    }


    public static void deleteProduct(BufferedReader reader, ProductService productService) throws IOException {
        System.out.print("remove product to code :");
        int productCode = Integer.parseInt(reader.readLine());
        productService.deleteProduct(productCode);
    }

    public static void updateProduct(BufferedReader reader, ProductService productService) throws IOException {
        System.out.print("update product");
        int productCode = Integer.parseInt(reader.readLine());
        System.out.print("update product name :");
        String productName = reader.readLine();
        System.out.print("update product  cost :");
        double productCost = Double.parseDouble(reader.readLine());
        System.out.print("update product count ");
        int productCount = Integer.parseInt(reader.readLine());
        String[] array = Arrays.stream(Category.values()).map(Enum::name).toArray(String[]::new);
        String categories = String.join(",", array);
        System.out.print("update product category (" + categories + ") :");

        Category productCategory = Category.valueOf(reader.readLine());

        productService.updateProduct(productCode, productName, productCost, productCount, productCategory);
    }


    public static void addNewProduct(BufferedReader reader, ProductService productService) throws IOException {
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
        System.out.print("add product category (" + categories + ") :");

        Category productCategory = Category.valueOf(reader.readLine());

        productService.addNewProduct(productCode, productName, productCost, productCount, productCategory);
    }
}
