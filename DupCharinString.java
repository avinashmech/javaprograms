package starting;

public class DupCharinString {
		public static void main(String[] args) {
			String str = "BOLLIMUNTHA AVINASH";
			int length = str.length();
			char[] ch = str.toCharArray(); // now string converted into character array
			for(int i=0; i<length; i++)
			{
				for(int j=i+1;j<length;j++)
				{
					if(ch[i]==ch[j])
					{
						System.out.println("Duplicate characters are:"+ ch[j]);
						break;
					}
				}
			}
		}
	}

