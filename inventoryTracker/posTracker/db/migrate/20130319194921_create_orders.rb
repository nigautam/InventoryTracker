class CreateOrders < ActiveRecord::Migration
  def change
    create_table :orders do |t|
      t.integer :employeeID
      t.integer :customerID
      t.integer :productSKU
      t.integer :orderQuantity
      t.integer :orderPrice
      t.string  :description

      t.timestamps
    end
  end
end
