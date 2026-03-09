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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLineageRequest extends AbstractModel {

    /**
    * Entity unique ID.
    */
    @SerializedName("ResourceUniqueId")
    @Expose
    private String ResourceUniqueId;

    /**
    * Entity type TABLE|METRIC|MODEL|SERVICE|COLUMN.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Lineage direction INPUT｜OUTPUT.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Pagination size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Source: WEDATA|THIRD default WEDATA.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
     * Get Entity unique ID. 
     * @return ResourceUniqueId Entity unique ID.
     */
    public String getResourceUniqueId() {
        return this.ResourceUniqueId;
    }

    /**
     * Set Entity unique ID.
     * @param ResourceUniqueId Entity unique ID.
     */
    public void setResourceUniqueId(String ResourceUniqueId) {
        this.ResourceUniqueId = ResourceUniqueId;
    }

    /**
     * Get Entity type TABLE|METRIC|MODEL|SERVICE|COLUMN. 
     * @return ResourceType Entity type TABLE|METRIC|MODEL|SERVICE|COLUMN.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Entity type TABLE|METRIC|MODEL|SERVICE|COLUMN.
     * @param ResourceType Entity type TABLE|METRIC|MODEL|SERVICE|COLUMN.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Lineage direction INPUT｜OUTPUT. 
     * @return Direction Lineage direction INPUT｜OUTPUT.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Lineage direction INPUT｜OUTPUT.
     * @param Direction Lineage direction INPUT｜OUTPUT.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Page number 
     * @return PageNumber Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Pagination size. 
     * @return PageSize Pagination size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size.
     * @param PageSize Pagination size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Source: WEDATA|THIRD default WEDATA. 
     * @return Platform Source: WEDATA|THIRD default WEDATA.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Source: WEDATA|THIRD default WEDATA.
     * @param Platform Source: WEDATA|THIRD default WEDATA.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    public ListLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListLineageRequest(ListLineageRequest source) {
        if (source.ResourceUniqueId != null) {
            this.ResourceUniqueId = new String(source.ResourceUniqueId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceUniqueId", this.ResourceUniqueId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

