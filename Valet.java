public class Valet implements HotelService{

    private String plateNumber; 

    public Valet(String plateNumber){
        this.plateNumber = plateNumber;
    }

    @Override 
    public void performService(){
        pickUpVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber){
        System.out.println("Vehicle with plate "+plateNumber+" has been picked up by the valet.");
    }
}