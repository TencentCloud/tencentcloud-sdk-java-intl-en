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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BinlogInfo extends AbstractModel {

    /**
    * <p>binlog backup file name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Backup file size, unit: Byte</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>File storage time. Time format: 2016-03-17 02:10:37</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>Download link<br>Description: This download link is the same as the download address of the parameter InternetUrl.</p>
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;

    /**
    * <p>Download address<br>Description: This download address is the same as the IntranetUrl download address.</p>
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * <p>Log specific type. Possible values: binlog - binary log</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>binlog file start time</p>
    */
    @SerializedName("BinlogStartTime")
    @Expose
    private String BinlogStartTime;

    /**
    * <p>binlog file expiration time</p>
    */
    @SerializedName("BinlogFinishTime")
    @Expose
    private String BinlogFinishTime;

    /**
    * <p>Region where local binlog files are located</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Backup task status. Possible values: "SUCCESS": backup successful, "FAILED": backup FAILED, "RUNNING": backup in progress.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Detailed information of binlog offsite backup</p>
    */
    @SerializedName("RemoteInfo")
    @Expose
    private RemoteBackupInfo [] RemoteInfo;

    /**
    * <p>Storage method: 0 - regular storage, 1 - archive storage, 2 - standard storage, defaults to 0.</p>
    */
    @SerializedName("CosStorageType")
    @Expose
    private Long CosStorageType;

    /**
    * <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Backup completion progress</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get <p>binlog backup file name</p> 
     * @return Name <p>binlog backup file name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>binlog backup file name</p>
     * @param Name <p>binlog backup file name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Backup file size, unit: Byte</p> 
     * @return Size <p>Backup file size, unit: Byte</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>Backup file size, unit: Byte</p>
     * @param Size <p>Backup file size, unit: Byte</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>File storage time. Time format: 2016-03-17 02:10:37</p> 
     * @return Date <p>File storage time. Time format: 2016-03-17 02:10:37</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>File storage time. Time format: 2016-03-17 02:10:37</p>
     * @param Date <p>File storage time. Time format: 2016-03-17 02:10:37</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>Download link<br>Description: This download link is the same as the download address of the parameter InternetUrl.</p> 
     * @return IntranetUrl <p>Download link<br>Description: This download link is the same as the download address of the parameter InternetUrl.</p>
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * Set <p>Download link<br>Description: This download link is the same as the download address of the parameter InternetUrl.</p>
     * @param IntranetUrl <p>Download link<br>Description: This download link is the same as the download address of the parameter InternetUrl.</p>
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * Get <p>Download address<br>Description: This download address is the same as the IntranetUrl download address.</p> 
     * @return InternetUrl <p>Download address<br>Description: This download address is the same as the IntranetUrl download address.</p>
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set <p>Download address<br>Description: This download address is the same as the IntranetUrl download address.</p>
     * @param InternetUrl <p>Download address<br>Description: This download address is the same as the IntranetUrl download address.</p>
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get <p>Log specific type. Possible values: binlog - binary log</p> 
     * @return Type <p>Log specific type. Possible values: binlog - binary log</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Log specific type. Possible values: binlog - binary log</p>
     * @param Type <p>Log specific type. Possible values: binlog - binary log</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>binlog file start time</p> 
     * @return BinlogStartTime <p>binlog file start time</p>
     */
    public String getBinlogStartTime() {
        return this.BinlogStartTime;
    }

    /**
     * Set <p>binlog file start time</p>
     * @param BinlogStartTime <p>binlog file start time</p>
     */
    public void setBinlogStartTime(String BinlogStartTime) {
        this.BinlogStartTime = BinlogStartTime;
    }

    /**
     * Get <p>binlog file expiration time</p> 
     * @return BinlogFinishTime <p>binlog file expiration time</p>
     */
    public String getBinlogFinishTime() {
        return this.BinlogFinishTime;
    }

    /**
     * Set <p>binlog file expiration time</p>
     * @param BinlogFinishTime <p>binlog file expiration time</p>
     */
    public void setBinlogFinishTime(String BinlogFinishTime) {
        this.BinlogFinishTime = BinlogFinishTime;
    }

    /**
     * Get <p>Region where local binlog files are located</p> 
     * @return Region <p>Region where local binlog files are located</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region where local binlog files are located</p>
     * @param Region <p>Region where local binlog files are located</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Backup task status. Possible values: "SUCCESS": backup successful, "FAILED": backup FAILED, "RUNNING": backup in progress.</p> 
     * @return Status <p>Backup task status. Possible values: "SUCCESS": backup successful, "FAILED": backup FAILED, "RUNNING": backup in progress.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Backup task status. Possible values: "SUCCESS": backup successful, "FAILED": backup FAILED, "RUNNING": backup in progress.</p>
     * @param Status <p>Backup task status. Possible values: "SUCCESS": backup successful, "FAILED": backup FAILED, "RUNNING": backup in progress.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Detailed information of binlog offsite backup</p> 
     * @return RemoteInfo <p>Detailed information of binlog offsite backup</p>
     */
    public RemoteBackupInfo [] getRemoteInfo() {
        return this.RemoteInfo;
    }

    /**
     * Set <p>Detailed information of binlog offsite backup</p>
     * @param RemoteInfo <p>Detailed information of binlog offsite backup</p>
     */
    public void setRemoteInfo(RemoteBackupInfo [] RemoteInfo) {
        this.RemoteInfo = RemoteInfo;
    }

    /**
     * Get <p>Storage method: 0 - regular storage, 1 - archive storage, 2 - standard storage, defaults to 0.</p> 
     * @return CosStorageType <p>Storage method: 0 - regular storage, 1 - archive storage, 2 - standard storage, defaults to 0.</p>
     */
    public Long getCosStorageType() {
        return this.CosStorageType;
    }

    /**
     * Set <p>Storage method: 0 - regular storage, 1 - archive storage, 2 - standard storage, defaults to 0.</p>
     * @param CosStorageType <p>Storage method: 0 - regular storage, 1 - archive storage, 2 - standard storage, defaults to 0.</p>
     */
    public void setCosStorageType(Long CosStorageType) {
        this.CosStorageType = CosStorageType;
    }

    /**
     * Get <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p> 
     * @return InstanceId <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p>
     * @param InstanceId <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Backup completion progress</p> 
     * @return Progress <p>Backup completion progress</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Backup completion progress</p>
     * @param Progress <p>Backup completion progress</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public BinlogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogInfo(BinlogInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.IntranetUrl != null) {
            this.IntranetUrl = new String(source.IntranetUrl);
        }
        if (source.InternetUrl != null) {
            this.InternetUrl = new String(source.InternetUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.BinlogStartTime != null) {
            this.BinlogStartTime = new String(source.BinlogStartTime);
        }
        if (source.BinlogFinishTime != null) {
            this.BinlogFinishTime = new String(source.BinlogFinishTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RemoteInfo != null) {
            this.RemoteInfo = new RemoteBackupInfo[source.RemoteInfo.length];
            for (int i = 0; i < source.RemoteInfo.length; i++) {
                this.RemoteInfo[i] = new RemoteBackupInfo(source.RemoteInfo[i]);
            }
        }
        if (source.CosStorageType != null) {
            this.CosStorageType = new Long(source.CosStorageType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "IntranetUrl", this.IntranetUrl);
        this.setParamSimple(map, prefix + "InternetUrl", this.InternetUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BinlogStartTime", this.BinlogStartTime);
        this.setParamSimple(map, prefix + "BinlogFinishTime", this.BinlogFinishTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "RemoteInfo.", this.RemoteInfo);
        this.setParamSimple(map, prefix + "CosStorageType", this.CosStorageType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

