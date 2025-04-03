import flyweight.MapMarker;
import flyweight.MarkerStyleFactory;
import model.User;
import proxy.ProtectedImageProxy;

import java.util.ArrayList;
import java.util.List;

public class HomeworkDemo {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demonstration ===");
        User agent = new User("agent007", true);
        ProtectedImageProxy imageProxy = new ProtectedImageProxy("property1.jpg", agent);
        imageProxy.displayThumbnail();
        imageProxy.displayFullImage();
        imageProxy.uploadImage("property1_updated.jpg");
        imageProxy.displayThumbnail();
        imageProxy.displayFullImage();

        System.out.println("\n=== Flyweight Pattern Demonstration ===");
        List<MapMarker> markers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            String icon, color, labelStyle;
            if (i % 3 == 0) {
                icon = "clinic";
                color = "crimson";
                labelStyle = "strong";
            } else if (i % 3 == 1) {
                icon = "diner";
                color = "navy";
                labelStyle = "slanted";
            } else {
                icon = "fuel_station";
                color = "olive";
                labelStyle = "regular";
            }
            markers.add(new MapMarker(i, i, icon, color, labelStyle));
        }
        System.out.println("Total markers: " + markers.size());
        System.out.println("Unique marker styles: " + MarkerStyleFactory.getTotalStyles());
    }
}
