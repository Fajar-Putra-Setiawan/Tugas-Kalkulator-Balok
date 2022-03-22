package hitung;
public class Balok extends persegiPanjang implements menghitungRuang{
    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return luas()*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return (luas()+(getPanjang()*tinggi+getLebar()*tinggi))*2;
    }
}
