<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="FSTTests" thread-count="4" parallel="classes">
    <!-- Comment out groups to run everything -->
	<!--<groups>
        <run>
            <include name="HeaderTests" />
        </run>
    </groups>-->
    <parameter name="username" value="admin" />
    <parameter name="password" value="password" />
    <test name="FSTActivities">
        <classes>
            <class name="Activities.Activity1" />
            <class name="Activities.Activity2" />
            <class name="Activities.Activity3" />
            <class name="Activities.Activity4Demo1Test" />
            <class name="Activities.Activity4Demo2Test" />
            <class name="activities.Activity5" />
         <class name="Activities.Activity6" />
            <class name="Activities.Activity7" />
        </classes>
    </test>
</suite>



