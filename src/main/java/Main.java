import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {

            if(args.length == 0 || !fileExists(args[0])) {
                throw new IllegalArgumentException();
            }

            String fileName = args[0];
            LineCounter counter = new LineCounter(fileName);
            System.out.println("Число строк в файле " + fileName + " = " + counter.getFileLinesCount());

        } catch (IllegalArgumentException e) {
            System.out.println("Программа должна принимать один параметр - путь до существующего файла!");
        } catch (IOException e) {
            System.out.println("Что-то пошло не так, попробуйте еще раз.");
        }

    }

    private static boolean fileExists(String fileName) {
        File file = new File(fileName);
        return file.exists() && !file.isDirectory();
    }
}
