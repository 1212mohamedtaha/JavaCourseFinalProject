<%@ page import="com.spark.JobDAO" %>
<%@ page import="com.spark.Excution" %>

<%@ page import="static com.spark.Main.jobPath" %>
<%@ page import="org.apache.spark.sql.Row" %>
<%@ page import="org.apache.spark.sql.Dataset" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--------------------------------------------------------------------------------------%>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="https://fonts.googleapis.com/css?family=Raleway:100,300,400,500,700,900" rel="stylesheet">

    <title>Most Demanding Skills</title>


    <!-- Additional CSS Files -->
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">

    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css">

    <link rel="stylesheet" href="assets/css/templatemo-softy-pinko.css">

</head>

<body>
<%!
    JobDAO dao = new JobDAO();
    Excution ex = new Excution();
    Dataset<Row> cleanDF = ex.sendCleanDF();

    //Dataset<Row> cleanDF = dao.cleanDataFrame(dao.readCSV());
    Dataset<Row> importantSkills = dao.importantSkills(cleanDF);

    Map<String, Long> mapImportantSkills = dao.mapImportantSkills(importantSkills);

    String titleBar = "TheMostImportantSkillsBarChart.jpg";
    String titlePie = "TheMostImportantSkillsPieChart.jpg";


%>
<%  dao.graphPieChart(mapImportantSkills,titlePie);
    dao.graphBarChart(mapImportantSkills,titleBar, "Skill","Count");%>
<!-- ***** Preloader Start ***** -->
<div id="preloader">
    <div class="jumper">
        <div></div>
        <div></div>
        <div></div>
    </div>
</div>
<!-- ***** Preloader End ***** -->


<!-- ***** Header Area Start ***** -->
<header class="header-area header-sticky">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <nav class="main-nav">

                    <!-- ***** Logo End ***** -->
                    <!-- ***** Menu Start ***** -->
                    <ul class="nav">
                        <li><a href="/spring-boot-jsp/" >About</a></li>
                        <li><a href="summary" >Data Summary</a></li>
                        <li><a href="clean" >Data Cleaning</a></li>
                        <li><a href="jop-per-company" >Number of jobs per company</a></li>
                        <li><a href="popular-jobs">Most popular job titles</a></li>
                        <li><a href="popular-areas" >Most popular job locations</a></li>
                        <li><a href="important-skills" class="active">Most Important Skills</a></li>
                        <li><a href="factorization">Factorization</a></li>
                    </ul>
                    <a class='menu-trigger'>
                        <span>Menu</span>
                    </a>.
                    <!-- ***** Menu End ***** -->
                </nav>
            </div>
        </div>
    </div>
</header>
<!-- ***** Header Area End ***** -->

<!-- ***** Welcome Area Start ***** -->
<div class="welcome-area" id="welcome">

    <!-- ***** Header Text Start ***** -->
    <div class="header-text">

    </div>
</div>
<!-- ***** Header Text End ***** -->
</div>
<!-- ***** Welcome Area End ***** -->




<!-- ***** Pricing Plans Start ***** -->
<section class="section colored" id="pricing-plans">
    <div class="container">
        <!-- ***** Section Title Start ***** -->
        <div class="row">
            <div class="col-lg-12">
                <div class="center-heading">
                    <h2 class="section-title">Most important skills required</h2>
                </div>
            </div>
            <div class="offset-lg-3 col-lg-6">

            </div>
        </div>
        <!-- ***** Section Title End ***** -->

        <div class="row">
            <!-- ***** Pricing Item Start ***** -->
            <div class="col-lg-4 col-md-6 col-sm-12" data-scroll-reveal="enter bottom move 50px over 0.6s after 0.2s">
                <div class="pricing-item">
                    <div class="pricing-header">
                        <h3 class="pricing-title">Top 10 skills:</h3>
                    </div>
                    <div class="pricing-body">

                            <pre>
							<p>
                                <%=dao.viewImportantSkills(mapImportantSkills) %>
							</p>
							</pre>
                    </div>

                </div>
            </div>
            <!-- ***** Pricing Item End ***** -->

            <!-- ***** Pricing Item Start ***** -->
            <div class="col-lg-4 col-md-6 col-sm-12" data-scroll-reveal="enter bottom move 50px over 0.6s after 0.4s">

                <!-- ***** Pricing Item End ***** -->
            </div>
        </div>
</section>
<!-- ***** Pricing Plans End ***** -->


<!-- ***** Blog Start ***** -->
<section class="section" id="blog">
    <div class="container">
        <!-- ***** Section Title Start ***** -->
        <div class="row">
            <div class="col-lg-12">
                <div class="center-heading">
                    <h2 class="section-title">Charts </h2>
                </div>
            </div>
            <div class="offset-lg-3 col-lg-6">

            </div>
        </div>
        <!-- ***** Section Title End ***** -->

        <div class="row">
            <div class="col-lg-4 col-md-6 col-sm-12">
                <div class="blog-post-thumb">
                    <div class="img">
                        <img src="<c:url value="<%=titleBar%>"/>" alt="Any"/>
                    </div>
                    <div class="blog-content">
                        <h5>
                            Bar Chart
                        </h5>


                    </div>
                </div>
            </div>

            <div class="col-lg-4 col-md-6 col-sm-12">
                <div class="blog-post-thumb">
                    <div class="img">
                        <img src="<c:url value="<%=titlePie%>"/>" alt="Any"/>

                    </div>
                    <div class="blog-content">
                        <h5>
                            Pie Chart
                        </h5>


                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- ***** Blog End ***** -->

<!-- ***** Contact Us Start ***** -->
<!-- ***** Contact Us End ***** -->

<!-- ***** Footer Start ***** -->
<footer >
    <div class="container">
        <div class="row">

            <div class="col-lg-5 col-12 align-left">
                <h2 class="h4 pb-lg-1 text-light light-300">About the project</h2>
                <p class="text-light my-lg-5 my-2">This project is done with Apache Spark™, and XChart libraries. With Spring as an application framework.</p>

            </div>



            <div class="col-lg-3 col-md-5 my-sm-0 mt-4">
                <h2 class="h4 pb-lg-1 text-light light-300">Our Team</h2>
                <ul class="list-unstyled text-light light-300">


                    <li class="pb-2">

                        <i class="bx-fw bx bxs-chevron-right bx-xs">
                        </i><a class="text-decoration-none text-light py-1" href="https://www.linkedin.com/in/esraa-abdulfatah-825bbb137" target="_blank">Esraa Abdulfatah   </a>

                    </li>
                    <li class="pb-2">
                        <i class="bx-fw bx bxs-chevron-right bx-xs"></i><a class="text-decoration-none text-light py-1" href="https://www.linkedin.com/in/khalid-sobh-75000b1bb/" target="_blank">Khalid Sobh</a>
                    </li>
                    <li class="pb-2">
                        <i class="bx-fw bx bxs-chevron-right bx-xs"></i><a class="text-decoration-none text-light py-1" href="https://www.linkedin.com/in/mohamed-taha-abdelaziz-077b76149/" target="_blank">Mohamed Taha</a>
                    </li>
                </ul>
            </div>


        </div>
    </div>


    <div class="row">
        <div class="col-lg-12">
            <p class="copyright">ITI AI-Pro | Mansoura Group 2 </p>
        </div>
    </div>


</footer>


<!-- jQuery -->
<script src="assets/js/jquery-2.1.0.min.js"></script>

<!-- Bootstrap -->
<script src="assets/js/popper.js"></script>
<script src="assets/js/bootstrap.min.js"></script>

<!-- Plugins -->
<script src="assets/js/scrollreveal.min.js"></script>
<script src="assets/js/waypoints.min.js"></script>
<script src="assets/js/jquery.counterup.min.js"></script>
<script src="assets/js/imgfix.min.js"></script>

<!-- Global Init -->
<script src="assets/js/custom.js"></script>

</body>
</html>