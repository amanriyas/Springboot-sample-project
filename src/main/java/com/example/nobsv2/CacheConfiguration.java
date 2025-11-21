package com.example.nobsv2;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
@EnableCaching
@EnableScheduling
public class CacheConfiguration {

    @Bean
    public CacheManager cacheManager() {
        ConcurrentMapCacheManager manager = new ConcurrentMapCacheManager();
        manager.setAllowNullValues(false);
        manager.setCacheNames(Arrays.asList("productCache"));
        return manager;
    }

    @CacheEvict(value = "productCache", allEntries = true)
    @Scheduled(fixedRate = 7000, initialDelay = 0) // Evict cache every 60 seconds

    public void evictAllCaches() {
        // This method will be called every 60 seconds to clear the cache
        System.out.println("Evicting Product Cache");
    }
}
