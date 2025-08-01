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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicy extends AbstractModel {

    /**
    * Policy index
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Long PolicyIndex;

    /**
    * Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The public network IP address of the access source
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * The version of the security policy
    */
    @SerializedName("PolicyVersion")
    @Expose
    private String PolicyVersion;

    /**
     * Get Policy index 
     * @return PolicyIndex Policy index
     */
    public Long getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * Set Policy index
     * @param PolicyIndex Policy index
     */
    public void setPolicyIndex(Long PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * Get Remarks 
     * @return Description Remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks
     * @param Description Remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The public network IP address of the access source 
     * @return CidrBlock The public network IP address of the access source
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set The public network IP address of the access source
     * @param CidrBlock The public network IP address of the access source
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get The version of the security policy 
     * @return PolicyVersion The version of the security policy
     */
    public String getPolicyVersion() {
        return this.PolicyVersion;
    }

    /**
     * Set The version of the security policy
     * @param PolicyVersion The version of the security policy
     */
    public void setPolicyVersion(String PolicyVersion) {
        this.PolicyVersion = PolicyVersion;
    }

    public SecurityPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicy(SecurityPolicy source) {
        if (source.PolicyIndex != null) {
            this.PolicyIndex = new Long(source.PolicyIndex);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.PolicyVersion != null) {
            this.PolicyVersion = new String(source.PolicyVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyIndex", this.PolicyIndex);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "PolicyVersion", this.PolicyVersion);

    }
}

