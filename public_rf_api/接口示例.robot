*** Settings ***
Library    RequestsLibrary

    
*** Test Cases ***
获取天气-Get请求-示例
    #建立连接
    Create Session    douban    https://api.yonyoucloud.com
    #准备请求数据
    ${req_data}    Create Dictionary    city=深圳    
    #发送get请求-带上请求参数
    ${resp}    Get Request    douban    /apis/dst/weatherResearch/weatherCurrent    params=${req_data}        
    Log    ${resp}  
    Log    ${resp.status_code}
    Log    ${resp.text}                  


获取天气-post-示例
    #建立连接
    Create Session    douban    https://api.yonyoucloud.com
    #准备请求数据
    ${req_data}    Create Dictionary    city=深圳    
    #发送post请求-带上请求数据
    ${resp}    Post Request    douban    /apis/dst/weatherResearch/weatherCurrent    ${req_data}        
    Log    ${resp}  
    Log    ${resp.status_code}
    Log    ${resp.text}          
    
    
#RequestsLibrary-接口测试
    #步骤：1）调用Create Session关键字，创建与服务器的连接；----建立连接
         #2）使用Create Dictionary关键字，创建键值对的请求数据等；-----准备请求数据
         #3）使用Get Request/Post Request关键字，发送get请求或post请求
         #4）获取响应数据：${resp.text}
            #获取请求的状态：${resp.status_code}          