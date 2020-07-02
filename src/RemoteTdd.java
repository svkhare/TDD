public class RemoteTdd {
    public String checkIfCapital(String str) {
        boolean b=!toString().equals(toString().toLowerCase());
        if(b == true){
            return "Doesn't have a capital letter";
        }
        return str;
    }

    public String checkIfNumber(String str) {
        if(!str.matches(".*\\d")){
            return "Doesn't have a number";
        }
        return str;
    }

    public String checkLength(String str) {
        if(str.length()<4){
            return "Length is less than four";
        }
        else if(str.length()>8){
            return "Length is greater than eight";
        }
        return str;
    }

    public String checkReGex(String str) {
        if(str.matches(".*")){
            return "Contains Regular Expression";
        }
        return str;
    }
}
