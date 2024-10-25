import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
    void readFile() throws FileNotFoundException //exception de skta hai so use throws keyword
    {
        FileInputStream fis=new FileInputStream("d:/abc.txt");
    }
    void saveFile() throws FileNotFoundException
    {
        String text ="this is demo";
        FileOutputStream fo=new FileOutputStream("d:xyz.txt");
    }
}
class Test{
    public static void main(String[] args) {
        ReadAndWrite rw=new ReadAndWrite();
        try{
        rw.readFile(); //so use try and catch handle execption 
        }
        catch(FileNotFoundException e){
            e.printStackTrace();

        }
        // System.out.println("hello1");
        try{
        rw.saveFile();
        }
        catch(FileNotFoundException  e){
            e.printStackTrace();

        }
        System.out.println("hello");
    }
}