public class SalesPerson {

    private String id;
    private Sales[] salesHistory = new Sales[5]; // details of the different sales
    private int count = 0;	// number of sales made
    //constructor for a new salesperson

    public SalesPerson(String id) {
        this.id = id;
    }

    public SalesPerson(String id, Sales[] s, int c) {
        //code missing
        this.id = id;
    }
    public int getCount(){
        return count;
    }
    public String getId() {
        return id;
    }
    public void setSalesHistory(Sales s) {

        salesHistory[count] = s;
        count++;
    }
    public double calcTotalSales()
    {
        int val = 0;
        for(int i =0; i<count; i++){
                val += salesHistory[i].getValue();
        }
        return val;
    }
    public Sales largestSale(){ // calculates the sale with the largest value

        int num = 0;
        double max = salesHistory[0].getValue();
        for(int i =0; i< salesHistory.length; i++){
            if(salesHistory[i].getValue()>max){
                max = salesHistory[i].getValue();
                num = i;
            }
        }
        return salesHistory[num];

    }

}
