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

public class ImageVulWhitelist extends AbstractModel {

    /**
    * <p>Vulnerability allowlist id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>Account name of the allowlist</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>uin of the account to which the allowlist belongs</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>appid of the associated account with the allowlist</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul>
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
    * <p>Vulnerability id</p>
    */
    @SerializedName("PocId")
    @Expose
    private String PocId;

    /**
    * <p>Vulnerability allowlist name</p>
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * <p>Whitelist status</p><p>Enumeration values:</p><ul><li>0: Inactive</li><li>1: Active</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Vulnerability allowlist id</p> 
     * @return RuleId <p>Vulnerability allowlist id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Vulnerability allowlist id</p>
     * @param RuleId <p>Vulnerability allowlist id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Account name of the allowlist</p> 
     * @return OwnerAccountName <p>Account name of the allowlist</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Account name of the allowlist</p>
     * @param OwnerAccountName <p>Account name of the allowlist</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>uin of the account to which the allowlist belongs</p> 
     * @return OwnerUin <p>uin of the account to which the allowlist belongs</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>uin of the account to which the allowlist belongs</p>
     * @param OwnerUin <p>uin of the account to which the allowlist belongs</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>appid of the associated account with the allowlist</p> 
     * @return OwnerAppId <p>appid of the associated account with the allowlist</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the associated account with the allowlist</p>
     * @param OwnerAppId <p>appid of the associated account with the allowlist</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul> 
     * @return Scope <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul>
     * @param Scope <p>Whitelist scope</p><p>Enumeration values:</p><ul><li>0: Selected images</li><li>1: All images</li></ul>
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
     * Get <p>Vulnerability id</p> 
     * @return PocId <p>Vulnerability id</p>
     */
    public String getPocId() {
        return this.PocId;
    }

    /**
     * Set <p>Vulnerability id</p>
     * @param PocId <p>Vulnerability id</p>
     */
    public void setPocId(String PocId) {
        this.PocId = PocId;
    }

    /**
     * Get <p>Vulnerability allowlist name</p> 
     * @return VulName <p>Vulnerability allowlist name</p>
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>Vulnerability allowlist name</p>
     * @param VulName <p>Vulnerability allowlist name</p>
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>Whitelist status</p><p>Enumeration values:</p><ul><li>0: Inactive</li><li>1: Active</li></ul> 
     * @return Status <p>Whitelist status</p><p>Enumeration values:</p><ul><li>0: Inactive</li><li>1: Active</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Whitelist status</p><p>Enumeration values:</p><ul><li>0: Inactive</li><li>1: Active</li></ul>
     * @param Status <p>Whitelist status</p><p>Enumeration values:</p><ul><li>0: Inactive</li><li>1: Active</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public ImageVulWhitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVulWhitelist(ImageVulWhitelist source) {
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
        if (source.PocId != null) {
            this.PocId = new String(source.PocId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PocId", this.PocId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

