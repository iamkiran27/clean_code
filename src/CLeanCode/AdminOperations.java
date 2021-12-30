package CLeanCode;

public class AdminOperations implements AdminInterface {
private DataBase db ;
AdminOperations(DataBase db)
{
    this.db = db;
}
    @Override
    public void deleteProduct(Products p) {
    db.deleteProduct(p);
    }

    @Override
    public void addProduct(String productName, int productPrice, String productCartegory, String manufacturedBy)
    {
        db.addProduct(new Products(productName,productPrice,productCartegory,manufacturedBy));
    }

    @Override
    public void updateProductDetails(Products p) {
        System.out.println("Update the product ....");

    }
}
