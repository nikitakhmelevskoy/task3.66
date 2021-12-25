public class Test {
    static boolean testPoints(Picture picture) {

        if (picture.getColor(1, 2) != SimpleColor.BLUE) {
            System.out.println("Test 1 failed");
            return false;
        } else if (picture.getColor(-9,-4 ) != SimpleColor.WHITE) {
            System.out.println("Test 2 failed");
            return false;
        } else if (picture.getColor(0, -9) != SimpleColor.GREEN) {
            System.out.println("Test 3 failed");
            return false;
        } else if (picture.getColor(-6, 0) != SimpleColor.GREY) {
            System.out.println("Test 4 failed");
            return false;
        } else {
            return true;

        }
    }

}