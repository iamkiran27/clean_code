package CLeanCode;

public class Products implements  ProductsInterface {
    private String productName;
    private int productPrice;
    private  String productCartegory;
    private String manufacturedBy;

    public Products(String productName, int productPrice, String productCartegory, String manufacturedBy) {
        this.productName = productName;
        this.productCartegory = productCartegory;
        this.manufacturedBy = manufacturedBy;
        this.productPrice = productPrice;
    }

    public Products() {

    }


    public String getProductDetails(Products p)
    {

       return  "Product name : "+p.productName+"\n"+"" +
               "Produt Price : "+p.productPrice+"\n"+"Product category : "+p.productCartegory+
               "\n"+"Manufactured by : "+p.manufacturedBy;
    }



}
