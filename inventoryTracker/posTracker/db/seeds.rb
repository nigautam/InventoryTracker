# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rake db:seed (or created alongside the db with db:setup).
#
# Examples:
#
#  cities = City.create([{ name: 'Chicago' }, { name: 'Copenhagen' }])
#   Mayor.create(name: 'Emanuel', city: cities.first)

Inventory.create(productName: 'WIFI N Router', sku: '000001', unitPrice: '60', quantity: '50', description: 'Enjoy a cost-effective, high performance solution for your small business network problems with the DSR-250 N Wireless N Gigabit VPN Router. Enabling clientless remote access using SSL VPN Tunnels, this router also beefs up your security options thanks to VPN Tunnels, IP Security, Point-to-Point Tunnelling Protocol and SSL.', price: '100' )
Inventory.create(productName: 'Wireless N card', sku: '000002', unitPrice: '25', quantity: '2', description: 'Xtreme N Dual Band PCI Express Desktop Adapter is a 802.11n wireless client that delivers unrivalled wireless performance for your PCI Express-enabled desktop computer. With support for 2.4GHz or 5GHz wireless networks, you have the freedom to choose the connectivity option that best suits your needs.', price: '50')
Inventory.create(productName: '6 ft ethernet cable', sku: '000003', unitPrice: '5', quantity: '2', description: 'Ethernet cable is CAT 7 high speed rated at 10Gbs. With data transmission rates six times faster than CAT 5e LAN cables and a short distance between the plug and its twisted pairs, quality and high speeds are guaranteed.', price: '20')
Inventory.create(productName: 'Signal booster', sku: '000004', unitPrice: '50', quantity: '2', description: 'Universal WiFi Range Extender effectively doubles the operating distance of your entire wireless network and conveniently avoids additional need for power cables or device clutter on your office desk or home theater.', price: '90')
Inventory.create(productName: '4 GB RAM', sku: '000005', unitPrice: '10', quantity: '2', description: 'Add more RAM to your laptop computer and you will enjoy faster performance for all your computing tasks ', price: '40')
Inventory.create(productName: '19" LED Monitor', sku: '000006', unitPrice: '100', quantity: '2', description: 'Wide LED monitor delivers a high definition resolution with low energy consumption. Other specs include a 1000:1 contrast ratio and 5ms response time. ', price: '200')

