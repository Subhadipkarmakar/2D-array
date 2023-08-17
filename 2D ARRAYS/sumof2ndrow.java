public class sumof2ndrow {
    public static void main(String[] args) {
       int matrix[][]={
        {1,4,9},
        {11,4,3},
        {2,2,3}
    };
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            if(i==1){
            for(int j=0;j<matrix[0].length;j++){
          
sum+=matrix[i][j];

            }
        
    }
} 
System.out.println(sum);
    }
    

}
