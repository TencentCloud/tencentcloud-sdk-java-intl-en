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

public class ConnectionPoolInfo extends AbstractModel{

    /**
    * Whether the connection pool is enabled
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * Connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PoolConnectionTimeOut")
    @Expose
    private Long PoolConnectionTimeOut;

    /**
     * Get Whether the connection pool is enabled
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ConnectionPool Whether the connection pool is enabled
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set Whether the connection pool is enabled
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ConnectionPool Whether the connection pool is enabled
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ConnectionPoolType Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ConnectionPoolType Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get Connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return PoolConnectionTimeOut Connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getPoolConnectionTimeOut() {
        return this.PoolConnectionTimeOut;
    }

    /**
     * Set Connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
     * @param PoolConnectionTimeOut Connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setPoolConnectionTimeOut(Long PoolConnectionTimeOut) {
        this.PoolConnectionTimeOut = PoolConnectionTimeOut;
    }

    public ConnectionPoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectionPoolInfo(ConnectionPoolInfo source) {
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
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
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "PoolConnectionTimeOut", this.PoolConnectionTimeOut);

    }
}

