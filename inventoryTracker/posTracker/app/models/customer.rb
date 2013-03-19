class Customer < ActiveRecord::Base
  attr_accessible :address, :companyName, :contactName, :customerID, :email, :phone
end
