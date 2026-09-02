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

public class ImageSensitiveWhitelist extends AbstractModel {

    /**
    * <p>Sensitive information allowlist id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>Allowlist associated account name</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>Account uin of the allowlist</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>appid of the account associated with the allowlist</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>Allowlisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leakage</li><li>3: credential leakage</li></ul>
    */
    @SerializedName("Behavior")
    @Expose
    private Long Behavior;

    /**
    * <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected image</li><li>1: All images</li></ul>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Allowlist effective mirror id</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private Long [] ImageIds;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Effective status</p><p>Enumeration values:</p><ul><li>0: allowlist ineffective</li><li>1: allowlist effective</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Sensitive information allowlist name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Sensitive information allowlist id</p> 
     * @return RuleId <p>Sensitive information allowlist id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Sensitive information allowlist id</p>
     * @param RuleId <p>Sensitive information allowlist id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Allowlist associated account name</p> 
     * @return OwnerAccountName <p>Allowlist associated account name</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Allowlist associated account name</p>
     * @param OwnerAccountName <p>Allowlist associated account name</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>Account uin of the allowlist</p> 
     * @return OwnerUin <p>Account uin of the allowlist</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>Account uin of the allowlist</p>
     * @param OwnerUin <p>Account uin of the allowlist</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>appid of the account associated with the allowlist</p> 
     * @return OwnerAppId <p>appid of the account associated with the allowlist</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the account associated with the allowlist</p>
     * @param OwnerAppId <p>appid of the account associated with the allowlist</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>Allowlisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leakage</li><li>3: credential leakage</li></ul> 
     * @return Behavior <p>Allowlisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leakage</li><li>3: credential leakage</li></ul>
     */
    public Long getBehavior() {
        return this.Behavior;
    }

    /**
     * Set <p>Allowlisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leakage</li><li>3: credential leakage</li></ul>
     * @param Behavior <p>Allowlisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leakage</li><li>3: credential leakage</li></ul>
     */
    public void setBehavior(Long Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected image</li><li>1: All images</li></ul> 
     * @return Scope <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected image</li><li>1: All images</li></ul>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected image</li><li>1: All images</li></ul>
     * @param Scope <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected image</li><li>1: All images</li></ul>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Allowlist effective mirror id</p> 
     * @return ImageIds <p>Allowlist effective mirror id</p>
     */
    public Long [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>Allowlist effective mirror id</p>
     * @param ImageIds <p>Allowlist effective mirror id</p>
     */
    public void setImageIds(Long [] ImageIds) {
        this.ImageIds = ImageIds;
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
     * Get <p>Effective status</p><p>Enumeration values:</p><ul><li>0: allowlist ineffective</li><li>1: allowlist effective</li></ul> 
     * @return Status <p>Effective status</p><p>Enumeration values:</p><ul><li>0: allowlist ineffective</li><li>1: allowlist effective</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Effective status</p><p>Enumeration values:</p><ul><li>0: allowlist ineffective</li><li>1: allowlist effective</li></ul>
     * @param Status <p>Effective status</p><p>Enumeration values:</p><ul><li>0: allowlist ineffective</li><li>1: allowlist effective</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Sensitive information allowlist name</p> 
     * @return Name <p>Sensitive information allowlist name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Sensitive information allowlist name</p>
     * @param Name <p>Sensitive information allowlist name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return UpdateTime <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param UpdateTime <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ImageSensitiveWhitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSensitiveWhitelist(ImageSensitiveWhitelist source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.Behavior != null) {
            this.Behavior = new Long(source.Behavior);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new Long[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new Long(source.ImageIds[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

