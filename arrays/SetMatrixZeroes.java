//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==0){
                    set1.add(i);
                    set2.add(j);
                }
            }
        }
        Iterator<Integer> it1 = set1.iterator();
        Iterator<Integer> it2 = set2.iterator();

        while (it1.hasNext()) {
            int a = it1.next();
            for (int j = 0; j < cols; j++)
                matrix[a][j] = 0;
        }
        while (it2.hasNext()) {
            int b = it2.next();
            for (int i = 0; i < rows; i++)
                matrix[i][b] = 0;
        }
    }
}