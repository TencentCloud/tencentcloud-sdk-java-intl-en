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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagListRequest extends AbstractModel {

    /**
    * The number of entries returned at a time. The maximum value is `1000`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Cost allocation tag key, used for fuzzy search.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Tag type, used for tag filtering. Valid values: `0` (general tags), `1` (cost allocation tags). If it is not specified, all tag keys will be queried.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Sorting order. Valid values: `asc` (ascending order), `desc` (descending order).
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get The number of entries returned at a time. The maximum value is `1000`. 
     * @return Limit The number of entries returned at a time. The maximum value is `1000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of entries returned at a time. The maximum value is `1000`.
     * @param Limit The number of entries returned at a time. The maximum value is `1000`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on. 
     * @return Offset Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on.
     * @param Offset Pagination offset. If `Offset` is `0`, it indicates the first page. When `Limit` is `100`, if `Offset` is `100`, it indicates the second page; if `Offset` is `200`, it indicates the third page, and so on.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Cost allocation tag key, used for fuzzy search. 
     * @return TagKey Cost allocation tag key, used for fuzzy search.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Cost allocation tag key, used for fuzzy search.
     * @param TagKey Cost allocation tag key, used for fuzzy search.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Tag type, used for tag filtering. Valid values: `0` (general tags), `1` (cost allocation tags). If it is not specified, all tag keys will be queried. 
     * @return Status Tag type, used for tag filtering. Valid values: `0` (general tags), `1` (cost allocation tags). If it is not specified, all tag keys will be queried.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Tag type, used for tag filtering. Valid values: `0` (general tags), `1` (cost allocation tags). If it is not specified, all tag keys will be queried.
     * @param Status Tag type, used for tag filtering. Valid values: `0` (general tags), `1` (cost allocation tags). If it is not specified, all tag keys will be queried.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Sorting order. Valid values: `asc` (ascending order), `desc` (descending order). 
     * @return OrderType Sorting order. Valid values: `asc` (ascending order), `desc` (descending order).
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorting order. Valid values: `asc` (ascending order), `desc` (descending order).
     * @param OrderType Sorting order. Valid values: `asc` (ascending order), `desc` (descending order).
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeTagListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagListRequest(DescribeTagListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

