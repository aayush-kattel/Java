package unit1;

public class strbuffer {
    public static void main(String[] args){
        String fname="Aayush";
        String laname="Kattel";

        System.out.println(fname+" "+laname);
        System.out.println(fname.length());
        System.out.println(fname.charAt(5));

        //str buffer class
        StringBuffer sb=new StringBuffer("Strbuffer example");
        System.out.println(sb.append(" hey"));
        System.out.println(sb.reverse());

    }

}
