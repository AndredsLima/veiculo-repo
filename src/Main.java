public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Carro sem motor \n");
        Carro meuCarro = new Carro();
        meuCarro.setCarroInfo("Fiat", "Touro", 2022);
        meuCarro.getCarroInfo();



        System.out.println("Carro com motor \n");
        Motor motorCarro = new Motor("v8", 1000);
        Carro meuCarroComMotor = new Carro("Chevrolet", "Camaro", 2023, motorCarro);
        
        
        meuCarroComMotor.ligar();

        meuCarro.percorrido(100);
        meuCarroComMotor.getCarroInfo();

        System.out.println("Quilometragem: " + meuCarro.getQuilometragem());

    }
}