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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL4ProxyRulesResponse extends AbstractModel {

    /**
    * The total count of forwarding rules.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of forwarding rules.	
    */
    @SerializedName("L4ProxyRules")
    @Expose
    private L4ProxyRule [] L4ProxyRules;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total count of forwarding rules. 
     * @return TotalCount The total count of forwarding rules.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total count of forwarding rules.
     * @param TotalCount The total count of forwarding rules.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of forwarding rules.	 
     * @return L4ProxyRules List of forwarding rules.	
     */
    public L4ProxyRule [] getL4ProxyRules() {
        return this.L4ProxyRules;
    }

    /**
     * Set List of forwarding rules.	
     * @param L4ProxyRules List of forwarding rules.	
     */
    public void setL4ProxyRules(L4ProxyRule [] L4ProxyRules) {
        this.L4ProxyRules = L4ProxyRules;
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

    public DescribeL4ProxyRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL4ProxyRulesResponse(DescribeL4ProxyRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.L4ProxyRules != null) {
            this.L4ProxyRules = new L4ProxyRule[source.L4ProxyRules.length];
            for (int i = 0; i < source.L4ProxyRules.length; i++) {
                this.L4ProxyRules[i] = new L4ProxyRule(source.L4ProxyRules[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "L4ProxyRules.", this.L4ProxyRules);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

