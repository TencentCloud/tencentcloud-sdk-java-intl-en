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

public class DescribeTablesNameRequest extends AbstractModel {

    /**
    * List all the data tables in the database.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Quantity of returns. It is 10 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset. It starts from 0 and is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criteria. The following filter types are supported. The Name should be one of them.
Table-name - String - (filter criteria) data table name, such as table-001.
table-id - String - (filter criteria) table id, such as 12342.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Specified data source name to be queried, and it is DataLakeCatalog by default.
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * Start time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Sorting fields, and they support CreateTime (creation time), UpdateTime (update time), StorageSize (storage space), RecordCount (number of rows), and Name (table name) (The ascending order according to names will be adopted if it is not passed).
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Sorting fields, and false means the descending order (by default) while true means the ascending order.
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
    * Table type, query of the table type, and the available value is EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * Filter fields - table format: If no criteria are specified, all the items will be checked; LAKEFS: managed table; ICEBERG: non-managed iceberg table; HIVE: non-managed hive table; OTHER: other non-managed tables.
    */
    @SerializedName("TableFormat")
    @Expose
    private String TableFormat;

    /**
     * Get List all the data tables in the database. 
     * @return DatabaseName List all the data tables in the database.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set List all the data tables in the database.
     * @param DatabaseName List all the data tables in the database.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Quantity of returns. It is 10 by default, and the maximum value is 100. 
     * @return Limit Quantity of returns. It is 10 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returns. It is 10 by default, and the maximum value is 100.
     * @param Limit Quantity of returns. It is 10 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data offset. It starts from 0 and is 0 by default. 
     * @return Offset Data offset. It starts from 0 and is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. It starts from 0 and is 0 by default.
     * @param Offset Data offset. It starts from 0 and is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter criteria. The following filter types are supported. The Name should be one of them.
Table-name - String - (filter criteria) data table name, such as table-001.
table-id - String - (filter criteria) table id, such as 12342. 
     * @return Filters Filter criteria. The following filter types are supported. The Name should be one of them.
Table-name - String - (filter criteria) data table name, such as table-001.
table-id - String - (filter criteria) table id, such as 12342.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The following filter types are supported. The Name should be one of them.
Table-name - String - (filter criteria) data table name, such as table-001.
table-id - String - (filter criteria) table id, such as 12342.
     * @param Filters Filter criteria. The following filter types are supported. The Name should be one of them.
Table-name - String - (filter criteria) data table name, such as table-001.
table-id - String - (filter criteria) table id, such as 12342.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Specified data source name to be queried, and it is DataLakeCatalog by default. 
     * @return DatasourceConnectionName Specified data source name to be queried, and it is DataLakeCatalog by default.
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set Specified data source name to be queried, and it is DataLakeCatalog by default.
     * @param DatasourceConnectionName Specified data source name to be queried, and it is DataLakeCatalog by default.
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get Start time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS. 
     * @return StartTime Start time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS.
     * @param StartTime Start time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS. 
     * @return EndTime End time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS.
     * @param EndTime End time: It is used to filter the update time, and the format is yyyy-mm-dd HH:MM:SS.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Sorting fields, and they support CreateTime (creation time), UpdateTime (update time), StorageSize (storage space), RecordCount (number of rows), and Name (table name) (The ascending order according to names will be adopted if it is not passed). 
     * @return Sort Sorting fields, and they support CreateTime (creation time), UpdateTime (update time), StorageSize (storage space), RecordCount (number of rows), and Name (table name) (The ascending order according to names will be adopted if it is not passed).
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting fields, and they support CreateTime (creation time), UpdateTime (update time), StorageSize (storage space), RecordCount (number of rows), and Name (table name) (The ascending order according to names will be adopted if it is not passed).
     * @param Sort Sorting fields, and they support CreateTime (creation time), UpdateTime (update time), StorageSize (storage space), RecordCount (number of rows), and Name (table name) (The ascending order according to names will be adopted if it is not passed).
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Sorting fields, and false means the descending order (by default) while true means the ascending order. 
     * @return Asc Sorting fields, and false means the descending order (by default) while true means the ascending order.
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set Sorting fields, and false means the descending order (by default) while true means the ascending order.
     * @param Asc Sorting fields, and false means the descending order (by default) while true means the ascending order.
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    /**
     * Get Table type, query of the table type, and the available value is EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW 
     * @return TableType Table type, query of the table type, and the available value is EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table type, query of the table type, and the available value is EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW
     * @param TableType Table type, query of the table type, and the available value is EXTERNAL_TABLE,INDEX_TABLE,MANAGED_TABLE,MATERIALIZED_VIEW,TABLE,VIEW,VIRTUAL_VIEW
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get Filter fields - table format: If no criteria are specified, all the items will be checked; LAKEFS: managed table; ICEBERG: non-managed iceberg table; HIVE: non-managed hive table; OTHER: other non-managed tables. 
     * @return TableFormat Filter fields - table format: If no criteria are specified, all the items will be checked; LAKEFS: managed table; ICEBERG: non-managed iceberg table; HIVE: non-managed hive table; OTHER: other non-managed tables.
     */
    public String getTableFormat() {
        return this.TableFormat;
    }

    /**
     * Set Filter fields - table format: If no criteria are specified, all the items will be checked; LAKEFS: managed table; ICEBERG: non-managed iceberg table; HIVE: non-managed hive table; OTHER: other non-managed tables.
     * @param TableFormat Filter fields - table format: If no criteria are specified, all the items will be checked; LAKEFS: managed table; ICEBERG: non-managed iceberg table; HIVE: non-managed hive table; OTHER: other non-managed tables.
     */
    public void setTableFormat(String TableFormat) {
        this.TableFormat = TableFormat;
    }

    public DescribeTablesNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTablesNameRequest(DescribeTablesNameRequest source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.TableFormat != null) {
            this.TableFormat = new String(source.TableFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "TableFormat", this.TableFormat);

    }
}

