package tests;
import java.io.IOException;
import metrics.FileConstructsParams;
import org.junit.Test;

public class TestFileConstructParams {
    
    /*@Test
    public void testNumClasses() throws IOException {
        FileConstructsParams file = new FileConstructsParams();
        int num = file.getConstrucs("D:\\JAD\\Docs\\Proyectos\\JAVA\\NetBeans\\metrics\\src\\metrics\\Util.java");
        System.out.println("Numero de constructores: " + num);
        num = file.getConstrucs("D:\\JAD\\Docs\\Proyectos\\JAVA\\NetBeans\\metrics\\src\\metrics\\FileConstructsParams.java");
        System.out.println("Numero de constructores: " + num);
    }*/

    @Test
    public void testNumFunctions() throws IOException {
        FileConstructsParams file = new FileConstructsParams();
        int num = file.getParams("D:\\JAD\\Docs\\Proyectos\\JAVA\\NetBeans\\metrics\\\\src\\\\metrics\\FileConstructsParams.java");
        System.out.println("Numero de parametros: " + num);

    }

    /*@Test
    public void testNumImports() throws IOException {
        FileNumClasses file = new FileNumClasses();
        int num = file.getFileImports("D:\\JAD\\Docs\\Proyectos\\JAVA\\NetBeans\\PractHPS\\src\\evaluator\\Calculator.java");
        System.out.println("Numero de imports del fichero: " + num);

    }*/   
}
