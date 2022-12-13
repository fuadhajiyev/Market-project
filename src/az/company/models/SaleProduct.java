package az.company.models;

import java.util.List;

public class SaleProduct {
   String id;
   Product product;
   int count;

   public SaleProduct() {
   }

   public SaleProduct(String id, Product product, int count) {
      this.id = id;
      this.product = product;
      this.count = count;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }


   public Product getProduct() {
      return product;
   }

   public void setProduct(Product product) {
      this.product = product;
   }

   public int getCount() {
      return count;
   }

   public void setCount(int count) {
      this.count = count;
   }
}
