import java.io.*;
public class launch {
    
    public static void main(String[] args) throws IOException{
        //Select File
        File file = new File("paste.txt");
        //If file does not exist
        if(!file.exists()){
            //Create New File
            file.createNewFile();
        }
        //writer
        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        //reader
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);

        //Texts
        bWriter.write("haci");
        bWriter.write("\nhttps://gozel.me");
        bWriter.close(); //Close File

        String line;
        while ((line=bReader.readLine()) != null){
            System.out.println(line);
        }
        bReader.close();

    }
}
