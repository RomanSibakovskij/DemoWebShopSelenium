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

1. //Test 001 -> user navigation to register page test (as a guest)

//valid tests

2. //Test 002 -> valid user account creation test (male)
3. //Test 002a -> valid user account creation test (female)
4. //Test 002b -> valid user account creation test (female)

//invalid tests

5. //Test 002c -> invalid user account creation test (no first name)
6. //Test 002d -> invalid user account creation test (no last name)
7. //Test 002e -> invalid user account creation test (no email address)
8. //Test 002f -> invalid user account creation test (no password / confirm password)
9. //Test 002g -> invalid user account creation test (too short first name)
10. //Test 002h -> invalid user account creation test (too short last name)
11. //Test 002i -> invalid user account creation test (too short email address)
12. //Test 002j -> invalid user account creation test (too short password / confirm password)
13. //Test 002k -> invalid user account creation test (too long first name)
14. //Test 002l -> invalid user account creation test (too long last name)
15. //Test 002m -> invalid user account creation test
16. //Test 002n -> invalid user account creation test (too long password / confirm password)
17. //Test 002o -> invalid user account creation test (invalid email address (by format))
18. //Test 002p -> invalid user account creation test (already existing email address)
19. //Test 002q -> invalid user account creation test (too long password / confirm password)

//valid login test

20. //Test 003 ->  valid user account login test

//invalid user login tests

21. //Test 003a ->  invalid user account login test (no email address)
22. //Test 003b ->  invalid user account login test (no password)
23. //Test 003c ->  invalid user account login test (invalid email address)
24. //Test 003d ->  invalid user account login test (invalid email address format)
25. //Test 003e ->  invalid user account login test (invalid password)

//user logout test

26. //Test 004 ->  user account logout test

//single featured product search tests

27. //Test 005 -> search for a single featured product test (as a registered user)

28. //Test 005a -> search for a single featured product test (as a guest)

//multiple featured products search tests

29. //Test 005b -> search for multiple featured products test (as a registered user)
30. //Test 005c -> search for multiple featured products test (as a guest)

//single available product search tests

31. //Test 006 -> search for a single available product test (as a registered user)
32. //Test 006a -> search for a single available product test (as a guest)

//multiple available products search tests

33. //Test 006b -> search for multiple available products test (as a registered user)
34. //Test 006c -> search for multiple available products test (as a guest)

//single featured product tests

35. //Test 007 -> add a single featured product to cart test (as a registered user)
36. //Test 007a -> add a single featured product to cart test (as a guest)

//single available product tests

37. //Test 007b -> add a single available product to cart test (as a registered user)
38. //Test 007c -> add a single available product to cart test (as a guest)

//multiple featured products addition to cart tests

39. //Test 007d -> add multiple featured products to cart test (as a registered user)
40. //Test 007e -> add multiple featured products to cart test (as a guest)

//multiple available products addition to cart tests

41. //Test 007f -> add multiple available products to cart test (as a registered user)
42. //Test 007g -> add multiple available products to cart test (as a guest)

//single featured product addition to check out tests

43. //Test 008 -> add a single featured product to check out test (as a registered user)
44. //Test 008a -> add a single featured product to check out test (as a guest)

//single available product addition to check out tests

45. //Test 008b -> add a single available product to check out test (as a registered user)
46. //Test 008c -> add a single available product to check out test (as a guest)

//invalid product addition to check out method test

47. //Test 008d -> invalid 'Add a single available product to check out' without clicking 'Agree to Terms' checkbox test (as a guest)

//multiple featured products addition to check out tests

48. //Test 008e -> add multiple featured products to check out test (as a registered user)
49. //Test 008f -> add multiple featured products to check out test (as a guest)

//multiple available products addition to check out tests

50. //Test 008g -> add multiple available products to check out test (as a registered user)
51. //Test 008h -> add multiple available products to check out test (as a guest)
52. //Test 008i -> add multiple available products to check out test (as a guest => with Remove product from checkout function test)

//valid checkout confirmation tests

//single featured product

53. //Test 009 -> check out confirmation of a single featured product test (as a registered user)
54. //Test 009a -> check out confirmation of a single featured product test (as a guest)

//single available product

55. //Test 009b -> check out confirmation of a single available product test (as a registered user)
56. //Test 009c -> check out confirmation of a single available product test (as a guest)

//multiple featured products

57. //Test 009d -> check out confirmation of multiple featured products test (as a registered user)
58. //Test 009e -> check out confirmation of multiple featured products test (as a guest)

//multiple available products

59. //Test 009f -> check out confirmation of multiple available products test (as a registered user)
60. //Test 009g -> check out confirmation of multiple available products test (as a guest)

// 'Check Money' order payment method tests

61. //Test 009h -> check out confirmation of a single product test - with 'Check/Money Order' payment method (as a registered user)
62. //Test 009i -> check out confirmation of multiple products test (as a guest - with selected 'Check/Money Order' payment method)

//'Credit Card' payment method tests

63. //Test 009j -> check out confirmation of a single product test (as a registered user - with 'Credit Card' payment method)
64. //Test 009k -> check out confirmation of multiple available products test (as a guest - with 'Credit Card' payment method)

//'Purchase Order' payment method tests

65. //Test 009l -> check out confirmation of a single product test (as a registered user - with 'Purchase Order' payment method)
66. //Test 009m -> check out confirmation of a single product test (as a guest - with 'Purchase Order' payment method)

//negative checkout confirmation tests (since guest starts with all empty input fields, it's more prudent to test guest branch only -> reg user will have the same output)

//no singular billing address input tests

67. //Test 009n -> invalid check out confirmation test - no first name (as a guest)
68. //Test 009o -> invalid check out confirmation test - no last name (as a guest)
69. //Test 009p -> invalid check out confirmation test - no email address (as a guest)
70. //Test 009q -> invalid check out confirmation test - no country / state selected (as a guest)
71. //Test 009r -> invalid check out confirmation test - no user city (as a guest)
72. //Test 009s -> invalid check out confirmation test - no user address (as a guest)
73. //Test 009t -> invalid check out confirmation test - no user zip code (as a guest)
74. //Test 009u -> invalid check out confirmation test - no user phone number (as a guest)

//no singular 'Credit Card' payment method input tests

75. //Test 009v -> invalid check out confirmation test - no credit card holder name (as a guest)
76. //Test 009w -> invalid check out confirmation test - no credit card number (as a guest)
77. //Test 009x -> invalid check out confirmation test - no credit card CVC number (as a guest)

//no 'Purchase Order' number test

78. //Test 009y -> invalid check out confirmation test - no purchase order number (as a guest)

//too short / too long singular input tests

79. //Test 009z -> invalid check out confirmation test - too short first name (as a guest)
80. //Test 009aa -> invalid check out confirmation test - too long first name (as a guest)
81. //Test 009ab -> invalid check out confirmation test - too short last name (as a guest)
82. //Test 009ac -> invalid check out confirmation test - too long last name (as a guest)
83. //Test 009ad -> invalid check out confirmation test - too short email address (as a guest)
84. //Test 009ae -> invalid check out confirmation test - too long email address (as a guest)
85. //Test 009af -> invalid check out confirmation test - invalid email address format (as a guest)
86. //Test 009ag -> invalid check out confirmation test - used email address format (as a guest)
87. //Test 009ah -> invalid check out confirmation test - too short user city (as a guest)
88. //Test 009ai -> invalid check out confirmation test - too long user city (as a guest)
89. //Test 009ak -> invalid check out confirmation test - too short user address (as a guest)
90. //Test 009al -> invalid check out confirmation test - too long user address (as a guest)
91. //Test 009am -> invalid check out confirmation test - too short user zip code (as a guest)
92. //Test 009an -> invalid check out confirmation test - too long user zip code (as a guest)
93. //Test 009ao -> invalid check out confirmation test - too short user phone number (as a guest)
94. //Test 009ap -> invalid check out confirmation test - too long user phone number (as a guest)
95. //Test 009aq -> invalid check out confirmation test - invalid user phone number format (as a guest)

//'Payment Information' section negative too short / too long tests

96. //Test 009ar -> invalid check out confirmation test - too short user cardholder name (as a guest)
97. //Test 009as -> invalid check out confirmation test - too long user cardholder name (as a guest)
98. //Test 009at -> invalid check out confirmation test - invalid user cardholder name format (as a guest)
99. //Test 009au -> invalid check out confirmation test - too short user card number (as a guest)
100. //Test 009av -> invalid check out confirmation test - too long user card number (as a guest)
101. //Test 009aw -> invalid check out confirmation test - invalid user card number format (as a guest)
102. //Test 009ax -> invalid check out confirmation test - too short user card CVC number (as a guest) (this input field has a 4 char limit, so too long CVC scenario cannot be enacted here)
103. //Test 009ay -> invalid check out confirmation test - invalid user card CVC number (as a guest)
104. //Test 009az -> invalid check out confirmation test - expired user credit card (as a guest)

// order validation tests

105. //Test 010 -> order details validation of a single featured product test (as a registered user)
106. //Test 010a ->  order details validation of a single featured product test (as a guest)

//single available product

107. //Test 010b -> order details validation of a single available product test (as a registered user)
108. //Test 010c -> order details validation of a single available product test (as a guest)

//multiple featured products

109. //Test 010d -> order details validation of multiple featured products test (as a registered user)
110. //Test 010e -> order details validation of multiple featured products test (as a guest)

//multiple available products

111. //Test 010f -> order details validation of multiple available products test (as a registered user)
112. //Test 010g -> order details validation of multiple available products test (as a guest)

// 'Check Money' order payment method tests

113. //Test 010h -> order details validation of a single product test - with 'Check/Money Order' payment method (as a registered user)
114. //Test 010i -> order details validation of multiple products test (as a guest - with selected 'Check/Money Order' payment method)

//'Credit Card' payment method tests

115. //Test 010j -> order details validation of a single product test (as a registered user - with 'Credit Card' payment method)
116. //Test 010k -> order details validation of multiple available products test (as a guest - with 'Credit Card' payment method)

//'Purchase Order' payment method tests

117. //Test 010l -> order details validation of a single product test (as a registered user - with 'Purchase Order' payment method)
118. //Test 010m -> order details validation of a single product test (as a guest - with 'Purchase Order' payment method)


