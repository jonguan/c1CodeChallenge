public class Milk implements IRobotCommand
{

    private IRobotCommand component ;

    public Milk(IRobotCommand c)
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
