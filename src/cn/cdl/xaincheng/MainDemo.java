package cn.cdl.xaincheng;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainDemo {
	
	public static void main(String[] args) {
		
//		LiftOff liftOff1 = new LiftOff();
//		liftOff1.run();
//		LiftOff liftOff2 = new LiftOff();
//		liftOff2.run();
		
//		Thread thread = new Thread(new LiftOff());
//		thread.start();
//		int i = 100;
//		while(i-->0){
//			System.out.println("----------------------"+i);
//			Thread.yield();
//		}
		// 执行器（Executor）管理Thread对象
		// Executor 在客户端和执行任务之间提供了一个中间层，与客户端直接执行任务不同，这个中介对象将执行任务
		// 
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		int i = 5;
//		while(i-->0){
//			// 为每个任务都创建了一个线程
//			executorService.execute(new LiftOff());
//		}
		// newFixedThreadPool(5):一次性预先执行代价昂贵的线程分配，可以限制线程的数量
//		ExecutorService executorService = Executors.newFixedThreadPool(5);
//		for(int i=5;i>0;i++)
//			executorService.execute(new LiftOff());
//			// 可以防止新任务被提交给这个Executor
//			// shutdown()启动一次顺序关闭，执行以前提交的任务，但不接受新任务。如果已经关闭，则调用没有其他作用
//			executorService.shutdown();
//		
		// SingleThreadExecutor相当于线程数量为一的FixedThreadPool
		// 如果向SingleThreadExecutor提交了多个任务，那么这些任务将排队，每个任务都会在下一个任务开始之前运行结束
		// SingleThreadExecutor会序列化所有提交给它的任务，并会维护它自己（隐藏）的悬挂任务列表
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		for(int i=0;i<5;i++)
//			executorService.execute(new LiftOff());
//			executorService.shutdown();
		
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i=0;i<10;i++)
			results.add(exec.submit(new TaskWithResult(i)));
		for(Future<String> fs:results)
			try {
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
}
}
