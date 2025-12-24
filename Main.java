class Main{
    public static void pp(int i,int j)
    {
        if(i>j){
            return;
        }
        else{
            System.out.println(i);
        }
        pp(i+1,j);
    }
    public static void main(String args[])
    {
        int i=1;  
        int j=10;
        pp(i,j);
    }
}