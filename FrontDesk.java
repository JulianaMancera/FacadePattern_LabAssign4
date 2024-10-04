public class FrontDesk{
    public void requestValetService(String plateNumber){
        Valet valet = new Valet(plateNumber);
        valet.performService();
    }

    public void requesHouseKeepingService(String roomNumber){
        HouseKeeping HouseKeeping = new HouseKeeping (roomNumber);
            HouseKeeping.performService();
    }

    public void requestCartService(int numberOfCarts){
        Cart cart = new Cart(numberOfCarts);
            cart.performService();
    }

}
