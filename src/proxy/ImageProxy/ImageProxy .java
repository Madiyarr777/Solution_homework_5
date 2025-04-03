package proxy;

public interface Image {
    void displayThumbnail();
    void displayFullImage();
}
package proxy;

public class ImageProxy implements Image {
    protected String filename;
    protected RealImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    public ImageProxy() {
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Showing low-res preview: " + filename);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}
