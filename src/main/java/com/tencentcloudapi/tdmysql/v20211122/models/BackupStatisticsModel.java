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

public class BackupStatisticsModel extends AbstractModel {

    /**
    * <p>Average size of total backup per day in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AverageSizePerDay")
    @Expose
    private Long AverageSizePerDay;

    /**
    * <p>Backup size of data, in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataBackupSize")
    @Expose
    private Long DataBackupSize;

    /**
    * <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogBackupSize")
    @Expose
    private Long LogBackupSize;

    /**
    * <p>Total backup count</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Total backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
     * Get <p>Average size of total backup per day in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AverageSizePerDay <p>Average size of total backup per day in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAverageSizePerDay() {
        return this.AverageSizePerDay;
    }

    /**
     * Set <p>Average size of total backup per day in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AverageSizePerDay <p>Average size of total backup per day in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAverageSizePerDay(Long AverageSizePerDay) {
        this.AverageSizePerDay = AverageSizePerDay;
    }

    /**
     * Get <p>Backup size of data, in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataBackupSize <p>Backup size of data, in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataBackupSize() {
        return this.DataBackupSize;
    }

    /**
     * Set <p>Backup size of data, in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataBackupSize <p>Backup size of data, in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataBackupSize(Long DataBackupSize) {
        this.DataBackupSize = DataBackupSize;
    }

    /**
     * Get <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogBackupSize <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLogBackupSize() {
        return this.LogBackupSize;
    }

    /**
     * Set <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogBackupSize <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogBackupSize(Long LogBackupSize) {
        this.LogBackupSize = LogBackupSize;
    }

    /**
     * Get <p>Total backup count</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount <p>Total backup count</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total backup count</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount <p>Total backup count</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Total backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalSize <p>Total backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set <p>Total backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalSize <p>Total backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    public BackupStatisticsModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupStatisticsModel(BackupStatisticsModel source) {
        if (source.AverageSizePerDay != null) {
            this.AverageSizePerDay = new Long(source.AverageSizePerDay);
        }
        if (source.DataBackupSize != null) {
            this.DataBackupSize = new Long(source.DataBackupSize);
        }
        if (source.LogBackupSize != null) {
            this.LogBackupSize = new Long(source.LogBackupSize);
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
        this.setParamSimple(map, prefix + "AverageSizePerDay", this.AverageSizePerDay);
        this.setParamSimple(map, prefix + "DataBackupSize", this.DataBackupSize);
        this.setParamSimple(map, prefix + "LogBackupSize", this.LogBackupSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

