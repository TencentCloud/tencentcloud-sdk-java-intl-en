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

public class AddOrganizationRequest extends AbstractModel {

    /**
    * Organization name. Only Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Organization parent node ID (obtain from the DescribeOrganization API; enter 0 for the root organization)
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
     * Get Organization name. Only Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique. 
     * @return Name Organization name. Only Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Organization name. Only Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique.
     * @param Name Organization name. Only Chinese, English, digits, spaces, Chinese and English parentheses, underscores (_), and hyphens (-) are supported. The length cannot exceed 64 characters, and the organization name must be unique.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Organization parent node ID (obtain from the DescribeOrganization API; enter 0 for the root organization) 
     * @return ParentId Organization parent node ID (obtain from the DescribeOrganization API; enter 0 for the root organization)
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Organization parent node ID (obtain from the DescribeOrganization API; enter 0 for the root organization)
     * @param ParentId Organization parent node ID (obtain from the DescribeOrganization API; enter 0 for the root organization)
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    public AddOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOrganizationRequest(AddOrganizationRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

