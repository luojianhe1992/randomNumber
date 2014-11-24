package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import utils.FileUtil;
import utils.FileUtil.FileLineProcess;

public class DataReader {
	public static List<int[]> loadData(String path){
		
		final List<int[]> result = new ArrayList<int[]>();
		
		FileUtil.iteratePathFileByLine(path, new FileLineProcess(){
			public boolean process(String line){
				char [] charList = line.toCharArray();
				
				int [] intList = new int [charList.length];
				
				for(int i = 0;i<charList.length;i++){
					intList[i] = charList[i] - '0';
				}
				result.add(intList);
				
				return true;
			}
		});
		return result;
	}
	
	//针对于第二种数据文件
	public static List<int[]> loadData2(String path){
		
		final List<int []> result = new ArrayList<int []>();
		
		FileUtil.iteratePathFileByLine(path, new FileLineProcess(){

			@Override
			public boolean process(String line) {
				
				if(line==null){
					System.out.println("the line is null.");
					
				}
				else{
					if(line.trim()==""){
						System.out.println("the line has no character");
					}
					else{
						String [] splits = line.split(":");
						
						char[] charList = splits[0].toCharArray();
						
						int [] intList = new int [charList.length];
						
						for(int i=0;i<charList.length;i++){
							intList[i] = charList[i] - '0';
						}
						result.add(intList);
						
					}
				}
				
				return true;
			}
		});
		return result;
	}
	
	public static void main(String [] args){
		
		/*
		
		List<int []> intArrayList = loadData("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi——一万位副本.txt");

		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i=0;i<intArrayList.size();i++){
			int [] temp = intArrayList.get(i);
			
			for(int j=0;j<temp.length;j++){
				intList.add(temp[j]);
			}
		}
		
		int l = 0;
		
		System.out.println("the intList is:");
		
		for(int i=0;i<intList.size();i++){
			System.out.print(intList.get(i)+" ");
			l++;
			if(l==50){
				System.out.println();
				l = l-50;
			}
		}
		
		
		int number_1 = 0;
		int number_2 = 0;
		int number_3 = 0;
		int number_4 = 0;
		int number_5 = 0;
		int number_6 = 0;
		int number_7 = 0;
		int number_8 = 0;
		int number_9 = 0;
		int number_0 = 0;
		
		for(int i=0;i<intList.size();i++){
			if(intList.get(i)==1){
				number_1++;
			}
			else if(intList.get(i)==2){
				number_2++;
			}
			else if(intList.get(i)==3){
				number_3++;
			}
			else if(intList.get(i)==4){
				number_4++;
			}
			else if(intList.get(i)==5){
				number_5++;
			}
			else if(intList.get(i)==6){
				number_6++;
			}
			else if(intList.get(i)==7){
				number_7++;
			}
			else if(intList.get(i)==8){
				number_8++;
			}
			else if(intList.get(i)==9){
				number_9++;
			}
			else{
				number_0++;
			}
		}
		
		System.out.println("number_1 is:"+number_1);
		System.out.println("number_2 is:"+number_2);
		System.out.println("number_3 is:"+number_3);
		System.out.println("number_4 is:"+number_4);
		System.out.println("number_5 is:"+number_5);
		System.out.println("number_6 is:"+number_6);
		System.out.println("number_7 is:"+number_7);
		System.out.println("number_8 is:"+number_8);
		System.out.println("number_9 is:"+number_9);
		System.out.println("number_0 is:"+number_0);;
		
		*/
		
		
		System.out.println("*****************************");
		
		/*
		
		List<int []> intArrayList2 = loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi——一万位副本 2.txt");
		
		List<Integer> intList2 = new ArrayList<Integer>();
	
		for(int i=0;i<intArrayList2.size();i++){
			for(int j=0;j<intArrayList2.get(i).length;j++){
				intList2.add(intArrayList2.get(i)[j]);
			}
		}
		
		int l2 = 0;
		
		System.out.println("the intList2 is:");
		
		for(int i=0;i<intList2.size();i++){
			System.out.print(intList2.get(i)+" ");
			
			l2++;
			
			if(l2==50){
				System.out.println();
				l2 = l2 - 50;
			}
		}
		
		number_1 = 0;
		number_2 = 0;
		number_3 = 0;
		number_4 = 0;
		number_5 = 0;
		number_6 = 0;
		number_7 = 0;
		number_8 = 0;
		number_9 = 0;
		number_0 = 0;
		
		
		
		for(int i=0;i<intList2.size();i++){
			if(intList2.get(i)==1){
				number_1++;
			}
			else if(intList2.get(i)==2){
				number_2++;
			}
			else if(intList2.get(i)==3){
				number_3++;
			}
			else if(intList2.get(i)==4){
				number_4++;
			}
			else if(intList2.get(i)==5){
				number_5++;
			}
			else if(intList2.get(i)==6){
				number_6++;
			}
			else if(intList2.get(i)==7){
				number_7++;
			}
			else if(intList2.get(i)==8){
				number_8++;
			}
			else if(intList2.get(i)==9){
				number_9++;
			}
			else{
				number_0++;
			}
		}
		
		System.out.println("number_1 is:"+number_1);
		System.out.println("number_2 is:"+number_2);
		System.out.println("number_3 is:"+number_3);
		System.out.println("number_4 is:"+number_4);
		System.out.println("number_5 is:"+number_5);
		System.out.println("number_6 is:"+number_6);
		System.out.println("number_7 is:"+number_7);
		System.out.println("number_8 is:"+number_8);
		System.out.println("number_9 is:"+number_9);
		System.out.println("number_0 is:"+number_0);;
		
		
		
		System.out.println("sum = "+ (number_1+number_2+number_3+number_4+number_5+number_6+number_7+number_8+number_9+number_0));
	
		*/
	
		System.out.println("**********************");
		
		/*
		
		List<int []> intArrayList3 = loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi——一百万位副本.txt");
	
		List<Integer> intList3 = new ArrayList<Integer>();
		
		for(int i = 0; i < intArrayList3.size(); i++){
			for(int j = 0; j < intArrayList3.get(i).length; j++){
				intList3.add(intArrayList3.get(i)[j]);
			}
		}
		
		int l3 = 0 ;
		
		System.out.println("the intList3 is:");
		
		for(int i = 0; i < intList3.size(); i++){
			System.out.print(intList3.get(i)+" ");
			
			l3++;
			
			if(l3==50){
				System.out.println();
				l3 = l3 - 50;
			}
			
		}
		
		number_1 = 0;
		number_2 = 0;
		number_3 = 0;
		number_4 = 0;
		number_5 = 0;
		number_6 = 0;
		number_7 = 0;
		number_8 = 0;
		number_9 = 0;
		number_0 = 0;
		
		
		
		for(int i=0;i<intList3.size();i++){
			if(intList3.get(i)==1){
				number_1++;
			}
			else if(intList3.get(i)==2){
				number_2++;
			}
			else if(intList3.get(i)==3){
				number_3++;
			}
			else if(intList3.get(i)==4){
				number_4++;
			}
			else if(intList3.get(i)==5){
				number_5++;
			}
			else if(intList3.get(i)==6){
				number_6++;
			}
			else if(intList3.get(i)==7){
				number_7++;
			}
			else if(intList3.get(i)==8){
				number_8++;
			}
			else if(intList3.get(i)==9){
				number_9++;
			}
			else{
				number_0++;
			}
		}
		
		System.out.println("number_1 is:"+number_1);
		System.out.println("number_2 is:"+number_2);
		System.out.println("number_3 is:"+number_3);
		System.out.println("number_4 is:"+number_4);
		System.out.println("number_5 is:"+number_5);
		System.out.println("number_6 is:"+number_6);
		System.out.println("number_7 is:"+number_7);
		System.out.println("number_8 is:"+number_8);
		System.out.println("number_9 is:"+number_9);
		System.out.println("number_0 is:"+number_0);;
		
		
		
		System.out.println("sum = "+ (number_1+number_2+number_3+number_4+number_5+number_6+number_7+number_8+number_9+number_0));
	
	
		System.out.println("sum1 = "+(number_0+number_1+number_2+number_3+number_4)+"    "+"sum2 = "+(number_5+number_6+number_7+number_8+number_9));
		
		double bias =  (1.0*((number_0+number_1+number_2+number_3+number_4)-(number_5+number_6+number_7+number_8+number_9))/(number_1+number_2+number_3+number_4+number_5+number_6+number_7+number_8+number_9+number_0));
		
		System.out.println("bias = "+ bias);
		
		*/
		
		//System.out.println("**********************");
		
		/*
		
		List<int[]> intArrayList4 = loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi——十亿位 副本.txt");
		
		List<Integer> intList4 = new ArrayList<Integer>();
		
		for(int i = 0;i<intArrayList4.size();i++){
			for(int j=0;j<intArrayList4.get(i).length;j++){
				intList4.add(intArrayList4.get(i)[j]);
			}
		}
		
		int l4 = 0;
		
		System.out.println("the intList4 is:");
		
		for(int i=0;i<intList4.size();i++){
			System.out.print(intList4.get(i)+" ");
			l4++;
			
			if(l4==50){
				System.out.println();
				l4 = l4 - 50;
			}
		}
		
		*/
		
		/*
		
		System.out.println("************************");
		
		List<int []> intArrayList5 = loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part1.txt");
	
		List<Integer> intList5 = new ArrayList<Integer>();
		
		for(int i=0;i<intArrayList.size();i++){
			for(int j=0;j<intArrayList.get(i).length;j++){
				intList.add(intArrayList.get(i)[j]);
				
			}
		}
		
		int l5 = 0;
		System.out.println("the intArrayList5 is:");
		
		for(int i=0;i<intList.size();i++){
			System.out.print(intList.get(i)+" ");
			l5++;
			
			if(l5==50){
				System.out.println();
				l5 = l5-50;
			}
		}
		
		*/
	

		System.out.println("************************");
		
		//
		//List<List<int []>> allData = new ArrayList<List<int[]>>();
		
		String [] paths = new String [100];
		
		int temp;
		
		for(int i=0;i<100;i++){
			
			temp = i + 1;
			
			paths [i] = "/Users/jianheluo/Documents/workspace/RandomNumber_jianhel/resources/piInputData/"+temp+"_pi.txt";
		}
		
		/*
		
		paths [0] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part1.txt";
		
		paths [1] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part2.txt";
		
		paths [2] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part3.txt";
		
		paths [3] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part4.txt";
		
		paths [4] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part5.txt";
		
		paths [5] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part6.txt";

		paths [6] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part7.txt";
		
		paths [7] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part8.txt";
		
		paths [8] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part9.txt";
		
		paths [9] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part10.txt";
		
		*/
		List<Integer> intList = new ArrayList<Integer>();
		
		List<int []> intArrayList;
		
		String [] outputPaths = new String [10];
		
		/*
		
		outputPaths [0] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part1.txt";
		
		outputPaths [1] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part2.txt";
		
		outputPaths [2] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part3.txt";
		
		outputPaths [3] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part4.txt";
		
		outputPaths [4] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part5.txt";
		
		outputPaths [5] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part6.txt";
		
		outputPaths [6] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part7.txt";
		
		outputPaths [7] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part8.txt";
		
		outputPaths [8] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part9.txt";
		
		outputPaths [9] = "/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/outputdata/randomNumber_part10.txt";
		*/
		
		//
		String outputPathOverall = "/Users/jianheluo/Documents/workspace/RandomNumber_jianhel/resources/outputdata/randomNumberOverall.txt";
		
		//count the number of 0 and 1
		long number_0 = 0;
		long number_1 = 0;
		
		//PrintWriter writer = null;
		
		//
		PrintWriter writer_overall = null;
		
		//
		File newFileOverall =  new File(outputPathOverall);
		
		//
		try{
			//
			writer_overall = new PrintWriter(newFileOverall);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		//
		for(int i=0;i<100;i++){
			intArrayList = loadData2(paths[i]);
			
			for(int j=0;j<intArrayList.size();j++){
				for(int k=0;k<intArrayList.get(j).length;k++){
					if(intArrayList.get(j)[k]<=4){
						intList.add(0);
						number_0++;
					}
					else{
						intList.add(1);
						number_1++;
					}
				}
			}
			
			//
			intArrayList.clear();
			
			
			//File newFile = new File(outputPaths[i]);
			
			
			/*
			try{
				writer = new PrintWriter(newFile);
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			*/
			
			int line = 0;
			
			for(int m=0;m<intList.size();m++){
				
				if(line == 49){
					//writer.print(intList.get(m));
					
					//
					writer_overall.print(intList.get(m));
					
					line++;
					
				}
				else{
					//writer.print(intList.get(m)+",");
					
					//
					writer_overall.print(intList.get(m)+",");
					
					line++;
				}
				
				if(line == 50){
					//writer.println();
					
					//
					writer_overall.println();
					
					line = line - 50;
				}
				
				
			}
			
			//
			//writer.flush();
			
			//
			writer_overall.flush();
			
			//
			intList.clear();
			
		}
		
		//writer.close();
		
		//
		writer_overall.close();
		
		System.out.println("the number_0 is:"+number_0+"\t"+"the number_1 is:"+number_1);
		
		System.out.println("the bias is:"+(1.0*(number_0-number_1))/(number_0+number_1));
		
		
		int number_0_l = 0;
		int number_1_l = 1;
		
		
		
		
		//I divide the one billion into ten parts, so I load the ten parts data.
		//allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part1.txt"));
	
		/*
		
		allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part2.txt"));
		
		allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part3.txt"));
		
		allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part4.txt"));
		
		
		
		allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part5.txt"));
		
		allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part6.txt"));
		
		allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part7.txt"));
		
		allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part8.txt"));
		
		
		
		allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part9.txt"));
		
		allData.add(loadData2("/Users/jianheluo/Documents/workspace/RandomNumberGenerator/resources/data/pi十亿位分块/pi_part10.txt"));
		
		*/
		
		/*
		
		//define allInt to store all the Integer
		List<ArrayList<Integer>> allInt = new ArrayList<ArrayList<Integer>>();

		
		for(int i=0;i<1;i++){
			allInt.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<allData.get(0).size();i++){
			for(int j=0;j<allData.get(0).get(i).length;j++){
				allInt.get(0).add(allData.get(0).get(i)[j]);
			}
		}
		
		*/
		
		/*
		
		for(int i=0;i<allData.get(1).size();i++){
			for(int j=0;j<allData.get(1).get(i).length;j++){
				allInt.get(1).add(allData.get(1).get(i)[j]);
			}
		}
		
		for(int i=0;i<allData.get(2).size();i++){
			for(int j=0;j<allData.get(2).get(i).length;j++){
				allInt.get(2).add(allData.get(2).get(i)[j]);
			}
		}
		
		for(int i=0;i<allData.get(3).size();i++){
			for(int j=0;j<allData.get(3).get(i).length;j++){
				allInt.get(3).add(allData.get(3).get(i)[j]);
			}
		}
		
		
		
		for(int i=0;i<allData.get(4).size();i++){
			for(int j=0;j<allData.get(4).get(i).length;j++){
				allInt.get(4).add(allData.get(4).get(i)[j]);
			}
		}
		
		for(int i=0;i<allData.get(5).size();i++){
			for(int j=0;j<allData.get(5).get(i).length;j++){
				allInt.get(5).add(allData.get(5).get(i)[j]);
			}
		}
		
		for(int i=0;i<allData.get(6).size();i++){
			for(int j=0;j<allData.get(6).get(i).length;j++){
				allInt.get(6).add(allData.get(6).get(i)[j]);
			}
		}
		
		for(int i=0;i<allData.get(7).size();i++){
			for(int j=0;j<allData.get(7).get(i).length;j++){
				allInt.get(7).add(allData.get(7).get(i)[j]);
			}
		}
		
		
		
		for(int i=0;i<allData.get(8).size();i++){
			for(int j=0;j<allData.get(8).get(i).length;j++){
				allInt.get(8).add(allData.get(8).get(i)[j]);
			}
		}
		
		for(int i=0;i<allData.get(9).size();i++){
			for(int j=0;j<allData.get(9).get(i).length;j++){
				allInt.get(9).add(allData.get(9).get(i)[j]);
			}
		}
		
		*/
		
		
		/*
		
		int l7 = 0;
		
		
		
		System.out.println("the allInt is:");
		
		
		
		for(int i=0;i<1;i++){
			for(int j=0;j<allInt.get(i).size();j++){
				System.out.print(allInt.get(i).get(j)+" ");
				l7++;
				
				if(l7==50){
					System.out.println();
					l7 = l7 -50;
				}
			}
		}
		*/
		/*
		int number_1 = 0;
		int number_2 = 0;
		int number_3 = 0;
		int number_4 = 0;
		int number_5 = 0;
		int number_6 = 0;
		int number_7 = 0;
		int number_8 = 0;
		int number_9 = 0;
		int number_0 = 0;
		
		
		
		for(int i=0;i<allInt.get(0).size();i++){
			if(allInt.get(0).get(i)==1){
				number_1++;
			}
			else if(allInt.get(0).get(i)==2){
				number_2++;
			}
			else if(allInt.get(0).get(i)==3){
				number_3++;
			}
			else if(allInt.get(0).get(i)==4){
				number_4++;
			}
			else if(allInt.get(0).get(i)==5){
				number_5++;
			}
			else if(allInt.get(0).get(i)==6){
				number_6++;
			}
			else if(allInt.get(0).get(i)==7){
				number_7++;
			}
			else if(allInt.get(0).get(i)==8){
				number_8++;
			}
			else if(allInt.get(0).get(i)==9){
				number_9++;
			}
			else{
				number_0++;
			}
		}
		
		System.out.println("number_1 is:"+number_1);
		System.out.println("number_2 is:"+number_2);
		System.out.println("number_3 is:"+number_3);
		System.out.println("number_4 is:"+number_4);
		System.out.println("number_5 is:"+number_5);
		System.out.println("number_6 is:"+number_6);
		System.out.println("number_7 is:"+number_7);
		System.out.println("number_8 is:"+number_8);
		System.out.println("number_9 is:"+number_9);
		System.out.println("number_0 is:"+number_0);;
		
		
		
		System.out.println("sum = "+ (number_1+number_2+number_3+number_4+number_5+number_6+number_7+number_8+number_9+number_0));
	
	
		System.out.println("sum1 = "+(number_0+number_1+number_2+number_3+number_4)+"    "+"sum2 = "+(number_5+number_6+number_7+number_8+number_9));
		
		double bias =  (1.0*((number_0+number_1+number_2+number_3+number_4)-(number_5+number_6+number_7+number_8+number_9))/(number_1+number_2+number_3+number_4+number_5+number_6+number_7+number_8+number_9+number_0));
		
		System.out.println("bias = "+ bias);
		
		*/
		
		/*
		
		System.out.println();
		
		System.out.println("print out the 0 or 1 random number:");
		
		List<Integer> randomNumber = new ArrayList<Integer>();
		
		for(int i = 0;i<allInt.get(0).size();i++){
			if(allInt.get(0).get(i)<=4){
				randomNumber.add(0);
			}
			else{
				randomNumber.add(1);
			}
		}
		
		
		*/
		
		
		
		/*
		l7 = 0;
		
		for(int i=0;i<randomNumber.size();i++){
			System.out.print(randomNumber.get(i)+" ");
			l7++;
			
			if(l7==50){
				System.out.println();
				l7 = l7 - 50;
			}
		}
		*/
		
		System.out.println("ending");
		
		
		/*
		
		
		List<Integer> intList6 = new ArrayList<Integer>();
		
		for(int i=0;i<intArrayList6.size();i++){
			for(int j=0;j<intArrayList6.get(i).length;j++){
				intList6.add(intArrayList6.get(i)[j]);
				
			}
		}
		
		int l6 = 0;
		
		int line = 1;
		
		System.out.println("the intArrayList5 is:");
		
		for(int i=0;i<intList6.size();i++){
			System.out.print(intList6.get(i)+" ");
			l6++;
			
			if(l6==50){
				System.out.println();
				l6 = l6-50;
			}
		}
		
		*/
	
	}
	

}
