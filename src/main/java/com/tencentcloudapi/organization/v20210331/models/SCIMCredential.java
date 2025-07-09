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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SCIMCredential extends AbstractModel {

    /**
    * Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * SCIM key status. Enabled: enabled. Disabled: disabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * SCIM key ID, which starts with the scimcred- prefix, followed by 12 random digits/lowercase letters.
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * SCIM key type.
    */
    @SerializedName("CredentialType")
    @Expose
    private String CredentialType;

    /**
    * Creation time of a SCIM key.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Expiration time of a SCIM key.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters. 
     * @return ZoneId Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
     * @param ZoneId Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get SCIM key status. Enabled: enabled. Disabled: disabled. 
     * @return Status SCIM key status. Enabled: enabled. Disabled: disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set SCIM key status. Enabled: enabled. Disabled: disabled.
     * @param Status SCIM key status. Enabled: enabled. Disabled: disabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get SCIM key ID, which starts with the scimcred- prefix, followed by 12 random digits/lowercase letters. 
     * @return CredentialId SCIM key ID, which starts with the scimcred- prefix, followed by 12 random digits/lowercase letters.
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set SCIM key ID, which starts with the scimcred- prefix, followed by 12 random digits/lowercase letters.
     * @param CredentialId SCIM key ID, which starts with the scimcred- prefix, followed by 12 random digits/lowercase letters.
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get SCIM key type. 
     * @return CredentialType SCIM key type.
     */
    public String getCredentialType() {
        return this.CredentialType;
    }

    /**
     * Set SCIM key type.
     * @param CredentialType SCIM key type.
     */
    public void setCredentialType(String CredentialType) {
        this.CredentialType = CredentialType;
    }

    /**
     * Get Creation time of a SCIM key. 
     * @return CreateTime Creation time of a SCIM key.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of a SCIM key.
     * @param CreateTime Creation time of a SCIM key.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Expiration time of a SCIM key. 
     * @return ExpireTime Expiration time of a SCIM key.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of a SCIM key.
     * @param ExpireTime Expiration time of a SCIM key.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public SCIMCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCIMCredential(SCIMCredential source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.CredentialType != null) {
            this.CredentialType = new String(source.CredentialType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "CredentialType", this.CredentialType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

