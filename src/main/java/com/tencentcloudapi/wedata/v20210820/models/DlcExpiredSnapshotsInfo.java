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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcExpiredSnapshotsInfo extends AbstractModel {

    /**
    * Whether to enable snapshot expiration governance: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExpiredSnapshotsEnable")
    @Expose
    private String ExpiredSnapshotsEnable;

    /**
    * Name of the engine used to run snapshot expiration governance
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Number of recent snapshots to retain
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RetainLast")
    @Expose
    private Long RetainLast;

    /**
    * Snapshots expired before specified days
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BeforeDays")
    @Expose
    private Long BeforeDays;

    /**
    * Number of parallel processes for cleaning up expired snapshots
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MaxConcurrentDeletes")
    @Expose
    private Long MaxConcurrentDeletes;

    /**
    * Snapshot expiration governance run cycle, unit: minutes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IntervalMin")
    @Expose
    private Long IntervalMin;

    /**
     * Get Whether to enable snapshot expiration governance: enable, none
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExpiredSnapshotsEnable Whether to enable snapshot expiration governance: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExpiredSnapshotsEnable() {
        return this.ExpiredSnapshotsEnable;
    }

    /**
     * Set Whether to enable snapshot expiration governance: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExpiredSnapshotsEnable Whether to enable snapshot expiration governance: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExpiredSnapshotsEnable(String ExpiredSnapshotsEnable) {
        this.ExpiredSnapshotsEnable = ExpiredSnapshotsEnable;
    }

    /**
     * Get Name of the engine used to run snapshot expiration governance
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Engine Name of the engine used to run snapshot expiration governance
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Name of the engine used to run snapshot expiration governance
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Engine Name of the engine used to run snapshot expiration governance
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Number of recent snapshots to retain
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RetainLast Number of recent snapshots to retain
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRetainLast() {
        return this.RetainLast;
    }

    /**
     * Set Number of recent snapshots to retain
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RetainLast Number of recent snapshots to retain
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRetainLast(Long RetainLast) {
        this.RetainLast = RetainLast;
    }

    /**
     * Get Snapshots expired before specified days
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BeforeDays Snapshots expired before specified days
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getBeforeDays() {
        return this.BeforeDays;
    }

    /**
     * Set Snapshots expired before specified days
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BeforeDays Snapshots expired before specified days
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBeforeDays(Long BeforeDays) {
        this.BeforeDays = BeforeDays;
    }

    /**
     * Get Number of parallel processes for cleaning up expired snapshots
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MaxConcurrentDeletes Number of parallel processes for cleaning up expired snapshots
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMaxConcurrentDeletes() {
        return this.MaxConcurrentDeletes;
    }

    /**
     * Set Number of parallel processes for cleaning up expired snapshots
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MaxConcurrentDeletes Number of parallel processes for cleaning up expired snapshots
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMaxConcurrentDeletes(Long MaxConcurrentDeletes) {
        this.MaxConcurrentDeletes = MaxConcurrentDeletes;
    }

    /**
     * Get Snapshot expiration governance run cycle, unit: minutes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IntervalMin Snapshot expiration governance run cycle, unit: minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getIntervalMin() {
        return this.IntervalMin;
    }

    /**
     * Set Snapshot expiration governance run cycle, unit: minutes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IntervalMin Snapshot expiration governance run cycle, unit: minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIntervalMin(Long IntervalMin) {
        this.IntervalMin = IntervalMin;
    }

    public DlcExpiredSnapshotsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcExpiredSnapshotsInfo(DlcExpiredSnapshotsInfo source) {
        if (source.ExpiredSnapshotsEnable != null) {
            this.ExpiredSnapshotsEnable = new String(source.ExpiredSnapshotsEnable);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.RetainLast != null) {
            this.RetainLast = new Long(source.RetainLast);
        }
        if (source.BeforeDays != null) {
            this.BeforeDays = new Long(source.BeforeDays);
        }
        if (source.MaxConcurrentDeletes != null) {
            this.MaxConcurrentDeletes = new Long(source.MaxConcurrentDeletes);
        }
        if (source.IntervalMin != null) {
            this.IntervalMin = new Long(source.IntervalMin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpiredSnapshotsEnable", this.ExpiredSnapshotsEnable);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "RetainLast", this.RetainLast);
        this.setParamSimple(map, prefix + "BeforeDays", this.BeforeDays);
        this.setParamSimple(map, prefix + "MaxConcurrentDeletes", this.MaxConcurrentDeletes);
        this.setParamSimple(map, prefix + "IntervalMin", this.IntervalMin);

    }
}

