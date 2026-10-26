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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateOrganizationRequest extends AbstractModel {

    /**
    * Organization ID (obtain from the DescribeOrganization API for querying organizations)
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * Organization name. Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Organization ID (obtain from the DescribeOrganization API for querying organizations) 
     * @return OrganizationId Organization ID (obtain from the DescribeOrganization API for querying organizations)
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set Organization ID (obtain from the DescribeOrganization API for querying organizations)
     * @param OrganizationId Organization ID (obtain from the DescribeOrganization API for querying organizations)
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get Organization name. Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique. 
     * @return Name Organization name. Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Organization name. Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique.
     * @param Name Organization name. Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public UpdateOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrganizationRequest(UpdateOrganizationRequest source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

