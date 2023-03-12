/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mibiblio;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assume;

/**
 *
 * @author Android2357
 */
public class BibliotecaLoaderTest {
    BibliotecaLoader biblioL;
    public BibliotecaLoaderTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
        biblioL=new BibliotecaLoader();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void getBlbliotecaRandomTest() {
        int ejemplares=4;
        Biblioteca biblio =BibliotecaLoader.getBlbliotecaRandom(ejemplares);
        assertTrue(ejemplares==biblio.getNumLibros());
    }

    @Test
    public void getWindowsBaseLibrosTest() {
        //Assume.assumeTrue(System.getProperty("Android2357").contains("windows"));
        
        List<Libro> lb=BibliotecaLoader.getWindowsBaseLibros();
        
                assertTrue(lb.size()>0);
    }

    @Test
    public void getLinuxBaseLibrosTest() {
        //Assume.assumeTrue(System.getProperty("Android2357").contains("Linux"));
        
        //revisar
        
         List<Libro> lb=BibliotecaLoader.getLinuxBaseLibros();
        
                assertTrue(lb.size()>0);
        
    }

    @Test
    public void getWindowsUsersAsAutoresTest() {
        //Assume.assumeTrue(System.getProperty("Android2357").contains("windows"));
        
        
    }

    @Test
    public void getLinuxUsersAsAutoresTest() {
        //Assume.assumeTrue(System.getProperty("Android2357").contains("Linux"));
        
        
    }
    
}
