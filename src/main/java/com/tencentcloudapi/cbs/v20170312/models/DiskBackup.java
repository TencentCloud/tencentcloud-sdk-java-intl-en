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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskBackup extends AbstractModel{

    /**
    * Cloud disk backup point ID.
    */
    @SerializedName("DiskBackupId")
    @Expose
    private String DiskBackupId;

    /**
    * ID of the cloud disk with which the backup point is associated.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Cloud disk size in GB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Cloud disk type. Valid values:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Backup point name.
    */
    @SerializedName("DiskBackupName")
    @Expose
    private String DiskBackupName;

    /**
    * Cloud disk backup point status. Valid values:<br><li>NORMAL: Normal<br><li>CREATING: Creating<br><li>ROLLBACKING: Rolling back
    */
    @SerializedName("DiskBackupState")
    @Expose
    private String DiskBackupState;

    /**
    * Cloud disk creation progress in percentage.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Creation time of the cloud disk backup point.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether the cloud disk is encrypted. Valid values: <br><li>false: Not encrypted <br><li>true: Encrypted
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
     * Get Cloud disk backup point ID. 
     * @return DiskBackupId Cloud disk backup point ID.
     */
    public String getDiskBackupId() {
        return this.DiskBackupId;
    }

    /**
     * Set Cloud disk backup point ID.
     * @param DiskBackupId Cloud disk backup point ID.
     */
    public void setDiskBackupId(String DiskBackupId) {
        this.DiskBackupId = DiskBackupId;
    }

    /**
     * Get ID of the cloud disk with which the backup point is associated. 
     * @return DiskId ID of the cloud disk with which the backup point is associated.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set ID of the cloud disk with which the backup point is associated.
     * @param DiskId ID of the cloud disk with which the backup point is associated.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Cloud disk size in GB. 
     * @return DiskSize Cloud disk size in GB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size in GB.
     * @param DiskSize Cloud disk size in GB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Cloud disk type. Valid values:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk 
     * @return DiskUsage Cloud disk type. Valid values:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Cloud disk type. Valid values:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk
     * @param DiskUsage Cloud disk type. Valid values:<br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Backup point name. 
     * @return DiskBackupName Backup point name.
     */
    public String getDiskBackupName() {
        return this.DiskBackupName;
    }

    /**
     * Set Backup point name.
     * @param DiskBackupName Backup point name.
     */
    public void setDiskBackupName(String DiskBackupName) {
        this.DiskBackupName = DiskBackupName;
    }

    /**
     * Get Cloud disk backup point status. Valid values:<br><li>NORMAL: Normal<br><li>CREATING: Creating<br><li>ROLLBACKING: Rolling back 
     * @return DiskBackupState Cloud disk backup point status. Valid values:<br><li>NORMAL: Normal<br><li>CREATING: Creating<br><li>ROLLBACKING: Rolling back
     */
    public String getDiskBackupState() {
        return this.DiskBackupState;
    }

    /**
     * Set Cloud disk backup point status. Valid values:<br><li>NORMAL: Normal<br><li>CREATING: Creating<br><li>ROLLBACKING: Rolling back
     * @param DiskBackupState Cloud disk backup point status. Valid values:<br><li>NORMAL: Normal<br><li>CREATING: Creating<br><li>ROLLBACKING: Rolling back
     */
    public void setDiskBackupState(String DiskBackupState) {
        this.DiskBackupState = DiskBackupState;
    }

    /**
     * Get Cloud disk creation progress in percentage. 
     * @return Percent Cloud disk creation progress in percentage.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Cloud disk creation progress in percentage.
     * @param Percent Cloud disk creation progress in percentage.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Creation time of the cloud disk backup point. 
     * @return CreateTime Creation time of the cloud disk backup point.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the cloud disk backup point.
     * @param CreateTime Creation time of the cloud disk backup point.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether the cloud disk is encrypted. Valid values: <br><li>false: Not encrypted <br><li>true: Encrypted 
     * @return Encrypt Whether the cloud disk is encrypted. Valid values: <br><li>false: Not encrypted <br><li>true: Encrypted
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Whether the cloud disk is encrypted. Valid values: <br><li>false: Not encrypted <br><li>true: Encrypted
     * @param Encrypt Whether the cloud disk is encrypted. Valid values: <br><li>false: Not encrypted <br><li>true: Encrypted
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    public DiskBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskBackup(DiskBackup source) {
        if (source.DiskBackupId != null) {
            this.DiskBackupId = new String(source.DiskBackupId);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.DiskBackupName != null) {
            this.DiskBackupName = new String(source.DiskBackupName);
        }
        if (source.DiskBackupState != null) {
            this.DiskBackupState = new String(source.DiskBackupState);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskBackupId", this.DiskBackupId);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskBackupName", this.DiskBackupName);
        this.setParamSimple(map, prefix + "DiskBackupState", this.DiskBackupState);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);

    }
}

