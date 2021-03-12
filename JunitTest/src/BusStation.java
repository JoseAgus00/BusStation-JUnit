public class BusStation {

    int amount;
    int maxAmount;
    int minAmount;

    public BusStation(int amount, int maxAmount, int minAmount){
        this.amount = amount;
        this.maxAmount = maxAmount;
        this.minAmount = minAmount;
    }

    public String getResponse(){
        String response;
        if(amount <= maxAmount && amount > minAmount ){
            response = "Sale el bus";
        }else{
            response = "No sale el bus";
        }
        return response;
    }

}



