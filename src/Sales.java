public class Sales {
    private String itemId; // id of the item
    private double value; // the price of one item private
    int quantity; // the number of the items sold
    // constructor missing
    public Sales(String id, double salesvalue, int quant){
        this.itemId = id;
        this.value = salesvalue;
        this.quantity = quant;

    }
    public double getValue() {

        return value;
    }
    public int getQuantity() {
        return quantity;
    }

}
