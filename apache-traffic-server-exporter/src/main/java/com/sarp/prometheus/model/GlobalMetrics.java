package com.sarp.prometheus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by sarp on 8/12/17.
 */

@Getter
@Setter
@ToString
public class GlobalMetrics {

    // main metrics

    @JsonProperty("proxy.node.restarts.manager.start_time")
    private long managerStartTime;

    @JsonProperty("proxy.node.restarts.proxy.start_time")
    private long proxyStartTime;

    @JsonProperty("proxy.node.restarts.proxy.cache_ready_time")
    private long proxyCacheReadyTime;

    @JsonProperty("proxy.node.restarts.proxy.stop_time")
    private long proxyStopTime;

    @JsonProperty("proxy.node.restarts.proxy.restart_count")
    private long proxyRestartCount;

    @JsonProperty("proxy.process.cache.KB_read_per_sec")
    private double kbReadPerSec;

    @JsonProperty("proxy.process.cache.KB_write_per_sec")
    private double kbWritePerSec;

    @JsonProperty("proxy.process.cache_total_hits_bytes")
    private double totalHitsBytes;

    @JsonProperty("proxy.process.cache_total_misses_bytes")
    private double totalMissesBytes;

    @JsonProperty("proxy.process.cache_total_bytes")
    private double totalBytes;

    //@JsonProperty("proxy.process.http.user_agent_speed_bytes_per_sec_100")
    private double throughput;

//    @JsonProperty("proxy.process.http.current_client_connections")
    @JsonProperty("proxy.process.http.current_active_client_connections")
    private int concurrentClientCount;

    //total cache

    @JsonProperty("proxy.process.cache.bytes_total")
    private long cacheBytesTotal;

    @JsonProperty("proxy.process.cache.bytes_used")
    private long cacheBytesUsed;

    @JsonProperty("proxy.node.cache.bytes_free")
    private long cacheBytesFree;

    @JsonProperty("proxy.process.cache_total_hits")
    private long cacheTotalHits;

    @JsonProperty("proxy.process.cache_total_misses")
    private long cacheTotalMisses;

    @JsonProperty("proxy.node.cache_hit_ratio") // both ram and disk
    private double cacheHitRatio;

    //ram cache

    @JsonProperty("proxy.process.cache.ram_cache.total_bytes")
    private double ramCacheTotalBytes;

    @JsonProperty("proxy.process.cache.ram_cache.bytes_used")
    private double ramCacheUsedBytes;

    @JsonProperty("proxy.process.cache.ram_cache.hits")
    private double ramCacheHits;

    @JsonProperty("proxy.process.cache.ram_cache.misses")
    private double ramCacheMisses;

    @JsonProperty("proxy.node.cache_hit_mem_ratio")
    private double ramCacheHitRatio;
}
