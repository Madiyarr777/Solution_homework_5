package proxy;

import model.User;

public class ProtectedImageProxy extends ImageProxy {
    private final User user;

    public ProtectedImageProxy(String filename, User user) {
        super(filename);
        this.user = user;
    }

    public ProtectedImageProxy(String image, User agent, User user) {
        super();
        this.user = user;
    }

    public void uploadImage(String newFilename) {
        if (!user.isLoggedIn()) {
            System.out.println("Error: User " + user.getUsername() + " is not permitted to upload images!");
            return;
        }
        System.out.println("Uploading new image: " + newFilename + " by user " + user.getUsername());
        this.filename = newFilename;
        this.realImage = null;
    }
}
