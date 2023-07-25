package cn.cai.getway.filter;

import cn.cai.getway.config.property.WhitelistProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

///**
// * 网关权限校验
// */
//@Component
//public class AuthFilter implements GlobalFilter, Ordered {
//
//    /**
//     * 注入白名单
//     */
//    @Autowired
//    private WhitelistProperty whitelistProperty;
//
//    /**
//     * 全局过滤器
//     * @param exchange the current server exchange
//     * @param chain provides a way to delegate to the next filter
//     * @return
//     */
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
//        ServerHttpRequest.Builder mutate = request.mutate();
//
//        String url = request.getURI().getPath();
//
//
//
//
//        return null;
//    }
//
//    @Override
//    public int getOrder() {
//        return -1;
//    }
//}
