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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCFrequencyRulesResponse extends AbstractModel {

    /**
    * Access frequency control rule list
    */
    @SerializedName("CCFrequencyRuleList")
    @Expose
    private CCFrequencyRule [] CCFrequencyRuleList;

    /**
    * Access frequency control rule status. Valid values: [on, off];
    */
    @SerializedName("CCFrequencyRuleStatus")
    @Expose
    private String CCFrequencyRuleStatus;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Access frequency control rule list 
     * @return CCFrequencyRuleList Access frequency control rule list
     */
    public CCFrequencyRule [] getCCFrequencyRuleList() {
        return this.CCFrequencyRuleList;
    }

    /**
     * Set Access frequency control rule list
     * @param CCFrequencyRuleList Access frequency control rule list
     */
    public void setCCFrequencyRuleList(CCFrequencyRule [] CCFrequencyRuleList) {
        this.CCFrequencyRuleList = CCFrequencyRuleList;
    }

    /**
     * Get Access frequency control rule status. Valid values: [on, off]; 
     * @return CCFrequencyRuleStatus Access frequency control rule status. Valid values: [on, off];
     */
    public String getCCFrequencyRuleStatus() {
        return this.CCFrequencyRuleStatus;
    }

    /**
     * Set Access frequency control rule status. Valid values: [on, off];
     * @param CCFrequencyRuleStatus Access frequency control rule status. Valid values: [on, off];
     */
    public void setCCFrequencyRuleStatus(String CCFrequencyRuleStatus) {
        this.CCFrequencyRuleStatus = CCFrequencyRuleStatus;
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

    public DescribeCCFrequencyRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCFrequencyRulesResponse(DescribeCCFrequencyRulesResponse source) {
        if (source.CCFrequencyRuleList != null) {
            this.CCFrequencyRuleList = new CCFrequencyRule[source.CCFrequencyRuleList.length];
            for (int i = 0; i < source.CCFrequencyRuleList.length; i++) {
                this.CCFrequencyRuleList[i] = new CCFrequencyRule(source.CCFrequencyRuleList[i]);
            }
        }
        if (source.CCFrequencyRuleStatus != null) {
            this.CCFrequencyRuleStatus = new String(source.CCFrequencyRuleStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CCFrequencyRuleList.", this.CCFrequencyRuleList);
        this.setParamSimple(map, prefix + "CCFrequencyRuleStatus", this.CCFrequencyRuleStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

