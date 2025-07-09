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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserRequest extends AbstractModel {

    /**
    * User directory ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * Pagination data
    */
    @SerializedName("Pageable")
    @Expose
    private Pageable Pageable;

    /**
    * Query condition (`propertycode` and `propertykey`)
    */
    @SerializedName("Filters")
    @Expose
    private QueryUserFilter [] Filters;

    /**
    * Whether the plaintext is returned
    */
    @SerializedName("Original")
    @Expose
    private Boolean Original;

    /**
    * Sorting configuration
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
     * Get User directory ID 
     * @return UserStoreId User directory ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set User directory ID
     * @param UserStoreId User directory ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get Pagination data 
     * @return Pageable Pagination data
     */
    public Pageable getPageable() {
        return this.Pageable;
    }

    /**
     * Set Pagination data
     * @param Pageable Pagination data
     */
    public void setPageable(Pageable Pageable) {
        this.Pageable = Pageable;
    }

    /**
     * Get Query condition (`propertycode` and `propertykey`) 
     * @return Filters Query condition (`propertycode` and `propertykey`)
     */
    public QueryUserFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query condition (`propertycode` and `propertykey`)
     * @param Filters Query condition (`propertycode` and `propertykey`)
     */
    public void setFilters(QueryUserFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Whether the plaintext is returned 
     * @return Original Whether the plaintext is returned
     */
    public Boolean getOriginal() {
        return this.Original;
    }

    /**
     * Set Whether the plaintext is returned
     * @param Original Whether the plaintext is returned
     */
    public void setOriginal(Boolean Original) {
        this.Original = Original;
    }

    /**
     * Get Sorting configuration 
     * @return Sort Sorting configuration
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting configuration
     * @param Sort Sorting configuration
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    public DescribeUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRequest(DescribeUserRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.Filters != null) {
            this.Filters = new QueryUserFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryUserFilter(source.Filters[i]);
            }
        }
        if (source.Original != null) {
            this.Original = new Boolean(source.Original);
        }
        if (source.Sort != null) {
            this.Sort = new Sort(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Original", this.Original);
        this.setParamObj(map, prefix + "Sort.", this.Sort);

    }
}

