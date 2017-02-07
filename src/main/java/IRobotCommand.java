public interface IRobotCommand
{
     String getCommand( ) ;    
     void setOption(String o) ;
     void setComponent(IRobotCommand component);
}
