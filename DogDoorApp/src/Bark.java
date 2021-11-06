import java.util.List;

public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    public boolean equals(Bark bark) {
        if (bark.getSound().equalsIgnoreCase(this.sound)) {
            return true;
        }
        return false;
    }
}
