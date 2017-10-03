package gradbots;

import robocode.BulletHitEvent;
import robocode.ScannedRobotEvent;

public class radarProcessing {

	// *** EVENT FLAGS *** //
	public boolean robotTooClose = false;
	public boolean bulletFired = false;	
	
	// *** local variables *** //
	private double lockedOnEnemyEnergy = 0.0;	
	private GradBot gradBot;
	
	// class constructor
	public radarProcessing (GradBot bot) {
		gradBot = bot;
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {		
		
		// check if enemy energy has dropped due to bullet fired
		checkBulletFired(e);
		checkEnemyProximity(e);
		
		// Update enemy energy level
		lockedOnEnemyEnergy = e.getEnergy();
		
	}
	
	public void onBulletHit(BulletHitEvent e) {
		
		// update locked on enemy energy after being struck by bullet
		lockedOnEnemyEnergy = e.getEnergy();
	}
	
	private void checkEnemyProximity(ScannedRobotEvent e) {
		if (e.getDistance() <= 2*this.gradBot.getWidth()) {
			robotTooClose = true;
		}
	}
	
	private void checkBulletFired(ScannedRobotEvent e) {
		if (lockedOnEnemyEnergy - e.getEnergy() >= 0.1 && 
				lockedOnEnemyEnergy - e.getEnergy() <= 3.0) {
			bulletFired = true;
		}
	}	
	
	public void clearRobotTooClose() {
		robotTooClose = false;
	}
	
	public void clearBulletFired() {
		bulletFired = false;
	}
	
	
	
}
