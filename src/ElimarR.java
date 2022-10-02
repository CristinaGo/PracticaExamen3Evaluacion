import java.io.File;

public class ElimarR {

    public static void deleteDirRecursively(File dir) {
        File[] children = dir.listFiles();
        for (File child: children) {
            if (child.isDirectory()) {
                deleteDirRecursively(child);
            } else {
                child.delete();
            } }
        dir.delete();
    }
}
