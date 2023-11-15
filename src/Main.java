public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello World ");
    Carro meuCarro = new Carro();
    meuCarro.setCarroInfo("Toyota", "Touro", 2022);
    meuCarro.getCarroInfo();
    
    meuCarro.percorrido(100);
    
    System.out.println("Quilometragem: " + meuCarro.getQuilometragem());

  }
}