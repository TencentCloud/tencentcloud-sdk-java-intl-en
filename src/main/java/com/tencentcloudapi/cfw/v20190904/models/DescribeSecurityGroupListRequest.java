/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupListRequest extends AbstractModel {

    /**
    * 0: outbound rule; 1: inbound rule
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Region code (e.g. ap-guangzhou ). All Tencent Cloud regions are supported.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Search value
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * Number of entries per page. Default: 10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Status. Null: all; '0': filter disabled rules; '1': filter enabled rules
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 0: not filter; 1: filter out normal rules to retain abnormal rules
    */
    @SerializedName("Filter")
    @Expose
    private Long Filter;

    /**
     * Get 0: outbound rule; 1: inbound rule 
     * @return Direction 0: outbound rule; 1: inbound rule
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 0: outbound rule; 1: inbound rule
     * @param Direction 0: outbound rule; 1: inbound rule
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Region code (e.g. ap-guangzhou ). All Tencent Cloud regions are supported. 
     * @return Area Region code (e.g. ap-guangzhou ). All Tencent Cloud regions are supported.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region code (e.g. ap-guangzhou ). All Tencent Cloud regions are supported.
     * @param Area Region code (e.g. ap-guangzhou ). All Tencent Cloud regions are supported.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Search value 
     * @return SearchValue Search value
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set Search value
     * @param SearchValue Search value
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get Number of entries per page. Default: 10 
     * @return Limit Number of entries per page. Default: 10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Default: 10
     * @param Limit Number of entries per page. Default: 10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default: 0 
     * @return Offset Offset. Default: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default: 0
     * @param Offset Offset. Default: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Status. Null: all; '0': filter disabled rules; '1': filter enabled rules 
     * @return Status Status. Null: all; '0': filter disabled rules; '1': filter enabled rules
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Null: all; '0': filter disabled rules; '1': filter enabled rules
     * @param Status Status. Null: all; '0': filter disabled rules; '1': filter enabled rules
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 0: not filter; 1: filter out normal rules to retain abnormal rules 
     * @return Filter 0: not filter; 1: filter out normal rules to retain abnormal rules
     */
    public Long getFilter() {
        return this.Filter;
    }

    /**
     * Set 0: not filter; 1: filter out normal rules to retain abnormal rules
     * @param Filter 0: not filter; 1: filter out normal rules to retain abnormal rules
     */
    public void setFilter(Long Filter) {
        this.Filter = Filter;
    }

    public DescribeSecurityGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupListRequest(DescribeSecurityGroupListRequest source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Filter != null) {
            this.Filter = new Long(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Filter", this.Filter);

    }
}

