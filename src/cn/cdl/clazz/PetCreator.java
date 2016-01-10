package cn.cdl.clazz;

import java.util.List;
import java.util.Random;

import cn.cdl.clazz.Container.Pet;

//宠物创造器
	abstract class PetCreator{
		private Random rand = new Random(47);
		public abstract List<Class<? extends Pet>> types();
		// 随机创建一个宠物
		public Pet randomPet(){
			int n = rand.nextInt(types().size());
			try {
				return types().get(n).newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		// 创建一组宠物
		public Pet[] createArrayPet(int size){
			Pet pet[] = new Pet[size];
			for(int i=0;i<size;i++){
				pet[i] = randomPet();
			}
			return pet;
		}
	}
