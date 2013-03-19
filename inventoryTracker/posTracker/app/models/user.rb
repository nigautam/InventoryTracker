class User < ActiveRecord::Base
  attr_accessible :address, :employeeID, :fname, :lname, :management
end
