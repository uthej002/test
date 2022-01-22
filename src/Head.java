public class Head {
    private boolean hair;
    private String eyeColor;
    private boolean spectacles;

    public boolean isHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public boolean isSpectacles() {
        return spectacles;
    }

    public void setSpectacles(boolean spectacles) {
        this.spectacles = spectacles;
    }

    public void printDetails() {
            System.out.println("bald?: " +hair);
        System.out.println("Eye color: " +eyeColor);
        System.out.println("wearing spectacles: " +spectacles);
    }
}
