package itunibo.jcc.planner.model;

class Location (private val name: String) {

	companion object {
		
		public val UNSPECIFIED = Location("unspecified")
		public val TRAVELLING = Location("travelling")
		
		public val locations: Map<String, Location> = mutableMapOf<String, Location>()
		
		init {
			// TODO Put "special" locations in locations map?
			// Note: would be used to calculate possible action in "getAllApplicable!"
		}
		
		operator fun get(name: String): Location {
			if (!locations.containsKey(name)){
				(locations as MutableMap<String, Location>)[name] = Location(name)
			}
			return locations[name]!!
		}
	}
	
	override fun toString(): String {
		return name;
	}
}