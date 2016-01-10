package cn.cdl.clazz;

import java.util.ArrayList;
import java.util.List;

import cn.cdl.clazz.Container.Pet;

public class ForNameCreator extends PetCreator{
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	private static String[] typesName = {
			"cn.cdl.clazz.Container.Mutt",
			"cn.cdl.clazz.Container.Pug",
			"cn.cdl.clazz.Container.Egyptianmua",
			"cn.cdl.clazz.Container.Manx",
			"cn.cdl.clazz.Container.Cymric",
			"cn.cdl.clazz.Container.Rat",
			"cn.cdl.clazz.Container.Mouse",
			"cn.cdl.clazz.Container.Hamster"
	};
	
	@SuppressWarnings("unchecked")
	public static void loader() {
		// TODO Auto-generated method stub
		try {
			for(String type:typesName)
				types.add((Class<? extends Pet>) Class.forName(type));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	static{
		loader();
	}

	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}
}
