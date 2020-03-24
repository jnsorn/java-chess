# java-chess
체스 게임 구현을 위한 저장소

## 기능 요구 사항

1. 체스판 만들기

    체스판에서 말의 위치 값은

    가로:  왼쪽 -> 오른쪽 a ~ h

    세로: 아래 -> 위 1 ~ 8
    ```java
    RNBQKBNR  8 (rank 8)
    PPPPPPPP  7
    ........  6
    ........  5
    ........  4
    ........  3
    pppppppp  2
    rnbqkbnr  1 (rank 1)
    
    abcdefgh ```

2. 체스판에서 각 진영은 검은색(대문자)과 흰색(소문자)편으로 구분한다.

## 구현 기능 목록
1. 말 생성
    - 폰 8개
    - 룩 2개
    - 나이트 2개
    - 비숍 2개
    - 킹 1개
    - 퀸 1개
2. 체스판 생성
    - 말을 초기 위치에 배치
3. 게임 진행을 위한 start, end 입력 받기
    - start, end 외 입력 시 예외 처리
    - start 입력 시 초기 체스판 출력
    - end 입력 시 게임 종료