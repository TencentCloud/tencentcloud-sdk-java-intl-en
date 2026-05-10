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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTargetGroupAttributeRequest extends AbstractModel {

    /**
    * Target group ID.
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * New name of target group.
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * Health check details.
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * Whether "All Dead, All Alive" is supported.
    */
    @SerializedName("AllDeadToAlive")
    @Expose
    private Boolean AllDeadToAlive;

    /**
    * 
    */
    @SerializedName("RescheduleUnbindRs")
    @Expose
    private Boolean RescheduleUnbindRs;

    /**
    * 
    */
    @SerializedName("RescheduleUnbindRsStartTime")
    @Expose
    private Long RescheduleUnbindRsStartTime;

    /**
    * 
    */
    @SerializedName("RescheduleUnhealthy")
    @Expose
    private Boolean RescheduleUnhealthy;

    /**
    * 
    */
    @SerializedName("RescheduleUnhealthyStartTime")
    @Expose
    private Long RescheduleUnhealthyStartTime;

    /**
     * Get Target group ID. 
     * @return TargetGroupId Target group ID.
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Target group ID.
     * @param TargetGroupId Target group ID.
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get New name of target group. 
     * @return TargetGroupName New name of target group.
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set New name of target group.
     * @param TargetGroupName New name of target group.
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get Health check details. 
     * @return HealthCheck Health check details.
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check details.
     * @param HealthCheck Health check details.
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Whether "All Dead, All Alive" is supported. 
     * @return AllDeadToAlive Whether "All Dead, All Alive" is supported.
     */
    public Boolean getAllDeadToAlive() {
        return this.AllDeadToAlive;
    }

    /**
     * Set Whether "All Dead, All Alive" is supported.
     * @param AllDeadToAlive Whether "All Dead, All Alive" is supported.
     */
    public void setAllDeadToAlive(Boolean AllDeadToAlive) {
        this.AllDeadToAlive = AllDeadToAlive;
    }

    /**
     * Get  
     * @return RescheduleUnbindRs 
     */
    public Boolean getRescheduleUnbindRs() {
        return this.RescheduleUnbindRs;
    }

    /**
     * Set 
     * @param RescheduleUnbindRs 
     */
    public void setRescheduleUnbindRs(Boolean RescheduleUnbindRs) {
        this.RescheduleUnbindRs = RescheduleUnbindRs;
    }

    /**
     * Get  
     * @return RescheduleUnbindRsStartTime 
     */
    public Long getRescheduleUnbindRsStartTime() {
        return this.RescheduleUnbindRsStartTime;
    }

    /**
     * Set 
     * @param RescheduleUnbindRsStartTime 
     */
    public void setRescheduleUnbindRsStartTime(Long RescheduleUnbindRsStartTime) {
        this.RescheduleUnbindRsStartTime = RescheduleUnbindRsStartTime;
    }

    /**
     * Get  
     * @return RescheduleUnhealthy 
     */
    public Boolean getRescheduleUnhealthy() {
        return this.RescheduleUnhealthy;
    }

    /**
     * Set 
     * @param RescheduleUnhealthy 
     */
    public void setRescheduleUnhealthy(Boolean RescheduleUnhealthy) {
        this.RescheduleUnhealthy = RescheduleUnhealthy;
    }

    /**
     * Get  
     * @return RescheduleUnhealthyStartTime 
     */
    public Long getRescheduleUnhealthyStartTime() {
        return this.RescheduleUnhealthyStartTime;
    }

    /**
     * Set 
     * @param RescheduleUnhealthyStartTime 
     */
    public void setRescheduleUnhealthyStartTime(Long RescheduleUnhealthyStartTime) {
        this.RescheduleUnhealthyStartTime = RescheduleUnhealthyStartTime;
    }

    public ModifyTargetGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTargetGroupAttributeRequest(ModifyTargetGroupAttributeRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.AllDeadToAlive != null) {
            this.AllDeadToAlive = new Boolean(source.AllDeadToAlive);
        }
        if (source.RescheduleUnbindRs != null) {
            this.RescheduleUnbindRs = new Boolean(source.RescheduleUnbindRs);
        }
        if (source.RescheduleUnbindRsStartTime != null) {
            this.RescheduleUnbindRsStartTime = new Long(source.RescheduleUnbindRsStartTime);
        }
        if (source.RescheduleUnhealthy != null) {
            this.RescheduleUnhealthy = new Boolean(source.RescheduleUnhealthy);
        }
        if (source.RescheduleUnhealthyStartTime != null) {
            this.RescheduleUnhealthyStartTime = new Long(source.RescheduleUnhealthyStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "AllDeadToAlive", this.AllDeadToAlive);
        this.setParamSimple(map, prefix + "RescheduleUnbindRs", this.RescheduleUnbindRs);
        this.setParamSimple(map, prefix + "RescheduleUnbindRsStartTime", this.RescheduleUnbindRsStartTime);
        this.setParamSimple(map, prefix + "RescheduleUnhealthy", this.RescheduleUnhealthy);
        this.setParamSimple(map, prefix + "RescheduleUnhealthyStartTime", this.RescheduleUnhealthyStartTime);

    }
}

