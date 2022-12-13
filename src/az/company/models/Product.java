package az.company.models;

import az.company.enums.Category;

public class Product {
    int id;
    String productName;
    double productCost;
    int productCount;
    Category category;

    public Product() {
    }

    public Product(int id, String productName, double productCost, int productCount, Category category) {
        this.id = id;
        this.productName = productName;
        this.productCost = productCost;
        this.productCount = productCount;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product:  \n" +
                "  code = " + id + "\n"+
                "  Name = " + productName +  "\n"+
                "  Cost = " + productCost + "\n"+
                "  Count = " + productCount +"\n"+
                "  Category = " + category +"\n"+
                "#################################";
    }
}
