class Order < ActiveRecord::Base
  attr_accessible :customerID, :employeeID, :orderPrice, :orderQuantity, :productSKU, :description
  has_many :inventories
end
