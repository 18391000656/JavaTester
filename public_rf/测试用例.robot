*** Settings ***
Library    DateTime      

*** Test Cases ***
打印hell world
    Log    hell world  
    
打印当前时间
    ${date}=    Get Current Date    
    Log    ${date}        
    
case01
    Log    hello world 
      