package Cameras;

public class Camera {
    private boolean active = false; 
    String serialNumber;
    Position position = new Position();

    boolean getActive(){
        return active;
    }

    Position getPositions() {
        return position;
    }

    void setPosition(Position position){
        this.position = position;
    }

    void setPosition(int x, int y,  int z ){
        position.x = x; 
        position.y = y; 
        position.z = z; 
    }

    @Override
    public String toString() {
        return "serialNumber: " + serialNumber + 
                "active: " + active;
    }

}