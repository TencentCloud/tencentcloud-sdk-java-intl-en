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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePolicyVersionRequest extends AbstractModel {

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * The policy document to use as the content for the new version
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * Specifies whether to set this version as the default version
    */
    @SerializedName("SetAsDefault")
    @Expose
    private Boolean SetAsDefault;

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get The policy document to use as the content for the new version 
     * @return PolicyDocument The policy document to use as the content for the new version
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set The policy document to use as the content for the new version
     * @param PolicyDocument The policy document to use as the content for the new version
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get Specifies whether to set this version as the default version 
     * @return SetAsDefault Specifies whether to set this version as the default version
     */
    public Boolean getSetAsDefault() {
        return this.SetAsDefault;
    }

    /**
     * Set Specifies whether to set this version as the default version
     * @param SetAsDefault Specifies whether to set this version as the default version
     */
    public void setSetAsDefault(Boolean SetAsDefault) {
        this.SetAsDefault = SetAsDefault;
    }

    public CreatePolicyVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePolicyVersionRequest(CreatePolicyVersionRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyDocument != null) {
            this.PolicyDocument = new String(source.PolicyDocument);
        }
        if (source.SetAsDefault != null) {
            this.SetAsDefault = new Boolean(source.SetAsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "SetAsDefault", this.SetAsDefault);

    }
}

