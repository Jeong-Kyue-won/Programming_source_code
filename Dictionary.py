dictData={"Kim":"010-1111-1111","Choi":"010-2222-2222"}
while True:
    cmd = input("명령?(1.추가 2.삭제 3.키조회 4.수정 5.전체보기 q.종료)>>>")
    if cmd=='q' or cmd=='Q':
        break
    if cmd=='1':
        try:
            k,v=input("키:값?>>>").split(":")
            if k in dictData:
                print("기존 딕셔너리에 이미 해당 키가 있습니다.")
                print(dictData[k])
            else:
                dictData[k]=v
                print("키=",k,"값=",v,"가 추가되었습니다.")
        except:
            print("\n키와 값을 키:값 형태로 입력하셔야 합니다.")
    if cmd=='2':
        k=input("키?>>>")
        if k not in dictData:
            print("해당 키가 없습니다.")
        else:
            del dictData[k]
            print("key=",k,"가 삭제 되었습니다.")
    if cmd=='3':
        k=input("키?>>>")
        if k in dictData:
            print("Key=",k,"의 값은",dictData[k])
        else:
            print("해당 키가 없습니다.")
    if cmd=='4':
        k=input("키?>>>")
        if k in dictData:
            v=input("바꿀 값은?")
            dictData[k]=v
            print("key=",k,"의 값이",dictData[k],"로 변경되었습니다.")
        else:
            print("해당 키가 없습니다.")
    if cmd=='5':
        print("===============================")
        print("전체 딕셔너리 키와 데이터 값 현황")
        print(dictData)
        print("===============================")
print("==================")
print("종료되었습니다.")
