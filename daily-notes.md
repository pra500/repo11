    svg notes:


//parent - name()
//child - local-name()


//*[name()='svg']//*[local-name()='img' and @id='abcfdv123']


//*[name()='svg']//*[local-name()='path' and @fill-rule='evenodd']

//speed work 15 jan:
-ve testing in api learn




execute multiple testng classes at a time:
mvn test -Dtest=Cult111Test,CulttTest,CultrtrTest,Cult1dd11Test,ExpliwaitTest






imp:
WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(8));
WebElement wbww=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Refund Policy']")));
System.out.println(wbww.getText());


    


    

for executing testng.xml on console:
mvn clean test "-Dsurefire.suiteXmlFiles=src/test/resources/testng.xml"  -  if testng.xml in resouces fldr
mvn clean test "-Dsurefire.suiteXmlFiles=testng.xml"  - if testng.xml in project path


    

imp:
jenkins ll pass our build if our build is pass in terminal otherwise not, tc's pass/fail 
doesn't matter at all for jenkins, it directly connects to our "build" 





    
    
    for executing testng class in terminal:
    mvn test -Dtest=LoginTest







//div[starts-with(@class, 'cmp-container')]









rough:
//*[local-name()='svg' and @stroke-linecap='round']//*[local-name()='path']




xpath remember: img take @alt




select class     isMultiple() returns:
true  → dropdown is MULTI SELECT
false → dropdown is SINGLE SELECT






svg element:

<svg>              //*[local-name()='svg']
<path>             //*[local-name()='svg']//*[local-name()='path']
<rect>             //*[local-name()='svg']//*[local-name()='rect']
<circle>           //*[local-name()='svg']//*[local-name()='circle']
<text>             //*[local-name()='svg']//*[local-name()='text']






extra: in page logo never use gettext(); , it will not work out

String text=
driver.findElement(By.xpath("//img[@class='logoClass']")).getText();
System.out.println(text);
























