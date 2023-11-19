/**************************************************
3 tipos de asginaciones:
-----------------
 - Ensanchamiento implícito
 - Estrechamiento implicito: 
	- requiere que se usan constantes
	- solo entre int short char byte
 - Estrechamiento explícito
***************************************************/
public class Asignaciones{

	public static void main(String arg[]){		
		System.out.println("---Ensanchamiento implicito--");
		byte $byte1= 125; //int -> byte
		int $int1 = 20; 
		long $long1= 30; 		double $double1;
		
		//int, long -> float, double
		
		$int1 = $byte1; // byte -> int
		$long1 = $int1; // int -> long		
		$double1 = $long1; // long -> double
		
		System.out.println($double1+" "+$long1+" "+$int1);

		System.out.println("---Estrechamiento implicito--");
		char $char1; 			
		char $char3 = 200;
		byte $byte11 = 0; //[-127,128]
		final short $short1 = 100; 
		final int $int2 = 20; 
				
		$byte1 = $short1; // short -> byte
		$char1 = $int2; // int -> char
		$byte11 = (byte)$short1;
		System.out.println("$byte1: "+$byte1);

		System.out.println("---Estrechamiento explicito--");
		byte $byte3= 10; 
		int $int3 = 256; 
		long $long3= 30L; 
		double $double3 = 40.00;	
		float $float3;
		
		$byte3 = (byte) $int3;	// int -> byte
		$int3 = (int) $long3; // long -> int
		$long3 = (long) $double3; //double -> long
		$float3 = (float)$double3; //double -> float
		
		System.out.println($byte3+" "+$int3+" "+$long3+" "+$float3);
		
		//Asignaciones Especiales
		long $long4 = 200; float $float4=200.50f;
		System.out.println($float4);
		$float4 = $long4;	// long -> float
		//ensanchamiento implicito: int -> long, int -> float
		// long -> float, long -> double

		$long4 = (long)$float4; // float -> long
		System.out.println($long4);
		
		
		System.out.println("---EJERCICIO 1--");
		
		char a = 'a';
		char b = 98;
		String c = "cadena";
		int a1 = a;
		int b1 = (int) b;
		System.out.println(a);
		System.out.println(b);
		System.out.println((char)a1 + (char)b1);
		System.out.println(a1 + b1);
		System.out.println(a + b);
		System.out.println(a + c);
		
		System.out.println("---EJERCICIO 2--");
		
		float foo = 2 , bar = 3, baz = 4;
		float mod1 = foo % baz, mod2 = baz % foo;
		System.out.println(mod1);
		System.out.println(mod2);
		
		float val = mod1 > mod2 ? bar : baz;
		
		System.out.println(val);

	}

}