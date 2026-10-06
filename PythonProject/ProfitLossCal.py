print("Profit/Loss Calculator")
print("Enter the cost price of the product: ")
cost_price = float(input())
print("Enter the selling price of the product: ")
selling_price = float(input())

if selling_price > cost_price:
    profit = selling_price - cost_price
    print("Profit: ", profit)
elif selling_price < cost_price:
    loss = cost_price - selling_price
    print("Loss: ", loss)
else:
    print("No Profit No Loss")