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

public class ImageRegistryTimedScanTaskInfo extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Task name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Whether to enable</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul>
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
    * <p>Scan target image filtering configuration</p>
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
    * <p>Timeout period, in seconds</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * <p>Scheduled task associated account name</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>appid of the account associated with the scheduled task</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>uin of the associated account for the scheduled task</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>Configuration creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Configuration update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Task ID.</p> 
     * @return Id <p>Task ID.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Task ID.</p>
     * @param Id <p>Task ID.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul> 
     * @return ScanType <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul>
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul>
     * @param ScanType <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul>
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
     * Get <p>Scan target image filtering configuration</p> 
     * @return Target <p>Scan target image filtering configuration</p>
     */
    public ImageScanAssetTarget getTarget() {
        return this.Target;
    }

    /**
     * Set <p>Scan target image filtering configuration</p>
     * @param Target <p>Scan target image filtering configuration</p>
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

    /**
     * Get <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return LastScanTime <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param LastScanTime <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get <p>Scheduled task associated account name</p> 
     * @return OwnerAccountName <p>Scheduled task associated account name</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Scheduled task associated account name</p>
     * @param OwnerAccountName <p>Scheduled task associated account name</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>appid of the account associated with the scheduled task</p> 
     * @return OwnerAppId <p>appid of the account associated with the scheduled task</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the account associated with the scheduled task</p>
     * @param OwnerAppId <p>appid of the account associated with the scheduled task</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>uin of the associated account for the scheduled task</p> 
     * @return OwnerUin <p>uin of the associated account for the scheduled task</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>uin of the associated account for the scheduled task</p>
     * @param OwnerUin <p>uin of the associated account for the scheduled task</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Configuration creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return CreateTime <p>Configuration creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Configuration creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param CreateTime <p>Configuration creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Configuration update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return UpdateTime <p>Configuration update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Configuration update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param UpdateTime <p>Configuration update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ImageRegistryTimedScanTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryTimedScanTaskInfo(ImageRegistryTimedScanTaskInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

