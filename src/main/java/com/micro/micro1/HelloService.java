package com.micro.micro1;

import com.amazonaws.xray.spring.aop.XRayEnabled;

import org.springframework.stereotype.Component;

@Component
@XRayEnabled
public class HelloService { 
  
    public String greetingHello() {
        return "Hello from micro2 service";
    }

    public void processRequest(RequestDto requestDto) throws Exception {
        if(!requestDto.getParam2().isEmpty()){
            throw new Exception("some business exception");
        }
        if(requestDto.getParam2().equals("wait")){
            Thread.sleep(4000);
        }
              
    }
  

}
