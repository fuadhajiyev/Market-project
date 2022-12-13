package az.company.service;

import az.company.models.Sale;
import az.company.models.SaleProduct;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class SaleService {

    List<Sale> sales = new ArrayList<>();

    public List<Sale> getSales() {
        return sales;
    }

    public Sale addNewSale(List<SaleProduct> saleProducts) {
        // 1. calculate total cost
        //    iterate each SaleProduct, multiple product cost * count and sum
        // 2. generate unique UUID to set to ID
        // 3. set saleProducts to saleProducts

        int totalCost = 0;
        for (SaleProduct saleProduct : saleProducts) {
            totalCost += saleProduct.getProduct().getProductCost() * saleProduct.getCount();
        }

        String id = UUID.randomUUID().toString();

        Sale addSale = new Sale(id, totalCost, saleProducts, new Date());
        sales.add(addSale);
        return addSale;
    }

    public void removeProductFromSale(String saleId, int productId, int count) {
        // 1. Find sale with the given saleId
        // 2. Find the Product inside Sale with the given ID
        // 3. Make sure there's enough product in sale to remove
        // 4. recalculate total cost

        Sale foundSale = null;
        for (Sale sale : sales) {
            if (sale.getId().equals(saleId)) {
                foundSale = sale;
            }
        }

        if (foundSale != null) {
            List<SaleProduct> saleProducts = foundSale.getSaleProducts();

            // remove operation
            for (SaleProduct saleProduct : saleProducts) {
                if (saleProduct.getProduct().getId() == productId) {
                    if (saleProduct.getCount() == count) {
                        saleProducts.remove(saleProduct);
                    } else if (saleProduct.getCount() > count) {
                        saleProduct.setCount(saleProduct.getCount() - count);
                    } else {
                        throw new RuntimeException("There is enough products to remove");
                    }
                }
            }

            foundSale.setSaleProducts(saleProducts);
            foundSale.reCalculateTotalCost();
        }
    }

}
