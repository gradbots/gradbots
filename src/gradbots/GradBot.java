package gradbots;



import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;
import robocode.SkippedTurnEvent;
import robocode.WinEvent;

public class GradBot extends AdvancedRobot {
	
	private RadarController radarCon;
	
	public void run(){
		
		radarCon = new RadarController(this);		
		setColors(Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE);
		turnRadarRight(360);
		while(true){
			execute();
		}
	}
	
	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		radarCon.onScannedRobot(event);
	}
	
	@Override
	public void onHitWall(HitWallEvent event) {
		System.out.println("WARNING: I hit a wall at " + event.getTime() 
			+ " angle from me " + event.getBearing());
	}
	
	@Override
	public void onHitRobot(HitRobotEvent event) {
	}
	
	@Override
	public void onRobotDeath(RobotDeathEvent event) {
	}
	
	@Override
	public void onBulletHit(BulletHitEvent event) {
	}
	
	@Override
	public void onBulletHitBullet(BulletHitBulletEvent event) {
	}
	
	@Override
	public void onBulletMissed(BulletMissedEvent event) {
	}
	
	@Override
	public void onHitByBullet(HitByBulletEvent event) {
	}
	
	@Override
	public void onWin(WinEvent event) {
	}
	
	@Override
	public void onSkippedTurn(SkippedTurnEvent event) {
		System.out.println("WARNING: Turn skipped at: " + event.getTime() 
			+ ", turn " + event.getSkippedTurn());
	}

}
