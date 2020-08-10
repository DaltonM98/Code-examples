//: A UIKit based Playground for presenting user interface
 
 import UIKit
import PlaygroundSupport

// Dalton Morrow

class MyViewController : UIViewController {
    override func loadView() {
        
        var fname = "john"
		var lname = "doe"
		var yserved = 12
		var mtype = "M"
		var rank = "S"
		var age = 34
		var milname = "blank"
		var rname = "blank"
		var msg = "blank"
        
        
        // Calculations
		
		var fulln = fname + " " + lname
		
		switch  mtype
				{
				case "A": milname = "Air Force"
				case "M": milname = "Marines"
				case "N": milname = "Navy"
				default: milname = "invalid Military Type"
				}
        
		switch  rank
				{
				case "L": rname = "Lieutenant"
				case "P": rname = "Private"
				case "S": rname = "Sergeant"
				default: rname = "invalid Rank"
				}
				
		if age >= 65 && yserved >= 10  &&  yserved <= 24
		{
		 msg = "Eligible due to Age"
		}
		else
			 if age < 65 && yserved >= 25
				{
				 msg = "Eligible due to Service Time only"
				}
				else
					if age >= 65 && yserved >= 25
					{
					 msg = "Eligible due to both Age and Service Time"
					}
		else
				{
		msg = "NOT Eligible due to both Age and Service Time Rules"
		}
        // Output
        
        print("Full Name : \(fulln) ")
        print("Military Name : \(milname)")
        print("Military Rank : \(rname)")
        print("Eligibility Message : \(msg)")
        
        
    }
}
// Present the view controller in the Live View window
PlaygroundPage.current.liveView = MyViewController()