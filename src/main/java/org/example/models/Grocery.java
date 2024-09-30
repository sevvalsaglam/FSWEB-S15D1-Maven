package org.example.models;

import java.util.*;

public class Grocery {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> groceryList=new ArrayList<>();

    public void startGrocery(){

        int choice;
        do{
            System.out.println("Yapılmak istenen operasyonu seçin. 0-> çıkış, 1-> ekleme, 2-> çıkarma ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz:");
                    String itemsToAdd= scanner.nextLine();
                    addItems(itemsToAdd);
                    printSorted();
                    break;
                case 2:
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz:");
                    String itemsToRemove= scanner.nextLine();
                    removeItems(itemsToRemove);
                    printSorted();
                    break;
            }
        }while (choice!=0);
        scanner.close();

    }
    public static void addItems(String itemsToAdd){
        String[] splitItems= itemsToAdd.split(",");
        for(String item: splitItems){
            item=item.trim();
            if(checkItemsInList(item)){
                System.out.println("Girilen item listede mevcut :" +item);
            }else{
                groceryList.add(item);
            }
        }
        printSorted();
    }
    private static boolean checkItemsInList(String item){
        return groceryList.contains(item);
    }
    public static void removeItems(String itemsToRemove){
        String[] splitItems= itemsToRemove.split(",");
        for(String item: splitItems){
            item=item.trim();
            if(checkItemsInList(item)){
                groceryList.remove(item);
            }else{
                System.out.println("Girilen item listede yok :" +item);
            }
        }
        printSorted();
    }
    public static void printSorted(){
        sortItems();
        System.out.println("Mevcut pazar listesi: ");
        for(String item : groceryList){
            System.out.println(item);
        }
    }

    private static void sortItems() {
        Collections.sort(groceryList);
    }
}
