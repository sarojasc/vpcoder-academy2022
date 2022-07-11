package InterfaceExmpl;

public class Frogs extends Animal implements TerrestrialAnimals,AquaticsAnimals {
    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void breath() {

    }

    @Override
    public void Livein() {
        TerrestrialAnimals.super.Livein();
    }
}
