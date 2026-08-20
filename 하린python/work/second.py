#       연산자 (Opeator)
# 1.산술 연산자
num1 = 100
num2 = 3

print(num1 + num2)  # 103 더하기
print(num1 - num2)  # 97 빼기
print(num1 * num2)  # 300 곱하기
print(num1 / num2)  #33.333333 나누기 /
print(num1 // num2) #33 나누기의 몫 //
print(num1 % num2)  #1  나누기의 나머지 %
print(num1 ** num2) #1000000  제곱 100 x 100 x 100

print()

# 2.대입 연산자
num1 = 77
num2 = 23

num1 = num1 + 23
num2 = num2 - 20

print(num1) #100
print(num2) #3

print()
#2-1 복합 대입 연산자
x = 3

x += 1

print(x)

num1 = 7
num2 = 3
num3 = num1//num2

num1 += num2
num3 *= num2

print(num1) # 10
print(num2) # 3
print(num3) # 6

print()
# 3. 비교 연산자
a=60
b=80

a = a>b #False
b = a<b #True
c = a == b #a가b랑 같은지 | False
d = a != b #a가b랑 다른지 | True
print(a,b,c,d)

str1 = "가나다"
str2 =  "가"+"나"+"다" #합치면 "가나다" 이므로 True
a= str1 == str2

print(a)

one = "1" #문자 1
num = 1   #숫자 1
b= one != num
print(b)

a = 70
b = 60

bigger = a>b
True_bool = bigger == True
True_str = bigger == "True" #문자열 "True"이다

print(True_bool,True_str)

print()

# 4. 논리연산자
"""
and : 모두 True 일때만 참이다
or  : 둘 중 하나면 True 여도 참이다
not : True 참이면 거짓 / False 거짓이면 참
"""
snowing = True
cold = True

winter = snowing and cold #둘 다 참이니 True

print(winter)

true = True

print(not true)
print()

# 4. 부호 연산자
x= 10

x = -x  #10 -> -10
print(x)

x = -x #-10 -> 10
print(x)
print()

# 5. 조건 연산자
'''
x = 10
y = 9
max = x if x>y else y
#만약 x가 y보다 크면 값은 x 이고,그렇지 않다면 값은 y이다

print(max)
'''
a = 21
b = 30

#만약 a가 b보다 크면
if a>b :
    #max의 값은 a(21)
    max = a
#그렇지 않다면
else:
    #max는 b(30)
    max = b

print(max) #30

print()


a= (85+83+81)/2
if a >= 80:
    num= "합격"
else :
    num = "불합격"

print(num)







