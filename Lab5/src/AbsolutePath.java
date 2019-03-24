
public class AbsolutePath {
	public static String ensureAbsolute(String args) {
		if( args.startsWith("/")) {
		return args;	
		}else {
			String currentDir = System.getProperty("user.dir");
			String overall = currentDir + args;
          return overall;
		}
		
	}
	public static String[] absoluteSplitPath(String s) {
		String[] component = splitPathName.splitPath(s);
		component[0] = ensureAbsolute(component[0]);
		return component;
	}
	public static void main(String args[]) {
		for(int i = 0; i< args.length; i++) {
			 String[] components = absoluteSplitPath(args[i]);

	            System.out.printf("File: %s Type: %s [%s]\n", components[1], components[3], components[0]);
		}
	}

}
