package adapter.example;

public class GasolinaEspecial implements IAutomovil{

    private int combustible;

    public GasolinaEspecial(){
        combustible=2;
    }

    @Override
    public void prender() {
        System.out.println("Gasolina> combustible actual: "+combustible);
    }

    @Override
    public void marcha(int tiempoMarcha) throws InterruptedException {

        for (int i = 0; i < tiempoMarcha ; i=i+5) {
            combustible=combustible-5;
            Thread.sleep(5000);
            if(combustible<=0){
                 System.out.println("Gasolina> se quedo sin combustible: estado actual: 0%");
                 combustible=0;
                 break;
            }
        }


    }

    @Override
    public void cargando(int tiempo) {
        for (int i = 0; i < tiempo; i++) {
            combustible=combustible+4;
            System.out.println("Gasolina: cargando combustible ...");
            if(combustible>=100){
                System.out.println("Gasolina> estado actual: 100%");
                combustible=100;
                break;
            }
        }
        System.out.println("Gasolina: combustible cargado : "+combustible+"%");
    }
}
