import java.util.Scanner;

public class TriangleException {
    private void triangleException(int x, int y, int z) {
        try{
            int a= x+y;
            int b= y+z;
            int c= z+x;

            if (x<0|| y<0|| z<0|| a<=z|| b<=x|| c<=y) {
                throw new NumberFormatException();
            }
            System.out.println(" x,y,z la 3 canh cua tam giac");

        } catch (NumberFormatException e) {
            System.out.println("moi ban nhap lai ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap x: ");
        int x = scanner.nextInt();
        System.out.println("nhap y: ");
        int y = scanner.nextInt();
        System.out.println("nhap z: ");
        int z = scanner.nextInt();

        TriangleException triangleException = new TriangleException();
        triangleException.triangleException(x, y, z);

    }
}
