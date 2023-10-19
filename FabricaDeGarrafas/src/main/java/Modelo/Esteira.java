package Modelo;

import javax.swing.JOptionPane;

public class Esteira {

    public boolean Estado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	boolean estado;

   public void ligar(){
        this.estado = true;
        JOptionPane.showMessageDialog(null, 
        "Esteira Ligada", "Notificação", 2);
    }

  public  void desligar(){
        this.estado = false;
        JOptionPane.showMessageDialog(null,
        "Esteira Desligada", "Notificação", 2);
    }

  public  void entregar(){
        this.ligar();
        JOptionPane.showMessageDialog(null, 
        "Caixa de garrafas entregue ao caminhão", "Notificação", 1);
        this.desligar();
    }
}
