class GC extends Exception{
    GC(String message){
        super(message);
    }
}

public class CustomException {
    static void CheckAttendance(boolean absent)throws GC{
        if(absent){
            throw new GC("Penalty to submit 3 books in library");
        }
        else{
            System.out.println("Present in class: No penalty");
        }
    }

    public static void main(String args[]){
        try {
            CheckAttendance(true);
        }
        catch(GC e){
            System.out.println("Caught Exception: "+e.getMessage());
        }
        finally{
            System.out.println("Welcome to sapthagiri");
        }
    }
}
