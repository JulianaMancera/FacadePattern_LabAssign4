public class HouseKeeping implements HotelService {
    private String roomNumber;

    public HouseKeeping(String roomNumber){
        this.roomNumber = roomNumber;
    }

    @Override 
    public void performService(){
        cleanrRoom(roomNumber);
    }
    public void cleanrRoom(String roomNumber){
        System.out.println("Room "+roomNumber+ " has been cleaned.");
    }
}