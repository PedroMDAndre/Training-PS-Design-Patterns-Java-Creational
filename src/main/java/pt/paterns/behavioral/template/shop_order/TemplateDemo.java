package pt.paterns.behavioral.template.shop_order;

public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("Web Order:");

        OrderTemplate webOrder = new WebOrder();
        webOrder.setGift(true);
        webOrder.processOrder();


        System.out.println("\nStore Order:");

        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }

}
