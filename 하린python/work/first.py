  print("hellow,python")


#카멜케이스(카멜camel 낙타)표기법

HaRin = 21

#스네이크케이스(스네이크snake 뱀) 표기법

Ha_Ru = 1

#출력
print(Ha_Ru) #1
print(HaRin) #21

print()

#   숫자형

#1. 정수형 (int) (Integer = 정수)
num1 = 10
num2 = 40

apple = num1+num2 #10 + 40 =50
num1 = num2
num2 = apple

print(apple) #50
print(num1) #40
print(num2) #50

#int( ) 함수를이용해서 다른 함수들을 정수형으로 변환시키기
a = int("1000") #문자형 "1000" 
b = int(1.334)  #실수 1.334

print(a,b)

print()

#2. 실수형 (float)

#실수형의 사칙연산
x = 2.0
y = 2.0
print(x*y)

a = 7.0
b = 3.0
print(a*b)

#float ( ) 함수를 이용해서 다른 함수들을 실수형으로 변환시키기
a = float("1000") #문자형 "1000"
b = float(12)     #정수형 12

print(a,b)

print()
#  불 자료형

#1.논리형 (bool 불)
#논리형은 True(참) / False(거짓)
x= 100
y=90

result = x > y # 100>90

print(result) #True

# Falst 는 값이 없는 모든경우를 뜻 한다
a = bool(0)
b = bool('')
c= bool([])
d = bool()
print(a,b,c,d)

print()

#   문자열 (string)

#1.문자열 생성
name1 = "Kim"
name2 = "Lee"
print(name1 ,name2) #Kim  Lee

str = "Park's Bakery"
print(str) #Park's Bakery

#2.문자열의 연산
first_name= "harin"
list_name= "Bak"
full_name= first_name + list_name # + 연산자 사용해 문자열 합치기

print(full_name)

pool = "메롱"
print(pool*8) # * 곱하기 연산자를 사용해 문자열 반복

#3.문자열 인덱스 (index)
s = "hello"

char = s[0]
char2 = s[2]
char3 = s[-1] #뒤어서 첫번째 문자는 -1로 시작한다
char4 = s[-4]
print(char,char2,char3,char4)

print()

#4.문자열 슬라이싱(slicing)
text ="I Love Python"
a = text[2:6]#start:stop(-1)  2 부터 5 까지
b = text[7:13] # 7~12까지 
c = text[4:13:2] #4부터 12 까지 2씩 증가

print(a)
print(b)
print(c)
print()
print(text[:6]) #시작(start)인덱스 생량
print(text[7:]) #종료(stop)인덱스 생략
print(text[:])  #시작과 종료 모두 다 생략

print()

#5. 문자열 길이 (len 함수 사용)
text1 = "a"
text="I Love Python"

b= len(text1)
a = len(text)

print(b) #1
print(a) #13

print()

#6. 그 외에 유용한 함수
'''
문자열을 모두 대문자로 만드는 함수 : . upper ( ) 함수
<->
문자열을 모두 소문자로 만드는 함수 : . lower ( ) 함수

양쪽공백을 제거하는 함수 : . strip ( ) 함수
+ 왼쪽공백제거 : .lstrip / 오른쪽 공백제거 :  .rstrip
'''
text = "I Like apple ,But I don't like vegetable"

A = text.upper()
B = text.lower()

print(A) #I LIKE APPLE ,BUT I DON'T LIKE VEGETABLE
print(B) #i like apple ,but i don't like vegetable

text ="            hi??                "

a = text.strip()
b = text.lstrip()
c = text.rstrip()

print(a)
print(b)
print(c)

text1 = "31025"


print(text1[:1],"학년",text1[1:3],"반",text1[3:5],"번")

'''

student_id = "31025"

a = student_id[0]
b = student_id[1:3]
c = student_id[3:5]

print(f"{a}학년 {b}반 {c}번 ")

'''

 
 
































































