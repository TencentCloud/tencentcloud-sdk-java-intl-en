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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoverStaffInfo extends AbstractModel {

    /**
    * Shift personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverStaffIDs")
    @Expose
    private String [] CoverStaffIDs;

    /**
    * Shift start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverStartTime")
    @Expose
    private Long CoverStartTime;

    /**
    * Shift end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverEndTime")
    @Expose
    private Long CoverEndTime;

    /**
     * Get Shift personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoverStaffIDs Shift personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCoverStaffIDs() {
        return this.CoverStaffIDs;
    }

    /**
     * Set Shift personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoverStaffIDs Shift personnel ID group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverStaffIDs(String [] CoverStaffIDs) {
        this.CoverStaffIDs = CoverStaffIDs;
    }

    /**
     * Get Shift start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoverStartTime Shift start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCoverStartTime() {
        return this.CoverStartTime;
    }

    /**
     * Set Shift start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoverStartTime Shift start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverStartTime(Long CoverStartTime) {
        this.CoverStartTime = CoverStartTime;
    }

    /**
     * Get Shift end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoverEndTime Shift end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCoverEndTime() {
        return this.CoverEndTime;
    }

    /**
     * Set Shift end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoverEndTime Shift end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverEndTime(Long CoverEndTime) {
        this.CoverEndTime = CoverEndTime;
    }

    public CoverStaffInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoverStaffInfo(CoverStaffInfo source) {
        if (source.CoverStaffIDs != null) {
            this.CoverStaffIDs = new String[source.CoverStaffIDs.length];
            for (int i = 0; i < source.CoverStaffIDs.length; i++) {
                this.CoverStaffIDs[i] = new String(source.CoverStaffIDs[i]);
            }
        }
        if (source.CoverStartTime != null) {
            this.CoverStartTime = new Long(source.CoverStartTime);
        }
        if (source.CoverEndTime != null) {
            this.CoverEndTime = new Long(source.CoverEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CoverStaffIDs.", this.CoverStaffIDs);
        this.setParamSimple(map, prefix + "CoverStartTime", this.CoverStartTime);
        this.setParamSimple(map, prefix + "CoverEndTime", this.CoverEndTime);

    }
}

