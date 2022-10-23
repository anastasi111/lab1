package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        List Sp =new List();
        System.out.print("Enter the number of  required items:");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            Sp.add(i+1);
        }
        System.out.print("Сompiled list:");
        Sp.print();
        System.out.println();
        System.out.print("Enter the item you want to delete:");
        int i=in.nextInt();
        System.out.print(Sp.remove(i-1));
        System.out.println();
        System.out.print("List after deleting an item:");
        Sp.print();
        System.out.println();
        System.out.print("Enter the item you want to get:");
        i=in.nextInt();
        System.out.print(Sp.get(i-1));
        System.out.println();
    }
}