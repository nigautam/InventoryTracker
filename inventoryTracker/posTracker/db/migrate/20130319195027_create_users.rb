class CreateUsers < ActiveRecord::Migration
  def change
    create_table :users do |t|
      t.string :fname
      t.string :lname
      t.string :address
      t.integer :employeeID
      t.boolean :management

      t.timestamps
    end
  end
end
