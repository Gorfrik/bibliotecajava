/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mibiblio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Android2357
 */
public class BibliotecaTest {

    List<Libro> libros;
    Libro lb;
    Biblioteca bibli;
    Autor au;
    ArrayList<Autor> autores;

    public BibliotecaTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @Before
    public void setUp() {
        autores = new ArrayList();
        bibli = new Biblioteca();
        libros = new ArrayList();
        au = new Autor("Garcia", "Oscar");
        autores.add(au);
        lb = new Libro("isbn", "El Grande", autores, LocalDate.MIN, "editorial");

    }

    @After
    public void tearDown() {
    }

    @Test
    public void addLibroTest() {
        bibli.addLibro(lb);
        assertEquals(bibli.getNumLibros(), 1);
        for (int i = 0; i < 999; i++) {
            bibli.addLibro(lb);
        }
        assertFalse(bibli.addLibro(lb));
    }

    @Test
    public void getNumLibrosTest() {
        int cantidad = 10;
        for (int i = 0; i < cantidad; i++) {
            bibli.addLibro(lb);
        }
        assertEquals(bibli.getNumLibros(), cantidad);
    }

    @Test
    public void getNumTitulosTest() {

        for (int i = 0; i < 10; i++) {
            bibli.addLibro(lb);
        }
        assertEquals(bibli.getNumTitulos(), 1);

    }

    @Test
    public void getLibrosPorAutorTest() throws AutorNuloException {

        bibli.addLibro(lb);
        Libro lib = new Libro("Zsd", "B", autores, LocalDate.MIN, "laeditorial");
        bibli.addLibro(lib);
        List librosVer = new ArrayList();
        librosVer.add(lb);
        librosVer.add(lib);
        List libros = new ArrayList();
        libros = bibli.getLibrosPorAutor(au);
        assertEquals(lib, libros.get(0));
        assertEquals(lb, libros.get(1));

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getLibrosPorAutorIndexOutOfBoundsExceptionTest() throws AutorNuloException {
        
        //revisar
        
        Autor aut=null;
        bibli.getLibrosPorAutor(aut);
    }

    @Test
    public void getLibrosPorTituloTest() {
        
        //revisar
        
        String tit="El Grande";
        bibli.addLibro(lb);
        List libros = bibli.getLibrosPorTitulo( tit);
        
        
    }

    @Test
    public void getAutoresTest() {
        
        //revisar
        
        bibli.addLibro(lb);
        List autor=bibli.getAutores();
        assertTrue(autor.contains(autores));
        
    }

}
