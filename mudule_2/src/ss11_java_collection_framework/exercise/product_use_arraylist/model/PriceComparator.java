package ss11_java_collection_framework.exercise.product_use_arraylist.model;

import java.util.Comparator;

public class PriceComparator implements Comparator<MobilePhone> {

    @Override
    public int compare(MobilePhone o1, MobilePhone o2) {
        if (o1.getPriceProduct() > o2.getPriceProduct()) {
            return 1;
        } else if (o1.getPriceProduct() == o2.getPriceProduct()){
            return 0;
        } else {
            return -1;
        }
    }
}
