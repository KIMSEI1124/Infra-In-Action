# TEAMCITY

JetBrain사에서 제공하고 있는 CI/CD 도구인 [TeamCity](https://www.jetbrains.com/teamcity/?source=google&medium=cpc&campaign=APAC_en_KR_TeamCity_Branded&term=teamcity&content=513083499784&gad_source=1&gclid=Cj0KCQiAxOauBhCaARIsAEbUSQRkLhiL4aQioOoi7ZCjAxddZV5a2d7rxaSy2RhYaaGzPXISMiqh12AaAnF4EALw_wcB)를 다뤄보겠습니다.
먼저 사용하게 된 계기는 Jenkins에서 설정에 대한 번거로움을 느끼게 되었고 무엇보다 UI가 더 이쁩니다!

## 실습 환경

### Local

- macOS
- docker

### Remote

- ubuntu 22.03
- docker

## Docker-Compose

Docker을 사용하여 서버를 구성할 것 이며 무료버젼은 3대의 Agent까지 가능합니다.
관련 자료는 [JetBrains/teamcity-docker-samples](https://github.com/JetBrains/teamcity-docker-samples) 에서 확인하였습니다.

사용하는 이미지의 정보는 다음과 같습니다.

- [teamcity-server:2023.11.3](https://hub.docker.com/layers/jetbrains/teamcity-server/2023.11.3/images/sha256-9290b19df4607d52613853933a6e0ce11e1508250d5341bd2db27a9067e05c54?context=explore)
- [teamcity-agent:2023.11.3](https://hub.docker.com/layers/jetbrains/teamcity-agent/2023.11.3/images/sha256-9b6aabaf2cf4edfc1fedee0bfb7e8f8cd2fcf44f80f626a0c171630c87b94e27?context=explore)

## Quick Starter

> ⚠️ **Warning**
>
> `.env`파일에서 원하는 설정으로 변경하신 후 실행하셔야 합니다.

```shell
sh up.sh
```
