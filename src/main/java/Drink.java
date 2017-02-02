public class Drink implements IRobotCommand
{
    
    private IRobotCommand component ;

    public Drink(IRobotCommand c)
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
