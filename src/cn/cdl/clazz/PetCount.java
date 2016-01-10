package cn.cdl.clazz;

import java.util.HashMap;

import cn.cdl.clazz.Container.Cat;
import cn.cdl.clazz.Container.Cymric;
import cn.cdl.clazz.Container.Dog;
import cn.cdl.clazz.Container.Egyptianmua;
import cn.cdl.clazz.Container.Hamster;
import cn.cdl.clazz.Container.Manx;
import cn.cdl.clazz.Container.Mouse;
import cn.cdl.clazz.Container.Mutt;
import cn.cdl.clazz.Container.Pet;
import cn.cdl.clazz.Container.Pug;
import cn.cdl.clazz.Container.Rat;
import cn.cdl.clazz.Container.Rodent;

public class PetCount {
	
	static class PetCounter extends HashMap<String, Integer>{
		public void count(String type){
			Integer num = this.get(type);
			if(num==null)
				this.put(type, 1);
			else
				this.put(type, num++);
		}
	}

	public static void countPets(PetCreator creator){
		PetCounter petCounter = new PetCounter();
		for(Pet pet:creator.createArrayPet(20)){
			System.out.println(pet.getClass().getSimpleName()+" ");
			if(pet instanceof Pet)
				petCounter.count("Pet");
			if(pet instanceof Dog)
				petCounter.count("Dog");
			if(pet instanceof Mutt)
				petCounter.count("Mutt");
			if(pet instanceof Pug)
				petCounter.count("pug");
			if(pet instanceof Cat)
				petCounter.count("Cat");
			if(pet instanceof Manx)
				petCounter.count("Manx");
			if(pet instanceof Egyptianmua)
				petCounter.count("Egyptianmua");
			if(pet instanceof Cymric)
				petCounter.count("Cymric");
			if(pet instanceof Rodent)
				petCounter.count("Rodent");
			if(pet instanceof Rat)
				petCounter.count("Rat");
			if(pet instanceof Mouse)
				petCounter.count("Mouse");
			if(pet instanceof Hamster)
				petCounter.count("Hamster");
			System.out.println(petCounter);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countPets(new ForNameCreator());
	}

}
