

public class TextPrinter {
    
    private StringBuilder column1;
    private StringBuilder column2;
    private StringBuilder textKeeper;
    private final String space = "     ";
    
    public TextPrinter(){
    
        column1 = new StringBuilder();
        column2 = new StringBuilder();
        textKeeper = new StringBuilder();
    }
    
    public void print2Columns(String text, int columnWidth){

        textKeeper.append(text);
        
        while(textKeeper.length() > 0){
        
            if(textKeeper.length() > columnWidth){
                
                column1.append(textKeeper.substring(0, columnWidth));
                textKeeper.delete(0, columnWidth);
                
                if(textKeeper.length() > columnWidth){
                    column2.append(textKeeper.substring(0, columnWidth));
                    textKeeper.delete(0, columnWidth);
                }
                else{
                    column2.append(textKeeper.substring(0, textKeeper.length()));
                    textKeeper.delete(0, textKeeper.length());
                }
            }
            else{
            
                column1.append(textKeeper.substring(0, textKeeper.length()));
                textKeeper.delete(0, textKeeper.length());
            }

            System.out.println(column1+space+column2);
            
            column1.setLength(0);
            column2.setLength(0);
        }

    }
    
    
}
