public class Carro {
    public String marca, modelo;
    public int ano;
    private int quilometragem;
    public static Motor motor;
    

    // -------------Construtor-------------------------------------------
    public Carro() {

    }

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;

    }

    // --------------------Métodos -----------------------------------

    public void setCarroInfo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public void getCarroInfo() {
        System.out.println("Marcar: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());

    }

    public void percorrido(int kmPercorrido) {
        if (quilometragem >= 0) {
            quilometragem += kmPercorrido;

        }

    }

    public void ligar() {
        if (motor != null) {
            motor.ligarMotor();

        } else {
            System.out.println("Este carro está sem motor !");
        }

    }

    // -----------Métodos Especiais------------

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    

}

