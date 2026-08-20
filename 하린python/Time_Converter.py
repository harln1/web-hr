#상수(constant)
#값이 바뀌지 않도록 사용하기로 약속한 변수
#파이썬 에서는 문법적으로 값을 못바꾸게 막는 '진짜상수'는 없다
#변수명을 대문자로 작성하면 "이변수는 상수처럼 사용하겠다"라는 의미


MIN = 60#1시간에 해당하는 분을 나타낸
SEC = 60#1분에 해당하는 초를 나타낸다
'''
hour를 매개변수로 갖는 hour_to_min함수 만들기
인수로 넘어온 hour를 분으로 변환하여 return한다
'''
def hour_to_min(hour):
    return hour * MIN
'''
min을 매개변수로 갖는 min_to_sec함수 만들기
인수로 넘어온 min을 초로 변환하여 return한다
'''
def min_to_sec(min):
    return min * SEC
'''
hour를 매개변수로 갖는 hour_to_sec함수 만들기
인수로 넘어온 hour를 초로 변환하여 return한다
'''
def hour_to_sec(hour):
    return min_to_sec(hour_to_min(hour))
