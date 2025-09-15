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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAutoScaleStrategyRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time rules.
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * Rule ID.
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Scaling group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time rules. 
     * @return StrategyType Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time rules.
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time rules.
     * @param StrategyType Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time rules.
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Rule ID. 
     * @return StrategyId Rule ID.
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Rule ID.
     * @param StrategyId Rule ID.
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Scaling group ID. 
     * @return GroupId Scaling group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Scaling group ID.
     * @param GroupId Scaling group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    public DeleteAutoScaleStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAutoScaleStrategyRequest(DeleteAutoScaleStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

