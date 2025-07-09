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

public class DescribeDLCTableListRequest extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Catalog name
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Query the list's filter criteria.
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * Table type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Pagination parameters
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameters
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting fields
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Sorting rules: true for ascending order; false for descending order
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
    * Data format type: hive, iceberg, etc.
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

    /**
     * Get Database name 
     * @return DbName Database name
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
     * @param DbName Database name
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Catalog name 
     * @return Catalog Catalog name
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog name
     * @param Catalog Catalog name
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Query the list's filter criteria. 
     * @return Filters Query the list's filter criteria.
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set Query the list's filter criteria.
     * @param Filters Query the list's filter criteria.
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Table type 
     * @return Type Table type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Table type
     * @param Type Table type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Pagination parameters 
     * @return Limit Pagination parameters
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters
     * @param Limit Pagination parameters
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameters 
     * @return Offset Pagination parameters
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameters
     * @param Offset Pagination parameters
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting fields 
     * @return Sort Sorting fields
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting fields
     * @param Sort Sorting fields
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Sorting rules: true for ascending order; false for descending order 
     * @return Asc Sorting rules: true for ascending order; false for descending order
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set Sorting rules: true for ascending order; false for descending order
     * @param Asc Sorting rules: true for ascending order; false for descending order
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    /**
     * Get Data format type: hive, iceberg, etc. 
     * @return TableFormat Data format type: hive, iceberg, etc.
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set Data format type: hive, iceberg, etc.
     * @param TableFormat Data format type: hive, iceberg, etc.
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    public DescribeDLCTableListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLCTableListRequest(DescribeDLCTableListRequest source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
        if (source.TableFormat != null) {
            this.TableFormat = new String(source.TableFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamSimple(map, prefix + "TableFormat", this.TableFormat);

    }
}

