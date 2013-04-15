import java.io.IOException;
import metrics.FileNumClasses;
import org.junit.Test;

public class FileConstructParams {
@Test
    public void testNumClasses() throws IOException {
        FileNumClasses file = new FileNumClasses();
        int num = file.getFileClass("D:\\JAD\\Docs\\Proyectos\\JAVA\\NetBeans\\PractHPS\\src\\evaluator\\Calculator.java");
        System.out.println("Numero de clases del fichero: " + num);

    }

    @Test
    public void testNumFunctions() throws IOException {
        FileNumClasses file = new FileNumClasses();
        int num = file.getFunctions("D:\\JAD\\Docs\\Proyectos\\JAVA\\NetBeans\\PractHPS\\src\\evaluator\\Calculator.java");
        System.out.println("Numero de funciones del fichero: " + num);

    }

    @Test
    public void testNumImports() throws IOException {
        FileNumClasses file = new FileNumClasses();
        int num = file.getFileImports("D:\\JAD\\Docs\\Proyectos\\JAVA\\NetBeans\\PractHPS\\src\\evaluator\\Calculator.java");
        System.out.println("Numero de imports del fichero: " + num);

    }   
}