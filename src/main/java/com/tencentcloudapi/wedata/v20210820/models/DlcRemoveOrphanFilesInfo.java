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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcRemoveOrphanFilesInfo extends AbstractModel {

    /**
    * Enable Removal of Isolated Files Governance Item: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemoveOrphanFilesEnable")
    @Expose
    private String RemoveOrphanFilesEnable;

    /**
    * Engine Name for Running Removal of Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Remove Isolated Files Older Than Specified Days
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BeforeDays")
    @Expose
    private Long BeforeDays;

    /**
    * Number of Concurrent Processes for Removing Isolated Files
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MaxConcurrentDeletes")
    @Expose
    private Long MaxConcurrentDeletes;

    /**
    * Isolated Files Governance Run Cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IntervalMin")
    @Expose
    private Long IntervalMin;

    /**
     * Get Enable Removal of Isolated Files Governance Item: enable, none
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RemoveOrphanFilesEnable Enable Removal of Isolated Files Governance Item: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRemoveOrphanFilesEnable() {
        return this.RemoveOrphanFilesEnable;
    }

    /**
     * Set Enable Removal of Isolated Files Governance Item: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RemoveOrphanFilesEnable Enable Removal of Isolated Files Governance Item: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemoveOrphanFilesEnable(String RemoveOrphanFilesEnable) {
        this.RemoveOrphanFilesEnable = RemoveOrphanFilesEnable;
    }

    /**
     * Get Engine Name for Running Removal of Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Engine Engine Name for Running Removal of Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Engine Name for Running Removal of Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Engine Engine Name for Running Removal of Isolated Files Governance Item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Remove Isolated Files Older Than Specified Days
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BeforeDays Remove Isolated Files Older Than Specified Days
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getBeforeDays() {
        return this.BeforeDays;
    }

    /**
     * Set Remove Isolated Files Older Than Specified Days
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BeforeDays Remove Isolated Files Older Than Specified Days
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBeforeDays(Long BeforeDays) {
        this.BeforeDays = BeforeDays;
    }

    /**
     * Get Number of Concurrent Processes for Removing Isolated Files
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MaxConcurrentDeletes Number of Concurrent Processes for Removing Isolated Files
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMaxConcurrentDeletes() {
        return this.MaxConcurrentDeletes;
    }

    /**
     * Set Number of Concurrent Processes for Removing Isolated Files
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MaxConcurrentDeletes Number of Concurrent Processes for Removing Isolated Files
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMaxConcurrentDeletes(Long MaxConcurrentDeletes) {
        this.MaxConcurrentDeletes = MaxConcurrentDeletes;
    }

    /**
     * Get Isolated Files Governance Run Cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IntervalMin Isolated Files Governance Run Cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getIntervalMin() {
        return this.IntervalMin;
    }

    /**
     * Set Isolated Files Governance Run Cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IntervalMin Isolated Files Governance Run Cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIntervalMin(Long IntervalMin) {
        this.IntervalMin = IntervalMin;
    }

    public DlcRemoveOrphanFilesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcRemoveOrphanFilesInfo(DlcRemoveOrphanFilesInfo source) {
        if (source.RemoveOrphanFilesEnable != null) {
            this.RemoveOrphanFilesEnable = new String(source.RemoveOrphanFilesEnable);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
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
        this.setParamSimple(map, prefix + "RemoveOrphanFilesEnable", this.RemoveOrphanFilesEnable);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "BeforeDays", this.BeforeDays);
        this.setParamSimple(map, prefix + "MaxConcurrentDeletes", this.MaxConcurrentDeletes);
        this.setParamSimple(map, prefix + "IntervalMin", this.IntervalMin);

    }
}

