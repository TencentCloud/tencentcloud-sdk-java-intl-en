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

public class LogBackupStatisticsModel extends AbstractModel {

    /**
    * <p>Avg size of each log backup in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AverageSizePerBackup")
    @Expose
    private Long AverageSizePerBackup;

    /**
    * <p>Avg daily log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AverageSizePerDay")
    @Expose
    private Long AverageSizePerDay;

    /**
    * <p>Number of log backups</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
     * Get <p>Avg size of each log backup in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AverageSizePerBackup <p>Avg size of each log backup in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAverageSizePerBackup() {
        return this.AverageSizePerBackup;
    }

    /**
     * Set <p>Avg size of each log backup in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AverageSizePerBackup <p>Avg size of each log backup in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAverageSizePerBackup(Long AverageSizePerBackup) {
        this.AverageSizePerBackup = AverageSizePerBackup;
    }

    /**
     * Get <p>Avg daily log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AverageSizePerDay <p>Avg daily log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAverageSizePerDay() {
        return this.AverageSizePerDay;
    }

    /**
     * Set <p>Avg daily log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AverageSizePerDay <p>Avg daily log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAverageSizePerDay(Long AverageSizePerDay) {
        this.AverageSizePerDay = AverageSizePerDay;
    }

    /**
     * Get <p>Number of log backups</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount <p>Number of log backups</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Number of log backups</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount <p>Number of log backups</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalSize <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalSize <p>Log backup size in Byte</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    public LogBackupStatisticsModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogBackupStatisticsModel(LogBackupStatisticsModel source) {
        if (source.AverageSizePerBackup != null) {
            this.AverageSizePerBackup = new Long(source.AverageSizePerBackup);
        }
        if (source.AverageSizePerDay != null) {
            this.AverageSizePerDay = new Long(source.AverageSizePerDay);
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
        this.setParamSimple(map, prefix + "AverageSizePerBackup", this.AverageSizePerBackup);
        this.setParamSimple(map, prefix + "AverageSizePerDay", this.AverageSizePerDay);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

