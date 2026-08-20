#작성한 시간 변환 함수를 다른 파이썬 파일에서 사용해보자
#import 사용하고 싶은 파일명 (확장자는 생략한다)
import Time_Converter

#다른 모듈에 있는 함수 사용법
#모듈명.함수(인수)
min = Time_Converter.hour_to_min(6)
print(f'6 시간은{min}분입니다')


#12분은 몇초인지 출력하세요
#min_to_sec() 함수를 활용하세요
sec = Time_Converter.min_to_sec(12)
print(f'12분은 {sec}초 입니다.')

47:30
