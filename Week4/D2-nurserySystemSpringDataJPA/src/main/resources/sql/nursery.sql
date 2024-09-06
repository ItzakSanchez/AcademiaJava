drop database IF EXISTS nursery;
create database nursery;

USE nursery;

Drop table if exists tbl_trees;

CREATE TABLE tbl_trees(
	id int NOT NULL AUTO_INCREMENT,
    name Varchar(255) NOT NULL,
    description Varchar(255),
    price decimal (10,2) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO tbl_trees (name, description, price) VALUES
('Maple', 'A deciduous tree known for its vibrant fall foliage and sweet sap.', 75.00),
('Oak', 'A large and sturdy tree, providing ample shade and producing acorns.', 100.00),
('Pine', 'An evergreen tree with needle-like leaves and a conical shape.', 50.00),
('Cherry Blossom', 'A beautiful tree known for its stunning pink spring flowers.', 120.00),
('Willow', 'A tree with long, flowing branches and a graceful appearance.', 80.00),
('Birch', 'A tree with distinctive white bark and delicate, small leaves.', 65.00),
('Cypress', 'An evergreen tree often found in wetlands, known for its unique, feathery foliage.', 90.00),
('Magnolia', 'A tree with large, fragrant flowers and shiny, dark green leaves.', 110.00),
('Elm', 'A sturdy tree with a broad canopy and serrated leaves, ideal for urban areas.', 85.00),
('Redwood', 'A majestic and towering evergreen tree, one of the tallest in the world.', 150.00);
