package com.wzc.netty;

import com.wzc.netty.constant.WebSocketConstant;
import com.wzc.netty.handler.WebSocketChanneInitializer;
import com.wzc.netty.service.WebSocketInfoService;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class NettyDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(NettyDemoApplication.class, args);
    }


}
