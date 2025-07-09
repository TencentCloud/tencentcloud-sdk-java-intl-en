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

public class AddShareUnitResourcesRequest extends AbstractModel {

    /**
    * Shared unit ID.
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * Shared unit region.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Shared resource type. For supported shared resource types, see [Overview of Resource Sharing](https://intl.cloud.tencent.com/document/product/850/59489?from_cn_redirect=1).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Shared resource list. Maximum: 10.
    */
    @SerializedName("Resources")
    @Expose
    private ProductResource [] Resources;

    /**
     * Get Shared unit ID. 
     * @return UnitId Shared unit ID.
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set Shared unit ID.
     * @param UnitId Shared unit ID.
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get Shared unit region. 
     * @return Area Shared unit region.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Shared unit region.
     * @param Area Shared unit region.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Shared resource type. For supported shared resource types, see [Overview of Resource Sharing](https://intl.cloud.tencent.com/document/product/850/59489?from_cn_redirect=1). 
     * @return Type Shared resource type. For supported shared resource types, see [Overview of Resource Sharing](https://intl.cloud.tencent.com/document/product/850/59489?from_cn_redirect=1).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Shared resource type. For supported shared resource types, see [Overview of Resource Sharing](https://intl.cloud.tencent.com/document/product/850/59489?from_cn_redirect=1).
     * @param Type Shared resource type. For supported shared resource types, see [Overview of Resource Sharing](https://intl.cloud.tencent.com/document/product/850/59489?from_cn_redirect=1).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Shared resource list. Maximum: 10. 
     * @return Resources Shared resource list. Maximum: 10.
     */
    public ProductResource [] getResources() {
        return this.Resources;
    }

    /**
     * Set Shared resource list. Maximum: 10.
     * @param Resources Shared resource list. Maximum: 10.
     */
    public void setResources(ProductResource [] Resources) {
        this.Resources = Resources;
    }

    public AddShareUnitResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddShareUnitResourcesRequest(AddShareUnitResourcesRequest source) {
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Resources != null) {
            this.Resources = new ProductResource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ProductResource(source.Resources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);

    }
}

