public class Cart implements HotelService {

    private int numberOfCarts; 

    public Cart(int numberOfCarts){
        this.numberOfCarts = numberOfCarts;
    }

    @Override 

    public void performService(){
        requestCart(numberOfCarts);
    }

    public void requestCart(int numberOfCarts){
        System.out.println(numberOfCarts + " luggage carts have been requested."); 
    }
}