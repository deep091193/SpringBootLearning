package com.lamdaPractice;

import java.io.InputStream;
import java.io.OutputStream;

public class ThisReferenceExample {

	public void doProcess(int i, Process p){
		
	}
	public static void main(String[] args) {

		ThisReferenceExample referenceExample = new ThisReferenceExample();
		referenceExample.doProcess(10, new Process() {
			@SuppressWarnings("unused")
			public void process(int i){
				System.out.println("Value of I is :" + i);
				System.out.println(this);
				
			}

			@Override
			public OutputStream getOutputStream() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public InputStream getInputStream() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public InputStream getErrorStream() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int waitFor() throws InterruptedException {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int exitValue() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				
			}
		});
			


	}

}
