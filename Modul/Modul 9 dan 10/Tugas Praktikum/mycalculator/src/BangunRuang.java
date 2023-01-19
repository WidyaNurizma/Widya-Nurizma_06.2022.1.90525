public abstract class BangunRuang implements Formula{

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
        return luas()*a;
    }
}