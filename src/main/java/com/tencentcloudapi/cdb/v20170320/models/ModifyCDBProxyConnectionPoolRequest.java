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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCDBProxyConnectionPoolRequest extends AbstractModel{

    /**
    * Database proxy ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Whether to enable the connection pool. Valid values: `true` (enable);
                             `false` (disable).
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private Boolean OpenConnectionPool;

    /**
    * Connection pool type.
You can use the `DescribeProxyConnectionPoolConf` API to query the connection pool type.
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * Connection persistence timeout in seconds
    */
    @SerializedName("PoolConnectionTimeOut")
    @Expose
    private Long PoolConnectionTimeOut;

    /**
     * Get Database proxy ID 
     * @return ProxyGroupId Database proxy ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Database proxy ID
     * @param ProxyGroupId Database proxy ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Whether to enable the connection pool. Valid values: `true` (enable);
                             `false` (disable). 
     * @return OpenConnectionPool Whether to enable the connection pool. Valid values: `true` (enable);
                             `false` (disable).
     */
    public Boolean getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set Whether to enable the connection pool. Valid values: `true` (enable);
                             `false` (disable).
     * @param OpenConnectionPool Whether to enable the connection pool. Valid values: `true` (enable);
                             `false` (disable).
     */
    public void setOpenConnectionPool(Boolean OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get Connection pool type.
You can use the `DescribeProxyConnectionPoolConf` API to query the connection pool type. 
     * @return ConnectionPoolType Connection pool type.
You can use the `DescribeProxyConnectionPoolConf` API to query the connection pool type.
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set Connection pool type.
You can use the `DescribeProxyConnectionPoolConf` API to query the connection pool type.
     * @param ConnectionPoolType Connection pool type.
You can use the `DescribeProxyConnectionPoolConf` API to query the connection pool type.
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get Connection persistence timeout in seconds 
     * @return PoolConnectionTimeOut Connection persistence timeout in seconds
     */
    public Long getPoolConnectionTimeOut() {
        return this.PoolConnectionTimeOut;
    }

    /**
     * Set Connection persistence timeout in seconds
     * @param PoolConnectionTimeOut Connection persistence timeout in seconds
     */
    public void setPoolConnectionTimeOut(Long PoolConnectionTimeOut) {
        this.PoolConnectionTimeOut = PoolConnectionTimeOut;
    }

    public ModifyCDBProxyConnectionPoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCDBProxyConnectionPoolRequest(ModifyCDBProxyConnectionPoolRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.OpenConnectionPool != null) {
            this.OpenConnectionPool = new Boolean(source.OpenConnectionPool);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.PoolConnectionTimeOut != null) {
            this.PoolConnectionTimeOut = new Long(source.PoolConnectionTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "PoolConnectionTimeOut", this.PoolConnectionTimeOut);

    }
}

