This is an application that accepts a tax rate and a list of products (with prices and descriptions), and outputs an invoice.     
Test result/output is shown at the end of the file "InvoiceApp.java". 

***


IPO diagram


| Input                                      | Processing                                                                                                                                                                                                | Output                                                                                                        |
| ------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
|                                            |                                                                                                                                                                                                           |  		Prompt user for tax rate                                                                                   |
|  		Tax rate – from user (double taxRate)   |  		Store double taxRate as taxRate/100                                                                                                                                                                    |                                                                                                               |
|                                            |                                                                                                                                                                                                           |  		Prompt user for product price                                                                              |
|  		Prices – from user (double Price)       |  		Store double price<br>For each price entered – add the price to totalAmount          |                                                                                                             |
|                                            |                                                                                                                                                                                                           |  		Prompt user for product description                                                                        |
| Description – from user (String description) |  		Store String description                                                                                                                                                                               |                                                                                                               |
|                                            |                                                                                                                                                                                                           |  		Prompt user to choose if wants to add a new product                                                   |
|  		Choose continue                         |  		If user chooses to continue<br>Allow user to enter another product                                                                                                               |  		Prompt user to enter another product<br>(Back to loop: Prompt for price and description)                      |
|  		Choose not to continue                  |  		If user chooses not to continue<br>Calculate tax by applying taxRate to totalAmount (taxRate/100 * totalAmount)<br>Calculate the finalAmount after tax by adding the calculated tax to totalAmount   |                                                                                                               |
|                                            |                                                                                                                                                                                                           |  		Display Invoice with each production's price and description, <br>totalAmount, tax and finalAmount after tax  |

