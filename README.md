# Abstraction Challenge
## Shop - Order List
Console application created to practice Abstraction.
The Challenge consists in create an Abstracted Class where Concrete Class will inherit from.
The Abstraction concept is used for create a list of different kind of products (List of the Abstracted Class). It is also used to pass objects as arguments to a method using the same parameter (abstracted) type.

- A list of products is loaded.
- Using a loop all the products are added to an Order List (simulating a receipt);
- The price of each order for each element is calculates based on the quantity of elements added.
- Program ends calculating the total price of the order.

1. Create an Abstracted Class (ProductForSale) from where the Concrete Classes (ProductA, ProductB, ProductC) will inherit from.
2. Create a Record that will be the Order, where each instance will be the selected product and the quantity of it.
3. A list of different products is created based on the types defined by its Classes (ProductA, ProductB, ProductC).
4. All products are add to a ArrayList. The ArrayList uses the Abstracted Class as a type, so it can hold all different types of products derived from it without the need to create a LinkedList for each type.
5. A method is called to add products to an OrderList, that is currently an ArrayList of the OrderItem (Record). Then it calculates the value of the OrderList (receipt) based on the orders inside of it. 

### Concepts covered on this project
| Labels             |
|--------------------|
| ArrayLists         |
| Record             |
| Abstracted Classes |
| OOP (Abstraction)  |
| Loops              |


