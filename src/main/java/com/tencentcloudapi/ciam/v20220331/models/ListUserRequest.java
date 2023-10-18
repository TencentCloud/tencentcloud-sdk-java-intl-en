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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserRequest extends AbstractModel {

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
    * Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Whether the content is passed through
    */
    @SerializedName("Original")
    @Expose
    private Boolean Original;

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
     * Get Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID 
     * @return Filters Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID
     * @param Filters Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Whether the content is passed through 
     * @return Original Whether the content is passed through
     */
    public Boolean getOriginal() {
        return this.Original;
    }

    /**
     * Set Whether the content is passed through
     * @param Original Whether the content is passed through
     */
    public void setOriginal(Boolean Original) {
        this.Original = Original;
    }

    public ListUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserRequest(ListUserRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Original != null) {
            this.Original = new Boolean(source.Original);
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

    }
}

