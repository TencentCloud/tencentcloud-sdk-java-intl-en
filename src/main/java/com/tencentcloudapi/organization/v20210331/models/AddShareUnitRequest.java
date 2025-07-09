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

public class AddShareUnitRequest extends AbstractModel {

    /**
    * Shared unit name. It only supports combinations of uppercase and lowercase letters, digits, hyphens (-), and underscores (_), with 3 to 128 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Shared unit region. You can obtain supported shared regions through the API [DescribeShareAreas](https://intl.cloud.tencent.com/document/product/850/103050?from_cn_redirect=1).
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Shared unit description. Maximum: 128 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed. Default value: 1
    */
    @SerializedName("ShareScope")
    @Expose
    private Long ShareScope;

    /**
     * Get Shared unit name. It only supports combinations of uppercase and lowercase letters, digits, hyphens (-), and underscores (_), with 3 to 128 characters. 
     * @return Name Shared unit name. It only supports combinations of uppercase and lowercase letters, digits, hyphens (-), and underscores (_), with 3 to 128 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Shared unit name. It only supports combinations of uppercase and lowercase letters, digits, hyphens (-), and underscores (_), with 3 to 128 characters.
     * @param Name Shared unit name. It only supports combinations of uppercase and lowercase letters, digits, hyphens (-), and underscores (_), with 3 to 128 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Shared unit region. You can obtain supported shared regions through the API [DescribeShareAreas](https://intl.cloud.tencent.com/document/product/850/103050?from_cn_redirect=1). 
     * @return Area Shared unit region. You can obtain supported shared regions through the API [DescribeShareAreas](https://intl.cloud.tencent.com/document/product/850/103050?from_cn_redirect=1).
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Shared unit region. You can obtain supported shared regions through the API [DescribeShareAreas](https://intl.cloud.tencent.com/document/product/850/103050?from_cn_redirect=1).
     * @param Area Shared unit region. You can obtain supported shared regions through the API [DescribeShareAreas](https://intl.cloud.tencent.com/document/product/850/103050?from_cn_redirect=1).
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Shared unit description. Maximum: 128 characters. 
     * @return Description Shared unit description. Maximum: 128 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Shared unit description. Maximum: 128 characters.
     * @param Description Shared unit description. Maximum: 128 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed. Default value: 1 
     * @return ShareScope Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed. Default value: 1
     */
    public Long getShareScope() {
        return this.ShareScope;
    }

    /**
     * Set Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed. Default value: 1
     * @param ShareScope Sharing scope. Valid values: 1: Only sharing within a group organization is allowed; 2: Sharing with any account is allowed. Default value: 1
     */
    public void setShareScope(Long ShareScope) {
        this.ShareScope = ShareScope;
    }

    public AddShareUnitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddShareUnitRequest(AddShareUnitRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ShareScope != null) {
            this.ShareScope = new Long(source.ShareScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ShareScope", this.ShareScope);

    }
}

