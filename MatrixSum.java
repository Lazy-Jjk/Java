class MatrixSum {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        for(int i=0;i<2;i++) {
            int rs=0, cs=0;
            for(int j=0;j<2;j++) {
                rs+=a[i][j];
                cs+=a[j][i];
            }
            System.out.println("Row "+i+": "+rs+", Col "+i+": "+cs);
        }
    }
}