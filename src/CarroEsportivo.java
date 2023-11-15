public class CarroEsportivo extends Carro {
    public int velocidadeMaxima;
    // --------------Método--------------------------

    public void acelerar() {
        System.out.println("Acelerando o carro esportivo !");

    }

    // ----------------Metodo para herdar-------------------------
    @Override
    public String toString() {
        return "Marca: " + getMarca() + " , Modelo : " + getModelo() + " , Ano : " + getAno() + ", Velocidade Máxima: "
                + getVelocidadeMaxima();
    }
//-----------------------------------------------------------------
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
