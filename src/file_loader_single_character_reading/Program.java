/*--
----This program write a file and read a file using buffer reader
---Skip Any Duplicates
 */
package file_loader_single_character_reading;

import file_loader_single_character_reading.entities.Company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kiran
 */
public class Program {

    public static void main(String[] args) {
        String filename = "D:/java/File_Loader_Single_Character_Reading/companies.csv";
        try {
            //---write    
            FileWriter writer = new FileWriter(filename);
            writer.write("1,LinkPink Codemy, He hacks,1\r\n");    //--for new line \r \n
            writer.write("2,Kamaila Kashir, Behind the thou,1\r\n");
            writer.write("2,Latex Hassin, Grey Goose,1\r\n");
            
            writer.close();
            System.out.println("Completed writing");

            //--Read
            BufferedReader reader=new BufferedReader(new FileReader(filename));
            List<Company> companyList=new ArrayList<Company>();
            String line="";
            while((line=reader.readLine())!=null){ //-- for single reading.. return intergerby reader.read()
                String[] tokens=line.split(",");
                Company company=new Company();
                boolean isDublicate=false;
                for(Company c:companyList){
                    if(c.getId()==Integer.parseInt(tokens[0])){
                        isDublicate=true; // --more id repeated skip
                    break;
                    }
                }
                if(!isDublicate){
                company.setId(Integer.parseInt  (tokens[0]));
                company.setName(tokens[1]);
                company.setDescription(tokens[2]);
                company.setAddedDate(new Date());
                company.setStatus(tokens[3].equals("1"));
                
                System.out.println(line);
                companyList.add(company);
            }}
            reader.close();
            /*
            for(Company c:companyList){
                System.out.println(c.toString());
            } 
            */
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

}
