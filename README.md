# Quiubas Java Library

Library version: `1.0.0`

[![Travis](https://img.shields.io/travis/rust-lang/rust.svg)]() [![Packagist](https://img.shields.io/packagist/l/doctrine/orm.svg)]() [![Quiubas](https://img.shields.io/badge/version-1.0-brightgreen.svg)]() 

## Requirements
- JDK 1.8+
- `org.json` library
- `apache.commons.codec` library

## Installation

Install **java .jar file** inside your libraries and then import the package with `import com.quiubas.api.*;`. Remember you can replace the `*` with any of the available Classes in case you require only a specific class for a specific endpoint.

Available classes:
- Quiubas
- Sms
- Balance
- Base
- Network
- Callback
- Keywords
- Mnp

## Quickstart

```java
//Imports
//The library package import
import com.quiubas.api.*;
//Others imports
import java.util.Map;
import java.util.HashMap;

public class MyApp {
    
    //Main
    public static void main(String[] args) {
        //Create an instance of the Quiubas class
        Quiubas Quiubas = new Quiubas();
        //Set the authentification information (API_KEY, API_SECRET)
        Quiubas.setAuth("b444ac8f67752e15140b262159e095de2878801c", "bbe6a9af1b8248123d688cbcc6d2c5a157b26507");
        //Lets create an example SMS, first create an instance of the Sms class
        Sms Sms = new Sms();
        //Then, we create a Map for the parameters
        Map<String, String> data = new HashMap<>();
        //Required parameters are "to_number" and "message"
        data.put("to_number", "+524435051725");
        data.put("message", "Hola mundo");
        //Now, lets send it.
        try{
            //If we don't have errors, we get a response as a JSONObject, so
            //we can get, for example, the sms_id and print it
            System.out.println(Sms.send(data).getString("sms_id");
        }catch(Exception e){
            //If we have errors, we show the error message
            System.out.println(e.getMessage());
        }
    }
    
}

```
