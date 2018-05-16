package adivinanumero;

public class Main {

    public static void main(String[] args) {
       PcAdivina PCHandler = new PcAdivina();
       YoAdivino YOHandler = new YoAdivino();
       MarcoInicial marcoPrincipal = new MarcoInicial(PCHandler, YOHandler);
       marcoPrincipal.setVisible(true); 
    }
    
}

