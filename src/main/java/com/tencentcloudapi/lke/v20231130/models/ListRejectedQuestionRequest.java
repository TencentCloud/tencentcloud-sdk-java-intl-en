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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRejectedQuestionRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Page number.


    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page.

    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Query content.

    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>Filter Conditions:<br>Effective: EnableScope: 1,2,3,4</p>
    */
    @SerializedName("Filters")
    @Expose
    private FilterItem [] Filters;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Page number.

 
     * @return PageNumber Page number.


     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number.


     * @param PageNumber Page number.


     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page.
 
     * @return PageSize Number of items per page.

     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page.

     * @param PageSize Number of items per page.

     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Query content.
 
     * @return Query Query content.

     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query content.

     * @param Query Query content.

     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>Filter Conditions:<br>Effective: EnableScope: 1,2,3,4</p> 
     * @return Filters <p>Filter Conditions:<br>Effective: EnableScope: 1,2,3,4</p>
     */
    public FilterItem [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter Conditions:<br>Effective: EnableScope: 1,2,3,4</p>
     * @param Filters <p>Filter Conditions:<br>Effective: EnableScope: 1,2,3,4</p>
     */
    public void setFilters(FilterItem [] Filters) {
        this.Filters = Filters;
    }

    public ListRejectedQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRejectedQuestionRequest(ListRejectedQuestionRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Filters != null) {
            this.Filters = new FilterItem[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FilterItem(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

