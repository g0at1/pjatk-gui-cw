package cwiczenia.c07.e02;

import java.io.*;
import java.util.*;

public
    class Main {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        File file = new File(inputFile);
        Map<String, List<Purchase>> purchasesByPerson = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String personName = parts[0];
                String productName = parts[1];
                double price = Double.parseDouble(parts[2]);

                Purchase purchase = new Purchase(productName, price);
                List<Purchase> purchases = purchasesByPerson.getOrDefault(personName, new ArrayList<>());
                purchases.add(purchase);
                purchasesByPerson.put(personName, purchases);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (String person : purchasesByPerson.keySet()) {
                List<Purchase> purchases = purchasesByPerson.get(person);
                int numPurchases = purchases.size();
                double totalPrice = 0.0;
                Map<String, Integer> productCounts = new HashMap<>();
                for (Purchase purchase : purchases) {
                    totalPrice += purchase.getPrice();
                    String product = purchase.getName();
                    int count = productCounts.getOrDefault(product, 0);
                    productCounts.put(product, count + 1);
                }
                int numProducts = productCounts.size();
                writer.println(person + " " + numPurchases + " " + numProducts + " " + totalPrice);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
