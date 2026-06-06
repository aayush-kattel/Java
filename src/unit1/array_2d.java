package unit1;

public class array_2d {
    public static void main(String[] args){
        int [][] twodarr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(twodarr[1][2]);

        //foreach loop to print 2d array
        for(int[] row:twodarr){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
