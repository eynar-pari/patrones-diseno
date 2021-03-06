package bridge.practice;

public class Cuadrado implements IFigure {

    private IColor color;

    public Cuadrado(IColor color) {
        this.color = color;
    }

    public void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void pintar() {
        System.out.println("pintando Cuadrado ..");
        color.pintar();
    }
}
