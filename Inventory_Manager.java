import java.util.ArrayList;
import java.util.Scanner;

public class Inventory_Manager {
    public static void main(String[] args)
    {
        boolean i = true;
        int menu;
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> List = new ArrayList<>();

        while(i)
        {
            System.out.println("==== Inventory Management System ====" +
                    "1) Add Product"+
                    "2) Update Product"+
                    "3) List Products"+
                    "4) Exit");
                menu = sc.nextInt();
                switch (menu)
                {
                    case 1:
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
