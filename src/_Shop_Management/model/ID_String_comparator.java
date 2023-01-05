package _Shop_Management.model;

import java.util.Comparator;

public class ID_String_comparator {
    class NameComparator implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            return p1.getProductID().compareTo(p2.getProductID());
        }
    }
}
