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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataBackupStatisticsModel extends AbstractModel {

    /**
    * Auto-backup count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * Auto-backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoBackupSize")
    @Expose
    private Long AutoBackupSize;

    /**
    * Avg backup size per each, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AverageSizePerBackup")
    @Expose
    private Long AverageSizePerBackup;

    /**
    * Avg daily backup size, Byte
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AverageSizePerDay")
    @Expose
    private Long AverageSizePerDay;

    /**
    * Manual backup count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * Manual backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManualBackupSize")
    @Expose
    private Long ManualBackupSize;

    /**
    * Number of data backups
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Data backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
     * Get Auto-backup count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoBackupCount Auto-backup count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set Auto-backup count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoBackupCount Auto-backup count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get Auto-backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoBackupSize Auto-backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutoBackupSize() {
        return this.AutoBackupSize;
    }

    /**
     * Set Auto-backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoBackupSize Auto-backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoBackupSize(Long AutoBackupSize) {
        this.AutoBackupSize = AutoBackupSize;
    }

    /**
     * Get Avg backup size per each, in Byte
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AverageSizePerBackup Avg backup size per each, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAverageSizePerBackup() {
        return this.AverageSizePerBackup;
    }

    /**
     * Set Avg backup size per each, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AverageSizePerBackup Avg backup size per each, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAverageSizePerBackup(Long AverageSizePerBackup) {
        this.AverageSizePerBackup = AverageSizePerBackup;
    }

    /**
     * Get Avg daily backup size, Byte
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AverageSizePerDay Avg daily backup size, Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAverageSizePerDay() {
        return this.AverageSizePerDay;
    }

    /**
     * Set Avg daily backup size, Byte
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AverageSizePerDay Avg daily backup size, Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAverageSizePerDay(Long AverageSizePerDay) {
        this.AverageSizePerDay = AverageSizePerDay;
    }

    /**
     * Get Manual backup count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManualBackupCount Manual backup count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set Manual backup count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManualBackupCount Manual backup count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
    }

    /**
     * Get Manual backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManualBackupSize Manual backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getManualBackupSize() {
        return this.ManualBackupSize;
    }

    /**
     * Set Manual backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManualBackupSize Manual backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManualBackupSize(Long ManualBackupSize) {
        this.ManualBackupSize = ManualBackupSize;
    }

    /**
     * Get Number of data backups
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of data backups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of data backups
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of data backups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Data backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalSize Data backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set Data backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalSize Data backup size, in Byte
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    public DataBackupStatisticsModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataBackupStatisticsModel(DataBackupStatisticsModel source) {
        if (source.AutoBackupCount != null) {
            this.AutoBackupCount = new Long(source.AutoBackupCount);
        }
        if (source.AutoBackupSize != null) {
            this.AutoBackupSize = new Long(source.AutoBackupSize);
        }
        if (source.AverageSizePerBackup != null) {
            this.AverageSizePerBackup = new Long(source.AverageSizePerBackup);
        }
        if (source.AverageSizePerDay != null) {
            this.AverageSizePerDay = new Long(source.AverageSizePerDay);
        }
        if (source.ManualBackupCount != null) {
            this.ManualBackupCount = new Long(source.ManualBackupCount);
        }
        if (source.ManualBackupSize != null) {
            this.ManualBackupSize = new Long(source.ManualBackupSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoBackupCount", this.AutoBackupCount);
        this.setParamSimple(map, prefix + "AutoBackupSize", this.AutoBackupSize);
        this.setParamSimple(map, prefix + "AverageSizePerBackup", this.AverageSizePerBackup);
        this.setParamSimple(map, prefix + "AverageSizePerDay", this.AverageSizePerDay);
        this.setParamSimple(map, prefix + "ManualBackupCount", this.ManualBackupCount);
        this.setParamSimple(map, prefix + "ManualBackupSize", this.ManualBackupSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

