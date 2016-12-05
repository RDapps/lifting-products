package webScraper;

class run{

  public static void main(String[] args){
      getSomething gs = new getSomething(); //initialise a constructor
      int hay = gs.get(5, 10); //
      
      getSomethingElse gse = new getSomethingElse();
      int hoy = gse.got(9);
      
      System.out.println(hay + hoy);
  }
  }
    class getSomething
    {
        public int get(int a, int b){
      
      int boo = a+b;
      return boo;
           
        }
    }      
        class getSomethingElse
        {
        public int got(int c){
            int baa = c;
            
            if (baa == 9){
                baa = baa * 10;
            }else {
                baa = baa;
            }
            
            return baa;
        }
            
        }
  
  
