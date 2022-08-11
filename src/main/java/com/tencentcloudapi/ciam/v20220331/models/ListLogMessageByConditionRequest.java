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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLogMessageByConditionRequest extends AbstractModel{

    /**
    * User pool ID
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
    * Start timestamp accurate to the millisecond
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Valid values of `Key`: `events`.

<li> **events** </li>	Values can be one or multiple items in ["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"].
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get User pool ID 
     * @return UserStoreId User pool ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set User pool ID
     * @param UserStoreId User pool ID
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
     * Get Start timestamp accurate to the millisecond 
     * @return StartTime Start timestamp accurate to the millisecond
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp accurate to the millisecond
     * @param StartTime Start timestamp accurate to the millisecond
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Valid values of `Key`: `events`.

<li> **events** </li>	Values can be one or multiple items in ["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"]. 
     * @return Filters Valid values of `Key`: `events`.

<li> **events** </li>	Values can be one or multiple items in ["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"].
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Valid values of `Key`: `events`.

<li> **events** </li>	Values can be one or multiple items in ["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"].
     * @param Filters Valid values of `Key`: `events`.

<li> **events** </li>	Values can be one or multiple items in ["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"].
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ListLogMessageByConditionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListLogMessageByConditionRequest(ListLogMessageByConditionRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
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
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

