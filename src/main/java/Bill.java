public class Bill {
    public int calculateBill(List<Item> items){
        int bill = 0;
        for(Item item: items)
        {
            bill = bill + item.price;
        }
        return bill;
    }
}
