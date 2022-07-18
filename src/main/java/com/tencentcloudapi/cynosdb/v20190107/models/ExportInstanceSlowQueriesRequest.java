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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportInstanceSlowQueriesRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Transaction start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Transaction end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Maximum number
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Username
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Client host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * File type. Valid values: csv, original.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

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
     * Get Transaction start time 
     * @return StartTime Transaction start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Transaction start time
     * @param StartTime Transaction start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Transaction end time 
     * @return EndTime Transaction end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Transaction end time
     * @param EndTime Transaction end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Maximum number 
     * @return Limit Maximum number
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number
     * @param Limit Maximum number
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Username 
     * @return Username Username
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username
     * @param Username Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Client host 
     * @return Host Client host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Client host
     * @param Host Client host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Database name 
     * @return Database Database name
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
     * @param Database Database name
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get File type. Valid values: csv, original. 
     * @return FileType File type. Valid values: csv, original.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type. Valid values: csv, original.
     * @param FileType File type. Valid values: csv, original.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public ExportInstanceSlowQueriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportInstanceSlowQueriesRequest(ExportInstanceSlowQueriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

