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

public class DescribeShareUnitResourcesRequest extends AbstractModel {

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
    * Offset. Its value must be an integer multiple of the limit. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit. Value range: 1–50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Search keyword. Product resource ID search is supported.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Shared resource type. For supported shared resource types, see [Overview of Resource Sharing](https://intl.cloud.tencent.com/document/product/850/59489?from_cn_redirect=1).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
     * Get Offset. Its value must be an integer multiple of the limit. Default value: 0. 
     * @return Offset Offset. Its value must be an integer multiple of the limit. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Its value must be an integer multiple of the limit. Default value: 0.
     * @param Offset Offset. Its value must be an integer multiple of the limit. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit. Value range: 1–50. 
     * @return Limit Limit. Value range: 1–50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit. Value range: 1–50.
     * @param Limit Limit. Value range: 1–50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Search keyword. Product resource ID search is supported. 
     * @return SearchKey Search keyword. Product resource ID search is supported.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search keyword. Product resource ID search is supported.
     * @param SearchKey Search keyword. Product resource ID search is supported.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
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

    public DescribeShareUnitResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShareUnitResourcesRequest(DescribeShareUnitResourcesRequest source) {
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

