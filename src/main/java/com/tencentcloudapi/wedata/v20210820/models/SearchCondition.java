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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchCondition extends AbstractModel {

    /**
    * Query Framework, Required
    */
    @SerializedName("Instance")
    @Expose
    private SearchConditionInstanceNew Instance;

    /**
    * Query Keyword (Task ID exact match, Task Name fuzzy match), Optional
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Sorting Order (asc, desc)
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp)
    */
    @SerializedName("SortCol")
    @Expose
    private String SortCol;

    /**
     * Get Query Framework, Required 
     * @return Instance Query Framework, Required
     */
    public SearchConditionInstanceNew getInstance() {
        return this.Instance;
    }

    /**
     * Set Query Framework, Required
     * @param Instance Query Framework, Required
     */
    public void setInstance(SearchConditionInstanceNew Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Query Keyword (Task ID exact match, Task Name fuzzy match), Optional 
     * @return Keyword Query Keyword (Task ID exact match, Task Name fuzzy match), Optional
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Query Keyword (Task ID exact match, Task Name fuzzy match), Optional
     * @param Keyword Query Keyword (Task ID exact match, Task Name fuzzy match), Optional
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Sorting Order (asc, desc) 
     * @return Sort Sorting Order (asc, desc)
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting Order (asc, desc)
     * @param Sort Sorting Order (asc, desc)
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp) 
     * @return SortCol Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp)
     */
    public String getSortCol() {
        return this.SortCol;
    }

    /**
     * Set Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp)
     * @param SortCol Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp)
     */
    public void setSortCol(String SortCol) {
        this.SortCol = SortCol;
    }

    public SearchCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchCondition(SearchCondition source) {
        if (source.Instance != null) {
            this.Instance = new SearchConditionInstanceNew(source.Instance);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.SortCol != null) {
            this.SortCol = new String(source.SortCol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortCol", this.SortCol);

    }
}

