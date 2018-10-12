# Quiubas Java Library

Library version: `1.4.0`

[![Build Status](https://travis-ci.org/quiubas/quiubas-java.svg?branch=master)](https://travis-ci.org/quiubas/quiubas-java) [![Packagist](https://img.shields.io/packagist/l/doctrine/orm.svg)]() [![Quiubas](https://img.shields.io/badge/version-1.3.1-brightgreen.svg)]() 

## Requirements
- JDK 1.8+
- JRE 1.8+
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
- Keywords
- Shortcode
- TwoFactor
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
        Quiubas.setAuth("YOUR_API_KEY", "YOUR_API_SECRET");
        //Lets create an example SMS, first create an instance of the Sms class
        Sms Sms = new Sms();
        //Then, we create a Map for the parameters
        Map<String, String> data = new HashMap<>();
        //Required parameters are "to_number" and "message"
        data.put("to_number", "PHONE_NUMBER");
        data.put("message", "Hello world");
        //Now, lets send it.
        try{
            //If we don't have errors, we get a response as a JSONObject, so
            //we can get, for example, the sms_id and print it
            System.out.println(Sms.send(data).getInt("id"));
        }catch(Exception e){
            //If we have errors, we show the error message
            System.out.println(e.getMessage());
        }
    }
    
}

```
