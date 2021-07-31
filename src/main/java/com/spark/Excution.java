package com.spark;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import java.util.Map;

public class Excution {
    JobDAO dao = new JobDAO(); //create object
     Dataset<Row> jobDB = dao.readCSV(); // read csv



    public Dataset<Row> sendJobDB(){
        return jobDB;
    }
    Dataset<Row> cleanDF = dao.cleanDataFrame(jobDB);
    public Dataset<Row> sendCleanDF(){
        return cleanDF;
    }



    /**

    JobDAO dao = new JobDAO();
   Dataset<Row> jobDB = dao.readCSV();
   Dataset<Row> cleanDF = dao.cleanDataFrame(jobDB);
   Dataset<Row> demandingCompanies = dao.demandingCompanies(cleanDF);
   Dataset<Row> demandingJobTitle = dao.popularJobTitle(cleanDF);
   Dataset<Row> demandingAreas = dao.popularAreas(cleanDF);
   public  String returnDescribe(){
       String viewDescribe =  dao.viewDescribe(jobDB) ;
       return viewDescribe;
   }
    public  String returnClean(){
        String viewClean = dao.viewClean(cleanDF);
        return viewClean;
    }
   String viewDemandingCompanies = dao.viewDemandingCompanies(demandingCompanies);
   String viewPopularJobTitle = dao.viewPopularJobTitle(demandingJobTitle);
   String viewPopularAreas = dao.viewPopularAreas(demandingAreas) ;
     */
}
