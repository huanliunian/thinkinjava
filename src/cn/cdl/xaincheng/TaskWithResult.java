package cn.cdl.xaincheng;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String>{

	private int id;
	
	public TaskWithResult(int id){
		this.id = id;
	}
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result of TaskWithResult"+id;
	}

}
