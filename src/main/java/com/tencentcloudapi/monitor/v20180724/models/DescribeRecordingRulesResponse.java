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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordingRulesResponse extends AbstractModel{

    /**
    * Number of rule groups
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Rule group details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordingRuleSet")
    @Expose
    private RecordingRuleSet [] RecordingRuleSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of rule groups 
     * @return TotalCount Number of rule groups
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of rule groups
     * @param TotalCount Number of rule groups
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Rule group details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordingRuleSet Rule group details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RecordingRuleSet [] getRecordingRuleSet() {
        return this.RecordingRuleSet;
    }

    /**
     * Set Rule group details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordingRuleSet Rule group details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordingRuleSet(RecordingRuleSet [] RecordingRuleSet) {
        this.RecordingRuleSet = RecordingRuleSet;
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

    public DescribeRecordingRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordingRulesResponse(DescribeRecordingRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RecordingRuleSet != null) {
            this.RecordingRuleSet = new RecordingRuleSet[source.RecordingRuleSet.length];
            for (int i = 0; i < source.RecordingRuleSet.length; i++) {
                this.RecordingRuleSet[i] = new RecordingRuleSet(source.RecordingRuleSet[i]);
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
        this.setParamArrayObj(map, prefix + "RecordingRuleSet.", this.RecordingRuleSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

