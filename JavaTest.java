class DrumKit {
    boolean topHate = true;
    boolean snare = true;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}

class JavaTest {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        if (d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();

    }
}