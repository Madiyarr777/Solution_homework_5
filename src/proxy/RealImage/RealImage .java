package proxy;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading full resolution image from disk: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Showing preview extracted from full image: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying full resolution image: " + filename);
    }
}
