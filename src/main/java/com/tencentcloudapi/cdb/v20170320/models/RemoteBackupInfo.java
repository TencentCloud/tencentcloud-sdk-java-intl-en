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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteBackupInfo extends AbstractModel {

    /**
    * ID of the remote backup subtask
    */
    @SerializedName("SubBackupId")
    @Expose
    private Long [] SubBackupId;

    /**
    * The region where the remote backup resides
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The start time of remote backup
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time of remote backup
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * The download address
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get ID of the remote backup subtask 
     * @return SubBackupId ID of the remote backup subtask
     */
    public Long [] getSubBackupId() {
        return this.SubBackupId;
    }

    /**
     * Set ID of the remote backup subtask
     * @param SubBackupId ID of the remote backup subtask
     */
    public void setSubBackupId(Long [] SubBackupId) {
        this.SubBackupId = SubBackupId;
    }

    /**
     * Get The region where the remote backup resides 
     * @return Region The region where the remote backup resides
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region where the remote backup resides
     * @param Region The region where the remote backup resides
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress). 
     * @return Status Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
     * @param Status Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The start time of remote backup 
     * @return StartTime The start time of remote backup
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time of remote backup
     * @param StartTime The start time of remote backup
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time of remote backup 
     * @return FinishTime The end time of remote backup
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set The end time of remote backup
     * @param FinishTime The end time of remote backup
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get The download address 
     * @return Url The download address
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The download address
     * @param Url The download address
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public RemoteBackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteBackupInfo(RemoteBackupInfo source) {
        if (source.SubBackupId != null) {
            this.SubBackupId = new Long[source.SubBackupId.length];
            for (int i = 0; i < source.SubBackupId.length; i++) {
                this.SubBackupId[i] = new Long(source.SubBackupId[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SubBackupId.", this.SubBackupId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

