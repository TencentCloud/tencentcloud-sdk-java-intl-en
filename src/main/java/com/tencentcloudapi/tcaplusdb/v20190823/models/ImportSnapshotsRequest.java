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

public class ImportSnapshotsRequest extends AbstractModel {

    /**
    * The ID of the cluster where the original table (from which the snapshot was created) resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The information of the snapshot to import
    */
    @SerializedName("Snapshots")
    @Expose
    private SnapshotInfo Snapshots;

    /**
    * Whether to import partial data of the snapshot. Valid values: `TRUE` (import partial data), `FALSE` (import all data).
    */
    @SerializedName("ImportSpecialKey")
    @Expose
    private String ImportSpecialKey;

    /**
    * Whether to import to the original table. Valid values: `TRUE` (import to the original table), `FALSE` (import to a new table).
    */
    @SerializedName("ImportOriginTable")
    @Expose
    private String ImportOriginTable;

    /**
    * The file of the keys of the partial data
    */
    @SerializedName("KeyFile")
    @Expose
    private KeyFile KeyFile;

    /**
    * The ID of the table group where the new table resides, which is valid only when `ImportOriginTable` is set to `FALSE`
    */
    @SerializedName("NewTableGroupId")
    @Expose
    private String NewTableGroupId;

    /**
    * The name of the new table, which is valid only when `ImportOriginTable` is set to `FALSE`. TcaplusDB will automatically create a table named `NewTableName` of the same structure as that of the original table.
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
     * Get The ID of the cluster where the original table (from which the snapshot was created) resides 
     * @return ClusterId The ID of the cluster where the original table (from which the snapshot was created) resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The ID of the cluster where the original table (from which the snapshot was created) resides
     * @param ClusterId The ID of the cluster where the original table (from which the snapshot was created) resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The information of the snapshot to import 
     * @return Snapshots The information of the snapshot to import
     */
    public SnapshotInfo getSnapshots() {
        return this.Snapshots;
    }

    /**
     * Set The information of the snapshot to import
     * @param Snapshots The information of the snapshot to import
     */
    public void setSnapshots(SnapshotInfo Snapshots) {
        this.Snapshots = Snapshots;
    }

    /**
     * Get Whether to import partial data of the snapshot. Valid values: `TRUE` (import partial data), `FALSE` (import all data). 
     * @return ImportSpecialKey Whether to import partial data of the snapshot. Valid values: `TRUE` (import partial data), `FALSE` (import all data).
     */
    public String getImportSpecialKey() {
        return this.ImportSpecialKey;
    }

    /**
     * Set Whether to import partial data of the snapshot. Valid values: `TRUE` (import partial data), `FALSE` (import all data).
     * @param ImportSpecialKey Whether to import partial data of the snapshot. Valid values: `TRUE` (import partial data), `FALSE` (import all data).
     */
    public void setImportSpecialKey(String ImportSpecialKey) {
        this.ImportSpecialKey = ImportSpecialKey;
    }

    /**
     * Get Whether to import to the original table. Valid values: `TRUE` (import to the original table), `FALSE` (import to a new table). 
     * @return ImportOriginTable Whether to import to the original table. Valid values: `TRUE` (import to the original table), `FALSE` (import to a new table).
     */
    public String getImportOriginTable() {
        return this.ImportOriginTable;
    }

    /**
     * Set Whether to import to the original table. Valid values: `TRUE` (import to the original table), `FALSE` (import to a new table).
     * @param ImportOriginTable Whether to import to the original table. Valid values: `TRUE` (import to the original table), `FALSE` (import to a new table).
     */
    public void setImportOriginTable(String ImportOriginTable) {
        this.ImportOriginTable = ImportOriginTable;
    }

    /**
     * Get The file of the keys of the partial data 
     * @return KeyFile The file of the keys of the partial data
     */
    public KeyFile getKeyFile() {
        return this.KeyFile;
    }

    /**
     * Set The file of the keys of the partial data
     * @param KeyFile The file of the keys of the partial data
     */
    public void setKeyFile(KeyFile KeyFile) {
        this.KeyFile = KeyFile;
    }

    /**
     * Get The ID of the table group where the new table resides, which is valid only when `ImportOriginTable` is set to `FALSE` 
     * @return NewTableGroupId The ID of the table group where the new table resides, which is valid only when `ImportOriginTable` is set to `FALSE`
     */
    public String getNewTableGroupId() {
        return this.NewTableGroupId;
    }

    /**
     * Set The ID of the table group where the new table resides, which is valid only when `ImportOriginTable` is set to `FALSE`
     * @param NewTableGroupId The ID of the table group where the new table resides, which is valid only when `ImportOriginTable` is set to `FALSE`
     */
    public void setNewTableGroupId(String NewTableGroupId) {
        this.NewTableGroupId = NewTableGroupId;
    }

    /**
     * Get The name of the new table, which is valid only when `ImportOriginTable` is set to `FALSE`. TcaplusDB will automatically create a table named `NewTableName` of the same structure as that of the original table. 
     * @return NewTableName The name of the new table, which is valid only when `ImportOriginTable` is set to `FALSE`. TcaplusDB will automatically create a table named `NewTableName` of the same structure as that of the original table.
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set The name of the new table, which is valid only when `ImportOriginTable` is set to `FALSE`. TcaplusDB will automatically create a table named `NewTableName` of the same structure as that of the original table.
     * @param NewTableName The name of the new table, which is valid only when `ImportOriginTable` is set to `FALSE`. TcaplusDB will automatically create a table named `NewTableName` of the same structure as that of the original table.
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    public ImportSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportSnapshotsRequest(ImportSnapshotsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Snapshots != null) {
            this.Snapshots = new SnapshotInfo(source.Snapshots);
        }
        if (source.ImportSpecialKey != null) {
            this.ImportSpecialKey = new String(source.ImportSpecialKey);
        }
        if (source.ImportOriginTable != null) {
            this.ImportOriginTable = new String(source.ImportOriginTable);
        }
        if (source.KeyFile != null) {
            this.KeyFile = new KeyFile(source.KeyFile);
        }
        if (source.NewTableGroupId != null) {
            this.NewTableGroupId = new String(source.NewTableGroupId);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Snapshots.", this.Snapshots);
        this.setParamSimple(map, prefix + "ImportSpecialKey", this.ImportSpecialKey);
        this.setParamSimple(map, prefix + "ImportOriginTable", this.ImportOriginTable);
        this.setParamObj(map, prefix + "KeyFile.", this.KeyFile);
        this.setParamSimple(map, prefix + "NewTableGroupId", this.NewTableGroupId);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);

    }
}

