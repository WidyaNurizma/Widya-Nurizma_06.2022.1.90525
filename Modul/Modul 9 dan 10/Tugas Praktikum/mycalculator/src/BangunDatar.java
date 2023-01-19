public abstract class BangunDatar implements Formula{

    @Override
    public double luas(){
        return a*a;
    }
    @Override
    public double keliling(){
        return 4*a;
    }
    @Override
    public double volume(){
        return 0;
    }
}