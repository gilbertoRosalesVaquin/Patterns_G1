/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_pattern;

public class StartState implements State {

   @Override
   public void doAction(Context context) {
      System.out.println("La ventanilla esta trabajando!!!!!!!!!!!!!!");
      context.setState(this);	
   }

   @Override
   public String toString(){
      return "Trabajando";
   }
}