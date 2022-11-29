-- q sort program
qsort [] = []
qsort (x:xs) = qsort smaller ++ [x] ++ qsort larger
    where 
        smaller = [a|a<-xs, a<=x]
        larger = [b|b<-xs, b>x]

-- take an integer and return its double
double x = x + x

-- take an integer and return its quadruple
quadruple x = double (double x)

-- takes a list and return last element 
last_ xs = head (reverse xs)

last' (x:xs) = xs !! (length xs - 1)

-- delete the last element from list and return
init_ xs = take (length xs - 1) xs

init' xs = reverse(tail (reverse xs))

-- check if a number is even or not
even_ n = n `mod` 2 == 0

-- split a list from a postion
splitAt_ :: Int -> [a] -> ([a], [a])
splitAt_ n xs = (take n xs, drop n xs)

-- return absolute value
abs_ :: Int -> Int
abs_ n = if n >= 0 then n else -n

-- returns sign of integer
signum_ :: Int -> Int
signum_ n = if n < 0 then -1 else 
               if n == 0 then 0 else 1

signum' :: Int -> Int
signum' n  | n < 0    = -1
           | n == 0   = 0
           | n > 0    = 1

-- adding two integer values

add_ :: (Int, Int) -> Int
add_ (x, y) = x + y

add' :: Int -> Int -> Int
add' x y = x + y

-- halving list in two parts

halve_ :: [a] -> ([a], [a])
halve_ xs = (take (length xs `div` 2) xs, drop (length xs `div` 2) xs)

halve :: [a] -> ([a], [a])
halve xs = (take n xs, drop n xs)
    where n = length xs `div` 2

halve' :: [a] -> ([a], [a])
halve' xs = splitAt_ (length xs `div` 2) xs

-- define a function third to get third element of a list
-- using head and tail and list indexing
third :: [a] -> a
third xs = head(tail (tail xs))

third' :: [a] -> a
third' xs = xs !! 2

-- saiftail 
safetail :: [a] -> [a]
safetail [] = []
safetail xs = tail xs 

-- using conditional expression
safetail_ :: [a] -> [a]
safetail_ xs = if null xs then [] else tail xs

-- using guarded equations
safetail' :: [a] -> [a]
safetail' xs | null xs  = []
             | otherwise = tail xs

-- using pattern matching
safetail'' :: [a] -> [a]
safetail'' [] = []
safetail'' (_:xs) = xs


