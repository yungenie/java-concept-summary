package test;

import java.io.File;
import java.io.FileFilter;

public class FileTest {
    public static void main(String[] args) {
        
        File[] hiddenFiles = new File(".").listFiles(new FileFilter(){
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        System.out.println("hiddenFiles = " + hiddenFiles);

        // 메서드 참조 method referense::(이 메서드를 값으로 사용해라)
        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
        System.out.println("hiddenFiles2 = " + hiddenFiles2);
        
    }
    
}
