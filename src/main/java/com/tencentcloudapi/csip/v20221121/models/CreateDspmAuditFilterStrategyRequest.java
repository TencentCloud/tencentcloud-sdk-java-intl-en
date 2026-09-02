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

public class CreateDspmAuditFilterStrategyRequest extends AbstractModel {

    /**
    * <p>Policy name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Rule content</p><p>Parameter format: json</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>Whether to enable</p><p>Enumeration values:</p><ul><li>1: enable</li><li>0: disable</li></ul>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>Policy description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

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
     * Get <p>Rule content</p><p>Parameter format: json</p> 
     * @return Rule <p>Rule content</p><p>Parameter format: json</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>Rule content</p><p>Parameter format: json</p>
     * @param Rule <p>Rule content</p><p>Parameter format: json</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>Whether to enable</p><p>Enumeration values:</p><ul><li>1: enable</li><li>0: disable</li></ul> 
     * @return IsEnabled <p>Whether to enable</p><p>Enumeration values:</p><ul><li>1: enable</li><li>0: disable</li></ul>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>Whether to enable</p><p>Enumeration values:</p><ul><li>1: enable</li><li>0: disable</li></ul>
     * @param IsEnabled <p>Whether to enable</p><p>Enumeration values:</p><ul><li>1: enable</li><li>0: disable</li></ul>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
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

    public CreateDspmAuditFilterStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmAuditFilterStrategyRequest(CreateDspmAuditFilterStrategyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

