package gradbots.BehaviourManagement;

import gradbots.GradBot;
import gradbots.BehaviourProfiles.BehaviourProfileBase;
import gradbots.Interfaces.IBehaviourProfile;

public final class BehaviourProfileManager
{
	private BehaviourProfileManager()
	{
		// hidden ctor 
	}
	
	public static IBehaviourProfile Choose(GradBot robot)
	{
		return new BehaviourProfileBase(robot);
	}
}
