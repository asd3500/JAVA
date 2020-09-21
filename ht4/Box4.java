/**
 * for task #2
 */
public class Box4 {

    double width;
    double height;
    double depth;

    /**
     * calculates and returns box volume
     * @return box volume
     */
    double getVolume() {
        return width * height * depth;
    }

    /**
     * prints instance variables
     */
    void show() {
        System.out.printf("%.2f;%.2f;%.2f\n", width, height, depth);
    }
}
