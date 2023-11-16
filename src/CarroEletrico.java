public class CarroEletrico extends Carro {
    public int autonomiaBateria;

    // ----------------Metodo para herdar-------------------------
    @Override
    public String toString() {
        return "Marca: " + getMarca() + " , Modelo : " + getModelo() + " , Ano : " + getAno() + ", Autonomia de bateria: "
                + getAutonomiaBateria();
    }
//-----------------------------------------------------------------


    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }


    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }
    

}
