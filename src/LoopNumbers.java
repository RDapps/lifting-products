public class LoopNumbers{
    public static void main(String[] args) {
        
        int records = 2;
        int records_added = 1;
        if (records_added == 0)
        {
            System.out.println("Records "+records);
        }else
        {
            records = records + records;
        }
        System.out.println("added " + records);
        
    }
}