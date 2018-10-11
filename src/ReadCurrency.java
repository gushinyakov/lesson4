import java.io.*;

public class ReadCurrency {

    private String filePath;

    private int dollar;
    private int rub;
    private int euro;

    ReadCurrency(String filePath) {
        this.filePath = filePath;
    }

    public void readCurrency() {
        FileReader file = null;
        BufferedReader bf = null;
        try {
            file = new FileReader(this.filePath);
            bf = new BufferedReader(file);

            String[] line = bf.readLine().trim().split(",");
            this.dollar = Integer.parseInt(line[0]);
            this.rub = Integer.parseInt(line[1]);
            this.euro = Integer.parseInt(line[2]);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int getDollar() {
        return dollar;
    }

    public int getRub() {
        return rub;
    }

    public int getEuro() {
        return euro;
    }
}
