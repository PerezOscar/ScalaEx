##
# Compute the refund amount for a collection of bottles.
#

LESS_DEPOSIT = 0.10
MORE_DEPOSIT = 0.25

less = int(input("how many containers 1 litre or less do you have?"))
more = int(input("How many containers more than 1 litre do you have?"))

#Compute the refundnamount
refund = less * LESS_DEPOSIT + more + MORE_DEPOSIT

#Display the result
print("Your total refund  wil be $%.2f." % refund)
