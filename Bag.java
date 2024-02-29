public class Bag {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private Integer stockBarang;


    public Bag(String kodeBarang, String jenisBarang, String namaBarang, Integer stockBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stockBarang = stockBarang;
    }


    @Override
    public String toString() {
        return "Bag [kodeBarang=" + kodeBarang + ", jenisBarang=" + jenisBarang + ", namaBarang=" + namaBarang
                + ", stockBarang=" + stockBarang + "]";
    } 
}

