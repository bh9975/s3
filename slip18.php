<?php
$dom=new DomDocument();
$dom->load("bookstyle.xml");
$t=$dom->getElementsByTagName("Bid");
foreach($t as $node)
{
	print $node->textContent;
	echo "<br>";
}
$t1=$dom->getElementsByTagName("name");
foreach($t1 as $node)
{
	print $node->textContent;
	echo "<br>";
}
?>