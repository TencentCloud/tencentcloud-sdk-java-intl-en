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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicy extends AbstractModel {

    /**
    * Protection policy ID list
    */
    @SerializedName("TaskPolicyIdList")
    @Expose
    private String [] TaskPolicyIdList;

    /**
    * Protection policy status
    */
    @SerializedName("TaskPolicyStatus")
    @Expose
    private String TaskPolicyStatus;

    /**
    * Policy rule
    */
    @SerializedName("TaskPolicyRule")
    @Expose
    private String TaskPolicyRule;

    /**
    * Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskPolicyDealType")
    @Expose
    private Long TaskPolicyDealType;

    /**
     * Get Protection policy ID list 
     * @return TaskPolicyIdList Protection policy ID list
     */
    public String [] getTaskPolicyIdList() {
        return this.TaskPolicyIdList;
    }

    /**
     * Set Protection policy ID list
     * @param TaskPolicyIdList Protection policy ID list
     */
    public void setTaskPolicyIdList(String [] TaskPolicyIdList) {
        this.TaskPolicyIdList = TaskPolicyIdList;
    }

    /**
     * Get Protection policy status 
     * @return TaskPolicyStatus Protection policy status
     */
    public String getTaskPolicyStatus() {
        return this.TaskPolicyStatus;
    }

    /**
     * Set Protection policy status
     * @param TaskPolicyStatus Protection policy status
     */
    public void setTaskPolicyStatus(String TaskPolicyStatus) {
        this.TaskPolicyStatus = TaskPolicyStatus;
    }

    /**
     * Get Policy rule 
     * @return TaskPolicyRule Policy rule
     */
    public String getTaskPolicyRule() {
        return this.TaskPolicyRule;
    }

    /**
     * Set Policy rule
     * @param TaskPolicyRule Policy rule
     */
    public void setTaskPolicyRule(String TaskPolicyRule) {
        this.TaskPolicyRule = TaskPolicyRule;
    }

    /**
     * Get Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskPolicyDealType Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskPolicyDealType() {
        return this.TaskPolicyDealType;
    }

    /**
     * Set Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskPolicyDealType Process method when the guardrail policy takes effect. 1: sequential execution, 2: pausing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskPolicyDealType(Long TaskPolicyDealType) {
        this.TaskPolicyDealType = TaskPolicyDealType;
    }

    public DescribePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicy(DescribePolicy source) {
        if (source.TaskPolicyIdList != null) {
            this.TaskPolicyIdList = new String[source.TaskPolicyIdList.length];
            for (int i = 0; i < source.TaskPolicyIdList.length; i++) {
                this.TaskPolicyIdList[i] = new String(source.TaskPolicyIdList[i]);
            }
        }
        if (source.TaskPolicyStatus != null) {
            this.TaskPolicyStatus = new String(source.TaskPolicyStatus);
        }
        if (source.TaskPolicyRule != null) {
            this.TaskPolicyRule = new String(source.TaskPolicyRule);
        }
        if (source.TaskPolicyDealType != null) {
            this.TaskPolicyDealType = new Long(source.TaskPolicyDealType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskPolicyIdList.", this.TaskPolicyIdList);
        this.setParamSimple(map, prefix + "TaskPolicyStatus", this.TaskPolicyStatus);
        this.setParamSimple(map, prefix + "TaskPolicyRule", this.TaskPolicyRule);
        this.setParamSimple(map, prefix + "TaskPolicyDealType", this.TaskPolicyDealType);

    }
}

