package OOPS;

import java.util.*;
import java.time.*;

public class HotRod {
	public static void main (String[] args) {
		
		
		
	}

}
class Race{
	String circuitName;
	String Location;
	public static int totalPlayers;
	
	Race(String a, String b) {
		
		circuitName=a;
		Location=b;
		Scanner sc=new Scanner(System.in);
		
		List<PlayerDetailss> pDetails=new ArrayList<PlayerDetailss>(6);
		int count=0;
		System.out.println("\t Players Fill Your Details below");
		for(PlayerDetailss p:pDetails)
		{
			System.out.println("Player Enter your Name:");
			p.setPlName(sc.next());
			System.out.println("Player Enter your Country Name:");
			p.setPlTeam(sc.next());
			System.out.println("Player Enter your Age:");
			p.setPlAge(sc.nextInt());
			System.out.println("Player Enter your Country:");
			p.setPlCountry(sc.next());
			System.out.println("Player Enter your Last Season Ranking:");
			p.setPlLastRanking(sc.nextInt());
			p.setWinningStatus(false);
			pDetails.add(p);
			count++;
		}
		totalPlayers=count;		
		
	}
	
	
}
class Daytona extends Race{
	
	final static int totallaps=10;
	
	
	Daytona() {		
		
		super("Salt Lake","Utah, USA");
		System.out.println("\t\t\t --------------Welcome to the SaltLake Chapter of The Great American HotRod CLassic Drag-------------- \n ");		
		System.out.println("Total Laps for Today's Race Are:"+ totallaps);
	}
	
	Start raceStart() {
		
		System.out.println("READY\n");
		System.out.println("3\n");
		System.out.println("2\n");
		System.out.println("GO\n");
		
		Start started=new Start();
		
		
		
		return started;
		
	}
}
class Start extends Daytona{
	
//	Result round() {
//		
//		
//	}

}

class Standing extends Start{
	
	void winner() {
		
		Race race=new Race("Salt Lake","Utah, USA");
		//Start firstRace=new Start();
		Daytona d=new Daytona();
		Start firstRace=d.raceStart();
		
		//return firstRace;
		
	}
	
}

class FinalStandings{
	
	
	
//	Result r() {
//		
//		Result r=new Result();
//		return r;
//		
//		
//		
//		
//	
//	}

}
	
//	Player winner() {
//		
//	}
	

class PlayerDetailss {
	
	private String plName;
	private int plAge;
	private String plCountry;
	private int plLastRanking;
	private String plTeam;
	private long lapTime;
	private long[] totalTime;
	boolean winningStatus;
	
	
	void raceStarted(PlayerDetailss ref) {
		
		int iterate=Race.totalPlayers;
		int[] allLapTime;
		for(int j=0;j<Daytona.totallaps;j++) 
		{
			long startTime=0;
			ref.lapTime=0;
			 for(int i=0;i<=iterate;i++) {
				long l= ZonedDateTime.now().toInstant().toEpochMilli();
				
				ref.lapTime=l-startTime;
				
				//double temp=Math.random()%100;
				System.out.println("Laptime for Player:"+i+"in Lap No:"+j+"is--->"+ref.lapTime);
				//startTime=lapTime;
				ref.totalTime[i]=ref.lapTime;
			}
		}
		
	}


	@Override
	public String toString() {
		return "PlayerDetailss [plName=" + plName + ", plAge=" + plAge + ", plCountry=" + plCountry + ", plLastRanking="
				+ plLastRanking + ", plTeam=" + plTeam + "]";
	}
	
	
	
/*  -------GETTERS AND SETTERS-------	*/	
	
	public String getPlName() {
		return plName;
	}
	public void setPlName(String plName) {
		this.plName = plName;
	}
	public int getPlAge() {
		return plAge;
	}
	public void setPlAge(int plAge) {
		this.plAge = plAge;
	}
	public String getPlCountry() {
		return plCountry;
	}
	public void setPlCountry(String plCountry) {
		this.plCountry = plCountry;
	}
	public int getPlLastRanking() {
		return plLastRanking;
	}
	public void setPlLastRanking(int plLastRanking) {
		this.plLastRanking = plLastRanking;
	}
	public String getPlTeam() {
		return plTeam;
	}
	public void setPlTeam(String plTeam) {
		this.plTeam = plTeam;
	}
	public void setWinningStatus(boolean winningStatus) {
		this.winningStatus = winningStatus;
	}	
	public boolean isWinningStatus() {
		return winningStatus;
	}

}

class InitializeRace{
	
	
	
}



