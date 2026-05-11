class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
          int positionLength = position.length;
          double [][] time = new double[positionLength][2]; 

          for(int i=0;i<positionLength;i++){
               time[i][0]= position[i];
               time[i][1]= (double)(target-position[i])/speed[i];
          }         
         
          Arrays.sort(time,(a,b)->Double.compare(b[0],a[0]));
          int fleet =0;
          double maxTimeTaken = 0.0;

          for(int i=0;i<positionLength;i++){
               if(time[i][1]>maxTimeTaken){
                 fleet++;
                 maxTimeTaken = time[i][1];
               }
          }

          return fleet;
    }
}
