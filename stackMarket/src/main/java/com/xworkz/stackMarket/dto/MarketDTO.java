package com.xworkz.stackMarket.dto;

public class MarketDTO {
	
		private String name;
		private String email;
		private int age;
		private long contact;
		public MarketDTO() {
			System.out.println("no arg const of FormDTO");
		}
		public MarketDTO(String name, String email, int age, long contact) {
			super();
			this.name = name;
			this.email = email;
			this.age = age;
			this.contact = contact;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + (int) (contact ^ (contact >>> 32));
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			MarketDTO other = (MarketDTO) obj;
			if (age != other.age)
				return false;
			if (contact != other.contact)
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "MarketDTO [name=" + name + ", email=" + email + ", age=" + age + ", contact=" + contact + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getContact() {
			return contact;
		}
		public void setContact(long contact) {
			this.contact = contact;
		}
	}


