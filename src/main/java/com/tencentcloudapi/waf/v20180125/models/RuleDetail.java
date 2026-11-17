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

public class RuleDetail extends AbstractModel {

    /**
    * <p>Rule ID.</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>rule name</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Severity.</p>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * <p>Action.</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Switch.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Desensitization example.</p>
    */
    @SerializedName("DesensitizeSample")
    @Expose
    private String DesensitizeSample;

    /**
    * <p>Detection direction.</p><p>Value range: [0, 3].</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>Rule modification time (second-level timestamp): The last time the tenant modified this rule. If it has never been modified, the value is 0.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>Rule ID.</p> 
     * @return RuleId <p>Rule ID.</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Rule ID.</p>
     * @param RuleId <p>Rule ID.</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>rule name</p> 
     * @return RuleName <p>rule name</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>rule name</p>
     * @param RuleName <p>rule name</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Severity.</p> 
     * @return Severity <p>Severity.</p>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>Severity.</p>
     * @param Severity <p>Severity.</p>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>Action.</p> 
     * @return Action <p>Action.</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Action.</p>
     * @param Action <p>Action.</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
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
     * Get <p>Desensitization example.</p> 
     * @return DesensitizeSample <p>Desensitization example.</p>
     */
    public String getDesensitizeSample() {
        return this.DesensitizeSample;
    }

    /**
     * Set <p>Desensitization example.</p>
     * @param DesensitizeSample <p>Desensitization example.</p>
     */
    public void setDesensitizeSample(String DesensitizeSample) {
        this.DesensitizeSample = DesensitizeSample;
    }

    /**
     * Get <p>Detection direction.</p><p>Value range: [0, 3].</p> 
     * @return Direction <p>Detection direction.</p><p>Value range: [0, 3].</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>Detection direction.</p><p>Value range: [0, 3].</p>
     * @param Direction <p>Detection direction.</p><p>Value range: [0, 3].</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>Rule modification time (second-level timestamp): The last time the tenant modified this rule. If it has never been modified, the value is 0.</p> 
     * @return UpdateTime <p>Rule modification time (second-level timestamp): The last time the tenant modified this rule. If it has never been modified, the value is 0.</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Rule modification time (second-level timestamp): The last time the tenant modified this rule. If it has never been modified, the value is 0.</p>
     * @param UpdateTime <p>Rule modification time (second-level timestamp): The last time the tenant modified this rule. If it has never been modified, the value is 0.</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleDetail(RuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DesensitizeSample != null) {
            this.DesensitizeSample = new String(source.DesensitizeSample);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DesensitizeSample", this.DesensitizeSample);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

