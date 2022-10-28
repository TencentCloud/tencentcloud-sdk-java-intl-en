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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BinlogInfo extends AbstractModel{

    /**
    * Binlog backup filename
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Backup file size in bytes
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * File stored time in the format of 2016-03-17 02:10:37
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Download address
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;

    /**
    * Download address
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * Log type. Value range: binlog
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Binlog file start file
    */
    @SerializedName("BinlogStartTime")
    @Expose
    private String BinlogStartTime;

    /**
    * Binlog file end time
    */
    @SerializedName("BinlogFinishTime")
    @Expose
    private String BinlogFinishTime;

    /**
    * The region where the binlog file resides
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
    * The detailed information of remote binlog backups
    */
    @SerializedName("RemoteInfo")
    @Expose
    private RemoteBackupInfo [] RemoteInfo;

    /**
    * Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`.
    */
    @SerializedName("CosStorageType")
    @Expose
    private Long CosStorageType;

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Binlog backup filename 
     * @return Name Binlog backup filename
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Binlog backup filename
     * @param Name Binlog backup filename
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Backup file size in bytes 
     * @return Size Backup file size in bytes
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Backup file size in bytes
     * @param Size Backup file size in bytes
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get File stored time in the format of 2016-03-17 02:10:37 
     * @return Date File stored time in the format of 2016-03-17 02:10:37
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set File stored time in the format of 2016-03-17 02:10:37
     * @param Date File stored time in the format of 2016-03-17 02:10:37
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Download address 
     * @return IntranetUrl Download address
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * Set Download address
     * @param IntranetUrl Download address
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * Get Download address 
     * @return InternetUrl Download address
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set Download address
     * @param InternetUrl Download address
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get Log type. Value range: binlog 
     * @return Type Log type. Value range: binlog
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Log type. Value range: binlog
     * @param Type Log type. Value range: binlog
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Binlog file start file 
     * @return BinlogStartTime Binlog file start file
     */
    public String getBinlogStartTime() {
        return this.BinlogStartTime;
    }

    /**
     * Set Binlog file start file
     * @param BinlogStartTime Binlog file start file
     */
    public void setBinlogStartTime(String BinlogStartTime) {
        this.BinlogStartTime = BinlogStartTime;
    }

    /**
     * Get Binlog file end time 
     * @return BinlogFinishTime Binlog file end time
     */
    public String getBinlogFinishTime() {
        return this.BinlogFinishTime;
    }

    /**
     * Set Binlog file end time
     * @param BinlogFinishTime Binlog file end time
     */
    public void setBinlogFinishTime(String BinlogFinishTime) {
        this.BinlogFinishTime = BinlogFinishTime;
    }

    /**
     * Get The region where the binlog file resides 
     * @return Region The region where the binlog file resides
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region where the binlog file resides
     * @param Region The region where the binlog file resides
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
     * Get The detailed information of remote binlog backups 
     * @return RemoteInfo The detailed information of remote binlog backups
     */
    public RemoteBackupInfo [] getRemoteInfo() {
        return this.RemoteInfo;
    }

    /**
     * Set The detailed information of remote binlog backups
     * @param RemoteInfo The detailed information of remote binlog backups
     */
    public void setRemoteInfo(RemoteBackupInfo [] RemoteInfo) {
        this.RemoteInfo = RemoteInfo;
    }

    /**
     * Get Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`. 
     * @return CosStorageType Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`.
     */
    public Long getCosStorageType() {
        return this.CosStorageType;
    }

    /**
     * Set Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`.
     * @param CosStorageType Storage method. Valid values: `0` (regular storage), `1`(archive storage). Default value: `0`.
     */
    public void setCosStorageType(Long CosStorageType) {
        this.CosStorageType = CosStorageType;
    }

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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

    }
}

