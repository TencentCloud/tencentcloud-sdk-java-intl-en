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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImmutableTagRulesResponse extends AbstractModel {

    /**
    * Rule list
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private ImmutableTagRule [] Rules;

    /**
    * Namespace with no rules created
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EmptyNs")
    @Expose
    private String [] EmptyNs;

    /**
    * Total rules
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
     * Get Rule list
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Rules Rule list
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public ImmutableTagRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Rule list
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Rules Rule list
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRules(ImmutableTagRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Namespace with no rules created
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return EmptyNs Namespace with no rules created
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getEmptyNs() {
        return this.EmptyNs;
    }

    /**
     * Set Namespace with no rules created
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param EmptyNs Namespace with no rules created
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEmptyNs(String [] EmptyNs) {
        this.EmptyNs = EmptyNs;
    }

    /**
     * Get Total rules 
     * @return Total Total rules
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total rules
     * @param Total Total rules
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

    public DescribeImmutableTagRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImmutableTagRulesResponse(DescribeImmutableTagRulesResponse source) {
        if (source.Rules != null) {
            this.Rules = new ImmutableTagRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ImmutableTagRule(source.Rules[i]);
            }
        }
        if (source.EmptyNs != null) {
            this.EmptyNs = new String[source.EmptyNs.length];
            for (int i = 0; i < source.EmptyNs.length; i++) {
                this.EmptyNs[i] = new String(source.EmptyNs[i]);
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
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArraySimple(map, prefix + "EmptyNs.", this.EmptyNs);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

