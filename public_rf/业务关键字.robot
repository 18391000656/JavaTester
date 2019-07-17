*** Keywords ***
打开谷歌浏览器病访问百度首页
    Log    打开浏览器，输入http://www.baidu.com,进入百度首页

输入用户名
    [Arguments]    ${username}
    [Return]    我是返回值
    Log    百度登录用户名为:${username}