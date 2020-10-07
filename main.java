import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
    //플러그인 실행 시에 실행되는 부분
    @Override
    public void onEnable(){
        System.out.println("귤쌤의 실습용 플러그인 실행");
    }
    //플러그인 종료 시에 실행되는 부분
    @Override
    public void onDisable(){
        System.out.println("빠이빠이");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("p")){
            if(args.length==1){//데이터 타입 확인을 안해주었기 때문에 정수가 아닌 문자를 넣을 시 오류 발생!

                int a = Integer.valueOf(args[0]);
                sender.sendMessage(a + "입니다!");

            }
            if(args.length==2){//데이터 타입 확인을 안해주었기 때문에 정수가 아닌 문자를 넣을 시 오류 발생!

                int a = Integer.valueOf(args[0]);
                int b = Integer.valueOf(args[1]);
                sender.sendMessage(a+b + "입니다!");

            }
            else{
                sender.sendMessage("명령어가 완전하지 않아요!");
            }
        }
        return true;
    }
}
