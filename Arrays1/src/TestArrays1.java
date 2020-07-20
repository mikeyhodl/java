public class TestArrays1
{
    public static void main(String[] args){
        double[]myList={1.9,2.9,3.4,3.5};
        //print all array elements.
        for(int i = 0;i <myList.length;i++)
        {
            System.out.println(myList[i]+" ");
        }
        double total = 0;
                for(int i=0;i<myList.length;i++){
                
                total += myList[i];
        }
    }
}
