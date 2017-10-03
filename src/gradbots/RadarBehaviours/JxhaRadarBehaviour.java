/**
 * @author JXHA
 */

package gradbots.RadarBehaviours;

import gradbots.GradBot;
import gradbots.Interfaces.IRadarBehaviour;
import robocode.BulletHitEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;
import gradbots.radarProcessing;

public class JxhaRadarBehaviour implements IRadarBehaviour
{
	
	protected GradBot GradBot;
	private boolean scanningForInfo = false;
	private radarProcessing radar;
	
	public JxhaRadarBehaviour(GradBot gradbot)
	{
		this.GradBot = gradbot;
		radar = new radarProcessing(gradbot);
	}
	
	public void doDefault(){
		scanForTarget();
	}
	
	public void onScannedRobot(ScannedRobotEvent e) 
	{
		
		if(!scanningForInfo){
			//Radar Lock On 
			double radarTurn = GradBot.getHeadingRadians() + e.getBearingRadians() - GradBot.getRadarHeadingRadians();
			GradBot.setTurnRadarRightRadians(Utils.normalRelativeAngle(radarTurn));
			//GradBot.scan();
		}	
		else if (scanningForInfo && GradBot.getTurnRemaining()==0){
			scanningForInfo = false;
		}
		
		radar.onScannedRobot(e);
	}
	
	public void onBulletHit(BulletHitEvent e) {
		radar.onBulletHit(e);
	}
	
	public void scanForTarget()
	{
		GradBot.setTurnRadarRight(Double.MAX_VALUE);
	}
	
	public void scanForInfo(){
		GradBot.setTurnRadarRight(380);
		scanningForInfo = true;
	}
}
