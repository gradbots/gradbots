package gradbots.MovementBehaviours;

import gradbots.GradBotWrappers.MovementWrapper;
import gradbots.Interfaces.IMovementBehaviour;

/**
 * Default movement behaviour implementation. Moves forward constantly.
 * 
 * @author KAHX
 *
 */
public class MovementBehaviourBase implements IMovementBehaviour
{
	protected MovementWrapper movementWrapper;
	
	public MovementBehaviourBase(MovementWrapper mw)
	{
		movementWrapper = mw;
	}
	
	public void doDefault()
	{
		movementWrapper.setAhead(100);
	}
}
