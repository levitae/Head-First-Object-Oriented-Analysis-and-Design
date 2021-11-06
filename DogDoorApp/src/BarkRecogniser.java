import java.util.Iterator;

public class BarkRecogniser {
    private DogDoor door;

    public BarkRecogniser(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark barkSound) {
        System.out.println("\tBarkRecognizer: Heard a \'"+barkSound.getSound()+"\'");
        for (Bark bark : this.door.getAllowedBarks()) {
            if (bark.equals(barkSound)) {
                this.door.open();
                return;
            }
        }
    }
}
