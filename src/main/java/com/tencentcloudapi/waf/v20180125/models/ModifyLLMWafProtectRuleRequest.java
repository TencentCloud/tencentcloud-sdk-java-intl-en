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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLLMWafProtectRuleRequest extends AbstractModel {

    /**
    * <p>Service ID.</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>List of rule IDs to modify.</p>
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

    /**
    * <p>Rule action.</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>Switch.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Detection direction: 1 indicates inbound, 2 indicates outbound, and 3 indicates both inbound and outbound.</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get <p>Service ID.</p> 
     * @return ServiceId <p>Service ID.</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>Service ID.</p>
     * @param ServiceId <p>Service ID.</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>List of rule IDs to modify.</p> 
     * @return RuleIds <p>List of rule IDs to modify.</p>
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set <p>List of rule IDs to modify.</p>
     * @param RuleIds <p>List of rule IDs to modify.</p>
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get <p>Rule action.</p> 
     * @return RuleAction <p>Rule action.</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>Rule action.</p>
     * @param RuleAction <p>Rule action.</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>Switch.</p> 
     * @return Status <p>Switch.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Switch.</p>
     * @param Status <p>Switch.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Detection direction: 1 indicates inbound, 2 indicates outbound, and 3 indicates both inbound and outbound.</p> 
     * @return Direction <p>Detection direction: 1 indicates inbound, 2 indicates outbound, and 3 indicates both inbound and outbound.</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>Detection direction: 1 indicates inbound, 2 indicates outbound, and 3 indicates both inbound and outbound.</p>
     * @param Direction <p>Detection direction: 1 indicates inbound, 2 indicates outbound, and 3 indicates both inbound and outbound.</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public ModifyLLMWafProtectRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLLMWafProtectRuleRequest(ModifyLLMWafProtectRuleRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

