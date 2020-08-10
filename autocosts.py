
def getcost():
    lpay = 0.0
    insur = 0.0
    gas = 0.0
    oil = 0.0
    tire = 0.0
    maint = 0.0
    monthc = 0.0
    totamt = 0.0
    for month in range(1, 3):
        lpay = float(input("enter the loan payment: "))
        insur = float(input("enter the insurance cost: "))
        gas = float(input("enter the gas cost: "))
        oil = float(input("enter the oil cost: "))
        tire = float(input("enter the tires cost: "))
        maint = float(input("enter the maintenence cost: "))

        totamt +=  lpay + insur + gas + oil + tire + maint
        monthc = lpay + insur + gas + oil + tire + maint
        print("Month ", month , " total cost was ", monthc)

    return totamt

def main():
    totcost = 0.0
    totcost =  getcost()
    print("the total annual cost is: ", format(totcost, ".2f"))

main()
