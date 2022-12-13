package az.company.models;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Sale {
    private String id;
    private int saleCost;
    private List<SaleProduct> saleProducts;

    private Date saleOfDate;

    public Sale(String id, int saleCost, List<SaleProduct> saleProducts, Date saleOfDate) {
        this.id = id;
        this.saleCost = saleCost;
        this.saleProducts = saleProducts;
        this.saleOfDate = saleOfDate;
    }

    public void reCalculateTotalCost() {
        int totalCost = 0;
        for(SaleProduct saleProduct: saleProducts) {
            totalCost += saleProduct.count * saleProduct.getProduct().getProductCost();
        }

        this.saleCost = totalCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(int saleCost) {
        this.saleCost = saleCost;
    }


    public Date getSaleOfDate() {
        return saleOfDate;
    }

    public void setSaleOfDate(Date saleOfDate) {
        this.saleOfDate = saleOfDate;
    }

    public List<SaleProduct> getSaleProducts() {
        return saleProducts;
    }

    public void setSaleProducts(List<SaleProduct> saleProducts) {
        this.saleProducts = saleProducts;
    }

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", saleCost=" + saleCost +
                ", saleProducts=" + saleProducts +
                ", saleOfDate=" + saleOfDate;
    }
}
