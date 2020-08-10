<?php
/*known values*/
$count = 0;
$start = 1000;
$money = 1000;
$dice1 = array(0);
$dice2 = array(0);
$i = 1;
$nbad = 0;
/*start of the loop*/
for ($i = 0; $i < 100; $i++) {
	
	$dice1[$i] = rand(1,6);
	$dice2[$i] = rand(1,6);
	$dicetot = $dice1[$i] + $dice2[$i];

	if($dicetot > 2)
	{
		$nbad = $nbad + 1;
		$money = $money * .70;
		switch($dicetot)
		{
			case 3: { $msg = "Loose Deuce";
				break; 
				}
			case 5: { $msg = "Fever Five";
				break; 
				}
			case 7: { $msg = "Natural";
				break; 
				}
			case 9: { $msg = "Nina";
				break; 
				}
			case 11: { $msg = "Yo!";
				break; 
				}
			case 12: { $msg = "Boxcars";
				break; 
				}
			default: { $msg = "Even Roll";
				break; 
				}
		}
	

	}
	

	if($dicetot == 2)
		{
		 $msg= "You Won";
		 $i = 101;
		}
	if($money < 1)
			$i = 101;
 
	echo "your total role = $dicetot and your message is $msg<br/>";
}
for ($k = 0; $k < $nbad+1; $k++)
{
	echo "role number ", $k+1, " dice number 1 had : ",$dice1[$k], " and dice number 2 had : ",$dice2[$k],"<br/>";
}
echo"<p> number of roles was : ",$nbad+1,"<br/>";
echo"starting money value was : $start <br/>";
echo"money left was : $money <br/></p>";

?>