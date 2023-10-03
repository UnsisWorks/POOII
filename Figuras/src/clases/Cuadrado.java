package clases;

/**
 *
 * @author labtecweb10
 */
public class Cuadrado extends Figura {

    public Cuadrado(float lado) {
        super.setLado(lado);
    }

    
    @Override
    public float calcularArea() {
        return (getLado() * 2);
    }

}
