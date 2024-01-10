public class InfoString {
    public static String boxInfoString(Box box) {
        String str = "Length: " + box.getLength();
        str += "\nWidth: " + box.getWidth();
        str += "\nHeight: " + box.getHeight();
        return str;
    }
}

