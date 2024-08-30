use restaurant;

delete from tbl_menu;
ALTER TABLE tbl_menu AUTO_INCREMENT = 1;


INSERT INTO tbl_menu (ItemName, Description, Category, Price) VALUES
( 'Margherita Pizza', 'Classic pizza with tomatoes, mozzarella, and basil', 'Main Course', 12.99),
('Spaghetti Carbonara', 'Pasta with eggs, cheese, pancetta, and pepper', 'Main Course', 14.49),
('Caesar Salad', 'Fresh Caesar salad with parmesan cheese and croutons', 'Appetizer', 8.99),
('Beef Burger', 'Juicy beef burger with lettuce, tomato, and cheese', 'Main Course', 11.49),
('Chicken Wings', 'Spicy chicken wings with a side of ranch sauce', 'Appetizer', 9.99),
('Grilled Salmon', 'Salmon fillet grilled to perfection with lemon and herbs', 'Main Course', 16.99),
('Tiramisu', 'Classic Italian dessert with coffee and mascarpone cheese', 'Dessert', 6.99),
('Vegetable Stir-Fry', 'Mixed vegetables stir-fried in a savory sauce', 'Main Course', 10.49),
('Greek Salad', 'Crisp salad with feta cheese, olives, and cucumbers', 'Appetizer', 7.99),
('Chocolate Cake', 'Rich chocolate cake with layers of fudge', 'Dessert', 5.49),
('Pancakes', 'Fluffy pancakes served with maple syrup and butter', 'Breakfast', 7.49),
('Avocado Toast', 'Toast topped with ripe avocado and a sprinkle of salt', 'Breakfast', 6.99),
('Margarita Cocktail', 'Refreshing cocktail with tequila, lime, and orange liqueur', 'Drink', 8.49),
('Iced Coffee', 'Chilled coffee served with ice and a splash of cream', 'Drink', 4.99),
('Cheeseburger', 'Cheeseburger with a beef patty, cheese, pickles, and onions', 'Main Course', 12.49),
('Pumpkin Soup', 'Creamy pumpkin soup with a hint of nutmeg', 'Appetizer', 7.49);