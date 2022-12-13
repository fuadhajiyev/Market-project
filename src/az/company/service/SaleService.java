package az.company.service;

import az.company.models.Product;
import az.company.models.Sale;
import az.company.models.SaleProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SaleService {

     List<Sale> sales = new ArrayList<>();
    String id = UUID.randomUUID().toString();
    /**
     * step1 -
     * @param sales
     * @return
     */
    public  Sale addNewSale(List<SaleProduct> sales){
         Sale  addSale = new Sale();

    }

}
