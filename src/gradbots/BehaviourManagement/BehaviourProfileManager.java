package gradbots.BehaviourManagement;

import gradbots.GradBot;

import gradbots.BehaviourProfiles.BehaviourProfileBase;
import gradbots.GradBotWrappers.GunWrapper;
import gradbots.GradBotWrappers.MovementWrapper;
import gradbots.GradBotWrappers.RadarWrapper;
import gradbots.Interfaces.IBehaviourProfile;
import gradbots.MovementBehaviours.RandomMovementBehaviour;
import gradbots.RadarBehaviours.JxhaRadarBehaviour;

/**
 * This class is responsible for deciding the behaviour profile
 * for the robot to use.
 * 
 * @author KAHX
 *
 */
public final class BehaviourProfileManager
{
	private BehaviourProfileManager()
	{
		// hidden ctor 
	}
	
	public static IBehaviourProfile Choose(GradBot r)
	{
		// make wrappers
		GunWrapper      gunWrapper      = new GunWrapper(r);
		MovementWrapper movementWrapper = new MovementWrapper(r);
		RadarWrapper    radarWrapper    = new RadarWrapper(r);
		
		IBehaviourProfile profile = new BehaviourProfileBase(r);
		
//		int others = robot.getOthers();
//		
//		if (others == 1)
//		{
//			// 1v1 behaviour
//		}
//		else if (others < 3)
//		{
//			// small battle behaviour
//		}
//		else
//		{
//			// large battle behaviour
//		}
		
		profile.setMovementBehaviour(new RandomMovementBehaviour(movementWrapper));
		profile.setRadarBehaviour(new JxhaRadarBehaviour(radarWrapper));
		
		return profile;
	}
}
