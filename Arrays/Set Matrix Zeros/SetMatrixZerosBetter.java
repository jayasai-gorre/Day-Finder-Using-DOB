class SetMatrixZerosBetter {

  public static void main(String[] args) {
    int arr[][] = {
      { 1, 4, 2, 1, 7 },
      { 7, 0, 4, 1, 9 },
      { 3, 2, 7, 4, 0 },
      { 1, 4, 0, 5, 7 },
    };
    int m = arr.length;
    int n = arr[0].length;
    int k = 0;
    int temp[] = new int[m * n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        temp[k] = arr[i][j];
        k++;
      }
    }

    for (int t = 0; t < temp.length; t++) { // t = tansverse
      if (temp[t] == 0) {
        int row = (int) t / n;
        int col = t % n;
        for (int i = 0; i < n; i++) {
          arr[row][i] = 0;
        }
        for (int i = 0; i < m; i++) {
          arr[i][col] = 0;
        }
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
