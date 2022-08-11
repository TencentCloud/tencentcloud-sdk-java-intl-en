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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPortraitRulesResponse extends AbstractModel{

    /**
    * Number of rules returned in this request
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Bot user profiling rule
    */
    @SerializedName("Rules")
    @Expose
    private PortraitManagedRuleDetail [] Rules;

    /**
    * Total number of rules
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of rules returned in this request 
     * @return Count Number of rules returned in this request
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of rules returned in this request
     * @param Count Number of rules returned in this request
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Bot user profiling rule 
     * @return Rules Bot user profiling rule
     */
    public PortraitManagedRuleDetail [] getRules() {
        return this.Rules;
    }

    /**
     * Set Bot user profiling rule
     * @param Rules Bot user profiling rule
     */
    public void setRules(PortraitManagedRuleDetail [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Total number of rules 
     * @return Total Total number of rules
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of rules
     * @param Total Total number of rules
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeSecurityPortraitRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPortraitRulesResponse(DescribeSecurityPortraitRulesResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Rules != null) {
            this.Rules = new PortraitManagedRuleDetail[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PortraitManagedRuleDetail(source.Rules[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
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
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

