package lab02;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] items = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("Cart is full! Cannot add more DVDs.");
            return;
        }
        items[qtyOrdered++] = disc;
        System.out.println("Added: " + disc.getTitle());
    }

    // Overloaded method: Thêm 2 DVD
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void displayCart() {
        System.out.println("\n===== Cart Contents =====");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + items[i].getTitle() + " - $" + items[i].getCost());
        }
    }
}
