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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableInfoNew extends AbstractModel{

    /**
    * Table name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table instance ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * ID of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Name of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Name of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * JSON string of table's primary key field structure
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyStruct")
    @Expose
    private String KeyStruct;

    /**
    * JSON string of table non-primary key field structure
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValueStruct")
    @Expose
    private String ValueStruct;

    /**
    * Table shardkey set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShardingKeySet")
    @Expose
    private String ShardingKeySet;

    /**
    * Table index key field set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexStruct")
    @Expose
    private String IndexStruct;

    /**
    * Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListElementNum")
    @Expose
    private Long ListElementNum;

    /**
    * Information list of IDL files associated with table
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * Reserved table capacity in GB
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReservedVolume")
    @Expose
    private Long ReservedVolume;

    /**
    * Reserved table read QPS
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReservedReadQps")
    @Expose
    private Long ReservedReadQps;

    /**
    * Reserved table write QPS
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReservedWriteQps")
    @Expose
    private Long ReservedWriteQps;

    /**
    * Actual table data size in MB
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableSize")
    @Expose
    private Long TableSize;

    /**
    * Table status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Table creation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Table's last modified time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * Table remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Memo")
    @Expose
    private String Memo;

    /**
    * Error message
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * TcaplusDB SDK data access ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiAccessId")
    @Expose
    private String ApiAccessId;

    /**
    * Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SortFieldNum")
    @Expose
    private Long SortFieldNum;

    /**
    * Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SortRule")
    @Expose
    private Long SortRule;

    /**
    * Distributed index information of table
    */
    @SerializedName("DbClusterInfoStruct")
    @Expose
    private String DbClusterInfoStruct;

    /**
     * Get Table name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableName Table name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableName Table name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table instance ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableInstanceId Table instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set Table instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableInstanceId Table instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableType Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableType Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableIdlType Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableIdlType Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get ID of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId ID of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterId ID of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Name of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterName Name of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Name of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterName Name of the cluster where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableGroupId ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableGroupId ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Name of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableGroupName Name of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set Name of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableGroupName Name of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get JSON string of table's primary key field structure
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyStruct JSON string of table's primary key field structure
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyStruct() {
        return this.KeyStruct;
    }

    /**
     * Set JSON string of table's primary key field structure
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyStruct JSON string of table's primary key field structure
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyStruct(String KeyStruct) {
        this.KeyStruct = KeyStruct;
    }

    /**
     * Get JSON string of table non-primary key field structure
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ValueStruct JSON string of table non-primary key field structure
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getValueStruct() {
        return this.ValueStruct;
    }

    /**
     * Set JSON string of table non-primary key field structure
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ValueStruct JSON string of table non-primary key field structure
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValueStruct(String ValueStruct) {
        this.ValueStruct = ValueStruct;
    }

    /**
     * Get Table shardkey set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ShardingKeySet Table shardkey set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getShardingKeySet() {
        return this.ShardingKeySet;
    }

    /**
     * Set Table shardkey set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ShardingKeySet Table shardkey set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setShardingKeySet(String ShardingKeySet) {
        this.ShardingKeySet = ShardingKeySet;
    }

    /**
     * Get Table index key field set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IndexStruct Table index key field set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexStruct() {
        return this.IndexStruct;
    }

    /**
     * Set Table index key field set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IndexStruct Table index key field set, which is valid for PROTO-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexStruct(String IndexStruct) {
        this.IndexStruct = IndexStruct;
    }

    /**
     * Get Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ListElementNum Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getListElementNum() {
        return this.ListElementNum;
    }

    /**
     * Set Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ListElementNum Number of LIST-type table elements
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setListElementNum(Long ListElementNum) {
        this.ListElementNum = ListElementNum;
    }

    /**
     * Get Information list of IDL files associated with table
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IdlFiles Information list of IDL files associated with table
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * Set Information list of IDL files associated with table
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IdlFiles Information list of IDL files associated with table
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * Get Reserved table capacity in GB
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReservedVolume Reserved table capacity in GB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getReservedVolume() {
        return this.ReservedVolume;
    }

    /**
     * Set Reserved table capacity in GB
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReservedVolume Reserved table capacity in GB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReservedVolume(Long ReservedVolume) {
        this.ReservedVolume = ReservedVolume;
    }

    /**
     * Get Reserved table read QPS
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReservedReadQps Reserved table read QPS
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getReservedReadQps() {
        return this.ReservedReadQps;
    }

    /**
     * Set Reserved table read QPS
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReservedReadQps Reserved table read QPS
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReservedReadQps(Long ReservedReadQps) {
        this.ReservedReadQps = ReservedReadQps;
    }

    /**
     * Get Reserved table write QPS
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReservedWriteQps Reserved table write QPS
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getReservedWriteQps() {
        return this.ReservedWriteQps;
    }

    /**
     * Set Reserved table write QPS
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReservedWriteQps Reserved table write QPS
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReservedWriteQps(Long ReservedWriteQps) {
        this.ReservedWriteQps = ReservedWriteQps;
    }

    /**
     * Get Actual table data size in MB
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableSize Actual table data size in MB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTableSize() {
        return this.TableSize;
    }

    /**
     * Set Actual table data size in MB
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableSize Actual table data size in MB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableSize(Long TableSize) {
        this.TableSize = TableSize;
    }

    /**
     * Get Table status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Table status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Table status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Table status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Table creation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Table creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Table creation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Table creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Table's last modified time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedTime Table's last modified time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Table's last modified time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdatedTime Table's last modified time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get Table remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Memo Table remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMemo() {
        return this.Memo;
    }

    /**
     * Set Table remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Memo Table remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    /**
     * Get Error message
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Error Error message
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set Error message
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Error Error message
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get TcaplusDB SDK data access ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiAccessId TcaplusDB SDK data access ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiAccessId() {
        return this.ApiAccessId;
    }

    /**
     * Set TcaplusDB SDK data access ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiAccessId TcaplusDB SDK data access ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiAccessId(String ApiAccessId) {
        this.ApiAccessId = ApiAccessId;
    }

    /**
     * Get Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SortFieldNum Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSortFieldNum() {
        return this.SortFieldNum;
    }

    /**
     * Set Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SortFieldNum Number of SORTLIST-type table sort fields
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSortFieldNum(Long SortFieldNum) {
        this.SortFieldNum = SortFieldNum;
    }

    /**
     * Get Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SortRule Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSortRule() {
        return this.SortRule;
    }

    /**
     * Set Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SortRule Sort order of SORTLIST-type tables
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSortRule(Long SortRule) {
        this.SortRule = SortRule;
    }

    /**
     * Get Distributed index information of table 
     * @return DbClusterInfoStruct Distributed index information of table
     */
    public String getDbClusterInfoStruct() {
        return this.DbClusterInfoStruct;
    }

    /**
     * Set Distributed index information of table
     * @param DbClusterInfoStruct Distributed index information of table
     */
    public void setDbClusterInfoStruct(String DbClusterInfoStruct) {
        this.DbClusterInfoStruct = DbClusterInfoStruct;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);
        this.setParamSimple(map, prefix + "KeyStruct", this.KeyStruct);
        this.setParamSimple(map, prefix + "ValueStruct", this.ValueStruct);
        this.setParamSimple(map, prefix + "ShardingKeySet", this.ShardingKeySet);
        this.setParamSimple(map, prefix + "IndexStruct", this.IndexStruct);
        this.setParamSimple(map, prefix + "ListElementNum", this.ListElementNum);
        this.setParamArrayObj(map, prefix + "IdlFiles.", this.IdlFiles);
        this.setParamSimple(map, prefix + "ReservedVolume", this.ReservedVolume);
        this.setParamSimple(map, prefix + "ReservedReadQps", this.ReservedReadQps);
        this.setParamSimple(map, prefix + "ReservedWriteQps", this.ReservedWriteQps);
        this.setParamSimple(map, prefix + "TableSize", this.TableSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Memo", this.Memo);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamSimple(map, prefix + "ApiAccessId", this.ApiAccessId);
        this.setParamSimple(map, prefix + "SortFieldNum", this.SortFieldNum);
        this.setParamSimple(map, prefix + "SortRule", this.SortRule);
        this.setParamSimple(map, prefix + "DbClusterInfoStruct", this.DbClusterInfoStruct);

    }
}

