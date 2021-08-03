package eg2;

import java.util.Objects;

public class Bus {

	private int id;
	private String providerName;
	private double cost;
	private float rating;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, String providerName, double cost, float rating) {
		super();
		this.id = id;
		this.providerName = providerName;
		this.cost = cost;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", providerName=" + providerName + ", cost=" + cost + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return id == other.id;
	}


	
}
