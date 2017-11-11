package cargoweight;

class Car {
	private double totalWeight=0;
	ComputeWeight[] com;
	Car(ComputeWeight[] com) {
		this.com = com;
	}
	public double gettotalWeight() {
		for(int i=0;i<com.length;i++) {
			totalWeight+=com[i].computeWeight();
		}
		return totalWeight;
	}
		
	
}
