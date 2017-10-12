package gradbots.RadarBehaviours;

import gradbots.GradBotWrappers.RadarWrapper;
import gradbots.Interfaces.IRadarBehaviour;

/**
 * Default radar behaviour implementation. Constantly turns radar right.
 * 
 * @author KAHX
 */
public class RadarBehaviourBase implements IRadarBehaviour
{
	protected RadarWrapper radarWrapper;
	
	public RadarBehaviourBase(RadarWrapper rw)
	{
		radarWrapper = rw;
	}
	
	public void doDefault()
	{
		radarWrapper.setTurnRadarRight(360.0);
	}
}
