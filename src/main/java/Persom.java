import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.corba.se.impl.orbutil.graph.NodeData;

import java.util.*;
import java.util.stream.Collectors;

public class Persom {

   private String customer;
   private String productName;
   private int quantity;
   private int pricePerItem;

    public Persom(String customer, String productName, int quantity, int pricePerItem) {
        this.customer = customer;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public static void main(String[] args) {
        Persom p = new Persom("Shiv", "Apple", 5, 10);
        Persom p1 = new Persom("Shiv", "Orange", 1, 5);
        Persom p2 = new Persom("Saurabh", "Apple", 2, 10);
        Persom p3 = new Persom("Saurabh", "WaterMelon", 10, 50);
        Persom p4 = new Persom("Adam", "Orange", 10, 5);
        Persom p5 = new Persom("Ankur", "Milk", 2, 15);

        List<Persom> persons = new ArrayList<>();
        persons.add(p);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);


        // persons.forEach(a -> System.out.println(a.getCustomer()+" "+a.getProductName()+" "+a.getQuantity()+" "+a.getPricePerItem()));

       Optional<Integer> pa = persons.stream().map(a -> (a.getQuantity() * a.getPricePerItem())).filter(a->a>a).findAny();
       List<Persom> pd=persons.stream().distinct().collect(Collectors.toList());


        System.out.println(pd);

        String maxP = "";
        int max = 0;
        for (Persom persom : persons) {
            if (max <(persom.getPricePerItem() * persom.pricePerItem)) {
                max=persom.getPricePerItem() * persom.pricePerItem;
                maxP = persom.getProductName();
            }
        }
        System.out.println(maxP+" "+max);


        List<Integer> list=Arrays.asList(2,4,7,9,10,15,42);

       list.stream().filter(a -> a % 2 == 0).forEach(a-> System.out.println(a));

       String d="Disussiosion";
       d=d.replace("sio", "***");
        System.out.println(d);
    }
}
