public class Athlete {

     static int nextBibNumber;
     static String raceLocation = "New York";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     int bibNumber;

Athlete (String name, int speed){
     this.name = name;
     this.speed = speed;
}

public static void main(String[] args) {
     //create two athletes      //print their names, bibNumbers, and the location of their race. }
	Athlete jeke = new Athlete("Jeke", 400);
	jeke.raceLocation="San Diego";
	jeke.raceStartTime="7:00";
	jeke.bibNumber=0;
	
	
	Athlete hugo = new Athlete("Hugo", 1);
	
System.out.println(jeke.raceLocation+jeke.raceStartTime);
System.out.println(jeke.speed+" "+jeke.bibNumber);
System.out.println(jeke.name);

hugo.raceLocation="Mars";
hugo.raceStartTime="28:00";
hugo.bibNumber=1;

System.out.println(hugo.raceLocation+hugo.raceStartTime);
System.out.println(hugo.speed+" "+hugo.bibNumber);
System.out.println(hugo.name);
}
}