package az.company.models;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Sale {
    private int id;
    private int saleCost;
    private List<SaleProduct> saleProducts;

    private Date saleOfDate;

    public Sale() {
    }


    public Sale(int id, int saleCost, List<SaleProduct> saleProducts, Date saleOfDate) {
        this.id = id;
        this.saleCost = saleCost;
        this.saleProducts = saleProducts;
        this.saleOfDate = saleOfDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
