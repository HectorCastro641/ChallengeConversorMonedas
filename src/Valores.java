public class Valores {
    private String base;
    private String target;
    private String resultado;

    public Valores(Resultado miResultado){
        this.base= miResultado.base_code();
        this.target= miResultado.target_code();
        this.resultado= miResultado.conversion_result();
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
