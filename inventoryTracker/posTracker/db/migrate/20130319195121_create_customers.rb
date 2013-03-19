class CreateCustomers < ActiveRecord::Migration
  def change
    create_table :customers do |t|
      t.integer :customerID
      t.string :companyName
      t.string :contactName
      t.string :address
      t.string :email
      t.string :phone

      t.timestamps
    end
  end
end
