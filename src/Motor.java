/**
 * @author @BrenooNogg
 */

// --------------Atributos----------------------
public class Motor {
    public String tipo;
    public int potencia;
    public boolean ligado;

    // -------------------Construtor ---------------------------

    public Motor(String tipo, int potencia) {

        this.tipo = tipo;
        this.potencia = potencia;
        this.ligado = false;

    }

    // ----------------Métodos------------------------------
    public void ligarMotor() {
        ligado = true;
        System.out.println("Ligando o Carro.... ");
        System.out.println("Motor: " + getTipo() + " Potência: " + getPotencia() + " HP");

    }

    public void desligar() {
        ligado = false;
        System.out.println("Motor desligado !");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setMotor(boolean ligado) {
        this.ligado = ligado;
    }

}