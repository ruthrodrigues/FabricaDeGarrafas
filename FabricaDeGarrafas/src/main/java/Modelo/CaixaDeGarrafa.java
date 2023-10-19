package Modelo;

public class CaixaDeGarrafa {
    
    public int quantGarrafas;
    public Esteira entrega;

    public CaixaDeGarrafa (Esteira entrega){
        this.entrega = entrega;
    }

  public void addGarrafa(){
        this.quantGarrafas++;
        System.out.println("Quantidade de garrafas na caixa: "+ quantGarrafas);
        this.verificar();
    }

  public void verificar(){
        if (quantGarrafas == 3){
            this.entrega.entregar();
            this.quantGarrafas = 0;
        }
    }

}
