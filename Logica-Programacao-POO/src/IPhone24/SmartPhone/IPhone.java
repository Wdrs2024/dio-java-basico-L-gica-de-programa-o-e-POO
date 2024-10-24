package IPhone24.SmartPhone;

import IPhone24.Internet.NavegadorInternet;
import IPhone24.Telefone.Telefone;
import IPhone24.Musicas.ReprodutorMusical;

public class IPhone implements Telefone, NavegadorInternet, ReprodutorMusical {
  
    public void telefonar() {
        System.out.println("Telefonando do IPhone");
    }
    

   
    public void receberChamada() {
        System.out.println("Recebendo chamada no IPhone");
    }


    public void navegar() {
        System.out.println("Navegando na Internet pelo IPhone");
    }

  
    public void verificarPagina() {
        System.out.println("Verificar página: ");
    }

    public void tocar() {
        System.out.println("Ouvindo música do IPhone");
    }

   
    public void parar() {
        System.out.println("Música parada.");
    }

    
    public void adicionarMusica() {
        System.out.println("Adicionando música: ");
    }
}
