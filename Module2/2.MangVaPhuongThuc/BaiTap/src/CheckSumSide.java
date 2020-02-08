public class CheckSumSide {
    public static void checkSide(int a, int b,int c) throws SumSide,SideNegative{
        if(a<0||b<0||c<0){
            throw new SideNegative("Alert Fail: Side Negative. plz input side > 0!!!!!");
        }else if((a+b)<c){
            throw new SumSide("Alert Fail: Sum of two side must larger than side left!!!!");
        }
        System.out.println("success");
    }

}
