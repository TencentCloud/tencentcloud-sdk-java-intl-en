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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyConnectionPoolInfo extends AbstractModel {

    /**
    * Connection persistence timeout in seconds
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * Whether the connection pool is enabled
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * Connection pool type. Valid value: `SessionConnectionPool` (session-level).
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
     * Get Connection persistence timeout in seconds
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained. 
     * @return ConnectionPoolTimeOut Connection persistence timeout in seconds
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set Connection persistence timeout in seconds
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     * @param ConnectionPoolTimeOut Connection persistence timeout in seconds
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get Whether the connection pool is enabled
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained. 
     * @return OpenConnectionPool Whether the connection pool is enabled
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set Whether the connection pool is enabled
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     * @param OpenConnectionPool Whether the connection pool is enabled
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get Connection pool type. Valid value: `SessionConnectionPool` (session-level).
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained. 
     * @return ConnectionPoolType Connection pool type. Valid value: `SessionConnectionPool` (session-level).
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set Connection pool type. Valid value: `SessionConnectionPool` (session-level).
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     * @param ConnectionPoolType Connection pool type. Valid value: `SessionConnectionPool` (session-level).
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    public ProxyConnectionPoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyConnectionPoolInfo(ProxyConnectionPoolInfo source) {
        if (source.ConnectionPoolTimeOut != null) {
            this.ConnectionPoolTimeOut = new Long(source.ConnectionPoolTimeOut);
        }
        if (source.OpenConnectionPool != null) {
            this.OpenConnectionPool = new String(source.OpenConnectionPool);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);

    }
}

