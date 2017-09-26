package gradbots;

import robocode.ScannedRobotEvent;
import robocode.util.Utils;
import robocode.AdvancedRobot;

public class RadarController {

	private AdvancedRobot GradBot;
	
	public RadarController(AdvancedRobot GradBot){
		this.GradBot = GradBot;
	};
	
	public void onScannedRobot(ScannedRobotEvent event) {
		System.out.println("Event Got to Radar Controller");
		double radarTurn =
		        // Absolute bearing to target
		        GradBot.getHeadingRadians() + event.getBearingRadians()
		        // Subtract current radar heading to get turn required
		        - GradBot.getRadarHeadingRadians();
		 
		    GradBot.setTurnRadarRightRadians(Utils.normalRelativeAngle(radarTurn));
		    GradBot.scan();

	}
	
}
