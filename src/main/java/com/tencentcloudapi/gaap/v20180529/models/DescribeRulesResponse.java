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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRulesResponse extends AbstractModel {

    /**
    * Rule information list classified by domain name type
    */
    @SerializedName("DomainRuleSet")
    @Expose
    private DomainRuleSet [] DomainRuleSet;

    /**
    * Total quantity of domain names under this listener
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Rule information list classified by domain name type 
     * @return DomainRuleSet Rule information list classified by domain name type
     */
    public DomainRuleSet [] getDomainRuleSet() {
        return this.DomainRuleSet;
    }

    /**
     * Set Rule information list classified by domain name type
     * @param DomainRuleSet Rule information list classified by domain name type
     */
    public void setDomainRuleSet(DomainRuleSet [] DomainRuleSet) {
        this.DomainRuleSet = DomainRuleSet;
    }

    /**
     * Get Total quantity of domain names under this listener 
     * @return TotalCount Total quantity of domain names under this listener
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total quantity of domain names under this listener
     * @param TotalCount Total quantity of domain names under this listener
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRulesResponse(DescribeRulesResponse source) {
        if (source.DomainRuleSet != null) {
            this.DomainRuleSet = new DomainRuleSet[source.DomainRuleSet.length];
            for (int i = 0; i < source.DomainRuleSet.length; i++) {
                this.DomainRuleSet[i] = new DomainRuleSet(source.DomainRuleSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DomainRuleSet.", this.DomainRuleSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

