package CLeanCode;

public class AdminOperations implements AdminInterface {
private final ProductServicesInterface ps ;
AdminOperations(ProductServicesInterface ps)
{
    this.ps = ps;
}
    @Override
    public void deleteProduct(Products p) {
    ps.deleteProduct(p);
    }

    @Override
    public void addProduct(String productName, int productPrice, String productCartegory, String manufacturedBy)
    {
        ps.addProduct(new Products(productName,productPrice,productCartegory,manufacturedBy));
    }

    @Override
    public void updateProductDetails(Products p) {
        System.out.println("Update the product ....");

    }
}
