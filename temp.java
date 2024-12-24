class temp{
    public static void main(String[] args){
        int[] a = {4 ,0 ,3 ,2 ,5};
        int n = a.length;
        int idx = n-1;
        System.out.println("idx = "+idx);
        for(int i=0; i<n-1; i++){
            if(a[i] == 0){
                int temp = a[idx];
                System.out.println("i = "+i);
                System.out.println("idx = "+idx);
                System.out.println("a[i] = "+a[i]);
                System.out.println("a[idx] = "+a[idx]);
                if(a[idx] == a[i]) {
                    continue;
                }
                else{
                    a[idx] = a[i];
                    a[i] = temp;
                }
                idx--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
