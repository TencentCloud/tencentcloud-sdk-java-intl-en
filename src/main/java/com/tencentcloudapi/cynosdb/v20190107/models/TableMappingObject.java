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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableMappingObject extends AbstractModel {

    /**
    * Source instance Id
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

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
    * Map database name
    */
    @SerializedName("MapDatabaseName")
    @Expose
    private String MapDatabaseName;

    /**
    * Mapping table name
    */
    @SerializedName("MapTableName")
    @Expose
    private String MapTableName;

    /**
    * Synchronization status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Sync progress
    */
    @SerializedName("Process")
    @Expose
    private Float Process;

    /**
    * Delay
    */
    @SerializedName("Lag")
    @Expose
    private Long Lag;

    /**
    * Message
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Whether it is the main table
    */
    @SerializedName("IsPrimary")
    @Expose
    private Boolean IsPrimary;

    /**
    * Virtual column padding value
    */
    @SerializedName("VirtualColValue")
    @Expose
    private String VirtualColValue;

    /**
     * Get Source instance Id 
     * @return SrcInstanceId Source instance Id
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set Source instance Id
     * @param SrcInstanceId Source instance Id
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
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
     * Get Map database name 
     * @return MapDatabaseName Map database name
     */
    public String getMapDatabaseName() {
        return this.MapDatabaseName;
    }

    /**
     * Set Map database name
     * @param MapDatabaseName Map database name
     */
    public void setMapDatabaseName(String MapDatabaseName) {
        this.MapDatabaseName = MapDatabaseName;
    }

    /**
     * Get Mapping table name 
     * @return MapTableName Mapping table name
     */
    public String getMapTableName() {
        return this.MapTableName;
    }

    /**
     * Set Mapping table name
     * @param MapTableName Mapping table name
     */
    public void setMapTableName(String MapTableName) {
        this.MapTableName = MapTableName;
    }

    /**
     * Get Synchronization status 
     * @return Status Synchronization status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Synchronization status
     * @param Status Synchronization status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Sync progress 
     * @return Process Sync progress
     */
    public Float getProcess() {
        return this.Process;
    }

    /**
     * Set Sync progress
     * @param Process Sync progress
     */
    public void setProcess(Float Process) {
        this.Process = Process;
    }

    /**
     * Get Delay 
     * @return Lag Delay
     */
    public Long getLag() {
        return this.Lag;
    }

    /**
     * Set Delay
     * @param Lag Delay
     */
    public void setLag(Long Lag) {
        this.Lag = Lag;
    }

    /**
     * Get Message 
     * @return Message Message
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Message
     * @param Message Message
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Whether it is the main table 
     * @return IsPrimary Whether it is the main table
     */
    public Boolean getIsPrimary() {
        return this.IsPrimary;
    }

    /**
     * Set Whether it is the main table
     * @param IsPrimary Whether it is the main table
     */
    public void setIsPrimary(Boolean IsPrimary) {
        this.IsPrimary = IsPrimary;
    }

    /**
     * Get Virtual column padding value 
     * @return VirtualColValue Virtual column padding value
     */
    public String getVirtualColValue() {
        return this.VirtualColValue;
    }

    /**
     * Set Virtual column padding value
     * @param VirtualColValue Virtual column padding value
     */
    public void setVirtualColValue(String VirtualColValue) {
        this.VirtualColValue = VirtualColValue;
    }

    public TableMappingObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableMappingObject(TableMappingObject source) {
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.MapDatabaseName != null) {
            this.MapDatabaseName = new String(source.MapDatabaseName);
        }
        if (source.MapTableName != null) {
            this.MapTableName = new String(source.MapTableName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Process != null) {
            this.Process = new Float(source.Process);
        }
        if (source.Lag != null) {
            this.Lag = new Long(source.Lag);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.IsPrimary != null) {
            this.IsPrimary = new Boolean(source.IsPrimary);
        }
        if (source.VirtualColValue != null) {
            this.VirtualColValue = new String(source.VirtualColValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "MapDatabaseName", this.MapDatabaseName);
        this.setParamSimple(map, prefix + "MapTableName", this.MapTableName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Process", this.Process);
        this.setParamSimple(map, prefix + "Lag", this.Lag);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "IsPrimary", this.IsPrimary);
        this.setParamSimple(map, prefix + "VirtualColValue", this.VirtualColValue);

    }
}

