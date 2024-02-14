package com.example.factorialcache;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class FactorialCacheService {

    private final Map<Integer, BigDecimal> factorialMap= new ConcurrentHashMap<>();


    public BigDecimal cachedFactorial(int n) {
        return factorialMap.getOrDefault(n,null);
    }

    public void cacheFactorial(int n, BigDecimal result) {
        factorialMap.put(n,result);
    }

}
