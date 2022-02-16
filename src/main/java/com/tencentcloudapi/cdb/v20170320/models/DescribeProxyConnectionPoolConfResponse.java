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

public class DescribeProxyConnectionPoolConfResponse extends AbstractModel{

    /**
    * Number of queried configurations
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Connection pool configuration details
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PoolConf")
    @Expose
    private PoolConf PoolConf;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of queried configurations
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Count Number of queried configurations
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of queried configurations
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Count Number of queried configurations
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Connection pool configuration details
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return PoolConf Connection pool configuration details
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public PoolConf getPoolConf() {
        return this.PoolConf;
    }

    /**
     * Set Connection pool configuration details
Note: this field may return `null`, indicating that no valid value can be found.
     * @param PoolConf Connection pool configuration details
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setPoolConf(PoolConf PoolConf) {
        this.PoolConf = PoolConf;
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

    public DescribeProxyConnectionPoolConfResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyConnectionPoolConfResponse(DescribeProxyConnectionPoolConfResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.PoolConf != null) {
            this.PoolConf = new PoolConf(source.PoolConf);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "PoolConf.", this.PoolConf);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

