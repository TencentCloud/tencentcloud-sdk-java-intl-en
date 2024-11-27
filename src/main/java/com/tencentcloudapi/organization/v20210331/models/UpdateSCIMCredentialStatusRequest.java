/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class UpdateSCIMCredentialStatusRequest extends AbstractModel {

    /**
    * Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * SCIM key ID, which starts with the scimcred- prefix, followed by 12 random digits/lowercase letters.
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * SCIM key status. Enabled: enabled. Disabled: disabled.
    */
    @SerializedName("NewStatus")
    @Expose
    private String NewStatus;

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
     * Get SCIM key status. Enabled: enabled. Disabled: disabled. 
     * @return NewStatus SCIM key status. Enabled: enabled. Disabled: disabled.
     */
    public String getNewStatus() {
        return this.NewStatus;
    }

    /**
     * Set SCIM key status. Enabled: enabled. Disabled: disabled.
     * @param NewStatus SCIM key status. Enabled: enabled. Disabled: disabled.
     */
    public void setNewStatus(String NewStatus) {
        this.NewStatus = NewStatus;
    }

    public UpdateSCIMCredentialStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSCIMCredentialStatusRequest(UpdateSCIMCredentialStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.NewStatus != null) {
            this.NewStatus = new String(source.NewStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "NewStatus", this.NewStatus);

    }
}

