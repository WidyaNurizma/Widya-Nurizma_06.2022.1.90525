package mainarray;

public class MainArray {
    int[] arrayAngka;
    public MainArray(int[] arrayAngka)
{
    this.arrayAngka=arrayAngka;
}

    public MainArray()
{
    
}

public void totalangka()
{
    System.out.println("total angka pada array");
    System.out.print("total angka : ");
    for (int i=0;i<this.arrayAngka.length;i++)
    {
        System.out.print(" "+this.arrayAngka[i]);
    }
    System.out.println("");
}
public void rerataangka()
{
    double hasil = 0;
    for (int i=0;i<this.arrayAngka.length;i++)
    {
        hasil=hasil+this.arrayAngka[i];
    }
    System.out.println("hasil : "+hasil/2);
}
}