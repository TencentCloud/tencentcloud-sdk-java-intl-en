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

public class KeySandboxCredential extends AbstractModel {

    /**
    * Credential ID
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * Credential name
    */
    @SerializedName("CredentialName")
    @Expose
    private String CredentialName;

    /**
    * Credential Type
Enumeration value:
access: normal Key (Key-Value pair)
sts: STS temporary key credential
    */
    @SerializedName("CredentialType")
    @Expose
    private String CredentialType;

    /**
    * Effective machine scope
    */
    @SerializedName("CredentialEffectScope")
    @Expose
    private CredentialEffectScope CredentialEffectScope;

    /**
    * Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Credential ID 
     * @return CredentialId Credential ID
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set Credential ID
     * @param CredentialId Credential ID
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get Credential name 
     * @return CredentialName Credential name
     */
    public String getCredentialName() {
        return this.CredentialName;
    }

    /**
     * Set Credential name
     * @param CredentialName Credential name
     */
    public void setCredentialName(String CredentialName) {
        this.CredentialName = CredentialName;
    }

    /**
     * Get Credential Type
Enumeration value:
access: normal Key (Key-Value pair)
sts: STS temporary key credential 
     * @return CredentialType Credential Type
Enumeration value:
access: normal Key (Key-Value pair)
sts: STS temporary key credential
     */
    public String getCredentialType() {
        return this.CredentialType;
    }

    /**
     * Set Credential Type
Enumeration value:
access: normal Key (Key-Value pair)
sts: STS temporary key credential
     * @param CredentialType Credential Type
Enumeration value:
access: normal Key (Key-Value pair)
sts: STS temporary key credential
     */
    public void setCredentialType(String CredentialType) {
        this.CredentialType = CredentialType;
    }

    /**
     * Get Effective machine scope 
     * @return CredentialEffectScope Effective machine scope
     */
    public CredentialEffectScope getCredentialEffectScope() {
        return this.CredentialEffectScope;
    }

    /**
     * Set Effective machine scope
     * @param CredentialEffectScope Effective machine scope
     */
    public void setCredentialEffectScope(CredentialEffectScope CredentialEffectScope) {
        this.CredentialEffectScope = CredentialEffectScope;
    }

    /**
     * Get Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format). 
     * @return CreateTime Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     * @param CreateTime Creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format). 
     * @return UpdateTime Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     * @param UpdateTime Update time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public KeySandboxCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeySandboxCredential(KeySandboxCredential source) {
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.CredentialName != null) {
            this.CredentialName = new String(source.CredentialName);
        }
        if (source.CredentialType != null) {
            this.CredentialType = new String(source.CredentialType);
        }
        if (source.CredentialEffectScope != null) {
            this.CredentialEffectScope = new CredentialEffectScope(source.CredentialEffectScope);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "CredentialName", this.CredentialName);
        this.setParamSimple(map, prefix + "CredentialType", this.CredentialType);
        this.setParamObj(map, prefix + "CredentialEffectScope.", this.CredentialEffectScope);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

