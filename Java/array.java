package Java;

public class array {

	public static void main(String[] args) {

       
        int[] arr1D = {10, 20, 30, 40, 50};

        System.out.println("1D Array Elements:");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
        System.out.println("\n");

       
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("2D Array Elements:");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

      
        int[][][] arr3D = {
            {
                {11, 12},
                {13, 14}
            },
            {
                {21, 22},
                {23, 24}
            }
        };

        System.out.println("3D Array Elements:");
        for (int i = 0; i < arr3D.length; i++) {
            System.out.println("Depth " + (i + 1) + ":");
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


	}


  
