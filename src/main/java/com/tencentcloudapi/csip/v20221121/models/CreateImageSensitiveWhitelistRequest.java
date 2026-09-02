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

public class CreateImageSensitiveWhitelistRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Whitelisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leak</li><li>3: credential leakage</li></ul>
    */
    @SerializedName("Behavior")
    @Expose
    private Long Behavior;

    /**
    * <p>Effective image id.</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: selected image</li><li>1: all images</li></ul>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Effective status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get <p>Whitelisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leak</li><li>3: credential leakage</li></ul> 
     * @return Behavior <p>Whitelisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leak</li><li>3: credential leakage</li></ul>
     */
    public Long getBehavior() {
        return this.Behavior;
    }

    /**
     * Set <p>Whitelisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leak</li><li>3: credential leakage</li></ul>
     * @param Behavior <p>Whitelisted sensitive information types</p><p>Enumeration values:</p><ul><li>1: root startup</li><li>2: code leak</li><li>3: credential leakage</li></ul>
     */
    public void setBehavior(Long Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get <p>Effective image id.</p> 
     * @return ImageIds <p>Effective image id.</p>
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>Effective image id.</p>
     * @param ImageIds <p>Effective image id.</p>
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: selected image</li><li>1: all images</li></ul> 
     * @return Scope <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: selected image</li><li>1: all images</li></ul>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: selected image</li><li>1: all images</li></ul>
     * @param Scope <p>Whitelist effective range</p><p>Enumeration values:</p><ul><li>0: selected image</li><li>1: all images</li></ul>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Effective status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul> 
     * @return Status <p>Effective status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Effective status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     * @param Status <p>Effective status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public CreateImageSensitiveWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageSensitiveWhitelistRequest(CreateImageSensitiveWhitelistRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Behavior != null) {
            this.Behavior = new Long(source.Behavior);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

