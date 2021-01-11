package com.imooc.user.zookeeper;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.request.AlipayUserInfoShareRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayUserInfoShareResponse;

import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws Exception {

        String p="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiZwHle1xIfaU7Gc/vtix2C4sLQlRXyhkBHbtCVHtJhvBtqaa8nw3dZVJgB55LytgGW1ukkmiB3bYZNryRWUbPCD9d6+dvWnKBmNk4Gg7jnT12i+9SSCUZYcTO9YeYFDBTx+pN8ODIFhqYwiN0P4ycAiSz2rDHrhfxHr+SQzRXcjjHTIe4c5duPhklwZw3UU5LV5OYyNm1jLAeL9jJGWhbURBqfyAtef5DNKcRItelNfFTQ8kwYmhsoL8337f/6rkBUNtvbkreBN0niC0zYJZxyJuDEoG4ieNdUpzJXM80nHst9p6BM/lXPpf60Wn+18PkSd5dRaCckrIjvDt0C0NOwIDAQAB";
        String s="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC9sZN31qZx6m6rn+0m2kezwDlCxF8s2aHoxqwpLRhzjvbHuWp7f/LpkJrDSNYWi0ttV+Z0FRxEPbfav9O9GGhdh23vH2ztT0J31Hn8WaR8s87l9uYtz5gSDCuICTmI/RWfTg8/3zAJafezBwHWAw9BVDFYoi8q5rEdHrdVZO9Mn7OkPhIrnvPZQN6SsuaSyqIFYTu5LDXgTfxoO1yQJRMwAO5YNgG/MZw9fKWf/NrfvWEwru3LODwYWR9RLBtnoXuw64dwqU+4gFOc7mVjH+GoedgKfnmOiMZSqFeazaMNdUR1tgsz0qVXYP7/i6mbamFU7r4t+7+45wMOn0xF4vRpAgMBAAECggEAHpI50/xyArXndB1oGPTgzWVTVSFUvWOtplgucsxjvmvx9ao6MQEj4uR9LK/WYPe+Bjc+WsL0NUNFGCoGM9l1KG2lF/6WjYBSlAFYT4Ua70YDOCicXBGyzmXLtjbWYO94xp3L811C3qGHXADrGNSRZtPsx/4LX/yh2rGSll6X+l8TQO7NzrUZUqLynzl5ssFWwc5BThddcfek4N5sHWAnSUHmA3IIO8Kvi9x3750Qv2EZvXs0fy1bBl2/J/kiWQuNh3G+zXPG3JqVrcMDFKIotGstMeF4cZyNlmphlZPAL7v3MOSmByZIplsaJnyMxKxFDj4uFkg9RUQ5IWciNUexAQKBgQDxJlAFMrph7y/vwo5ypA3e9ZgLY5a5ZPC7K94dJjJneYx8OkYDyqElolQmf/NiDgniJWkujcz6/vJgAZakLLHsbHCgt5Gq6v7DPyRd8Ogv4Dn/eXMFQdZGysWzTF1m0CE8SOo5JbWTpVKW7+/adZFnWqZi9xa5vA190kv6qTrS+QKBgQDJYBFGSEYmmHmcHAEj5MZS0BB4Nx/+EtMHuzGMG3WWZc+la4vAiqvSBJen/Pb+dK4WnQQQIvRvf0dMVVhtVjrgfRGbKz0PMpdfAn4k7Y7eqBznhRqFuYA/kWMmnCk5ZFj0Ow1J8LrQVbdU+LYNdTm9kIb6l1pxOlRAT/OjI1MY8QKBgBPVQNOMnoObdmfTqn+HOpTRwhV9tVG+GYZrTzM6hv63onQ9HrEFI0fDGASqlUvFN87foMzxYKBsA2cd+lO6UU/Og1zUfCiAdz97m/QV8iKt4FdAl9Mg3QypdKUQbMYd6/3XSVw1278u46ICTcm7zZ+gdvrAs5/G9Z0ZhKIy9OGRAoGAWYK9SvtXS1KdQ7ni+9x2F1tq5rTCIMKnURlxNbEC/J42xXXfge9h3pGyA7ba51JgC6cxpiaTdngh7hlFnBwnQZ/2Un3Ov1GinVXTUoDR78DUUEkG+AfzrM3oP8JMRLmJHM6e4o4BzBc9zaRb7/F6f/udNAhQ6GGgD5I6XvqVtlECgYAtntSOUi1/sXi2LpJ2Pij38YOB4dCAzoGNi4TkypQBLdOpsgxKwUsg5S+Okvn4Rv/zqiFXVNo3vDd/syVQKoKU2MXtvZwLU4lMkXnH4JMcSINu89A4VbATPt/KZX+3X3xLStRxxaH80LRPz0GZB1cgNMaUBJEqayflCpzd+8m6/Q=="      ;
        String a = "2021002119655640";
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
                a,s,"json","GBK",p,"RSA2");
//        AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
//        request.setGrantType("authorization_code");
//        request.setCode("59086435770d4f5bad04be5c0c07XX93");
//        AlipaySystemOauthTokenResponse response = alipayClient.execute(request);
//        System.out.print(response);
//        if(response.isSuccess()){
//            System.out.println(accessToken);
//
//            System.out.println("调用成功");
//        } else {
//            System.out.println("调用失败");
//        }
        String accessToken = "authusrBe2f6ba9b945048b69748fe18c3423X93";
        AlipayUserInfoShareRequest request1 = new AlipayUserInfoShareRequest();
        AlipayUserInfoShareResponse response1 = alipayClient.execute(request1,accessToken);
        if(response1.isSuccess()){

            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }

    }

}
