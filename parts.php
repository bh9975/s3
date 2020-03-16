<?php
$url = 'http: //www.example.com/php-example/index.php';

print_r(parse_url($url));
print_r(parse_url($url, PHP_URL_SCHEME));


print_r(parse_url($url, PHP_URL_HOST));

echo "path".(parse_url($url, PHP_URL_PATH));


?>



