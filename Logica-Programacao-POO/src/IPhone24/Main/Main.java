package IPhone24.Main;

import IPhone24.SmartPhone.IPhone;
import IPhone24.Telefone.Telefone;


public class Main {
    public static void main(String[] args) {


		IPhone iphone  = new IPhone();
		IPhone Telefone = iphone;	
		IPhone NavegadorInternet = iphone;
		IPhone ReprodutorMusical = iphone;

        iphone.telefonar();
		iphone.receberChamada();
        iphone.navegar();
		iphone.verificarPagina();
        iphone.tocar();
		iphone.parar();
		iphone.adicionarMusica();
		
		
		
    }
}