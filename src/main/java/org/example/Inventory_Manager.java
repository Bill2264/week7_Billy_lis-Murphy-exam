package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory_Manager {
    public static void main(String[] args)
    {
        String Id, name;
        double price;
        boolean check =true;
        int menu, i = 0, quantity;
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> List = new ArrayList<>();

        while(i < 1)
        {
            Product product = new Product();
            System.out.println("""
                    ==== Inventory Management System ====\
                    
                    1) Add Product\
                    
                    2) Update Product\
                    
                    3) List Products\
                    
                    4) Exit""");
                menu = sc.nextInt();
                switch (menu)
                {
                    case 1:
                        if(i != 0) {
                            while (check) {
                                System.out.println("Please enter Product Id: ");
                                Id = sc.next();
                                product.setProductId(Id);
                                for (Product p : List) {
                                    if (Id.equals(p.getProductId())) {
                                        System.out.println("Id already in use, please input new Id");
                                        check = true;
                                        break;
                                    }
                                    check = false;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Please enter Product Id: ");
                            Id = sc.next();
                            product.setProductId(Id);
                        }

                        check = true;
                        System.out.println("Please enter Product Name: ");
                        name = sc.next();
                        product.setName(name);
                        System.out.println("Please enter Product Price: ");
                        price = sc.nextDouble();
                        product.setPrice(price);
                        System.out.println("Please enter Product Quantity: ");
                        quantity = sc.nextInt();
                        product.setQuantity(quantity);
                        List.add(product);
                        break;
                    case 2:
                        while(check && (i != 0)) {
                            System.out.println("Please enter Product Id you wish to change: ");
                            Id = sc.next();
                            for (Product p : List) {
                                if (Id.equals(p.getProductId())) {
                                    System.out.println("Please enter Product Name: ");
                                    name = sc.next();
                                    p.setName(name);
                                    System.out.println("Please enter Product Price: ");
                                    price = sc.nextDouble();
                                    p.setPrice(price);
                                    System.out.println("Please enter Product Quantity: ");
                                    quantity = sc.nextInt();
                                    p.setQuantity(quantity);
                                    List.add(product);
                                    check = true;
                                    break;
                                }
                                check = false;
                            }
                        }
                        if(!check)
                        {
                            System.out.println("Id not associated with any product");
                            check = true;
                        }
                        break;
                    case 3:
                        for(Product p : List)
                        {
                            System.out.println(p);
                        }
                        break;
                    case 4:
                        System.out.println("Good bye");
                        i = 1;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                i--;
        }
    }
}
