public class HotelApp{

    public static void main(String[] args) {
        
        FrontDesk frontDesk = new FrontDesk();

        //request valet service
        frontDesk.requestValetService("ABC987");

        //request housekeeping service
        frontDesk.requesHouseKeepingService("2149");

        //request cart service
        frontDesk.requestCartService(3);
    }
}