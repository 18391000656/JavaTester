*** Settings ***
Library    SeleniumLibrary

*** Keywords ***
打开谷歌浏览器并访问百度首页
    Open Browser    http://www.baidu.com    Chrome
    Sleep    5
    
点击登录链接
    Click Element    xpath=//*[@id="u1"]//*[@name="tj_login"]
    Sleep    2        

点击用用户名按钮
    Wait Until Element Is Visible    id=TANGRAM__PSP_10__footerULoginBtn    5
    Click Element    id=TANGRAM__PSP_10__footerULoginBtn              

百度登录
    Input Text    id=TANGRAM__PSP_10__userName    18391000656
    Input Text    id=TANGRAM__PSP_10__password    645222zhangli.
    Click Button    id=TANGRAM__PSP_10__submit
        
