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

public class CreateImageRegistryTimedScanTaskConfigRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Task name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Whether to enable</p><p>Enumeration values:</p><ul><li>true: enable</li><li>false: disable</li></ul>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>Scan category</p><p>Enumeration values:</p><ul><li>VUL: Vulnerability</li><li>VIRUS: Trojan</li><li>RISK: Sensitive information</li></ul>
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
    * <p>Filtering configuration for scan target image</p>
    */
    @SerializedName("Target")
    @Expose
    private ImageScanAssetTarget Target;

    /**
    * <p>Mirror filter configuration</p>
    */
    @SerializedName("Filter")
    @Expose
    private ImageScanRegistryFilter Filter;

    /**
    * <p>CreateImageRegistryTimedScanTaskConfig</p>
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
     * Get <p>Task name</p> 
     * @return Name <p>Task name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task name</p>
     * @param Name <p>Task name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Whether to enable</p><p>Enumeration values:</p><ul><li>true: enable</li><li>false: disable</li></ul> 
     * @return Enable <p>Whether to enable</p><p>Enumeration values:</p><ul><li>true: enable</li><li>false: disable</li></ul>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Whether to enable</p><p>Enumeration values:</p><ul><li>true: enable</li><li>false: disable</li></ul>
     * @param Enable <p>Whether to enable</p><p>Enumeration values:</p><ul><li>true: enable</li><li>false: disable</li></ul>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Scan category</p><p>Enumeration values:</p><ul><li>VUL: Vulnerability</li><li>VIRUS: Trojan</li><li>RISK: Sensitive information</li></ul> 
     * @return ScanType <p>Scan category</p><p>Enumeration values:</p><ul><li>VUL: Vulnerability</li><li>VIRUS: Trojan</li><li>RISK: Sensitive information</li></ul>
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>Scan category</p><p>Enumeration values:</p><ul><li>VUL: Vulnerability</li><li>VIRUS: Trojan</li><li>RISK: Sensitive information</li></ul>
     * @param ScanType <p>Scan category</p><p>Enumeration values:</p><ul><li>VUL: Vulnerability</li><li>VIRUS: Trojan</li><li>RISK: Sensitive information</li></ul>
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
     * Get <p>Filtering configuration for scan target image</p> 
     * @return Target <p>Filtering configuration for scan target image</p>
     */
    public ImageScanAssetTarget getTarget() {
        return this.Target;
    }

    /**
     * Set <p>Filtering configuration for scan target image</p>
     * @param Target <p>Filtering configuration for scan target image</p>
     */
    public void setTarget(ImageScanAssetTarget Target) {
        this.Target = Target;
    }

    /**
     * Get <p>Mirror filter configuration</p> 
     * @return Filter <p>Mirror filter configuration</p>
     */
    public ImageScanRegistryFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Mirror filter configuration</p>
     * @param Filter <p>Mirror filter configuration</p>
     */
    public void setFilter(ImageScanRegistryFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>CreateImageRegistryTimedScanTaskConfig</p> 
     * @return Timeout <p>CreateImageRegistryTimedScanTaskConfig</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>CreateImageRegistryTimedScanTaskConfig</p>
     * @param Timeout <p>CreateImageRegistryTimedScanTaskConfig</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public CreateImageRegistryTimedScanTaskConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRegistryTimedScanTaskConfigRequest(CreateImageRegistryTimedScanTaskConfigRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.Target != null) {
            this.Target = new ImageScanAssetTarget(source.Target);
        }
        if (source.Filter != null) {
            this.Filter = new ImageScanRegistryFilter(source.Filter);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

