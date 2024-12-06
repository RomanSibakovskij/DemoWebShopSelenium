# DemoWebShopSelenium

Simple Selenium test suite on user account registration/login/logout/basic product addition to cart functionality. The test suite captures screenshots at the end of test case run (for logging purposes).

#Tech Requirements:
 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

## Test Case List

//Test 001 -> user navigation to register page test (as a guest)

//valid tests

//Test 002 -> valid user account creation test (male)
//Test 002a -> valid user account creation test (female)
//Test 002b -> valid user account creation test (female)

//invalid tests

//Test 002c -> invalid user account creation test (no first name)
//Test 002d -> invalid user account creation test (no last name)
//Test 002e -> invalid user account creation test (no email address)
//Test 002f -> invalid user account creation test (no password / confirm password)
//Test 002g -> invalid user account creation test (too short first name)
//Test 002h -> invalid user account creation test (too short last name)
//Test 002i -> invalid user account creation test (too short email address)
//Test 002j -> invalid user account creation test (too short password / confirm password)
//Test 002k -> invalid user account creation test (too long first name)
//Test 002l -> invalid user account creation test (too long last name)
//Test 002m -> invalid user account creation test
//Test 002n -> invalid user account creation test (too long password / confirm password)
//Test 002o -> invalid user account creation test (invalid email address (by format))
//Test 002p -> invalid user account creation test (already existing email address)
//Test 002q -> invalid user account creation test (too long password / confirm password)

//valid login test
//Test 003 ->  valid user account login test

//invalid user login tests

//Test 003a ->  invalid user account login test (no email address)
//Test 003b ->  invalid user account login test (no password)
//Test 003c ->  invalid user account login test (invalid email address)
//Test 003d ->  invalid user account login test (invalid email address format)
//Test 003e ->  invalid user account login test (invalid password)

//user logout test


//Test 004 ->  user account logout test

//single featured product search tests


//Test 005 -> search for a single featured product test (as a registered user)

//Test 005a -> search for a single featured product test (as a guest)

//multiple featured products search tests
//Test 005b -> search for multiple featured products test (as a registered user)
//Test 005c -> search for multiple featured products test (as a guest)

//single available product search tests


//Test 006 -> search for a single available product test (as a registered user)
//Test 006a -> search for a single available product test (as a guest)

//multiple available products search tests


//Test 006b -> search for multiple available products test (as a registered user)
//Test 006c -> search for multiple available products test (as a guest)

//single featured product tests

//Test 007 -> add a single featured product to cart test (as a registered user)
//Test 007a -> add a single featured product to cart test (as a guest)

//single available product tests

//Test 007b -> add a single available product to cart test (as a registered user)
//Test 007c -> add a single available product to cart test (as a guest)

//multiple featured products addition to cart tests

//Test 007d -> add multiple featured products to cart test (as a registered user)
//Test 007e -> add multiple featured products to cart test (as a guest)

//multiple available products addition to cart tests

//Test 007f -> add multiple available products to cart test (as a registered user)
//Test 007g -> add multiple available products to cart test (as a guest)

//single featured product addition to check out tests

//Test 008 -> add a single featured product to check out test (as a registered user)
//Test 008a -> add a single featured product to check out test (as a guest)

//single available product addition to check out tests

//Test 008b -> add a single available product to check out test (as a registered user)
//Test 008c -> add a single available product to check out test (as a guest)

//invalid product addition to check out method test

//Test 008d -> invalid 'Add a single available product to check out' without clicking 'Agree to Terms' checkbox test (as a guest)

//multiple featured products addition to check out tests

//Test 008e -> add multiple featured products to check out test (as a registered user)
//Test 008f -> add multiple featured products to check out test (as a guest)

//multiple available products addition to check out tests

//Test 008g -> add multiple available products to check out test (as a registered user)
//Test 008h -> add multiple available products to check out test (as a guest)
//Test 008i -> add multiple available products to check out test (as a guest => with Remove product from checkout function test)

//valid checkout confirmation tests

//single featured product

//Test 009 -> check out confirmation of a single featured product test (as a registered user)
//Test 009a -> check out confirmation of a single featured product test (as a guest)

//single available product

//Test 009b -> check out confirmation of a single available product test (as a registered user)
//Test 009c -> check out confirmation of a single available product test (as a guest)

//multiple featured products

//Test 009d -> check out confirmation of multiple featured products test (as a registered user)
//Test 009e -> check out confirmation of multiple featured products test (as a guest)

//multiple available products

//Test 009f -> check out confirmation of multiple available products test (as a registered user)
//Test 009g -> check out confirmation of multiple available products test (as a guest)

// 'Check Money' order payment method tests

//Test 009h -> check out confirmation of a single product test - with 'Check/Money Order' payment method (as a registered user)
//Test 009i -> check out confirmation of multiple products test (as a guest - with selected 'Check/Money Order' payment method)

//'Credit Card' payment method tests

//Test 009j -> check out confirmation of a single product test (as a registered user - with 'Credit Card' payment method)
//Test 009k -> check out confirmation of multiple available products test (as a guest - with 'Credit Card' payment method)

//'Purchase Order' payment method tests

//Test 009l -> check out confirmation of a single product test (as a registered user - with 'Purchase Order' payment method)
//Test 009m -> check out confirmation of a single product test (as a guest - with 'Purchase Order' payment method)

//negative checkout confirmation tests (since guest starts with all empty input fields, it's more prudent to test guest branch only -> reg user will have the same output)

//no singular billing address input tests

//Test 009n -> invalid check out confirmation test - no first name (as a guest)
//Test 009o -> invalid check out confirmation test - no last name (as a guest)
//Test 009p -> invalid check out confirmation test - no email address (as a guest)
//Test 009q -> invalid check out confirmation test - no country / state selected (as a guest)
//Test 009r -> invalid check out confirmation test - no user city (as a guest)
//Test 009s -> invalid check out confirmation test - no user address (as a guest)
//Test 009t -> invalid check out confirmation test - no user zip code (as a guest)
//Test 009u -> invalid check out confirmation test - no user phone number (as a guest)

//no singular 'Credit Card' payment method input tests

//Test 009v -> invalid check out confirmation test - no credit card holder name (as a guest)
//Test 009w -> invalid check out confirmation test - no credit card number (as a guest)
//Test 009x -> invalid check out confirmation test - no credit card CVC number (as a guest)

//no 'Purchase Order' number test

//Test 009y -> invalid check out confirmation test - no purchase order number (as a guest)

//too short / too long singular input tests

//Test 009z -> invalid check out confirmation test - too short first name (as a guest)
//Test 009aa -> invalid check out confirmation test - too long first name (as a guest)
//Test 009ab -> invalid check out confirmation test - too short last name (as a guest)
//Test 009ac -> invalid check out confirmation test - too long last name (as a guest)
//Test 009ad -> invalid check out confirmation test - too short email address (as a guest)
//Test 009ae -> invalid check out confirmation test - too long email address (as a guest)
//Test 009af -> invalid check out confirmation test - invalid email address format (as a guest)
//Test 009ag -> invalid check out confirmation test - used email address format (as a guest)
//Test 009ah -> invalid check out confirmation test - too short user city (as a guest)
//Test 009ai -> invalid check out confirmation test - too long user city (as a guest)
//Test 009ak -> invalid check out confirmation test - too short user address (as a guest)
//Test 009al -> invalid check out confirmation test - too long user address (as a guest)
//Test 009am -> invalid check out confirmation test - too short user zip code (as a guest)
//Test 009an -> invalid check out confirmation test - too long user zip code (as a guest)
//Test 009ao -> invalid check out confirmation test - too short user phone number (as a guest)
//Test 009ap -> invalid check out confirmation test - too long user phone number (as a guest)
//Test 009aq -> invalid check out confirmation test - invalid user phone number format (as a guest)

//'Payment Information' section negative too short / too long tests

//Test 009ar -> invalid check out confirmation test - too short user cardholder name (as a guest)
//Test 009as -> invalid check out confirmation test - too long user cardholder name (as a guest)
//Test 009at -> invalid check out confirmation test - invalid user cardholder name format (as a guest)
//Test 009au -> invalid check out confirmation test - too short user card number (as a guest)
//Test 009av -> invalid check out confirmation test - too long user card number (as a guest)
//Test 009aw -> invalid check out confirmation test - invalid user card number format (as a guest)
//Test 009ax -> invalid check out confirmation test - too short user card CVC number (as a guest) (this input field has a 4 char limit, so too long CVC scenario cannot be enacted here)
//Test 009ay -> invalid check out confirmation test - invalid user card CVC number (as a guest)
//Test 009az -> invalid check out confirmation test - expired user credit card (as a guest)

// order validation tests

//Test 010 -> order details validation of a single featured product test (as a registered user)
//Test 010a ->  order details validation of a single featured product test (as a guest)

//single available product

//Test 010b -> order details validation of a single available product test (as a registered user)
//Test 010c -> order details validation of a single available product test (as a guest)

//multiple featured products

//Test 010d -> order details validation of multiple featured products test (as a registered user)
//Test 010e -> order details validation of multiple featured products test (as a guest)

//multiple available products

//Test 010f -> order details validation of multiple available products test (as a registered user)
//Test 010g -> order details validation of multiple available products test (as a guest)

// 'Check Money' order payment method tests

//Test 010h -> order details validation of a single product test - with 'Check/Money Order' payment method (as a registered user)
//Test 010i -> order details validation of multiple products test (as a guest - with selected 'Check/Money Order' payment method)

//'Credit Card' payment method tests

//Test 010j -> order details validation of a single product test (as a registered user - with 'Credit Card' payment method)
//Test 010k -> order details validation of multiple available products test (as a guest - with 'Credit Card' payment method)

//'Purchase Order' payment method tests

//Test 010l -> order details validation of a single product test (as a registered user - with 'Purchase Order' payment method)
//Test 010m -> order details validation of a single product test (as a guest - with 'Purchase Order' payment method)


