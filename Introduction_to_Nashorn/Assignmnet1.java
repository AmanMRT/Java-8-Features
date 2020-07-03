package Introduction_to_Nashorn;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Assignmnet1 {
	
	ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		
	//FileReader fr = new FileReader("E:\\Eclipse Workspace\\Java\\WiproPBL\\src\\Introduction_to_Nashorn\\Demo.js");
	
	//engine.eval(fr);
	
	Invocable invocable = (Invocable)nashorn;
	//invocable.invokeFunction("checkPrime");
	
	
}
