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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanVulSettingRequest extends AbstractModel {

    /**
    * Regular detection interval (days)
    */
    @SerializedName("TimerInterval")
    @Expose
    private Long TimerInterval;

    /**
    * Vulnerability type. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability. Pass in the values in array format. Example: [1,2]
    */
    @SerializedName("VulCategories")
    @Expose
    private Long [] VulCategories;

    /**
    * Severity level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical. Pass in the values in array format. Example: [1,2,3]
    */
    @SerializedName("VulLevels")
    @Expose
    private Long [] VulLevels;

    /**
    * Periodic detection time. Example: 02:10:50
    */
    @SerializedName("TimerTime")
    @Expose
    private String TimerTime;

    /**
    * Whether the vulnerability is an emergency vulnerability. 0: no; 1: yes.
    */
    @SerializedName("VulEmergency")
    @Expose
    private Long VulEmergency;

    /**
    * Scan start time. Example: 00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Scan end time. Example: 08:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Whether to enable scanning. 1: enable; 0: disable.
    */
    @SerializedName("EnableScan")
    @Expose
    private Long EnableScan;

    /**
    * If empty, scan hosts with all Professional, Premium, and General Discount editions by default; if not empty, only scan the selected hosts.
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * 
    */
    @SerializedName("ScanMethod")
    @Expose
    private Long ScanMethod;

    /**
     * Get Regular detection interval (days) 
     * @return TimerInterval Regular detection interval (days)
     */
    public Long getTimerInterval() {
        return this.TimerInterval;
    }

    /**
     * Set Regular detection interval (days)
     * @param TimerInterval Regular detection interval (days)
     */
    public void setTimerInterval(Long TimerInterval) {
        this.TimerInterval = TimerInterval;
    }

    /**
     * Get Vulnerability type. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability. Pass in the values in array format. Example: [1,2] 
     * @return VulCategories Vulnerability type. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability. Pass in the values in array format. Example: [1,2]
     */
    public Long [] getVulCategories() {
        return this.VulCategories;
    }

    /**
     * Set Vulnerability type. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability. Pass in the values in array format. Example: [1,2]
     * @param VulCategories Vulnerability type. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability. Pass in the values in array format. Example: [1,2]
     */
    public void setVulCategories(Long [] VulCategories) {
        this.VulCategories = VulCategories;
    }

    /**
     * Get Severity level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical. Pass in the values in array format. Example: [1,2,3] 
     * @return VulLevels Severity level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical. Pass in the values in array format. Example: [1,2,3]
     */
    public Long [] getVulLevels() {
        return this.VulLevels;
    }

    /**
     * Set Severity level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical. Pass in the values in array format. Example: [1,2,3]
     * @param VulLevels Severity level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical. Pass in the values in array format. Example: [1,2,3]
     */
    public void setVulLevels(Long [] VulLevels) {
        this.VulLevels = VulLevels;
    }

    /**
     * Get Periodic detection time. Example: 02:10:50 
     * @return TimerTime Periodic detection time. Example: 02:10:50
     */
    public String getTimerTime() {
        return this.TimerTime;
    }

    /**
     * Set Periodic detection time. Example: 02:10:50
     * @param TimerTime Periodic detection time. Example: 02:10:50
     */
    public void setTimerTime(String TimerTime) {
        this.TimerTime = TimerTime;
    }

    /**
     * Get Whether the vulnerability is an emergency vulnerability. 0: no; 1: yes. 
     * @return VulEmergency Whether the vulnerability is an emergency vulnerability. 0: no; 1: yes.
     */
    public Long getVulEmergency() {
        return this.VulEmergency;
    }

    /**
     * Set Whether the vulnerability is an emergency vulnerability. 0: no; 1: yes.
     * @param VulEmergency Whether the vulnerability is an emergency vulnerability. 0: no; 1: yes.
     */
    public void setVulEmergency(Long VulEmergency) {
        this.VulEmergency = VulEmergency;
    }

    /**
     * Get Scan start time. Example: 00:00 
     * @return StartTime Scan start time. Example: 00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Scan start time. Example: 00:00
     * @param StartTime Scan start time. Example: 00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Scan end time. Example: 08:00 
     * @return EndTime Scan end time. Example: 08:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Scan end time. Example: 08:00
     * @param EndTime Scan end time. Example: 08:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Whether to enable scanning. 1: enable; 0: disable. 
     * @return EnableScan Whether to enable scanning. 1: enable; 0: disable.
     */
    public Long getEnableScan() {
        return this.EnableScan;
    }

    /**
     * Set Whether to enable scanning. 1: enable; 0: disable.
     * @param EnableScan Whether to enable scanning. 1: enable; 0: disable.
     */
    public void setEnableScan(Long EnableScan) {
        this.EnableScan = EnableScan;
    }

    /**
     * Get If empty, scan hosts with all Professional, Premium, and General Discount editions by default; if not empty, only scan the selected hosts. 
     * @return Uuids If empty, scan hosts with all Professional, Premium, and General Discount editions by default; if not empty, only scan the selected hosts.
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set If empty, scan hosts with all Professional, Premium, and General Discount editions by default; if not empty, only scan the selected hosts.
     * @param Uuids If empty, scan hosts with all Professional, Premium, and General Discount editions by default; if not empty, only scan the selected hosts.
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get  
     * @return ScanMethod 
     */
    public Long getScanMethod() {
        return this.ScanMethod;
    }

    /**
     * Set 
     * @param ScanMethod 
     */
    public void setScanMethod(Long ScanMethod) {
        this.ScanMethod = ScanMethod;
    }

    public ScanVulSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanVulSettingRequest(ScanVulSettingRequest source) {
        if (source.TimerInterval != null) {
            this.TimerInterval = new Long(source.TimerInterval);
        }
        if (source.VulCategories != null) {
            this.VulCategories = new Long[source.VulCategories.length];
            for (int i = 0; i < source.VulCategories.length; i++) {
                this.VulCategories[i] = new Long(source.VulCategories[i]);
            }
        }
        if (source.VulLevels != null) {
            this.VulLevels = new Long[source.VulLevels.length];
            for (int i = 0; i < source.VulLevels.length; i++) {
                this.VulLevels[i] = new Long(source.VulLevels[i]);
            }
        }
        if (source.TimerTime != null) {
            this.TimerTime = new String(source.TimerTime);
        }
        if (source.VulEmergency != null) {
            this.VulEmergency = new Long(source.VulEmergency);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.EnableScan != null) {
            this.EnableScan = new Long(source.EnableScan);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.ScanMethod != null) {
            this.ScanMethod = new Long(source.ScanMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerInterval", this.TimerInterval);
        this.setParamArraySimple(map, prefix + "VulCategories.", this.VulCategories);
        this.setParamArraySimple(map, prefix + "VulLevels.", this.VulLevels);
        this.setParamSimple(map, prefix + "TimerTime", this.TimerTime);
        this.setParamSimple(map, prefix + "VulEmergency", this.VulEmergency);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EnableScan", this.EnableScan);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "ScanMethod", this.ScanMethod);

    }
}

