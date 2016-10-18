
import java.util.ArrayList;
import java.util.List;
import sun.security.util.Length;



public class TextPrinter {
    
    List<String> lines;
    private StringBuilder textKeeper;
    private final String space = "     ";
    
    public TextPrinter(){
        

    }
    

    public void print2Columns(String text, int columnWidth){
        
        lines = new ArrayList<>();
        textKeeper = new StringBuilder();
        
        textKeeper.append(text);
        List<String> columnA = new ArrayList<>();
        List<String> columnB = new ArrayList<>();
 
        while(textKeeper.length()>columnWidth){
            
            if(textKeeper.charAt(0)==' ')
                textKeeper.deleteCharAt(0);
            
            if(textKeeper.charAt(columnWidth)!=' '){
                
                
                if(textKeeper.charAt(columnWidth)=='-' || textKeeper.charAt(columnWidth)=='.' || textKeeper.charAt(columnWidth)==','){
                    lines.add(textKeeper.substring(0, columnWidth+1));
                    textKeeper.delete(0, columnWidth+1);

                }
                else if(textKeeper.charAt(columnWidth+1)==','){
                    lines.add(textKeeper.substring(0, columnWidth+2));
                    textKeeper.delete(0, columnWidth+2);
                }
                else if(textKeeper.charAt(columnWidth+1)==' '){
                    lines.add(textKeeper.substring(0, columnWidth+2));
                    textKeeper.delete(0, columnWidth+2);
                }
                else if(textKeeper.charAt(columnWidth-1)==' '){
                    lines.add(textKeeper.substring(0, columnWidth-1));
                    textKeeper.delete(0, columnWidth-1);
                }
                else if(textKeeper.charAt(columnWidth-1)!=' '&& textKeeper.charAt(columnWidth-2)==' '){
                    lines.add(textKeeper.substring(0, columnWidth-2));
                    textKeeper.delete(0, columnWidth-2);
                }

                else{

                    textKeeper.insert(columnWidth, '-');
                    lines.add(textKeeper.substring(0, columnWidth+1));
                    textKeeper.delete(0, columnWidth+1); 
                }

            }
            else{
                
                lines.add(textKeeper.substring(0, columnWidth));
                textKeeper.delete(0, columnWidth);
                 
            }
        }
        lines.add(textKeeper.substring(0, textKeeper.length()));
        
        if(lines.size()%2==0){
                columnA = lines.subList(0, lines.size()/2);
                columnB = lines.subList(lines.size()/2, lines.size());
        }
        else{
            columnA = lines.subList(0, (lines.size()/2)+1);
            columnB = lines.subList((lines.size()/2)+1, lines.size());
        }

        int width = columnWidth+1;
        String format = "%-"+width+"."+width+"s"+space+"%-"+width+"."+width+"s%n";

        if(columnA.size() > columnB.size()){
            
            for(int i = 0; i<columnB.size(); i++){
                System.out.printf(format, columnA.get(i), columnB.get(i));
            }
            System.out.println(columnA.get(columnA.size()-1));
        }
        else if(columnA.size() == columnB.size()){

            for(int i = 0; i<columnA.size(); i++)
                System.out.printf(format, columnA.get(i), columnB.get(i));
        } 
    
    }

         //columnA.forEach((x)->System.out.printf(format, x));
        //columnB.forEach((x)->System.out.printf(format, x));

}
