import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Inventory_Manager {
    public static void main(String[] args)
    {
        String Id, name;
        double price;
        boolean i = true, check =true;
        int menu , quantity;
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> List = new ArrayList<>();

        while(i)
        {
            Product product = new Product();
            System.out.println("==== Inventory Management System ====" +
                    "1) Add Product"+
                    "2) Update Product"+
                    "3) List Products"+
                    "4) Exit");
                menu = sc.nextInt();
                switch (menu)
                {
                    case 1:
                        while(check) {
                            System.out.println("Please enter Product Id: ");
                            Id = sc.nextLine();
                            for (Product p : List) {
                                if (Objects.equals(Id, p.getProductId())) {
                                    System.out.println("Id already in use, please input new Id");
                                    break;
                                }
                                product.setProductId(Id);
                                check = false;
                            }
                        }
                        check = true;
                        System.out.println("Please enter Product Name: ");
                        name = sc.nextLine();
                        product.setName(name);
                        System.out.println("Please enter Product Price: ");
                        price = sc.nextDouble();
                        product.setPrice(price);
                        System.out.println("Please enter Product Quantity: ");
                        quantity = sc.nextInt();
                        product.setQuantity(quantity);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Good bye");
                        i = false;
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
        }
    }
}
