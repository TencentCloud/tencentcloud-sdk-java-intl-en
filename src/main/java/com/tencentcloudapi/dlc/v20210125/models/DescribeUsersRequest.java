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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsersRequest extends AbstractModel {

    /**
    * Specify the UIN of the sub-user to be queried. Users need to create it through the CreateUser API.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Quantity of returns. It is 20 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting fields, which support the following type: create-time
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Sorting methods: desc means in order; asc means in reverse order; it is asc by default.
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * Filter criteria. The following filter types are supported. User-type means the filtering is based on the types of users, and user-keyword means the filtering is based on the names of users.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Specify the UIN of the sub-user to be queried. Users need to create it through the CreateUser API. 
     * @return UserId Specify the UIN of the sub-user to be queried. Users need to create it through the CreateUser API.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Specify the UIN of the sub-user to be queried. Users need to create it through the CreateUser API.
     * @param UserId Specify the UIN of the sub-user to be queried. Users need to create it through the CreateUser API.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Offset, which is 0 by default. 
     * @return Offset Offset, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
     * @param Offset Offset, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Quantity of returns. It is 20 by default, and the maximum value is 100. 
     * @return Limit Quantity of returns. It is 20 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returns. It is 20 by default, and the maximum value is 100.
     * @param Limit Quantity of returns. It is 20 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting fields, which support the following type: create-time 
     * @return SortBy Sorting fields, which support the following type: create-time
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting fields, which support the following type: create-time
     * @param SortBy Sorting fields, which support the following type: create-time
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Sorting methods: desc means in order; asc means in reverse order; it is asc by default. 
     * @return Sorting Sorting methods: desc means in order; asc means in reverse order; it is asc by default.
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set Sorting methods: desc means in order; asc means in reverse order; it is asc by default.
     * @param Sorting Sorting methods: desc means in order; asc means in reverse order; it is asc by default.
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get Filter criteria. The following filter types are supported. User-type means the filtering is based on the types of users, and user-keyword means the filtering is based on the names of users. 
     * @return Filters Filter criteria. The following filter types are supported. User-type means the filtering is based on the types of users, and user-keyword means the filtering is based on the names of users.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The following filter types are supported. User-type means the filtering is based on the types of users, and user-keyword means the filtering is based on the names of users.
     * @param Filters Filter criteria. The following filter types are supported. User-type means the filtering is based on the types of users, and user-keyword means the filtering is based on the names of users.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsersRequest(DescribeUsersRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

