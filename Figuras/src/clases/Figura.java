package clases;

/**
 *
 * @author labtecweb10
 */
public abstract class Figura {
    
    private float lado;
    /**
     * Metodo abstracto usado para calcular el area
     * @return
     */
    public abstract float calcularArea();
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
