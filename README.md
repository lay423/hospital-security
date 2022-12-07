# hospital-security

#### Token 인증
1. `POST /api/v1/login` 토큰 발급
2. `POST /api/v1/reviews` 토큰 인증


#### 방명록 등록, 조회
1. `GET /api/v1/visits` 방명록 조회
2. `POST /api/v1/visits` 방명록 등록
3. `GET /api/v1/visits/users/{id}` 특정 유저의 방명록 조회
4. `GET /api/v1/visits/hospitals/{id}` 특정 병원의 기록 조회

#### Docker url
1. 전체조회 - http://ec2-43-201-153-66.ap-northeast-2.compute.amazonaws.com:8080/api/v1/visits
2. 특정 유저 조회 - http://ec2-43-201-153-66.ap-northeast-2.compute.amazonaws.com:8080/api/v1/visits/users/1
3. 병원 기록 조회 - http://ec2-43-201-153-66.ap-northeast-2.compute.amazonaws.com:8080/api/v1/visits/hospitals/1

![er](https://user-images.githubusercontent.com/41409287/206075080-5f54839c-5676-4f17-bda7-3fa1ad9a5464.PNG)
