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

public class DescribeSecurityGroupPolicyRequest extends AbstractModel {

    /**
    * Cloud service provider
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * Asset ID.
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Group account member id.</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupID")
    @Expose
    private String SecurityGroupID;

    /**
     * Get Cloud service provider 
     * @return Provider Cloud service provider
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set Cloud service provider
     * @param Provider Cloud service provider
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get Asset ID. 
     * @return AssetID Asset ID.
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set Asset ID.
     * @param AssetID Asset ID.
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Group account member id.</p> 
     * @return MemberId <p>Group account member id.</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id.</p>
     * @param MemberId <p>Group account member id.</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Security group ID 
     * @return SecurityGroupID Security group ID
     */
    public String getSecurityGroupID() {
        return this.SecurityGroupID;
    }

    /**
     * Set Security group ID
     * @param SecurityGroupID Security group ID
     */
    public void setSecurityGroupID(String SecurityGroupID) {
        this.SecurityGroupID = SecurityGroupID;
    }

    public DescribeSecurityGroupPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupPolicyRequest(DescribeSecurityGroupPolicyRequest source) {
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.SecurityGroupID != null) {
            this.SecurityGroupID = new String(source.SecurityGroupID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "SecurityGroupID", this.SecurityGroupID);

    }
}

