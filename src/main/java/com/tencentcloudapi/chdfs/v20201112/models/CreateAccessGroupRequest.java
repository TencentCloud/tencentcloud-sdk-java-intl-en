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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccessGroupRequest extends AbstractModel {

    /**
    * Permission group name
    */
    @SerializedName("AccessGroupName")
    @Expose
    private String AccessGroupName;

    /**
    * VPC type (1: CVM; 2: BM 1.0)
    */
    @SerializedName("VpcType")
    @Expose
    private Long VpcType;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Permission group description, which is an empty string by default
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Permission group name 
     * @return AccessGroupName Permission group name
     */
    public String getAccessGroupName() {
        return this.AccessGroupName;
    }

    /**
     * Set Permission group name
     * @param AccessGroupName Permission group name
     */
    public void setAccessGroupName(String AccessGroupName) {
        this.AccessGroupName = AccessGroupName;
    }

    /**
     * Get VPC type (1: CVM; 2: BM 1.0) 
     * @return VpcType VPC type (1: CVM; 2: BM 1.0)
     */
    public Long getVpcType() {
        return this.VpcType;
    }

    /**
     * Set VPC type (1: CVM; 2: BM 1.0)
     * @param VpcType VPC type (1: CVM; 2: BM 1.0)
     */
    public void setVpcType(Long VpcType) {
        this.VpcType = VpcType;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Permission group description, which is an empty string by default 
     * @return Description Permission group description, which is an empty string by default
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Permission group description, which is an empty string by default
     * @param Description Permission group description, which is an empty string by default
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateAccessGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccessGroupRequest(CreateAccessGroupRequest source) {
        if (source.AccessGroupName != null) {
            this.AccessGroupName = new String(source.AccessGroupName);
        }
        if (source.VpcType != null) {
            this.VpcType = new Long(source.VpcType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessGroupName", this.AccessGroupName);
        this.setParamSimple(map, prefix + "VpcType", this.VpcType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

