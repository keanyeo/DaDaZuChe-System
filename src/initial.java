import java.util.Scanner;

public class initial {
	
	public static void main(String[] args) {
		
		
		System.out.printf("List of car for rent : \n");
		System.out.printf("No\tModel \tPrice\tLoad\n");
		System.out.printf("1.\tCivic \tRM200\t4 People\n");
		System.out.printf("2.\tBus \tRM400\t20 People\n");
		System.out.printf("3.\tLori \tRM200\t3 Ton\n");
		System.out.printf("4.\tHilux \tRM1000\t4 People 1 Ton\n");
		
		
		transport carObject = new car("Civic",200,4);
		transport busObject = new bus("Bus",400,40);
		shipment loriObject = new lori("Lori",200,1);
		tranship truckObject = new truck("Hilux",1000,4,1);
		
		Scanner input = new Scanner(System.in);		
		System.out.printf("Insert how many car you wan to rent : \n");
		int quantity =	input.nextInt();
		
		System.out.printf("Insert how many days you wan to rent : \n");
		int rentDay =	input.nextInt();
		
		int[] seri = new int[quantity];
	
		
		for (int counter=1;counter<quantity;counter++) {
			System.out.printf("Insert car model number :");
			seri[counter] = input.nextInt();
			
				 if (seri[counter] == 1) {
					carObject.addQuantity();
				}else if (seri[counter] == 2) {
					busObject.addQuantity();
				}else if (seri[counter]== 3) {
					loriObject.addQuantity();
				}else if(seri[counter]== 4) {
					truckObject.addQuantity();
				}else if(seri[counter] <= 0 || seri[counter] => 5){ 
					System.out.println("valid number from 1 to 4 only");
					counter-=1;						 
				}
			
		
		//calculate total				
		int sum1 = carObject.calSubtotal()*rentDay;
		int sum2 =  busObject.calSubtotal()*rentDay;
		int sum3 =  loriObject.calSubtotal()*rentDay;
		int sum4 =  truckObject.calSubtotal()*rentDay;
		int total = sum1+sum2+sum3+sum4;
		System.out.printf("Total amount :RM%d\n",total);
		
		//display name
		System.out.printf("The model u booking :");
		for (int x=0;x<carObject.getQuantity();x++) {
			System.out.printf(" %s", carObject.getName());			
		}
		for (int x=0;x<busObject.getQuantity();x++) {
			System.out.printf(" %s",busObject.getName());			
		}
		for (int x=0;x<loriObject.getQuantity();x++) {
			System.out.printf(" %s",loriObject.getName());			
		}
		for (int x=0;x<truckObject.getQuantity();x++) {
			System.out.printf(" %s\n",truckObject.getName());			
		}
		
		
		//calculate people
		int total_people = carObject.getLoad()+busObject.getLoad()+truckObject.getLoad();
		System.out.printf("People you can fetch: %d\n",total_people);
		
		//calculate weight 
		int total_weight = loriObject.getLoadw()+truckObject.getLoadw();
		System.out.printf("Weight(Ton) you can carry: %d\n",total_weight);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}				
		}


	
	

	

	


		
	
		



		
		

		
		



	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		


	
	


