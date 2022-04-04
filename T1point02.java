package t1point02;


public class T1point02 {

   
    public static void main(String[] args) {
        String[][]mhs = {
            {"Adi","127647","Teknik Informatika"},
            {"Mika","129883","Sistem KOmputer"},
            {"Budi","120495","Sistem Komputer"},
            {"Bunga","123489","Teknik Informatika"}
        };
        for (int i=0; i<mhs.length; i++){
            System.out.print(" "+mhs[i][0]);
            System.out.print(" "+mhs[i][1]);
            System.out.println(" "+mhs[i][2]);
            
        }
    }
    
}
