import java.util.Scanner;

public class IVAdiscount {
    public static void main (String[] args) {
        // 3. VAT discount (VAT = Value Added Tax, en español es IVA = Impuesto de valor agregado)
        // Write value of a product and take out the percentage according to the vat discount.
        Scanner scan = new Scanner(System.in);
        float vat = 21;
        float productPrice;
        System.out.println("Write the product price: ");
        productPrice = scan.nextFloat();

        float discountTotal = (productPrice * vat)/100;
        float finalPrice = productPrice - discountTotal;
        System.out.println("the price to pay is = $" + finalPrice);
    }
}
