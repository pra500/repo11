package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import java.util.List;



public class WrongggTest {

        WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }


        @Test(priority = 1)
        public void wrongUrl() {
            driver.get("https://www.saucedemo123.com");         // wrong URL
        }


        @Test(priority = 2)
        public void wrongTitle() {
            driver.get("https://www.saucedemo.com");
            Assert.assertEquals(driver.getTitle(), "Sauce Demo"); // actual is "Swag Labs"
        }


        @Test(priority = 3)
        public void wrongLocator() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("username")).sendKeys("standard_user"); // actual id is "user-name"
        }


        @Test(priority = 4)
        public void wrongPassword() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("wrongpassword");  // actual is "secret_sauce"
            driver.findElement(By.id("login-button")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        }


        @Test(priority = 5)
        public void wrongClassName() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            List<WebElement> items = driver.findElements(By.className("inventory_items")); // actual is "inventory_item"
            Assert.assertTrue(items.size() > 0);
        }


        @Test(priority = 6)
        public void wrongXpath() {
            driver.get("https://www.saucedemo.com");
            WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo1']")); // actual is "login_logo"
            Assert.assertTrue(logo.isDisplayed());
        }


        @Test(priority = 7)
        public void wrongUrlAssertion() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("home")); // actual contains "inventory"
        }


        @Test(priority = 8)
        public void wrongButtonId() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("submit-button")).click(); // actual is "login-button"
        }


        @Test(priority = 9)
        public void wrongCartId() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("add-to-cart-backpack")).click(); // actual is "add-to-cart-sauce-labs-backpack"
        }


        @Test(priority = 10)
        public void wrongCartBadge() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            String count = driver.findElement(By.className("cart_badge")).getText(); // actual is "shopping_cart_badge"
            Assert.assertEquals(count, "1");
        }

        /*

        @Test(priority = 11)
        public void wrongApiUrl() {
            given()
                    .when()
                    .get("https://dummyjson.com/products")   // actual is "/products"
                    .then()
                    .statusCode(200);
        }

        // ❌ Line 12 - Wrong status code
        @Test(priority = 12)
        public void wrongStatusCode() {
            given()
                    .when()
                    .get("https://dummyjson.com/products/1")
                    .then()
                    .statusCode(201);                        // actual is 200
        }

        // ❌ Line 13 - Wrong field name
        @Test(priority = 13)
        public void wrongFieldName() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/products/1")
                    .then()
                    .extract().response();

            String name = res.jsonPath().getString("name"); // actual field is "title"
            Assert.assertNotNull(name);
        }

        // ❌ Line 14 - Wrong expected value
        @Test(priority = 14)
        public void wrongExpectedValue() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/products/1")
                    .then()
                    .extract().response();

            Assert.assertEquals(res.jsonPath().getInt("id"), 2); // actual id is 1
        }

        // ❌ Line 15 - Wrong HTTP method
        @Test(priority = 15)
        public void wrongHttpMethod() {
            given()
                    .header("Content-Type", "application/json")
                    .body("{ \"username\": \"emilys\", \"password\": \"emilyspass\" }")
                    .when()
                    .get("https://dummyjson.com/auth/login")  // should be POST not GET
                    .then()
                    .statusCode(200);
        }

        // ❌ Line 16 - Wrong JSON body key
        @Test(priority = 16)
        public void wrongJsonKey() {
            String body = "{ \"name\": \"Test Product\", \"price\": 99 }"; // actual key is "title"

            given()
                    .header("Content-Type", "application/json")
                    .body(body)
                    .when()
                    .post("https://dummyjson.com/products/add")
                    .then()
                    .statusCode(201);
        }

        // ❌ Line 17 - Wrong nested field
        @Test(priority = 17)
        public void wrongNestedField() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/products/1")
                    .then()
                    .extract().response();

            double width = res.jsonPath().getDouble("dimension.width"); // actual is "dimensions.width"
            Assert.assertTrue(width > 0);
        }

        // ❌ Line 18 - Wrong array index
        @Test(priority = 18)
        public void wrongArrayIndex() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/products")
                    .then()
                    .extract().response();

            String title = res.jsonPath().getString("products[50].title"); // only 30 returned
            Assert.assertNotNull(title);
        }

        // ❌ Line 19 - Wrong search param
        @Test(priority = 19)
        public void wrongQueryParam() {
            Response res = given()
                    .queryParam("search", "phone")  // actual param is "q"
                    .when()
                    .get("https://dummyjson.com/products/search")
                    .then()
                    .statusCode(200)
                    .extract().response();

            Assert.assertTrue(res.jsonPath().getInt("total") > 0);
        }

        // ❌ Line 20 - Wrong delete status code
        @Test(priority = 20)
        public void wrongDeleteStatus() {
            given()
                    .when()
                    .delete("https://dummyjson.com/products/1")
                    .then()
                    .statusCode(204);  // dummyjson returns 200 not 204
        }

        // ❌ Line 21 - NullPointerException
        @Test(priority = 21)
        public void nullPointer() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/products/1")
                    .then()
                    .extract().response();

            String val = res.jsonPath().getString("nonExistentField"); // returns null
            System.out.println(val.toUpperCase());                     // NPE crash!
        }

        // ❌ Line 22 - Wrong total assertion
        @Test(priority = 22)
        public void wrongTotalCount() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/products")
                    .then()
                    .extract().response();

            Assert.assertEquals(res.jsonPath().getInt("total"), 50); // actual is 194
        }

        // ❌ Line 23 - Wrong user field
        @Test(priority = 23)
        public void wrongUserField() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/users/1")
                    .then()
                    .extract().response();

            Assert.assertEquals(res.jsonPath().getString("name"), "Emily"); // actual is "firstName"
        }

        // ❌ Line 24 - Wrong brand assertion
        @Test(priority = 24)
        public void wrongBrandAssertion() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/products/1")
                    .then()
                    .extract().response();

            Assert.assertEquals(res.jsonPath().getString("brand"), "Nike"); // actual brand is different
        }

        // ❌ Line 25 - Wrong list size
        @Test(priority = 25)
        public void wrongListSize() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/users")
                    .then()
                    .extract().response();

            Assert.assertEquals(res.jsonPath().getList("users").size(), 10); // actual is 30
        }

        // ❌ Line 26 - Wrong CSS selector
        @Test(priority = 26)
        public void wrongCssSelector() {
            driver.get("https://www.saucedemo.com");
            WebElement btn = driver.findElement(
                    By.cssSelector(".login-button")); // actual is "#login-button"
            btn.click();
        }

        // ❌ Line 27 - Wrong tag name
        @Test(priority = 27)
        public void wrongTagName() {
            driver.get("https://www.w3schools.com/html/html_tables.asp");
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table[@id='customers']//tr"));

            for (WebElement row : rows) {
                List<WebElement> cols = row.findElements(By.tagName("th")); // should be "td"
                for (WebElement col : cols) {
                    System.out.println(col.getText());
                }
            }
        }

        // ❌ Line 28 - Wrong table id
        @Test(priority = 28)
        public void wrongTableId() {
            driver.get("https://www.w3schools.com/html/html_tables.asp");
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table[@id='myTable']//tr")); // actual is "customers"

            Assert.assertTrue(rows.size() > 0);
        }

        // ❌ Line 29 - Wrong category assertion
        @Test(priority = 29)
        public void wrongCategory() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/products/1")
                    .then()
                    .extract().response();

            Assert.assertEquals(res.jsonPath().getString("category"), "electronics"); // actual is "beauty"
        }

        // ❌ Line 30 - Wrong skip value
        @Test(priority = 30)
        public void wrongSkipValue() {
            Response res = given()
                    .when()
                    .get("https://dummyjson.com/users")
                    .then()
                    .extract().response();

            Assert.assertEquals(res.jsonPath().getInt("skip"), 1); // actual is 0
        }


         */
    }

