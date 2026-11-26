package com.mohan.spring_boot_learning.day01;

class JobFinderBackend{
    public boolean isHiring(){
        return  false;
    }
    public String hrContact(String resume){
        if(isHiring() && uploadResume(resume)){
            return "Hr Contact details";
        }else{
            return "No Hiring";
        }
    }
    public boolean uploadResume(String file){
        String data = file;
        if(file.contains("Spring,SpringBoot,Microservices")){
            return true;
        }else{
            System.out.println("Resume not uploaded");
            return false;
        }
    }
}
class JobFinderAPplication{ //extends JobFinderBackend{
    JobFinderBackend backend;
	
    public boolean uploadResume(String file){
        return backend.uploadResume(file);
    }

}
public class User {
    public static void main(String[] args) {
        JobFinderAPplication application = new JobFinderAPplication();
        boolean uploadResume =  application.uploadResume("File: Spring,SpringBoot,Microservices");
        if (uploadResume) {
            System.out.println("After Shortlisting: HR will contact");
           // System.out.println(application.hrContact("File: Spring,SpringBoot,Microservices"));
        }

    }

}
