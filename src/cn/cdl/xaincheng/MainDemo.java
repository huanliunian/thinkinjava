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
		// ִ������Executor������Thread����
		// Executor �ڿͻ��˺�ִ������֮���ṩ��һ���м�㣬��ͻ���ֱ��ִ������ͬ������н����ִ������
		// 
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		int i = 5;
//		while(i-->0){
//			// Ϊÿ�����񶼴�����һ���߳�
//			executorService.execute(new LiftOff());
//		}
		// newFixedThreadPool(5):һ����Ԥ��ִ�д��۰�����̷߳��䣬���������̵߳�����
//		ExecutorService executorService = Executors.newFixedThreadPool(5);
//		for(int i=5;i>0;i++)
//			executorService.execute(new LiftOff());
//			// ���Է�ֹ�������ύ�����Executor
//			// shutdown()����һ��˳��رգ�ִ����ǰ�ύ�����񣬵�����������������Ѿ��رգ������û����������
//			executorService.shutdown();
//		
		// SingleThreadExecutor�൱���߳�����Ϊһ��FixedThreadPool
		// �����SingleThreadExecutor�ύ�˶��������ô��Щ�����Ŷӣ�ÿ�����񶼻�����һ������ʼ֮ǰ���н���
		// SingleThreadExecutor�����л������ύ���������񣬲���ά�����Լ������أ������������б�
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
