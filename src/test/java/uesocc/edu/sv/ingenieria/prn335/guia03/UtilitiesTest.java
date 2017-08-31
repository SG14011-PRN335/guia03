package uesocc.edu.sv.ingenieria.prn335.guia03;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author jcsantos
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {

    @Deployment
    public static WebArchive desplegar() {
        WebArchive salida = ShrinkWrap.create(WebArchive.class)
        .addClass(Utilities.class)
        .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }
    
    @Inject
    private Utilities servicio;

    @Test
    public void probarMetodogetResume() { //prueba 1 getResume
        String fraseEsperada1 = "Bienvenidos a la mat";
        String fraseCompleta="Bienvenidos a la materia de Programación 3 Ciclo II 2017.";
        String resultado = servicio.getResume(fraseCompleta);
        Assert.assertEquals(fraseEsperada1, resultado);
        System.out.println(" ");
        System.out.println("Resultado esperado: "+fraseEsperada1+"\n");
        System.out.println("Resultado del metodo: "+resultado+"\n");
        
        
    }
    @Test
    public void probarMetodogetResumeb() {//prueba 2 getResume
        String fraseEsperada1 = "Hola Mundo!";
        String fraseCompleta="Hola Mundo!";
        String resultado = servicio.getResume(fraseCompleta);
        Assert.assertEquals(fraseEsperada1, resultado);
         System.out.println(" ");
        System.out.println("Resultado esperado: "+fraseEsperada1+"\n");
        System.out.println("Resultado del metodo: "+resultado+"\n");
          
    }
    @Test
    public void probarMetodogetResumec() {//prueba 3 getResume
        String fraseEsperada1 = null;
        String fraseCompleta=null;
        String resultado = servicio.getResume(fraseCompleta);
        Assert.assertEquals(fraseEsperada1, resultado);
         System.out.println(" ");
        System.out.println("Resultado esperado: "+fraseEsperada1+"\n");
        System.out.println("Resultado del metodo: "+resultado+"\n");
    }

    
    @Test
    public void probarMetodoCapitalizar() { //prueba 1 capitalizar
        String fraseEsperada2="Pruebas De Unidad Con Junit & Arquillian";
        String texto="prueBas  de  UNIDAD con JUnit & arQuillian";
        String resultado = servicio.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
         System.out.println(" ");
        System.out.println("Resultado esperado: "+fraseEsperada2+"\n");
        System.out.println("Resultado del metodo: "+resultado+"\n");
    }
    @Test
    public void probarMetodoCapitalizarb() {//prueba 2 capitalizar
        String fraseEsperada2="";
        String texto="";
        String resultado = servicio.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
        System.out.println(" ");
        System.out.println("Resultado esperado: "+fraseEsperada2+"\n");
        System.out.println("Resultado del metodo: "+resultado+"\n");
    }
    
    @Test
    public void probarMetodoCapitalizarc() {//prueba 3 capitalizar
        String fraseEsperada2=null;
        String texto=null;
        String resultado = servicio.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
        System.out.println(" ");
        System.out.println("Resultado esperado: "+fraseEsperada2+"\n");
        System.out.println("Resultado del metodo: "+resultado+"\n");
    }
    
    @Test
    public void probarMetodoContarCoincidencias() {//prueba 1 contar
        int coincidenciasEsperadas3=1;
        String frase="2017";
        String Cadena = "Bienvenidos a la materia de Programación 3 Ciclo II 2017.";
        int resultado = servicio.contarCoincidencias(Cadena, frase);
        Assert.assertEquals(coincidenciasEsperadas3, resultado);
        System.out.println(" ");
        System.out.println("Resultado esperado: "+coincidenciasEsperadas3+"\n");
        System.out.println("Resultado del metodo: "+resultado+"\n");
    }
    @Test
    public void probarMetodoContarCoincidenciasb() {//prueba 2 contar
        int coincidenciasEsperadas3=2;
        String frase="MA";
        String Cadena = "Bienvenidos a la materia de Programación 3 Ciclo II 2017.";
        int resultado = servicio.contarCoincidencias(Cadena, frase);
        Assert.assertEquals(coincidenciasEsperadas3, resultado);
        System.out.println(" ");
        System.out.println("Resultado esperado: "+coincidenciasEsperadas3+"\n");
        System.out.println("Resultado del metodo: "+resultado+"\n");
    }
    @Test
    public void probarMetodoContarCoincidenciasc() {//prueba 3 contar
        int coincidenciasEsperadas3=0;
        String frase="bienvenido";
        String Cadena =null;
        int resultado = servicio.contarCoincidencias(Cadena, frase);
        Assert.assertEquals(coincidenciasEsperadas3, resultado);
        System.out.println(" ");
        System.out.println("Resultado esperado: "+coincidenciasEsperadas3+"\n");
        System.out.println("Resultado del metodo: "+resultado+"\n");
    }
}
