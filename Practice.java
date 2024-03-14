class Main{
    static{
        System.out.println("Static block Loaded...");
    }
    {
        System.out.println("Instance Block Loaded!!!");
    }
    public static void main(String []args) throws Exception{
        Main obj=(Main)Class.forName("Main").newInstance();
    }
}