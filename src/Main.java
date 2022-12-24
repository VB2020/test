public class Main {
    public static void main(String[] args) {

        var printOutputStream = System.out;
        String someString1 = ")()())";
        String someString2 = "(()";
        String someString3 = ")(())())";
        String someString4 = ")(";

        var sb = new StringBuilder();
        var sbTmp = new StringBuilder();
        var sdf = someString3.toCharArray();
        int cc = 0;
        for (int i = 0; i < sdf.length; i++) {
            if (sdf[i] == '(') {
                cc ++;
                sbTmp.append(sdf[i]);
            }
            if (sdf[i] == ')' && cc > 0) {
                cc --;
                sbTmp.append(sdf[i]);
                if (cc == 0) {
                    sb.append(sbTmp);
                    sbTmp = new StringBuilder();
                }
            }
            if (i == sdf.length - 1 && cc > 0) {
                sb.append(sbTmp.substring(cc));

            }
        }
        if (sb.length() != 0) {
            printOutputStream.println(sb);
        } else {
            printOutputStream.println(0);
        }
    }


}