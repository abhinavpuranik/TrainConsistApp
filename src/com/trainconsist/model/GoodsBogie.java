/*
 * @author Developer
 * @version 16.0
 * 
 * goods Bogie model
 **/

package com.trainconsist.model;

import com.trainconsist.exception.CargoSafetyException;

public class GoodsBogie {

		public String type;
		String cargo;
		
		public GoodsBogie(String type, String cargo) {
			this.type = type;
			this.cargo = cargo;
			
		}
		public GoodsBogie(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}

		public String getCargo() {
			return cargo;
		}
		
		public void assignCargo(String cargo) {
			if(!type.equals("Cylindrical") && cargo.equals("Petroleum")) 
			{
				throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be loaded in " + type + " bogie");
			}
			this.cargo = cargo;
			System.out.println("Cargo assigned successfully: " + cargo);
		}
}

