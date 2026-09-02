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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDspmAuditFilterStrategyRequest extends AbstractModel {

    /**
    * <p>Policy ID.</p>
    */
    @SerializedName("AuditFilterStrategyId")
    @Expose
    private Long AuditFilterStrategyId;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Policy name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Policy description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Policy rule content</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>Policy ID.</p> 
     * @return AuditFilterStrategyId <p>Policy ID.</p>
     */
    public Long getAuditFilterStrategyId() {
        return this.AuditFilterStrategyId;
    }

    /**
     * Set <p>Policy ID.</p>
     * @param AuditFilterStrategyId <p>Policy ID.</p>
     */
    public void setAuditFilterStrategyId(Long AuditFilterStrategyId) {
        this.AuditFilterStrategyId = AuditFilterStrategyId;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Policy name.</p> 
     * @return Name <p>Policy name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Policy name.</p>
     * @param Name <p>Policy name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Policy description.</p> 
     * @return Description <p>Policy description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Policy description.</p>
     * @param Description <p>Policy description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Policy rule content</p> 
     * @return Rule <p>Policy rule content</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>Policy rule content</p>
     * @param Rule <p>Policy rule content</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul> 
     * @return IsEnabled <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul>
     * @param IsEnabled <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyDspmAuditFilterStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAuditFilterStrategyRequest(ModifyDspmAuditFilterStrategyRequest source) {
        if (source.AuditFilterStrategyId != null) {
            this.AuditFilterStrategyId = new Long(source.AuditFilterStrategyId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditFilterStrategyId", this.AuditFilterStrategyId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

