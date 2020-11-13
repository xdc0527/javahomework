import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

public class file_hash {

	public static byte[] SHA1Checksum(InputStream is) throws Exception { 
		byte[] buffer = new byte[1024]; 
		MessageDigest complete = MessageDigest.getInstance("SHA-1"); 
		int numRead = 0;
		do {
			numRead = is.read(buffer); 
			if (numRead > 0) {
				complete.update(buffer, 0, numRead);
			}
		} while (numRead != -1); 
		is.close();
		return complete.digest();
	}
	
	public static String convertToHex(byte sha1[]) { 
		String result = ""; 
		for (int i = 0; i < sha1.length; i++) {
			result += Integer.toString(sha1[i] & 0xFF, 16);                               
		}
		return result;
	}

	public static void dfs(String path) throws Exception { 
		File dir = new File(path); 
		File[] fs = dir.listFiles(); 
			for(int i = 0; i < fs.length; i ++) { 
				if (fs[i].isFile()) { 
					FileInputStream is = new FileInputStream(fs[i]); 
					byte[] sha1 = SHA1Checksum(is);
					String result = convertToHex(sha1);  
					System.out.println("文件" + fs[i].getName() + "的sha值： " + result);
					
				}
				if(fs[i].isDirectory()) { 
					System.out.println("路径" + path + File.separator + fs[i].getName());
					dfs(path + File.separator + fs[i].getName());     
				}   
			}                   
	}
	
	
	public static void main(String[] args) {
		System.out.println("请输入文件/文件夹的路径");
		Scanner dir = new Scanner(System.in);
		try{
		   dfs(dir.nextLine());
		   dir.close();  
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("异常：路径不存在");
		}     
	}
}