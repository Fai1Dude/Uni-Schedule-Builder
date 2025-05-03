import java.io.File;

public class LAB21 {
    public static void main(String[] args) {
        File file = new File("C:/Users/Faisal/Desktop/ICS108");
        System.out.println(directoryDepth(file));
    }

    public static int directoryDepth(File folder) {
        int depth = 0;
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            for (int i = 0; i < files.length; i++) {
                int newDepth = 1;
                newDepth += directoryDepth(files[i]);
                if (newDepth > depth) {
                    depth = newDepth;
                }
            }
        }
        return depth;
    }
}
