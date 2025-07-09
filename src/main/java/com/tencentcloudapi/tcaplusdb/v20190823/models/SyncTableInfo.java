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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncTableInfo extends AbstractModel {

    /**
    * Sharded table quantity of the target cache table
    */
    @SerializedName("TargetTableSplitNum")
    @Expose
    private Long TargetTableSplitNum;

    /**
    * Prefix of the target cache table name
    */
    @SerializedName("TargetTableNamePrefix")
    @Expose
    private String [] TargetTableNamePrefix;

    /**
    * Instance ID of the cache database
    */
    @SerializedName("TargetSyncDBInstanceId")
    @Expose
    private String TargetSyncDBInstanceId;

    /**
    * Name of the database where the cache table resides
    */
    @SerializedName("TargetDatabaseName")
    @Expose
    private String TargetDatabaseName;

    /**
    * Caching status. Valid values: `0` (creating), `1` (caching), `2` (disabled), `-1` (deleted).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * ID of cluster where the table resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The ID of the table group where the table resides
    */
    @SerializedName("TableGroupId")
    @Expose
    private Long TableGroupId;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Mapping from the primary key field of the TcaplusDB table to the field of the target cache table
    */
    @SerializedName("KeyFieldMapping")
    @Expose
    private SyncTableField [] KeyFieldMapping;

    /**
    * Mapping of TcaplusDB table field to target cache table field
    */
    @SerializedName("ValueFieldMapping")
    @Expose
    private SyncTableField [] ValueFieldMapping;

    /**
     * Get Sharded table quantity of the target cache table 
     * @return TargetTableSplitNum Sharded table quantity of the target cache table
     */
    public Long getTargetTableSplitNum() {
        return this.TargetTableSplitNum;
    }

    /**
     * Set Sharded table quantity of the target cache table
     * @param TargetTableSplitNum Sharded table quantity of the target cache table
     */
    public void setTargetTableSplitNum(Long TargetTableSplitNum) {
        this.TargetTableSplitNum = TargetTableSplitNum;
    }

    /**
     * Get Prefix of the target cache table name 
     * @return TargetTableNamePrefix Prefix of the target cache table name
     */
    public String [] getTargetTableNamePrefix() {
        return this.TargetTableNamePrefix;
    }

    /**
     * Set Prefix of the target cache table name
     * @param TargetTableNamePrefix Prefix of the target cache table name
     */
    public void setTargetTableNamePrefix(String [] TargetTableNamePrefix) {
        this.TargetTableNamePrefix = TargetTableNamePrefix;
    }

    /**
     * Get Instance ID of the cache database 
     * @return TargetSyncDBInstanceId Instance ID of the cache database
     */
    public String getTargetSyncDBInstanceId() {
        return this.TargetSyncDBInstanceId;
    }

    /**
     * Set Instance ID of the cache database
     * @param TargetSyncDBInstanceId Instance ID of the cache database
     */
    public void setTargetSyncDBInstanceId(String TargetSyncDBInstanceId) {
        this.TargetSyncDBInstanceId = TargetSyncDBInstanceId;
    }

    /**
     * Get Name of the database where the cache table resides 
     * @return TargetDatabaseName Name of the database where the cache table resides
     */
    public String getTargetDatabaseName() {
        return this.TargetDatabaseName;
    }

    /**
     * Set Name of the database where the cache table resides
     * @param TargetDatabaseName Name of the database where the cache table resides
     */
    public void setTargetDatabaseName(String TargetDatabaseName) {
        this.TargetDatabaseName = TargetDatabaseName;
    }

    /**
     * Get Caching status. Valid values: `0` (creating), `1` (caching), `2` (disabled), `-1` (deleted). 
     * @return Status Caching status. Valid values: `0` (creating), `1` (caching), `2` (disabled), `-1` (deleted).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Caching status. Valid values: `0` (creating), `1` (caching), `2` (disabled), `-1` (deleted).
     * @param Status Caching status. Valid values: `0` (creating), `1` (caching), `2` (disabled), `-1` (deleted).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get ID of cluster where the table resides 
     * @return ClusterId ID of cluster where the table resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of cluster where the table resides
     * @param ClusterId ID of cluster where the table resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The ID of the table group where the table resides 
     * @return TableGroupId The ID of the table group where the table resides
     */
    public Long getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set The ID of the table group where the table resides
     * @param TableGroupId The ID of the table group where the table resides
     */
    public void setTableGroupId(Long TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table ID 
     * @return TableId Table ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID
     * @param TableId Table ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Mapping from the primary key field of the TcaplusDB table to the field of the target cache table 
     * @return KeyFieldMapping Mapping from the primary key field of the TcaplusDB table to the field of the target cache table
     */
    public SyncTableField [] getKeyFieldMapping() {
        return this.KeyFieldMapping;
    }

    /**
     * Set Mapping from the primary key field of the TcaplusDB table to the field of the target cache table
     * @param KeyFieldMapping Mapping from the primary key field of the TcaplusDB table to the field of the target cache table
     */
    public void setKeyFieldMapping(SyncTableField [] KeyFieldMapping) {
        this.KeyFieldMapping = KeyFieldMapping;
    }

    /**
     * Get Mapping of TcaplusDB table field to target cache table field 
     * @return ValueFieldMapping Mapping of TcaplusDB table field to target cache table field
     */
    public SyncTableField [] getValueFieldMapping() {
        return this.ValueFieldMapping;
    }

    /**
     * Set Mapping of TcaplusDB table field to target cache table field
     * @param ValueFieldMapping Mapping of TcaplusDB table field to target cache table field
     */
    public void setValueFieldMapping(SyncTableField [] ValueFieldMapping) {
        this.ValueFieldMapping = ValueFieldMapping;
    }

    public SyncTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncTableInfo(SyncTableInfo source) {
        if (source.TargetTableSplitNum != null) {
            this.TargetTableSplitNum = new Long(source.TargetTableSplitNum);
        }
        if (source.TargetTableNamePrefix != null) {
            this.TargetTableNamePrefix = new String[source.TargetTableNamePrefix.length];
            for (int i = 0; i < source.TargetTableNamePrefix.length; i++) {
                this.TargetTableNamePrefix[i] = new String(source.TargetTableNamePrefix[i]);
            }
        }
        if (source.TargetSyncDBInstanceId != null) {
            this.TargetSyncDBInstanceId = new String(source.TargetSyncDBInstanceId);
        }
        if (source.TargetDatabaseName != null) {
            this.TargetDatabaseName = new String(source.TargetDatabaseName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new Long(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.KeyFieldMapping != null) {
            this.KeyFieldMapping = new SyncTableField[source.KeyFieldMapping.length];
            for (int i = 0; i < source.KeyFieldMapping.length; i++) {
                this.KeyFieldMapping[i] = new SyncTableField(source.KeyFieldMapping[i]);
            }
        }
        if (source.ValueFieldMapping != null) {
            this.ValueFieldMapping = new SyncTableField[source.ValueFieldMapping.length];
            for (int i = 0; i < source.ValueFieldMapping.length; i++) {
                this.ValueFieldMapping[i] = new SyncTableField(source.ValueFieldMapping[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetTableSplitNum", this.TargetTableSplitNum);
        this.setParamArraySimple(map, prefix + "TargetTableNamePrefix.", this.TargetTableNamePrefix);
        this.setParamSimple(map, prefix + "TargetSyncDBInstanceId", this.TargetSyncDBInstanceId);
        this.setParamSimple(map, prefix + "TargetDatabaseName", this.TargetDatabaseName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamArrayObj(map, prefix + "KeyFieldMapping.", this.KeyFieldMapping);
        this.setParamArrayObj(map, prefix + "ValueFieldMapping.", this.ValueFieldMapping);

    }
}

