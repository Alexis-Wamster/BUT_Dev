import java.io.*;

public class Q1File extends File{

    private static final long serialVersionUID = 1L;

    public Q1File(String pathname){
        super(pathname);
    }

    public static Q1File[] convertion(File[] listeBrute){
        if (listeBrute == null){
            return null;
        }
        Q1File[] listeFinal = new Q1File[listeBrute.length];
        for (int i=0; i<listeBrute.length; i++){
            listeFinal[i] = Q1File.convertion(listeBrute[i]);
        }
        return listeFinal;
    }

    public static Q1File convertion(File repertoire){
        if (repertoire == null){
            return null;
        }
        return new Q1File(repertoire.getAbsolutePath());
    }

    @Override
    public String toString(){
        return this.getName();
    }
}