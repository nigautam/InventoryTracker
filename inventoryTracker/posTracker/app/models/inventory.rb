class Inventory < ActiveRecord::Base
  attr_accessible :description, :price, :productName, :quantity, :sku, :unitPrice
  belongs_to :order
end
