package itunibo.jcc.planner.model

// Flyweight pattern

class Item(private val name: String) {

	companion object {
		
		public val items: Map<String, Item> = mutableMapOf<String, Item>()
		
		operator fun get(name: String): Item {
			if (!items.containsKey(name)){
				(items as MutableMap<String, Item>)[name]  = Item(name)
			}
			return items[name]!!
		}
	}
	
	override fun toString(): String {
		return name;
	}
}