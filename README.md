# java-racingcar-precourse

## ✨ 구현할 기능 목록

### 입력

- [ ] 경주할 자동차 이름을 쉼표(,) 기준으로 입력받고 파싱하여 이름 리스트로 만든다. 
- [ ] 이름이 5자 초과면 IllegalArgumentException을 반환한다. 
- [ ] 시도할 횟수를 입력 받는다. 
- [ ] 횟수가 0 이하면 IllegalArgumentException을 반환한다.

### 자동차

- [ ] 자동차 객체를 생성한다.
- [ ] 자동차별로 랜덤 숫자를 직접 생성한다.
- [ ] 랜덤 숫자가 4 이상일 경우 move()로 이동한다.
- [ ] canMove()로 이동 조건을 판단한다.

### 경주

- [ ] 입력받은 자동차 리스트와 시도 횟수를 기반으로 경주를 실행한다.
- [ ] findWinners()로 가장 멀리 이동한 자동차(들)를 반환한다.


### 출력

- [ ] 각 회차가 끝날 때마다 자동차 이름과 이동 거리를 -로 표현하여 출력한다.

### 컨트롤러

- [ ] View(InputView, OutputView)와 비즈니스 로직(CarRace)을 연결하는 중간 계층 역할을 수행한다.

## ✨ 개발할 순서 목록 (TDD)

### Car

- [ ] 이름이 5자 초과면 IllegalArgumentException을 반환한다. 
- [ ] canMove(int n) 에서 n이 4 이상이면 true, 미만이면 false을 반환한다. 
- [ ] move() 호출 시 이동 조건 충족이면 score+1

### CarRace

- [ ] numberOfGames <= 0 면 IllegalArgumentException을 반환한다.
- [ ] findWinners()가 최대로 움직인 Car(동점자 포함)를 반환한다. 

### NumberPicker

