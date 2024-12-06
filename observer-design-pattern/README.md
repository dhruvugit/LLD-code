Observer Design Patter: 

Problem Statement: How will you implement notify me functionality on Amazon when a product goes out of stock and you want to notify user when it comes back to stock. So it's like Observer and observable pattern or subscriber model. 

Whenever there will change in state of Observable it will nofiy to all it's Observers 

Solution: 
1) We will make two interface for Observer and Observable. Observable interface will be having methods in it like add remove setData and notify. It will also be having the List of Observers. So it's typical have a relationship as one to many. As one Observable has a list of Observers. At last the observer interface will be having the update method. 

2) So now we have two interface for Observer and Observable and we will make a Observable's concrete class where there will be method implementation so it's is a relationship. That new class is a Observable. 
3) 