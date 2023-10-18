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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTargetRequest extends AbstractModel {

    /**
    * Event bus ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Event rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Delivery target ID
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Enables batch delivery
    */
    @SerializedName("EnableBatchDelivery")
    @Expose
    private Boolean EnableBatchDelivery;

    /**
    * Maximum waiting time for batch delivery
    */
    @SerializedName("BatchTimeout")
    @Expose
    private Long BatchTimeout;

    /**
    * Maximum number of events in batch delivery
    */
    @SerializedName("BatchEventCount")
    @Expose
    private Long BatchEventCount;

    /**
     * Get Event bus ID 
     * @return EventBusId Event bus ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set Event bus ID
     * @param EventBusId Event bus ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get Event rule ID 
     * @return RuleId Event rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Event rule ID
     * @param RuleId Event rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Delivery target ID 
     * @return TargetId Delivery target ID
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Delivery target ID
     * @param TargetId Delivery target ID
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Enables batch delivery 
     * @return EnableBatchDelivery Enables batch delivery
     */
    public Boolean getEnableBatchDelivery() {
        return this.EnableBatchDelivery;
    }

    /**
     * Set Enables batch delivery
     * @param EnableBatchDelivery Enables batch delivery
     */
    public void setEnableBatchDelivery(Boolean EnableBatchDelivery) {
        this.EnableBatchDelivery = EnableBatchDelivery;
    }

    /**
     * Get Maximum waiting time for batch delivery 
     * @return BatchTimeout Maximum waiting time for batch delivery
     */
    public Long getBatchTimeout() {
        return this.BatchTimeout;
    }

    /**
     * Set Maximum waiting time for batch delivery
     * @param BatchTimeout Maximum waiting time for batch delivery
     */
    public void setBatchTimeout(Long BatchTimeout) {
        this.BatchTimeout = BatchTimeout;
    }

    /**
     * Get Maximum number of events in batch delivery 
     * @return BatchEventCount Maximum number of events in batch delivery
     */
    public Long getBatchEventCount() {
        return this.BatchEventCount;
    }

    /**
     * Set Maximum number of events in batch delivery
     * @param BatchEventCount Maximum number of events in batch delivery
     */
    public void setBatchEventCount(Long BatchEventCount) {
        this.BatchEventCount = BatchEventCount;
    }

    public UpdateTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTargetRequest(UpdateTargetRequest source) {
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.EnableBatchDelivery != null) {
            this.EnableBatchDelivery = new Boolean(source.EnableBatchDelivery);
        }
        if (source.BatchTimeout != null) {
            this.BatchTimeout = new Long(source.BatchTimeout);
        }
        if (source.BatchEventCount != null) {
            this.BatchEventCount = new Long(source.BatchEventCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "EnableBatchDelivery", this.EnableBatchDelivery);
        this.setParamSimple(map, prefix + "BatchTimeout", this.BatchTimeout);
        this.setParamSimple(map, prefix + "BatchEventCount", this.BatchEventCount);

    }
}

