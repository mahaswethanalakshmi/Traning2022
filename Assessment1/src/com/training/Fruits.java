package com.training;

public class Fruits  {

	private String fruitName;   //	private String fruitName;

	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruits(String fruites) {
		super();
		fruitName = fruites;
	}

	public String getFruites() {
		return fruitName;
	}

	public void setFruites(String fruites) {
		fruitName = fruites;
	}
	

	@Override
	public String toString() {
		return "Fruits [fruitName=" + fruitName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruitName == null) ? 0 : fruitName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruits other = (Fruits) obj;
		if (fruitName == null) {
			if (other.fruitName != null)
				return false;
		} else if (!fruitName.equals(other.fruitName))
			return false;
		return true;
	}}

