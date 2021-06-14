package com.sorting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Java program implementing Singleton class 
//with method name as that of class 
class SerializeSingleton implements Serializable
{ 
 /**
	 * 
	 */
	private static final long serialVersionUID = -5036215752610558801L;

// static variable single_instance of type Singleton 
 private static SerializeSingleton instance=new SerializeSingleton(); 

 // variable of type String 
// public String s; 

 // private constructor restricted to this class itself 
 private SerializeSingleton() 
 { 
    
 } 
 
 protected Object readResolove() {
	 return instance;
 }

 // static method to create instance of Singleton class 
 /*public static SerializeSingleton Singleton() 
 { 
     // To ensure only one instance is created 
     if (instance == null) 
     { 
    	 instance = new SerializeSingleton(); 
     } 
     return instance; 
 } */


//Driver Code 

 public static void main(String[] args)  
 { 
     try
     { 
    	 SerializeSingleton instance1 = SerializeSingleton.instance; 
         ObjectOutput out 
             = new ObjectOutputStream(new FileOutputStream("file.text")); 
         out.writeObject(instance1); 
         out.close(); 
   
         // deserailize from file to object 
         ObjectInput in  
             = new ObjectInputStream(new FileInputStream("file.text")); 
           
         SerializeSingleton instance2 = (SerializeSingleton) in.readObject(); 
         in.close(); 
   
         System.out.println("instance1 hashCode:- "
                                              + instance1.hashCode()); 
         System.out.println("instance2 hashCode:- " 
                                              + instance2.hashCode()); 
     }  
       
     catch (Exception e)  
     { 
         e.printStackTrace(); 
     } 
 } 
}