package clases;

/**
 *
 * @author labtecweb10
 */
public class Rectangulo extends Figura {

    private float lado2;

    public Rectangulo(float lado1, float lado2) {
        super.setLado(lado1);
        this.lado2 = lado2;
    }
    
    @Override
    public float calcularArea() {
        return getLado() * lado2;
    }
    
}
