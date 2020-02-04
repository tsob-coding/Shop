import java.util.Scanner;

public class Driver
{
    // Instances //

    private Scanner input = new Scanner (System.in);
    private Product product;

    // Methods //

    public void addProduct()
    {

        System.out.println("Enter the Product Name: ");
        String productName = input.nextLine();

        System.out.println("Enter the Product Code: ");
        int productCode = input.nextInt();

        System.out.println("Enter the Unit Cost");
        double unitCost = input.nextDouble();

        System.out.println("Is this product in your current line (y/n): ");
        char currentProduct = input.next().charAt(0);

        boolean inCurrentProductLine = false;
        if ((currentProduct == 'y') || (currentProduct == 'Y'))
            inCurrentProductLine = true;

        product = new Product(productName, productCode, unitCost, inCurrentProductLine);

    }
    public void printProduct()
    {
        System.out.println(product.toString());
    }

    public static void main (String[] args)
    {
        Driver c = new Driver();
        c.addProduct();
        c.printProduct();
    }
}
