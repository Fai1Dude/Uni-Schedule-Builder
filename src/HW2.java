import java.io.File;

public class HW2 {
    public static void main(String[] args) {
        File file = new File("C:/Users/Faisa/Downloads/new");
        dir(file);
    }
    public static void dir(File file) {
        try {
            File[] files = file.listFiles();
            for (File afile : files) {
                if (afile.isDirectory()) {
                    System.out.println("directory :" + afile.getCanonicalPath());
                    dir(afile);
                } else {
                    System.out.println("    file:" + afile.getCanonicalPath());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}