/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceNodeInfoResponse extends AbstractModel{

    /**
    * The number of proxy nodes
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * Proxy node information
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Proxy")
    @Expose
    private ProxyNodes [] Proxy;

    /**
    * The number of redis nodes
    */
    @SerializedName("RedisCount")
    @Expose
    private Long RedisCount;

    /**
    * Redis node information
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Redis")
    @Expose
    private RedisNodes [] Redis;

    /**
    * The number of tendis nodes
    */
    @SerializedName("TendisCount")
    @Expose
    private Long TendisCount;

    /**
    * Tendis node information
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tendis")
    @Expose
    private TendisNodes [] Tendis;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of proxy nodes 
     * @return ProxyCount The number of proxy nodes
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set The number of proxy nodes
     * @param ProxyCount The number of proxy nodes
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get Proxy node information
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Proxy Proxy node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public ProxyNodes [] getProxy() {
        return this.Proxy;
    }

    /**
     * Set Proxy node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Proxy Proxy node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProxy(ProxyNodes [] Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get The number of redis nodes 
     * @return RedisCount The number of redis nodes
     */
    public Long getRedisCount() {
        return this.RedisCount;
    }

    /**
     * Set The number of redis nodes
     * @param RedisCount The number of redis nodes
     */
    public void setRedisCount(Long RedisCount) {
        this.RedisCount = RedisCount;
    }

    /**
     * Get Redis node information
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Redis Redis node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public RedisNodes [] getRedis() {
        return this.Redis;
    }

    /**
     * Set Redis node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Redis Redis node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRedis(RedisNodes [] Redis) {
        this.Redis = Redis;
    }

    /**
     * Get The number of tendis nodes 
     * @return TendisCount The number of tendis nodes
     */
    public Long getTendisCount() {
        return this.TendisCount;
    }

    /**
     * Set The number of tendis nodes
     * @param TendisCount The number of tendis nodes
     */
    public void setTendisCount(Long TendisCount) {
        this.TendisCount = TendisCount;
    }

    /**
     * Get Tendis node information
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Tendis Tendis node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public TendisNodes [] getTendis() {
        return this.Tendis;
    }

    /**
     * Set Tendis node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Tendis Tendis node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTendis(TendisNodes [] Tendis) {
        this.Tendis = Tendis;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceNodeInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceNodeInfoResponse(DescribeInstanceNodeInfoResponse source) {
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.Proxy != null) {
            this.Proxy = new ProxyNodes[source.Proxy.length];
            for (int i = 0; i < source.Proxy.length; i++) {
                this.Proxy[i] = new ProxyNodes(source.Proxy[i]);
            }
        }
        if (source.RedisCount != null) {
            this.RedisCount = new Long(source.RedisCount);
        }
        if (source.Redis != null) {
            this.Redis = new RedisNodes[source.Redis.length];
            for (int i = 0; i < source.Redis.length; i++) {
                this.Redis[i] = new RedisNodes(source.Redis[i]);
            }
        }
        if (source.TendisCount != null) {
            this.TendisCount = new Long(source.TendisCount);
        }
        if (source.Tendis != null) {
            this.Tendis = new TendisNodes[source.Tendis.length];
            for (int i = 0; i < source.Tendis.length; i++) {
                this.Tendis[i] = new TendisNodes(source.Tendis[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamArrayObj(map, prefix + "Proxy.", this.Proxy);
        this.setParamSimple(map, prefix + "RedisCount", this.RedisCount);
        this.setParamArrayObj(map, prefix + "Redis.", this.Redis);
        this.setParamSimple(map, prefix + "TendisCount", this.TendisCount);
        this.setParamArrayObj(map, prefix + "Tendis.", this.Tendis);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

