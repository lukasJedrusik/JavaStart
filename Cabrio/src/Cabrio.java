public class Cabrio {

    private String name;
    private String brand;
    private boolean isMoving;
    private boolean roofIsOpen;

    public Cabrio(String name, String brand, boolean isMoving, boolean roofIsOpen) {
        this.name = name;
        this.brand = brand;
        this.isMoving = isMoving;
        this.roofIsOpen = roofIsOpen;
    }

    public Cabrio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isRoofIsOpen() {
        return roofIsOpen;
    }

    public void setRoofIsOpen(boolean roofIsOpen) {
       if (!this.isMoving) {
           this.roofIsOpen = roofIsOpen;
       } else{
           System.out.println("Samochód w ruchu!");
       }
    }


}
