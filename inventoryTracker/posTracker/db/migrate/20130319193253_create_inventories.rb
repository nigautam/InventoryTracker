class CreateInventories < ActiveRecord::Migration
  def change
    create_table :inventories do |t|
      t.string :productName
      t.string :description
      t.integer :sku
      t.integer :unitPrice
      t.integer :price
      t.integer :quantity

      t.timestamps
    end
  end
end
