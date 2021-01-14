public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double bobo = 0;
        for(int i = 0; i < mat.length ; i++){
            for(int j = 0; j < mat[0].length; j++){
                bobo+=mat[i][j];
            }
        }
        return bobo/(mat.length*mat[0].length);
        
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        double[] values = new double[mat.length * mat[0].length];
        int b = 0;
        for(int i = 0; i <mat.length; i++){
            for(int j = 0; j <mat[0].length; j++){
                values[b] = mat[i][j];
                b++;
            }
        }
        
        if(values.length%2!=0){
            return values[values.length/2];
        }else{
            return (values[values.length/2-1]+values[values.length/2])/2;
        }
       
        
        
        
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        int d = 0;
        int[] arr = new int[2];
        
        for(int i = 0; i <mat.length; i ++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j]==mat[0][0]){
                    d++;
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        for(int i = 0; i <mat.length; i ++){
            for(int j = 0; j < mat[0].length; j++){
                int b = 0;
                for(int k = 0; k <mat.length; k ++){
                    for(int l = 0; l < mat[0].length; l++){
                        if(mat[i][j]==mat[k][l]){
                            b++;
                        }
                    }
                }
                if (b>d){
                    d=b;
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return mat[arr[0]][arr[1]];
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
