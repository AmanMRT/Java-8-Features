package Nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashronFromJava
{
   public static void main(String args[]) 
   {
	      ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
	      ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
	        
	      String name = "PJP";
	      Integer result = null;
	      
	      try 
	      {
	         nashorn.eval("print('" + name + "')");
	         result = (Integer) nashorn.eval("10 + 2");
	      } catch(ScriptException e) 
	      {
	         System.out.println("Error executing script: "+ e.getMessage());
	         e.printStackTrace();
	      }
	      
	      System.out.println(result);
	      System.out.println(result.toString());
	      
	      
	      
	      
	}
}