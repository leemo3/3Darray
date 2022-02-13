
public class ThreeDim {

  public static void main(String[] args) {
    //create a 3d Array
    int[][][] threed = {
        {
        {2, -3, 4},
        {1, 3, 5}      
    },
        {
      {-4, -5, 6, 7},
      {1},
      {7, 8}
        }

  };
    int[][][] test = null;
    for (int [][] array2D: test) {
      for (int [] array1D: array2D) {
        for(int item: array1D) {
          System.out.println(item);
        }
        }
      }
    }

}
