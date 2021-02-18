
package java2;

class Siswa{
    String nama; 
    String NIM;


Siswa(String nama,String NIM){
    
    this.nama = nama;
    this.NIM = NIM;
    
    }


void show (){

    System.out.println("Nama : " + this.nama);
    System.out.println("NIM: " + this.NIM);

    }
}

public class Java2 {

    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Ryan","31");
        Siswa siswa2 = new Siswa("Ryo","32");
        Siswa siswa3 = new Siswa("Siti","33");
        Siswa siswa4 = new Siswa("Tias","34");
        Siswa siswa5 = new Siswa("Yolla","35");
        //method
        
        siswa1.show();
        siswa2.show();
        siswa3.show();
        siswa4.show();
        siswa5.show();
    }
    
}
