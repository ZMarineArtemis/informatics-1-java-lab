public class SplitPathName {

    /*
     * Returns 4 components: 
     * [0] - directory 
     * [1] - filename 
     * [2] - filename-base
     * [3] - filename-extension
     */
    public static String[] splitPath(String s) {
        String[] components = new String[4];

        int indexLastSlash = s.lastIndexOf("/");

        // Directory:
        if (indexLastSlash == -1) {
            components[0] = "";
            components[1] = s;
        } else {
            components[0] = s.substring(0, indexLastSlash + 1);
            components[1] = s.substring(indexLastSlash + 1, s.length());
        }

        // Filename:
        int firstDot = components[1].indexOf('.');
        if (firstDot == -1) {
            components[2] = components[1];
            components[3] = "";
        } else {
            components[2] = components[1].substring(0, firstDot);
            components[3] = components[1].substring(firstDot, components[1].length());
        }

        return components;
    }

 
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            String[] components = splitPath(args[i]);

            System.out.printf("File: %s Type: %s [%s]\n", components[1], components[3], components[0]);
        }
    }

}