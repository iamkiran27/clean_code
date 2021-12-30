package CLeanCode;

import java.security.SecureRandom;

public class Products {
    private String productName;
    private int productPrice;
    private  String productCartegory;
    private String manufacturedBy;
    private DataBase db;
    Products(DataBase db )
    {
        this.db = db;
    }

    public Products(String productName, int productPrice, String productCartegory, String manufacturedBy) {
        this.productName = productName;
        this.productCartegory = productCartegory;
        this.manufacturedBy = manufacturedBy;
        this.productPrice = productPrice;
    }


    public void addProduct(String productName, int productPrice, String productCartegory, String manufacturedBy, String productId)
    {
        db.addProduct(new Products(productName,productPrice,productCartegory,manufacturedBy));
    }


   public String getProductDetails(Products p)
    {

       return  "Product name : "+p.productName+"\n"+"" +
               "Produt Price : "+p.productPrice+"\n"+"Product category : "+p.productCartegory+
               "\n"+"Manufactured by : "+p.manufacturedBy;
    }

}
