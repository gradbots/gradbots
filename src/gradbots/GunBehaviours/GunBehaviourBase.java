package gradbots.GunBehaviours;

import gradbots.GradBotWrappers.GunWrapper;
import gradbots.Interfaces.IGunBehaviour;

/**
 * Default gun behaviour implementation. Fires at power 3 constantly.
 * 
 * @author KAHX
 *
 */
public class GunBehaviourBase implements IGunBehaviour
{
	protected GunWrapper gunWrapper;
	
	public GunBehaviourBase(GunWrapper gw)
	{
		gunWrapper = gw;
	}
	
	public void doDefault()
	{
		gunWrapper.setFire(3);
	}
}
