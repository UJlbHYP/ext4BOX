import java.util.*;
import java.io.*;
class Main  {
		public static String url = "/";
		public static void main(String[] args) {
		Scanner s=new  Scanner(System.in);	
		System.out.print(url+"$ ");
		while (true){
			String cmd1 = "";
			cmd1 = s.nextLine();
			// System.out.print(cmd1);	
			String commands[] = cmd1.split(" ");
			String command = commands[0];
			if (command.equals("cd")) {
				if (commands.length==2){
					if (commands[1].equals("..")) {
						levelUP();
					}
					else if (cmd1.split("\"")[0].equals("cd ")||(cmd1.split("\"").length==2)) {
						String dirr="";
						for (int i=1;i<commands.length-1;i++) {
							dirr+=commands[i];
						}
						// System.out.println(dirr);
						// String dirr2=(dirr.split("\""))[1];
						levelDOWN(dirr);	
					}
					else{
						// url=url+commands[1]+'/';
						levelDOWN(commands[1]);	
					}
				}
				
			} 
			System.out.print(url+"$ ");
		}
		
	}

	public static void levelUP(){
		String urlik[] = url.split("/");
		url="/";
		for (int i=1;i<urlik.length-1 ;i++ ) {
			url+=urlik[i];
		}
		url+="/";
	}
	public static void levelDOWN(String directory){
		url+=directory+"/";
	}
}
