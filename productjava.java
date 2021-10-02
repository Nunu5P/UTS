package Products;
public class Product {
    String name;
    double price;
    private double subtotal, discount_amount, tax_amount, grandTotal;
    public Product(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
    public void getProductListing(int qty, double tax, double discount){
        
        setPrice(50000);
        subtotal = qty * price;
        discount_amount = discount/100 * subtotal;
        tax_amount = tax/100 * (subtotal - price);
        grandTotal = subtotal - discount + tax;

        System.out.println("==========ProductListing========");
        System.out.println(String.format("Harga dalam Rupiah: Rp%,.2f", price));
        System.out.println(String.format("Subtotal: Rp%,.2f", subtotal));
        System.out.println(String.format("potongan: Rp%,.2f", discount_amount));
        System.out.println(String.format("pajak: Rp%,.2f", tax_amount));
        System.out.println(String.format("grand total: Rp%,.2f", grandTotal));
        System.out.println("==================");
    }
}
