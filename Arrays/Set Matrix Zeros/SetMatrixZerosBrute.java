// Set zeros in the row and colomn if any zero found while transversing the 2D Array
// TC: 0(3mn+n²) and SC: 0(mn)
/* Sample inputs: { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } 
                  { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } */
class SetMatrixZerosBrute {

  public static void main(String[] args) {
    int[][] arr = {
      { 1, 4, 2, 1, 7 },
      { 7, 0, 4, 1, 9 },
      { 3, 2, 7, 4, 0 },
      { 1, 4, 0, 5, 7 },
    };
    int m = arr.length;
    int n = arr[0].length;
    int[][] temp = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        temp[i][j] = Integer.MIN_VALUE;
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] == 0) {
          // k iteraters from 0 to 2 in coloumn and j is fixed
          for (int k = 0; k < m; k++) {
            temp[k][j] = 0;
          }

          // i is fixed and l iterates from 0 to 2 in row
          for (int l = 0; l < n; l++) {
            temp[i][l] = 0;
          }
        } else {
          if (temp[i][j] != 0) {
            temp[i][j] = arr[i][j];
          }
        }
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(temp[i][j] + " ");
      }
      System.out.println();
    }
  }
}
