/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hr.edunova.batchrenamer;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author AMD
 */
public class BatchRenamer {

    public static void main(String[] args) {
        
        
        
    }
    
    private static void batchRename(String directoryPath){
        
        Pattern pattern = Pattern.compile("(.+)-([0-9]{2})_([0-9]{4})(\\..+)");
        
        File directory = new File(directoryPath);
        
        if(!directory.isDirectory()){
            System.out.println("not a directory");
            return;
        }
        
        File[] files =directory.listFiles();
        
        if(files != null){
            for(File file : files){
                if(file.isFile()){
                    
                    Matcher matcher = pattern.matcher(file.getName());
                    if(!matcher.matches()){
                        System.out.println("name " + file.getName() + " not matching");
                    }
                    
                    if(matcher.matches()){
                        String prefix = matcher.group(1);
                        String month = matcher.group(2);
                        String year = matcher.group(3);
                        String extension = matcher.group(4);
                        
                        String newFileName = prefix + "-" + year + "_" + month + extension;
                        File newfiFile = new File(directory, newFileName);
                        if(file.renameTo(newfiFile)){
                            System.out.println("Renamed: " + file.getName() + "->" + newFileName);                            
                        }else{
                            System.out.println("Failed to rename: " + file.getName());
                        }
                    }
                }
            }
        }
    }
}
