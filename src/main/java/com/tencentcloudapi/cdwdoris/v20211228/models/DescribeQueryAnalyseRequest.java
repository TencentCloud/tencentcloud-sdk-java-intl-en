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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQueryAnalyseRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * Start time of operation period
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of operation period.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * SQL fragments (fuzzy query supported)
    */
    @SerializedName("SQLFragment")
    @Expose
    private String SQLFragment;

    /**
    * Catalog filter condition
    */
    @SerializedName("CatalogFilter")
    @Expose
    private String CatalogFilter;

    /**
    * Database name filter condition
    */
    @SerializedName("DatabaseFilter")
    @Expose
    private String DatabaseFilter;

    /**
    * SQL type filter criteria
    */
    @SerializedName("SQLTypeFilter")
    @Expose
    private String SQLTypeFilter;

    /**
    * Sorting field
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * Sorting order: asc (ascending) or desc (descending)
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * Minimum query execution time, in milliseconds.
    */
    @SerializedName("QueryTime")
    @Expose
    private Long QueryTime;

    /**
    * Page number, defaults to 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of records per page, defaults to 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get Start time of operation period 
     * @return StartTime Start time of operation period
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of operation period
     * @param StartTime Start time of operation period
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of operation period. 
     * @return EndTime End time of operation period.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of operation period.
     * @param EndTime End time of operation period.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get SQL fragments (fuzzy query supported) 
     * @return SQLFragment SQL fragments (fuzzy query supported)
     */
    public String getSQLFragment() {
        return this.SQLFragment;
    }

    /**
     * Set SQL fragments (fuzzy query supported)
     * @param SQLFragment SQL fragments (fuzzy query supported)
     */
    public void setSQLFragment(String SQLFragment) {
        this.SQLFragment = SQLFragment;
    }

    /**
     * Get Catalog filter condition 
     * @return CatalogFilter Catalog filter condition
     */
    public String getCatalogFilter() {
        return this.CatalogFilter;
    }

    /**
     * Set Catalog filter condition
     * @param CatalogFilter Catalog filter condition
     */
    public void setCatalogFilter(String CatalogFilter) {
        this.CatalogFilter = CatalogFilter;
    }

    /**
     * Get Database name filter condition 
     * @return DatabaseFilter Database name filter condition
     */
    public String getDatabaseFilter() {
        return this.DatabaseFilter;
    }

    /**
     * Set Database name filter condition
     * @param DatabaseFilter Database name filter condition
     */
    public void setDatabaseFilter(String DatabaseFilter) {
        this.DatabaseFilter = DatabaseFilter;
    }

    /**
     * Get SQL type filter criteria 
     * @return SQLTypeFilter SQL type filter criteria
     */
    public String getSQLTypeFilter() {
        return this.SQLTypeFilter;
    }

    /**
     * Set SQL type filter criteria
     * @param SQLTypeFilter SQL type filter criteria
     */
    public void setSQLTypeFilter(String SQLTypeFilter) {
        this.SQLTypeFilter = SQLTypeFilter;
    }

    /**
     * Get Sorting field 
     * @return SortField Sorting field
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set Sorting field
     * @param SortField Sorting field
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get Sorting order: asc (ascending) or desc (descending) 
     * @return SortOrder Sorting order: asc (ascending) or desc (descending)
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set Sorting order: asc (ascending) or desc (descending)
     * @param SortOrder Sorting order: asc (ascending) or desc (descending)
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get Minimum query execution time, in milliseconds. 
     * @return QueryTime Minimum query execution time, in milliseconds.
     */
    public Long getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Minimum query execution time, in milliseconds.
     * @param QueryTime Minimum query execution time, in milliseconds.
     */
    public void setQueryTime(Long QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get Page number, defaults to 1. 
     * @return PageNum Page number, defaults to 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number, defaults to 1.
     * @param PageNum Page number, defaults to 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of records per page, defaults to 10. 
     * @return PageSize Number of records per page, defaults to 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of records per page, defaults to 10.
     * @param PageSize Number of records per page, defaults to 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeQueryAnalyseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQueryAnalyseRequest(DescribeQueryAnalyseRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SQLFragment != null) {
            this.SQLFragment = new String(source.SQLFragment);
        }
        if (source.CatalogFilter != null) {
            this.CatalogFilter = new String(source.CatalogFilter);
        }
        if (source.DatabaseFilter != null) {
            this.DatabaseFilter = new String(source.DatabaseFilter);
        }
        if (source.SQLTypeFilter != null) {
            this.SQLTypeFilter = new String(source.SQLTypeFilter);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Long(source.QueryTime);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SQLFragment", this.SQLFragment);
        this.setParamSimple(map, prefix + "CatalogFilter", this.CatalogFilter);
        this.setParamSimple(map, prefix + "DatabaseFilter", this.DatabaseFilter);
        this.setParamSimple(map, prefix + "SQLTypeFilter", this.SQLTypeFilter);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

