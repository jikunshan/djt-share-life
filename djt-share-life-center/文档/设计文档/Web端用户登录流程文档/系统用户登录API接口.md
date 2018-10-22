用户登录
---
> **[ 接口描述 ]** web用户登录接口API

> **[ 使用对象 ]** 系统开发人员

> **[ 接口地址 ]** 

    path : /login/000
    
> **[ 接口入参 ]** 

    
    参数类型        参数必填        参数名称                备注
    String          必须           userName               用户名
    String          必须           password               密码（密文）
    String          可选           yzm                    验证码
    
> **[ 公共出参 ]** 
     
    参数类型        参数必填        参数名称                备注
    Boolean         必须           result                 true为正确结果,false为异常结果
    String          可选           msg                    result为false时返回
 
> **[ 接口出参 ]** 

    无
    
> **[ 入参示例 ]** 

    {
        "loginName":"dhr",
        "password":"123456",
        "yzm":"AXDG"
    }

> **[ 出参示例 ]** 
    
    {
        "result":true,
        "msg":""
    }