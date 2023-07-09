package user_defined_object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Cricket_Bat {
	// Instance variable
	public static String product = "CRICKET BAT";
	private String Brand_name;
	private String Willow_name;
	private String Edition_name;
	private int Bat_id;
	private double Rate;

	// Constructor
	public Cricket_Bat(String brand_name, String willow_name, String edition_name, int bat_id, double rate) {
		super();
		Brand_name = brand_name;
		Willow_name = willow_name;
		Edition_name = edition_name;
		Bat_id = bat_id;
		Rate = rate;
	}

			// Setter | Getter method for Brand_name
			public String getBrand_name() {
				return Brand_name;
			}
		
			public void setBrand_name(String brand_name) {
				Brand_name = brand_name;
			}

					// Setter | Getter method for Willow_name
					public String getWillow_name() {
						return Willow_name;
					}
				
					public void setWillow_name(String willow_name) {
						Willow_name = willow_name;
					}

							// Setter | Getter method for Edition_name
							public String getEdition_name() {
								return Edition_name;
							}
						
							public void setEdition_name(String edition_name) {
								Edition_name = edition_name;
							}

									// Setter | Getter method for Bat_id
									public int getBat_id() {
										return Bat_id;
									}
								
									public void setAt_id(int bat_id) {
										Bat_id = bat_id;
									}

											// Setter | Getter method for Rate
											public double getRate() {
												return Rate;
											}
										
											public void setRate(double rate) {
												Rate = rate;
											}

		@Override // toString method
	public String toString() {
		return "\n Cricket_Bat [Brand_name=" + Brand_name + ", Willow_name=" + Willow_name + ", Edition_name="
				+ Edition_name + ", Bat_id=" + Bat_id + ", Rate=" + Rate + "]";
	}
		
		

	
	@Override
		public int hashCode() {
			return Objects.hash(Bat_id, Brand_name, Edition_name, Rate, Willow_name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cricket_Bat other = (Cricket_Bat) obj;
			return Bat_id == other.Bat_id /*&& Objects.equals(Brand_name, other.Brand_name)
					&& Objects.equals(Edition_name, other.Edition_name)
					&& Double.doubleToLongBits(Rate) == Double.doubleToLongBits(other.Rate)
					&& Objects.equals(Willow_name, other.Willow_name)*/;
		}
		
// ##########################################################################################################
	
}
