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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DMSPartition extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Data directory name
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Data version
    */
    @SerializedName("DataVersion")
    @Expose
    private Long DataVersion;

    /**
    * Partition name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Value List
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Storage size
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * Number of records
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Last access time
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * Additional attribute
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
    * Storage object
    */
    @SerializedName("Sds")
    @Expose
    private DMSSds Sds;

    /**
     * Get Database name 
     * @return DatabaseName Database name
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name
     * @param DatabaseName Database name
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Data directory name 
     * @return SchemaName Data directory name
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Data directory name
     * @param SchemaName Data directory name
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
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
     * Get Data version 
     * @return DataVersion Data version
     */
    public Long getDataVersion() {
        return this.DataVersion;
    }

    /**
     * Set Data version
     * @param DataVersion Data version
     */
    public void setDataVersion(Long DataVersion) {
        this.DataVersion = DataVersion;
    }

    /**
     * Get Partition name 
     * @return Name Partition name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Partition name
     * @param Name Partition name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Value List 
     * @return Values Value List
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Value List
     * @param Values Value List
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Storage size 
     * @return StorageSize Storage size
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Storage size
     * @param StorageSize Storage size
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get Number of records 
     * @return RecordCount Number of records
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set Number of records
     * @param RecordCount Number of records
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifiedTime Modification time
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Modification time
     * @param ModifiedTime Modification time
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Last access time 
     * @return LastAccessTime Last access time
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set Last access time
     * @param LastAccessTime Last access time
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    /**
     * Get Additional attribute 
     * @return Params Additional attribute
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set Additional attribute
     * @param Params Additional attribute
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
    }

    /**
     * Get Storage object 
     * @return Sds Storage object
     */
    public DMSSds getSds() {
        return this.Sds;
    }

    /**
     * Set Storage object
     * @param Sds Storage object
     */
    public void setSds(DMSSds Sds) {
        this.Sds = Sds;
    }

    public DMSPartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSPartition(DMSPartition source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.DataVersion != null) {
            this.DataVersion = new Long(source.DataVersion);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
        if (source.Sds != null) {
            this.Sds = new DMSSds(source.Sds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "DataVersion", this.DataVersion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamObj(map, prefix + "Sds.", this.Sds);

    }
}

