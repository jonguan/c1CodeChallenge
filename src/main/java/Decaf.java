public class Decaf implements IRobotCommand
{
    private IRobotCommand component ;

    public Decaf(IRobotCommand c)
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
