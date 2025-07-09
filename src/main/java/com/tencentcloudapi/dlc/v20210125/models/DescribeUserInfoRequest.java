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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserInfoRequest extends AbstractModel {

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Type of queried information. Group: working group; DataAuth: data permission; EngineAuth: engine permission
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Filter criteria that are queried

When the type is Group, the fuzzy search is supported as the key is workgroup-name.

When the type is DataAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

data-name: fuzzy search of the database and table.

When the type is EngineAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

engine-name: fuzzy search of the database and table.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sort fields.

When the type is Group, the create-time and group-name are supported.

When the type is DataAuth, create-time is supported.

When the type is EngineAuth, create-time is supported.
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
    * Quantity of returns. It is 20 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get User ID 
     * @return UserId User ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
     * @param UserId User ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Type of queried information. Group: working group; DataAuth: data permission; EngineAuth: engine permission 
     * @return Type Type of queried information. Group: working group; DataAuth: data permission; EngineAuth: engine permission
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of queried information. Group: working group; DataAuth: data permission; EngineAuth: engine permission
     * @param Type Type of queried information. Group: working group; DataAuth: data permission; EngineAuth: engine permission
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Filter criteria that are queried

When the type is Group, the fuzzy search is supported as the key is workgroup-name.

When the type is DataAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

data-name: fuzzy search of the database and table.

When the type is EngineAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

engine-name: fuzzy search of the database and table. 
     * @return Filters Filter criteria that are queried

When the type is Group, the fuzzy search is supported as the key is workgroup-name.

When the type is DataAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

data-name: fuzzy search of the database and table.

When the type is EngineAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

engine-name: fuzzy search of the database and table.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria that are queried

When the type is Group, the fuzzy search is supported as the key is workgroup-name.

When the type is DataAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

data-name: fuzzy search of the database and table.

When the type is EngineAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

engine-name: fuzzy search of the database and table.
     * @param Filters Filter criteria that are queried

When the type is Group, the fuzzy search is supported as the key is workgroup-name.

When the type is DataAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

data-name: fuzzy search of the database and table.

When the type is EngineAuth, the keys supported are:

policy-type: types of permissions;

policy-source: data sources;

engine-name: fuzzy search of the database and table.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort fields.

When the type is Group, the create-time and group-name are supported.

When the type is DataAuth, create-time is supported.

When the type is EngineAuth, create-time is supported. 
     * @return SortBy Sort fields.

When the type is Group, the create-time and group-name are supported.

When the type is DataAuth, create-time is supported.

When the type is EngineAuth, create-time is supported.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sort fields.

When the type is Group, the create-time and group-name are supported.

When the type is DataAuth, create-time is supported.

When the type is EngineAuth, create-time is supported.
     * @param SortBy Sort fields.

When the type is Group, the create-time and group-name are supported.

When the type is DataAuth, create-time is supported.

When the type is EngineAuth, create-time is supported.
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

    public DescribeUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserInfoRequest(DescribeUserInfoRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

