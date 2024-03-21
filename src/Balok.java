import java.util.Scanner;
public class Balok extends BangunRuang{
    @Override
    public void input() {

    }

    Scanner scanner = new Scanner(System.in);
    private double panjang ;
    private double lebar;
    private double tinggi ;


    public Balok (String name) { super(name);}

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.println("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.println("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.println("Input tinggi: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan()  {
        double hasil = 2 * ((panjang * lebar)+(panjang * tinggi)+(lebar * tinggi));
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        double hasil = panjang * lebar * tinggi ;
        super.volume();
        System.out.println("Hasil volume: "+ hasil);
    }
}