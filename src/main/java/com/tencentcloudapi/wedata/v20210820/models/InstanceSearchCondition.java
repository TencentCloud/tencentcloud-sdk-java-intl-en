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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSearchCondition extends AbstractModel {

    /**
    * Task Scheduling Cycle Type
    */
    @SerializedName("CycleList")
    @Expose
    private String [] CycleList;

    /**
    * Start time
    */
    @SerializedName("DateFrom")
    @Expose
    private String DateFrom;

    /**
    * Expire Time
    */
    @SerializedName("DateTo")
    @Expose
    private String DateTo;

    /**
    * Instance Filtering Conditions
    */
    @SerializedName("Instance")
    @Expose
    private InstanceCondition Instance;

    /**
    * Fuzzy Query Keywords
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Sorting Method
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Sort Fields
    */
    @SerializedName("SortCol")
    @Expose
    private String SortCol;

    /**
    * Instance Status Type
    */
    @SerializedName("StateList")
    @Expose
    private String [] StateList;

    /**
     * Get Task Scheduling Cycle Type 
     * @return CycleList Task Scheduling Cycle Type
     */
    public String [] getCycleList() {
        return this.CycleList;
    }

    /**
     * Set Task Scheduling Cycle Type
     * @param CycleList Task Scheduling Cycle Type
     */
    public void setCycleList(String [] CycleList) {
        this.CycleList = CycleList;
    }

    /**
     * Get Start time 
     * @return DateFrom Start time
     */
    public String getDateFrom() {
        return this.DateFrom;
    }

    /**
     * Set Start time
     * @param DateFrom Start time
     */
    public void setDateFrom(String DateFrom) {
        this.DateFrom = DateFrom;
    }

    /**
     * Get Expire Time 
     * @return DateTo Expire Time
     */
    public String getDateTo() {
        return this.DateTo;
    }

    /**
     * Set Expire Time
     * @param DateTo Expire Time
     */
    public void setDateTo(String DateTo) {
        this.DateTo = DateTo;
    }

    /**
     * Get Instance Filtering Conditions 
     * @return Instance Instance Filtering Conditions
     */
    public InstanceCondition getInstance() {
        return this.Instance;
    }

    /**
     * Set Instance Filtering Conditions
     * @param Instance Instance Filtering Conditions
     */
    public void setInstance(InstanceCondition Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Fuzzy Query Keywords 
     * @return Keyword Fuzzy Query Keywords
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Fuzzy Query Keywords
     * @param Keyword Fuzzy Query Keywords
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Sorting Method 
     * @return Sort Sorting Method
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting Method
     * @param Sort Sorting Method
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Sort Fields 
     * @return SortCol Sort Fields
     */
    public String getSortCol() {
        return this.SortCol;
    }

    /**
     * Set Sort Fields
     * @param SortCol Sort Fields
     */
    public void setSortCol(String SortCol) {
        this.SortCol = SortCol;
    }

    /**
     * Get Instance Status Type 
     * @return StateList Instance Status Type
     */
    public String [] getStateList() {
        return this.StateList;
    }

    /**
     * Set Instance Status Type
     * @param StateList Instance Status Type
     */
    public void setStateList(String [] StateList) {
        this.StateList = StateList;
    }

    public InstanceSearchCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSearchCondition(InstanceSearchCondition source) {
        if (source.CycleList != null) {
            this.CycleList = new String[source.CycleList.length];
            for (int i = 0; i < source.CycleList.length; i++) {
                this.CycleList[i] = new String(source.CycleList[i]);
            }
        }
        if (source.DateFrom != null) {
            this.DateFrom = new String(source.DateFrom);
        }
        if (source.DateTo != null) {
            this.DateTo = new String(source.DateTo);
        }
        if (source.Instance != null) {
            this.Instance = new InstanceCondition(source.Instance);
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
        if (source.StateList != null) {
            this.StateList = new String[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new String(source.StateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CycleList.", this.CycleList);
        this.setParamSimple(map, prefix + "DateFrom", this.DateFrom);
        this.setParamSimple(map, prefix + "DateTo", this.DateTo);
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortCol", this.SortCol);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);

    }
}

