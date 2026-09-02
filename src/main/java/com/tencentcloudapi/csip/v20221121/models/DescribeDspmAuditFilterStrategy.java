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

public class DescribeDspmAuditFilterStrategy extends AbstractModel {

    /**
    * <p>Policy ID.</p>
    */
    @SerializedName("AuditFilterStrategyId")
    @Expose
    private Long AuditFilterStrategyId;

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
    * <p>Rule content</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: Disable</li><li>1: Enable</li></ul>
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
    * <p>Creation time</p><p>Parameter format: 2026-07-16T11:44:45+08</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last update time</p><p>Parameter format: 2026-07-16T11:44:45+08</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Cloud Account ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>User identity</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Account nickname</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

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
     * Get <p>Rule content</p> 
     * @return Rule <p>Rule content</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>Rule content</p>
     * @param Rule <p>Rule content</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: Disable</li><li>1: Enable</li></ul> 
     * @return IsEnabled <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: Disable</li><li>1: Enable</li></ul>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: Disable</li><li>1: Enable</li></ul>
     * @param IsEnabled <p>Whether to enable</p><p>Enumeration values:</p><ul><li>0: Disable</li><li>1: Enable</li></ul>
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

    /**
     * Get <p>Creation time</p><p>Parameter format: 2026-07-16T11:44:45+08</p> 
     * @return CreateTime <p>Creation time</p><p>Parameter format: 2026-07-16T11:44:45+08</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time</p><p>Parameter format: 2026-07-16T11:44:45+08</p>
     * @param CreateTime <p>Creation time</p><p>Parameter format: 2026-07-16T11:44:45+08</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last update time</p><p>Parameter format: 2026-07-16T11:44:45+08</p> 
     * @return ModifyTime <p>Last update time</p><p>Parameter format: 2026-07-16T11:44:45+08</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Last update time</p><p>Parameter format: 2026-07-16T11:44:45+08</p>
     * @param ModifyTime <p>Last update time</p><p>Parameter format: 2026-07-16T11:44:45+08</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Cloud Account ID</p> 
     * @return AppId <p>Cloud Account ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Cloud Account ID</p>
     * @param AppId <p>Cloud Account ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>User identity</p> 
     * @return Uin <p>User identity</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>User identity</p>
     * @param Uin <p>User identity</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Account nickname</p> 
     * @return NickName <p>Account nickname</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Account nickname</p>
     * @param NickName <p>Account nickname</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public DescribeDspmAuditFilterStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmAuditFilterStrategy(DescribeDspmAuditFilterStrategy source) {
        if (source.AuditFilterStrategyId != null) {
            this.AuditFilterStrategyId = new Long(source.AuditFilterStrategyId);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditFilterStrategyId", this.AuditFilterStrategyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);

    }
}

