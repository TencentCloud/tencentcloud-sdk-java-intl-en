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

public class BackupSummaryItem extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of automatic data backups of an instance.
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * Capacity of automatic data backups of an instance.
    */
    @SerializedName("AutoBackupVolume")
    @Expose
    private Long AutoBackupVolume;

    /**
    * Number of manual data backups of an instance.
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * Capacity of manual data backups of an instance.
    */
    @SerializedName("ManualBackupVolume")
    @Expose
    private Long ManualBackupVolume;

    /**
    * Total number of data backups of an instance (including automatic backups and manual backups).
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * Total capacity of data backups of an instance.
    */
    @SerializedName("DataBackupVolume")
    @Expose
    private Long DataBackupVolume;

    /**
    * Number of log backups of an instance.
    */
    @SerializedName("BinlogBackupCount")
    @Expose
    private Long BinlogBackupCount;

    /**
    * Capacity of log backups of an instance.
    */
    @SerializedName("BinlogBackupVolume")
    @Expose
    private Long BinlogBackupVolume;

    /**
    * Total capacity of backups of an instance (including data backups and log backups).
    */
    @SerializedName("BackupVolume")
    @Expose
    private Long BackupVolume;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Number of automatic data backups of an instance. 
     * @return AutoBackupCount Number of automatic data backups of an instance.
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set Number of automatic data backups of an instance.
     * @param AutoBackupCount Number of automatic data backups of an instance.
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get Capacity of automatic data backups of an instance. 
     * @return AutoBackupVolume Capacity of automatic data backups of an instance.
     */
    public Long getAutoBackupVolume() {
        return this.AutoBackupVolume;
    }

    /**
     * Set Capacity of automatic data backups of an instance.
     * @param AutoBackupVolume Capacity of automatic data backups of an instance.
     */
    public void setAutoBackupVolume(Long AutoBackupVolume) {
        this.AutoBackupVolume = AutoBackupVolume;
    }

    /**
     * Get Number of manual data backups of an instance. 
     * @return ManualBackupCount Number of manual data backups of an instance.
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set Number of manual data backups of an instance.
     * @param ManualBackupCount Number of manual data backups of an instance.
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
    }

    /**
     * Get Capacity of manual data backups of an instance. 
     * @return ManualBackupVolume Capacity of manual data backups of an instance.
     */
    public Long getManualBackupVolume() {
        return this.ManualBackupVolume;
    }

    /**
     * Set Capacity of manual data backups of an instance.
     * @param ManualBackupVolume Capacity of manual data backups of an instance.
     */
    public void setManualBackupVolume(Long ManualBackupVolume) {
        this.ManualBackupVolume = ManualBackupVolume;
    }

    /**
     * Get Total number of data backups of an instance (including automatic backups and manual backups). 
     * @return DataBackupCount Total number of data backups of an instance (including automatic backups and manual backups).
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set Total number of data backups of an instance (including automatic backups and manual backups).
     * @param DataBackupCount Total number of data backups of an instance (including automatic backups and manual backups).
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get Total capacity of data backups of an instance. 
     * @return DataBackupVolume Total capacity of data backups of an instance.
     */
    public Long getDataBackupVolume() {
        return this.DataBackupVolume;
    }

    /**
     * Set Total capacity of data backups of an instance.
     * @param DataBackupVolume Total capacity of data backups of an instance.
     */
    public void setDataBackupVolume(Long DataBackupVolume) {
        this.DataBackupVolume = DataBackupVolume;
    }

    /**
     * Get Number of log backups of an instance. 
     * @return BinlogBackupCount Number of log backups of an instance.
     */
    public Long getBinlogBackupCount() {
        return this.BinlogBackupCount;
    }

    /**
     * Set Number of log backups of an instance.
     * @param BinlogBackupCount Number of log backups of an instance.
     */
    public void setBinlogBackupCount(Long BinlogBackupCount) {
        this.BinlogBackupCount = BinlogBackupCount;
    }

    /**
     * Get Capacity of log backups of an instance. 
     * @return BinlogBackupVolume Capacity of log backups of an instance.
     */
    public Long getBinlogBackupVolume() {
        return this.BinlogBackupVolume;
    }

    /**
     * Set Capacity of log backups of an instance.
     * @param BinlogBackupVolume Capacity of log backups of an instance.
     */
    public void setBinlogBackupVolume(Long BinlogBackupVolume) {
        this.BinlogBackupVolume = BinlogBackupVolume;
    }

    /**
     * Get Total capacity of backups of an instance (including data backups and log backups). 
     * @return BackupVolume Total capacity of backups of an instance (including data backups and log backups).
     */
    public Long getBackupVolume() {
        return this.BackupVolume;
    }

    /**
     * Set Total capacity of backups of an instance (including data backups and log backups).
     * @param BackupVolume Total capacity of backups of an instance (including data backups and log backups).
     */
    public void setBackupVolume(Long BackupVolume) {
        this.BackupVolume = BackupVolume;
    }

    public BackupSummaryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupSummaryItem(BackupSummaryItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AutoBackupCount != null) {
            this.AutoBackupCount = new Long(source.AutoBackupCount);
        }
        if (source.AutoBackupVolume != null) {
            this.AutoBackupVolume = new Long(source.AutoBackupVolume);
        }
        if (source.ManualBackupCount != null) {
            this.ManualBackupCount = new Long(source.ManualBackupCount);
        }
        if (source.ManualBackupVolume != null) {
            this.ManualBackupVolume = new Long(source.ManualBackupVolume);
        }
        if (source.DataBackupCount != null) {
            this.DataBackupCount = new Long(source.DataBackupCount);
        }
        if (source.DataBackupVolume != null) {
            this.DataBackupVolume = new Long(source.DataBackupVolume);
        }
        if (source.BinlogBackupCount != null) {
            this.BinlogBackupCount = new Long(source.BinlogBackupCount);
        }
        if (source.BinlogBackupVolume != null) {
            this.BinlogBackupVolume = new Long(source.BinlogBackupVolume);
        }
        if (source.BackupVolume != null) {
            this.BackupVolume = new Long(source.BackupVolume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AutoBackupCount", this.AutoBackupCount);
        this.setParamSimple(map, prefix + "AutoBackupVolume", this.AutoBackupVolume);
        this.setParamSimple(map, prefix + "ManualBackupCount", this.ManualBackupCount);
        this.setParamSimple(map, prefix + "ManualBackupVolume", this.ManualBackupVolume);
        this.setParamSimple(map, prefix + "DataBackupCount", this.DataBackupCount);
        this.setParamSimple(map, prefix + "DataBackupVolume", this.DataBackupVolume);
        this.setParamSimple(map, prefix + "BinlogBackupCount", this.BinlogBackupCount);
        this.setParamSimple(map, prefix + "BinlogBackupVolume", this.BinlogBackupVolume);
        this.setParamSimple(map, prefix + "BackupVolume", this.BackupVolume);

    }
}

