/**
 * @author JXHA
 */

package gradbots.RadarBehaviours;

import gradbots.GradBotWrappers.RadarWrapper;
import gradbots.Interfaces.IRadarBehaviour;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

public class JxhaRadarBehaviour implements IRadarBehaviour
{
	protected RadarWrapper radarWrapper;
	private boolean scanningForInfo = false;
	
	public JxhaRadarBehaviour(RadarWrapper rw)
	{
		radarWrapper = rw;
	}
	
	public void doDefault()
	{
		if (radarWrapper.getRadarTurnRemaining() == 0)
			scanForTarget();
	}
	
	public void onScannedRobot(ScannedRobotEvent e) 
	{
		if(!scanningForInfo)
		{
			//Radar Lock On 
			double radarTurn = radarWrapper.getHeading() + e.getBearing() - radarWrapper.getRadarHeading();
			radarWrapper.setTurnRadarRight(Utils.normalRelativeAngleDegrees(radarTurn));
			//GradBot.scan();
		}	
		else if (scanningForInfo && radarWrapper.getTurnRemaining()==0)
		{
			scanningForInfo = false;
		}
	}
	
	public void scanForTarget()
	{
		radarWrapper.setTurnRadarRight(Double.MAX_VALUE);
	}
	
	public void scanForInfo()
	{
		radarWrapper.setTurnRadarRight(380);
		scanningForInfo = true;
	}
}
