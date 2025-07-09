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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPolicyManagedRulesIdResponse extends AbstractModel {

    /**
    * Total number of returned items
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Managed rule
    */
    @SerializedName("Rules")
    @Expose
    private ManagedRule [] Rules;

    /**
    * Total number of returned items
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of returned items 
     * @return Total Total number of returned items
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of returned items
     * @param Total Total number of returned items
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Managed rule 
     * @return Rules Managed rule
     */
    public ManagedRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Managed rule
     * @param Rules Managed rule
     */
    public void setRules(ManagedRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Total number of returned items 
     * @return Count Total number of returned items
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Total number of returned items
     * @param Count Total number of returned items
     */
    public void setCount(Long Count) {
        this.Count = Count;
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

    public DescribeSecurityPolicyManagedRulesIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPolicyManagedRulesIdResponse(DescribeSecurityPolicyManagedRulesIdResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Rules != null) {
            this.Rules = new ManagedRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ManagedRule(source.Rules[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

