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

public class PoolConf extends AbstractModel{

    /**
    * Connection pool type. Valid value: `SessionConnectionPool` (session-level connection pool)
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * Maximum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("MaxPoolConnectionTimeOut")
    @Expose
    private Long MaxPoolConnectionTimeOut;

    /**
    * Minimum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("MinPoolConnectionTimeOut")
    @Expose
    private Long MinPoolConnectionTimeOut;

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
     * Get Maximum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return MaxPoolConnectionTimeOut Maximum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getMaxPoolConnectionTimeOut() {
        return this.MaxPoolConnectionTimeOut;
    }

    /**
     * Set Maximum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
     * @param MaxPoolConnectionTimeOut Maximum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setMaxPoolConnectionTimeOut(Long MaxPoolConnectionTimeOut) {
        this.MaxPoolConnectionTimeOut = MaxPoolConnectionTimeOut;
    }

    /**
     * Get Minimum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return MinPoolConnectionTimeOut Minimum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getMinPoolConnectionTimeOut() {
        return this.MinPoolConnectionTimeOut;
    }

    /**
     * Set Minimum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
     * @param MinPoolConnectionTimeOut Minimum value of connection persistence timeout in seconds
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setMinPoolConnectionTimeOut(Long MinPoolConnectionTimeOut) {
        this.MinPoolConnectionTimeOut = MinPoolConnectionTimeOut;
    }

    public PoolConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PoolConf(PoolConf source) {
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.MaxPoolConnectionTimeOut != null) {
            this.MaxPoolConnectionTimeOut = new Long(source.MaxPoolConnectionTimeOut);
        }
        if (source.MinPoolConnectionTimeOut != null) {
            this.MinPoolConnectionTimeOut = new Long(source.MinPoolConnectionTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "MaxPoolConnectionTimeOut", this.MaxPoolConnectionTimeOut);
        this.setParamSimple(map, prefix + "MinPoolConnectionTimeOut", this.MinPoolConnectionTimeOut);

    }
}

