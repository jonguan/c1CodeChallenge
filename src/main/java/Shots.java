
public class Shots implements IRobotCommand
{

    private IRobotCommand component ;

    public Shots(IRobotCommand c)
    {
        this.component = c ;
    }

    public String getCommand( ) 
    {
        return "" ;
    }
    
    public void setOption(String o) 
    {
         
    }
    
}
