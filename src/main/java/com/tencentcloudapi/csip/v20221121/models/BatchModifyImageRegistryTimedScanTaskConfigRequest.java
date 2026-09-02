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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyImageRegistryTimedScanTaskConfigRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * <p>Whether to enable</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>Scan category</p><p>Enumeration value:</p><ul><li>CVE: Vulnerability</li><li>RISK: Risk</li><li>VIRUS: Trojan</li></ul>
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * <p>Scheduled task scheduling configuration</p>
    */
    @SerializedName("Schedule")
    @Expose
    private ImageScanScheduleConfig Schedule;

    /**
    * <p>Timeout period, in seconds</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Task ID.</p> 
     * @return Id <p>Task ID.</p>
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set <p>Task ID.</p>
     * @param Id <p>Task ID.</p>
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Whether to enable</p> 
     * @return Enable <p>Whether to enable</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Whether to enable</p>
     * @param Enable <p>Whether to enable</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Scan category</p><p>Enumeration value:</p><ul><li>CVE: Vulnerability</li><li>RISK: Risk</li><li>VIRUS: Trojan</li></ul> 
     * @return ScanType <p>Scan category</p><p>Enumeration value:</p><ul><li>CVE: Vulnerability</li><li>RISK: Risk</li><li>VIRUS: Trojan</li></ul>
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>Scan category</p><p>Enumeration value:</p><ul><li>CVE: Vulnerability</li><li>RISK: Risk</li><li>VIRUS: Trojan</li></ul>
     * @param ScanType <p>Scan category</p><p>Enumeration value:</p><ul><li>CVE: Vulnerability</li><li>RISK: Risk</li><li>VIRUS: Trojan</li></ul>
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>Scheduled task scheduling configuration</p> 
     * @return Schedule <p>Scheduled task scheduling configuration</p>
     */
    public ImageScanScheduleConfig getSchedule() {
        return this.Schedule;
    }

    /**
     * Set <p>Scheduled task scheduling configuration</p>
     * @param Schedule <p>Scheduled task scheduling configuration</p>
     */
    public void setSchedule(ImageScanScheduleConfig Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get <p>Timeout period, in seconds</p> 
     * @return Timeout <p>Timeout period, in seconds</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Timeout period, in seconds</p>
     * @param Timeout <p>Timeout period, in seconds</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public BatchModifyImageRegistryTimedScanTaskConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyImageRegistryTimedScanTaskConfigRequest(BatchModifyImageRegistryTimedScanTaskConfigRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.Schedule != null) {
            this.Schedule = new ImageScanScheduleConfig(source.Schedule);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

