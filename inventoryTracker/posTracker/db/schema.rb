# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended to check this file into your version control system.

ActiveRecord::Schema.define(:version => 20130319195121) do

  create_table "customers", :force => true do |t|
    t.integer  "customerID"
    t.string   "companyName"
    t.string   "contactName"
    t.string   "address"
    t.string   "email"
    t.string   "phone"
    t.datetime "created_at",  :null => false
    t.datetime "updated_at",  :null => false
  end

  create_table "inventories", :force => true do |t|
    t.string   "productName"
    t.string   "description"
    t.integer  "sku"
    t.integer  "unitPrice"
    t.integer  "price"
    t.integer  "quantity"
    t.datetime "created_at",  :null => false
    t.datetime "updated_at",  :null => false
  end

  create_table "orders", :force => true do |t|
    t.integer  "employeeID"
    t.integer  "customerID"
    t.integer  "productSKU"
    t.integer  "orderQuantity"
    t.integer  "orderPrice"
    t.datetime "created_at",    :null => false
    t.datetime "updated_at",    :null => false
  end

  create_table "users", :force => true do |t|
    t.string   "fname"
    t.string   "lname"
    t.string   "address"
    t.integer  "employeeID"
    t.boolean  "management"
    t.datetime "created_at", :null => false
    t.datetime "updated_at", :null => false
  end

end
