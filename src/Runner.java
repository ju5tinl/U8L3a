import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        int[][] test = {{1,1,1,0,0,0},
                        {0,1,0,0,0,0},
                        {1,1,1,0,0,0},
                        {0,0,2,4,4,0},
                        {0,0,0,2,0,0},
                        {0,0,1,2,4,0}};
    }
    public static int maximumHG(int[][] arr)
    {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int r = 0; r < arr.length - 2; r++)
        {
            for(int c = 0; c < arr[0].length - 3; c++){
                sum+= arr[r][c] +  arr[r][c + 1] + arr[r][c + 2]; //top 3
                sum+= arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2]; //bottom 3
                sum+= arr[r+1][c+1]; //middle
                list.add(sum);
                sum = 0;
            }
        }
        int max = list.get(0);
        for(int a = 1; a < list.size(); a++)
        {
            if(max < list.get(a))
            {
                max = list.get(a);
            }
        }
        return max;
    }
}
