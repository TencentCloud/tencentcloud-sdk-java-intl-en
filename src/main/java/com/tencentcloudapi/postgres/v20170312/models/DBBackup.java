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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBBackup extends AbstractModel {

    /**
    * Unique backup file ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * File generation start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * File generation end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * File size in KB
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Policy (0: instance backup, 1: multi-database backup)
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * Type (0: scheduled)
    */
    @SerializedName("Way")
    @Expose
    private Long Way;

    /**
    * Backup mode (1: full)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Status (1: creating, 2: success, 3: failure)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * DB list
    */
    @SerializedName("DbList")
    @Expose
    private String [] DbList;

    /**
    * Download address on private network
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * Download address on public network
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
    * Backup set ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
     * Get Unique backup file ID 
     * @return Id Unique backup file ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique backup file ID
     * @param Id Unique backup file ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get File generation start time 
     * @return StartTime File generation start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set File generation start time
     * @param StartTime File generation start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get File generation end time 
     * @return EndTime File generation end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set File generation end time
     * @param EndTime File generation end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get File size in KB 
     * @return Size File size in KB
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size in KB
     * @param Size File size in KB
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Policy (0: instance backup, 1: multi-database backup) 
     * @return Strategy Policy (0: instance backup, 1: multi-database backup)
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Policy (0: instance backup, 1: multi-database backup)
     * @param Strategy Policy (0: instance backup, 1: multi-database backup)
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Type (0: scheduled) 
     * @return Way Type (0: scheduled)
     */
    public Long getWay() {
        return this.Way;
    }

    /**
     * Set Type (0: scheduled)
     * @param Way Type (0: scheduled)
     */
    public void setWay(Long Way) {
        this.Way = Way;
    }

    /**
     * Get Backup mode (1: full) 
     * @return Type Backup mode (1: full)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Backup mode (1: full)
     * @param Type Backup mode (1: full)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Status (1: creating, 2: success, 3: failure) 
     * @return Status Status (1: creating, 2: success, 3: failure)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status (1: creating, 2: success, 3: failure)
     * @param Status Status (1: creating, 2: success, 3: failure)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get DB list 
     * @return DbList DB list
     */
    public String [] getDbList() {
        return this.DbList;
    }

    /**
     * Set DB list
     * @param DbList DB list
     */
    public void setDbList(String [] DbList) {
        this.DbList = DbList;
    }

    /**
     * Get Download address on private network 
     * @return InternalAddr Download address on private network
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * Set Download address on private network
     * @param InternalAddr Download address on private network
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * Get Download address on public network 
     * @return ExternalAddr Download address on public network
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * Set Download address on public network
     * @param ExternalAddr Download address on public network
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    /**
     * Get Backup set ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SetId Backup set ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set Backup set ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SetId Backup set ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    public DBBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBBackup(DBBackup source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.Way != null) {
            this.Way = new Long(source.Way);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DbList != null) {
            this.DbList = new String[source.DbList.length];
            for (int i = 0; i < source.DbList.length; i++) {
                this.DbList[i] = new String(source.DbList[i]);
            }
        }
        if (source.InternalAddr != null) {
            this.InternalAddr = new String(source.InternalAddr);
        }
        if (source.ExternalAddr != null) {
            this.ExternalAddr = new String(source.ExternalAddr);
        }
        if (source.SetId != null) {
            this.SetId = new String(source.SetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Way", this.Way);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DbList.", this.DbList);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);
        this.setParamSimple(map, prefix + "SetId", this.SetId);

    }
}

