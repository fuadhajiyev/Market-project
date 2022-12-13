package az.company.service;

import az.company.enums.Category;
import az.company.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();

    /**
     * @return all products
     */
    public List<Product> getProducts() {
        return products;
    }

    public List<Product> showProductsByCategory(Category category) {
        List<Product> categoryProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory() == category) {
                categoryProducts.add(product);
            }

        }
        return categoryProducts;
    }

    public List<Product> showProductsByCostRange(int min, int max) {
        List<Product> costRangeProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getProductCost() <= max && product.getProductCost() >= min) {
                costRangeProducts.add(product);
            }
        }
        return costRangeProducts;

    }

    public List<Product> showProductsByName(String name) {
        List<Product> nameByProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getProductName().equals(name)) {
                nameByProducts.add(product);
            }
        }

        return nameByProducts;
    }

    public Product addNewProduct(int id, String productName, double productCost, int productCount, Category category) {

        Product newProduct = new Product(id, productName, productCost, productCount, category);
        products.add(newProduct);
        return newProduct;

    }

    public Product updateProduct(int id, String productName, double productCost, int productCount, Category category) {

        for (Product prod : products) {
            if (prod.getId() == id) {
                prod.setProductName(productName);
                prod.setProductCost(productCost);
                prod.setProductCount(productCount);
                prod.setCategory(category);
                return prod;
            }

        }
        return null;

    }

    public  String deleteProduct(int id) {

        for (Product prod : products) {
            if (prod.getId() == id) {
                products.remove(prod);
                return "id " + id + " product success deleted !";
            }

        }
        return null;

    }
}
