package com.spark;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.ml.clustering.KMeansModel;
import org.apache.spark.ml.clustering.KMeans;
//import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.linalg.VectorUDT;
import org.apache.spark.mllib.linalg.Vectors;
//import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import org.apache.spark.ml.clustering.KMeansModel;
import org.apache.spark.ml.clustering.KMeans;
import org.apache.spark.ml.evaluation.ClusteringEvaluator;
import org.apache.spark.ml.linalg.Vector;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
// $example off$
import org.apache.spark.sql.SparkSession;

import java.io.IOException;


public class Main {

    public static final String jobPath = "src/main/resources/Wuzzuf_Jobs.csv";

    public static void main(String[] args) throws IOException {
//        Logger.getLogger("org").setLevel(Level.ERROR);
//        JobDAO dao = new JobDAO();
//        Dataset<Row> jobDB = dao.readCSV();
//        System.out.println("Here" + dao.viewDescribe(dao.readCSV()));
//        Dataset<Row> cleanDF = dao.cleanDataFrame(jobDB);
//        Dataset<Row> demandingCompanies = dao.demandingCompanies(cleanDF);
//        Dataset<Row> demandingJobTitle = dao.popularJobTitle(cleanDF);
//        Dataset<Row> demandingAreas = dao.popularAreas(cleanDF);


//        final SparkSession sparkSession = SparkSession.builder ().appName ("Wuzzuf Jobs Project").master ("local[4]")
//                .getOrCreate ();
//
//        Dataset<Row> jobsDF = sparkSession.read().format("csv")
//                .option("sep", ";")
//                .option("inferSchema", "true")
//                .option("header", "true")
//                .load(jobPath);
//        // Trains a k-means model.
//        KMeans kmeans = new KMeans().setK(5).setSeed(1L);
//        KMeansModel model = kmeans.fit(jobsDF);
//        // Make predictions
//        Dataset<Row> predictions = model.transform(jobsDF);
//        // Evaluate clustering by computing Silhouette score
//        ClusteringEvaluator evaluator = new ClusteringEvaluator();
//        double silhouette = evaluator.evaluate(predictions);
//        System.out.println("Silhouette with squared euclidean distance = " + silhouette);
//        // Shows the result.
//        Vector[] centers = model.clusterCenters();
//        System.out.println("Cluster Centers: ");
//        for (Vector center: centers) {
//            System.out.println(center);
//        }
//        // $example off$
//        sparkSession.stop();

    }
}
