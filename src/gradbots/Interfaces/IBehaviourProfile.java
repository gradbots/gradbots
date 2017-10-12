package gradbots.Interfaces;


/**
 * Classes that implement this interface are a collection
 * of objects to handle firing, movement, radar
 * 
 * @author KAHX
 *
 */
public interface IBehaviourProfile extends IEventHandler, IDefaultable
{
	public void setGunBehaviour(IGunBehaviour newGunBehaviour);
	
	public void setMovementBehaviour(IMovementBehaviour newMovementBehaviour);
	
	public void setRadarBehaviour(IRadarBehaviour newRadarBehaviour);
}
