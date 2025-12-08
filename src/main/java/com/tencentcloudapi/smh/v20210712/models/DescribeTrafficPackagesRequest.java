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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficPackagesRequest extends AbstractModel {

    /**
    * Specifies one or more resource ids for querying, with a maximum of 100 per request.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * Page number, int, used in conjunction with PageSize. default value is 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Specifies the column to sort.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Specifies the source type filter criteria.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Specifies one or more resource ids for querying, with a maximum of 100 per request. 
     * @return ResourceIds Specifies one or more resource ids for querying, with a maximum of 100 per request.
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Specifies one or more resource ids for querying, with a maximum of 100 per request.
     * @param ResourceIds Specifies one or more resource ids for querying, with a maximum of 100 per request.
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Page number, int, used in conjunction with PageSize. default value is 1. 
     * @return PageNumber Page number, int, used in conjunction with PageSize. default value is 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, int, used in conjunction with PageSize. default value is 1.
     * @param PageNumber Page number, int, used in conjunction with PageSize. default value is 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100. 
     * @return PageSize Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100.
     * @param PageSize Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Specifies the column to sort. 
     * @return OrderBy Specifies the column to sort.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Specifies the column to sort.
     * @param OrderBy Specifies the column to sort.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method. 
     * @return OrderByType Sorting method.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method.
     * @param OrderByType Sorting method.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Specifies the source type filter criteria. 
     * @return Type Specifies the source type filter criteria.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Specifies the source type filter criteria.
     * @param Type Specifies the source type filter criteria.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribeTrafficPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficPackagesRequest(DescribeTrafficPackagesRequest source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

