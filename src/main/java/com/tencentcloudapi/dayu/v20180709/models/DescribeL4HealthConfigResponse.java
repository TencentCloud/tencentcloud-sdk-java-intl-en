/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL4HealthConfigResponse extends AbstractModel {

    /**
    * Layer-4 health check configuration array
    */
    @SerializedName("HealthConfig")
    @Expose
    private L4HealthConfig [] HealthConfig;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Layer-4 health check configuration array 
     * @return HealthConfig Layer-4 health check configuration array
     */
    public L4HealthConfig [] getHealthConfig() {
        return this.HealthConfig;
    }

    /**
     * Set Layer-4 health check configuration array
     * @param HealthConfig Layer-4 health check configuration array
     */
    public void setHealthConfig(L4HealthConfig [] HealthConfig) {
        this.HealthConfig = HealthConfig;
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

    public DescribeL4HealthConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL4HealthConfigResponse(DescribeL4HealthConfigResponse source) {
        if (source.HealthConfig != null) {
            this.HealthConfig = new L4HealthConfig[source.HealthConfig.length];
            for (int i = 0; i < source.HealthConfig.length; i++) {
                this.HealthConfig[i] = new L4HealthConfig(source.HealthConfig[i]);
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
        this.setParamArrayObj(map, prefix + "HealthConfig.", this.HealthConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

