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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDataRegistry extends AbstractModel {

    /**
    * Data source ID.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Database name.

    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Table name

    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Partition name

    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * Input output table data type.
Input stream:
 UPSTREAM,
Output stream:
  DOWNSTREAM;.
    */
    @SerializedName("DataFlowType")
    @Expose
    private String DataFlowType;

    /**
    * Physical unique ID..
    */
    @SerializedName("TablePhysicalId")
    @Expose
    private String TablePhysicalId;

    /**
    * Database unique id..
    */
    @SerializedName("DbGuid")
    @Expose
    private String DbGuid;

    /**
    * Unique id of the table.
    */
    @SerializedName("TableGuid")
    @Expose
    private String TableGuid;

    /**
     * Get Data source ID. 
     * @return DatasourceId Data source ID.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID.
     * @param DatasourceId Data source ID.
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Database name.
 
     * @return DatabaseName Database name.

     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name.

     * @param DatabaseName Database name.

     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
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
     * Get Partition name
 
     * @return PartitionName Partition name

     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set Partition name

     * @param PartitionName Partition name

     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get Input output table data type.
Input stream:
 UPSTREAM,
Output stream:
  DOWNSTREAM;. 
     * @return DataFlowType Input output table data type.
Input stream:
 UPSTREAM,
Output stream:
  DOWNSTREAM;.
     */
    public String getDataFlowType() {
        return this.DataFlowType;
    }

    /**
     * Set Input output table data type.
Input stream:
 UPSTREAM,
Output stream:
  DOWNSTREAM;.
     * @param DataFlowType Input output table data type.
Input stream:
 UPSTREAM,
Output stream:
  DOWNSTREAM;.
     */
    public void setDataFlowType(String DataFlowType) {
        this.DataFlowType = DataFlowType;
    }

    /**
     * Get Physical unique ID.. 
     * @return TablePhysicalId Physical unique ID..
     */
    public String getTablePhysicalId() {
        return this.TablePhysicalId;
    }

    /**
     * Set Physical unique ID..
     * @param TablePhysicalId Physical unique ID..
     */
    public void setTablePhysicalId(String TablePhysicalId) {
        this.TablePhysicalId = TablePhysicalId;
    }

    /**
     * Get Database unique id.. 
     * @return DbGuid Database unique id..
     */
    public String getDbGuid() {
        return this.DbGuid;
    }

    /**
     * Set Database unique id..
     * @param DbGuid Database unique id..
     */
    public void setDbGuid(String DbGuid) {
        this.DbGuid = DbGuid;
    }

    /**
     * Get Unique id of the table. 
     * @return TableGuid Unique id of the table.
     */
    public String getTableGuid() {
        return this.TableGuid;
    }

    /**
     * Set Unique id of the table.
     * @param TableGuid Unique id of the table.
     */
    public void setTableGuid(String TableGuid) {
        this.TableGuid = TableGuid;
    }

    public TaskDataRegistry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDataRegistry(TaskDataRegistry source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.DataFlowType != null) {
            this.DataFlowType = new String(source.DataFlowType);
        }
        if (source.TablePhysicalId != null) {
            this.TablePhysicalId = new String(source.TablePhysicalId);
        }
        if (source.DbGuid != null) {
            this.DbGuid = new String(source.DbGuid);
        }
        if (source.TableGuid != null) {
            this.TableGuid = new String(source.TableGuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "DataFlowType", this.DataFlowType);
        this.setParamSimple(map, prefix + "TablePhysicalId", this.TablePhysicalId);
        this.setParamSimple(map, prefix + "DbGuid", this.DbGuid);
        this.setParamSimple(map, prefix + "TableGuid", this.TableGuid);

    }
}

