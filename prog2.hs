init_ xs = take (length xs - 1) xs

-- write a program to print prime numbers upto n

factors :: Int -> [Int]
factors n = [x | x <- [1..n], n `mod` x == 0]

prime :: Int -> Bool
prime n = factors n == [1,n]

primes :: Int -> [Int]
primes n = [x | x <- [2..n], prime x]

-- using list comprehension, give an expression that calaculates the sun 1^2 + 2^2 + ... + 100^2

total = sum [x^2 | x <- [1..100]]

-- replicate 
replicate_ :: Int -> a -> [a]
replicate_ n x = [x | _ <- [1..n]]

-- triple (x, y, z) of positive integer is pythagorean if x^2 + y^2 = z^2
-- using list comprehension, define a function

pyths :: Int -> [(Int, Int, Int)]
pyths n = [(x, y, z) | x <- [1..n], y <- [1..n], z <- [1..n], x^2 + y^2 == z^2]

-- perfect numbers | a number is perfect if sum of its factor excluding number itself
-- init is used bcz we have to exclude number itself
perfects :: Int -> [Int]
perfects n = [x | x <- [1..n], sum (init_ (factors x)) == x]

-- scalar product of two list of integers xs and ys of length 
scalarproduct :: [Int] -> [Int] -> [Int]
scalarproduct xs ys = [x*y | (x,y) <- zip xs ys]

-- factorial using recursion
fac :: Int -> Int
fac 0 = 1
fac n = n * fac (n-1)

-- product of n numbers
product_ :: [Int] -> Int
product_ [] = 1
product_ (x:xs) = x * product xs

-- function that calculates nth fibonacci number
fib :: Int -> Int
fib 0 = 0
fib 1 = 1
fib n = fib (n-2) + fib (n-1)
