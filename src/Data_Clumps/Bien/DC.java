/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Clumps.Bien;

/**
 *
 * @author san_t
 */
public class DC {
  public static void main(String args[]) {
 	    String firstName = args[0];
 	    String lastName = args[1];
 	    Integer age = new Integer(args[2]);
 	    String gender = args[3];
 	    String occupation = args[4];
 	    String city = args[5];
 
 	    Person joe = new Person(firstName,lastName,age,gender,occupation,city);
 	    joe.welcomeNew();
 	    joe.work();
 	    
 	}
 	private static class Person{
 		/*Todos los parametros y metodos se han movido a una clase interna*/
 		String firstName;
 	    String lastName;
 	    Integer age;
 	    String gender;
 	    String occupation;
 	    String city;
 	    
 	    public Person(String firstName, String lastName, Integer age, String gender, String occupation, String city){
 	    	this.firstName = firstName;
 	    	this.lastName = lastName;
 	    	this.age = age;
 	    	this.gender = gender;
 	    	this.occupation = occupation;
 	    	this.city = city;
 	    } 	    
 	    public void welcomeNew(){
 		    System.out.printf("Welcome %s %s, a %d-year-old %s from %s who works as a%s\n",firstName, lastName, age, gender, city, occupation);
 		}
 	    /* La nueva clase permite nuevas incorporaciones */
 	    public void work(){
 	    	System.out.printf("This is %s working hard on %s in %s", firstName, occupation, city);
 	    }
 	    
 	}  
}
