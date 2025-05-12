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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogicBackupConfigInfo extends AbstractModel {

    /**
    * Whether automatic logical backup is enabled.
    */
    @SerializedName("LogicBackupEnable")
    @Expose
    private String LogicBackupEnable;

    /**
    * Specifies the automatic logic backup start time.
    */
    @SerializedName("LogicBackupTimeBeg")
    @Expose
    private Long LogicBackupTimeBeg;

    /**
    * Specifies the termination time of automatic logical backup.
    */
    @SerializedName("LogicBackupTimeEnd")
    @Expose
    private Long LogicBackupTimeEnd;

    /**
    * Specifies the retention time for automatic logical backup.
    */
    @SerializedName("LogicReserveDuration")
    @Expose
    private Long LogicReserveDuration;

    /**
    * Whether cross-regional logical backup is enabled.
    */
    @SerializedName("LogicCrossRegionsEnable")
    @Expose
    private String LogicCrossRegionsEnable;

    /**
    * 
    */
    @SerializedName("LogicCrossRegions")
    @Expose
    private String [] LogicCrossRegions;

    /**
     * Get Whether automatic logical backup is enabled. 
     * @return LogicBackupEnable Whether automatic logical backup is enabled.
     */
    public String getLogicBackupEnable() {
        return this.LogicBackupEnable;
    }

    /**
     * Set Whether automatic logical backup is enabled.
     * @param LogicBackupEnable Whether automatic logical backup is enabled.
     */
    public void setLogicBackupEnable(String LogicBackupEnable) {
        this.LogicBackupEnable = LogicBackupEnable;
    }

    /**
     * Get Specifies the automatic logic backup start time. 
     * @return LogicBackupTimeBeg Specifies the automatic logic backup start time.
     */
    public Long getLogicBackupTimeBeg() {
        return this.LogicBackupTimeBeg;
    }

    /**
     * Set Specifies the automatic logic backup start time.
     * @param LogicBackupTimeBeg Specifies the automatic logic backup start time.
     */
    public void setLogicBackupTimeBeg(Long LogicBackupTimeBeg) {
        this.LogicBackupTimeBeg = LogicBackupTimeBeg;
    }

    /**
     * Get Specifies the termination time of automatic logical backup. 
     * @return LogicBackupTimeEnd Specifies the termination time of automatic logical backup.
     */
    public Long getLogicBackupTimeEnd() {
        return this.LogicBackupTimeEnd;
    }

    /**
     * Set Specifies the termination time of automatic logical backup.
     * @param LogicBackupTimeEnd Specifies the termination time of automatic logical backup.
     */
    public void setLogicBackupTimeEnd(Long LogicBackupTimeEnd) {
        this.LogicBackupTimeEnd = LogicBackupTimeEnd;
    }

    /**
     * Get Specifies the retention time for automatic logical backup. 
     * @return LogicReserveDuration Specifies the retention time for automatic logical backup.
     */
    public Long getLogicReserveDuration() {
        return this.LogicReserveDuration;
    }

    /**
     * Set Specifies the retention time for automatic logical backup.
     * @param LogicReserveDuration Specifies the retention time for automatic logical backup.
     */
    public void setLogicReserveDuration(Long LogicReserveDuration) {
        this.LogicReserveDuration = LogicReserveDuration;
    }

    /**
     * Get Whether cross-regional logical backup is enabled. 
     * @return LogicCrossRegionsEnable Whether cross-regional logical backup is enabled.
     */
    public String getLogicCrossRegionsEnable() {
        return this.LogicCrossRegionsEnable;
    }

    /**
     * Set Whether cross-regional logical backup is enabled.
     * @param LogicCrossRegionsEnable Whether cross-regional logical backup is enabled.
     */
    public void setLogicCrossRegionsEnable(String LogicCrossRegionsEnable) {
        this.LogicCrossRegionsEnable = LogicCrossRegionsEnable;
    }

    /**
     * Get  
     * @return LogicCrossRegions 
     */
    public String [] getLogicCrossRegions() {
        return this.LogicCrossRegions;
    }

    /**
     * Set 
     * @param LogicCrossRegions 
     */
    public void setLogicCrossRegions(String [] LogicCrossRegions) {
        this.LogicCrossRegions = LogicCrossRegions;
    }

    public LogicBackupConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogicBackupConfigInfo(LogicBackupConfigInfo source) {
        if (source.LogicBackupEnable != null) {
            this.LogicBackupEnable = new String(source.LogicBackupEnable);
        }
        if (source.LogicBackupTimeBeg != null) {
            this.LogicBackupTimeBeg = new Long(source.LogicBackupTimeBeg);
        }
        if (source.LogicBackupTimeEnd != null) {
            this.LogicBackupTimeEnd = new Long(source.LogicBackupTimeEnd);
        }
        if (source.LogicReserveDuration != null) {
            this.LogicReserveDuration = new Long(source.LogicReserveDuration);
        }
        if (source.LogicCrossRegionsEnable != null) {
            this.LogicCrossRegionsEnable = new String(source.LogicCrossRegionsEnable);
        }
        if (source.LogicCrossRegions != null) {
            this.LogicCrossRegions = new String[source.LogicCrossRegions.length];
            for (int i = 0; i < source.LogicCrossRegions.length; i++) {
                this.LogicCrossRegions[i] = new String(source.LogicCrossRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogicBackupEnable", this.LogicBackupEnable);
        this.setParamSimple(map, prefix + "LogicBackupTimeBeg", this.LogicBackupTimeBeg);
        this.setParamSimple(map, prefix + "LogicBackupTimeEnd", this.LogicBackupTimeEnd);
        this.setParamSimple(map, prefix + "LogicReserveDuration", this.LogicReserveDuration);
        this.setParamSimple(map, prefix + "LogicCrossRegionsEnable", this.LogicCrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "LogicCrossRegions.", this.LogicCrossRegions);

    }
}

