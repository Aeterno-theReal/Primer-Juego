import java.util.Scanner;

public class PrimerJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**Creamos nuestro primer juego en modo texto. 
		 * Este programa pide dos n�meros enteros al usuario y los compara,
		 * si los dos n�meros son iguales finaliza la ejecuci�n, en caso
		 * de que el segundo n�mero sea mayor o menor al primero se le
		 * informa al usuario.
		 */
		
		//Declaramos las variables a usar en el programa
		
		Scanner teclado = new Scanner(System.in);
		
		int oculto=0;
		int num2=0;		
		int cont=0;
		int usados=0;
		int intentos=7;
		int restantes=intentos;
		String reiniciar="";
		//Para que el usuario introduzca el n�mero oculto a mano
		
		/*
		//Pedimos el primer n�mero al usuario (el n�mero a buscar)
		System.out.println("Introduzca el primer d�gito:");
		oculto=teclado.nextInt();
		teclado.nextLine();
		
		//Realizamos saltos de l�nea para ocultar el primer n�mero al usuario
		while(cont!=20)
		{
			System.out.println("");
			cont++;
		}
		*/
		
		//Bucle para preguntar al usuario si desea jugar mas de una vez
		
		do
		{

			//Reinicializamos todas las variables
			oculto=0;
			num2=0;
			usados=0;
			restantes=intentos;
			//Para que el sistema elija un n�mero al azar
			
			oculto = (int) (Math.random() * 100);
			System.out.println(oculto);
				
			//Comenzamos el juego
			System.out.println("-------INICIO DEL PRIMER JUEGO-------");
	
			//Realizamos la operaci�n de comparaci�n entre ambos d�gitos
			
			do
			{
				//Pedimos el segundo n�mero al usuario
				System.out.println("Introduzca el n�mero: ");
				num2=teclado.nextInt();
				teclado.nextLine();
				
				if(num2==oculto)
				{
					System.out.println("�CORRECTO!, has ganado. El n�mero buscado era: ((" + oculto + "))");
				}
				else
				{
					if(num2<oculto)
					{
						System.out.println("El n�mero buscado es mayor al introducido");
					}
					else
					{
						System.out.println("El n�mero buscado es menor al introducido");
					}
					usados++;
					restantes--;
					
					//Comprobamos que no hemos llegado al l�mite de intentos
					if(restantes != 0)
					{
						System.out.println("Has usado [" + usados + "] intentos; tienes [" + restantes + "] intentos restantes");
					}
					else
					{
						System.out.println("Has usado todos los intentos, lo siento, has fracasado.");
						System.out.println("El n�mero buscado era: ((" + oculto + "))");
					}
				}
			}while(num2 != oculto && usados < intentos);
			
			
			//Preguntamos al usuario si desea volver a jugar
			System.out.println("\n�Desea volver a jugar? (s/n)");
			reiniciar=teclado.nextLine();
			
			//Creamos saltos de l�nea para que borre la pantalla y muestre el nuevo inicio o fin del juego.
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		}while(reiniciar.equals("s") || reiniciar.equals("S"));
		
		System.out.println("----FIN DEL JUEGO----");

	}

}
