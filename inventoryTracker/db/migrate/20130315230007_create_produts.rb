class CreateProduts < ActiveRecord::Migration
  def change
    create_table :produts do |t|
      t.string :name
      t.string :description
      t.integer :price
      t.integer :quantity

      t.timestamps
    end
  end
end
