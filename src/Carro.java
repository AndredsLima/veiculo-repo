// --------------Atributos-------------------------------------------
public class Carro {
    public String marca, modelo;
    public int ano;
    private int quilometragem;

    public int autonomiaBateria;

    // -------------Construtor-------------------------------------------
    public Carro() {

    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        
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


}
