package br.com.feltex.statusapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.MessageFormat;

@RestController
@RequestMapping("/")
public class Status {


    @GetMapping
    public String status() throws UnknownHostException {
        var localhost = InetAddress.getLocalHost();
        return MessageFormat.format("[server-status] - Ip: {0} hostName: {1}",
                localhost.getHostAddress(),
                localhost.getHostName());
    }
}
