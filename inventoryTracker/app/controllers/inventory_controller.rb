class InventoryController < ApplicationController
  def index
    @product = Products.all
  end
  
  def show
    
  end
  
  def create
    
  end
  
  def update
    
  end
  
  def destroy
    
  end
  
  def new
    @product = Products.new
  end
  
  def edit
    
  end
end
