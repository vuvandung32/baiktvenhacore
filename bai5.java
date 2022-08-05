import java.util.Scanner;

public class bai5 {
        private static int n;
        private static String[][] A;
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Nhập số dong: ");
            int n = scanner.nextInt();
            System.out.print("Nhập số cột ");
            int m = scanner.nextInt();
            //KHAI BÁo mảng 2 chiều
            int[][] arr = new int[n][m];
            int[][] arr2= new int[n][m];
            // khai báo mảng 2 chiều để nhận giá trị tổngs
            int tong[][] = new int [m][n];
    
            //nhập phần tử trong mảng 1 
            System.out.print("Nhập các phần tử của mảng arr: \n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("arr[%d][%d] = ", i, j);
                    arr[i][j] = scanner.nextInt();
                }
            }
    
            //nhập phần tử trong mảng 2
            System.out.println("Nhập các phần tử cho mảng ar2:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("ar2[" + i + "," + j + "] = ");
                    arr2[i][j] = scanner.nextInt();
                }
            }
            // cộng tổng 2 mảng lại với nhau 
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    tong[i][j] = arr[i][j] + arr2[i][j];
                }
            }
    
            
            System.out.println("Các phần tử của mảng arr: ");
            show(arr);
            System.out.println("Các phần tử của mảng arr2: ");
            show(arr2);
            System.out.println("tổng của 2 mảng  ");
            show(tong);
    
    
        }
        public static void show(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("đường chéo chính chính:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    //nếu i==j thì đấy sẽ là 2 số nhập cùng nhau nên là mới in nó ra 
                    if (i == j) {
                        System.out.print(A[i][j]+" ");
                    }
                    System.out.println(A);
                }
            }
            
        }
        
    
    }
    

