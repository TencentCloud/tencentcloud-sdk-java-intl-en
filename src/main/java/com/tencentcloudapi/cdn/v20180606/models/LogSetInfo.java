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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogSetInfo extends AbstractModel {

    /**
    * Developer ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Channel
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Logset name
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * Whether it is the default logset
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Log retention period in days
    */
    @SerializedName("LogsetSavePeriod")
    @Expose
    private Long LogsetSavePeriod;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Deleted")
    @Expose
    private String Deleted;

    /**
    * Whether English is used in this region
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RegionEn")
    @Expose
    private String RegionEn;

    /**
     * Get Developer ID 
     * @return AppId Developer ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Developer ID
     * @param AppId Developer ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Channel
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Channel Channel
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set Channel
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Channel Channel
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get Logset ID 
     * @return LogsetId Logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
     * @param LogsetId Logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Logset name 
     * @return LogsetName Logset name
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set Logset name
     * @param LogsetName Logset name
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get Whether it is the default logset 
     * @return IsDefault Whether it is the default logset
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default logset
     * @param IsDefault Whether it is the default logset
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Log retention period in days 
     * @return LogsetSavePeriod Log retention period in days
     */
    public Long getLogsetSavePeriod() {
        return this.LogsetSavePeriod;
    }

    /**
     * Set Log retention period in days
     * @param LogsetSavePeriod Log retention period in days
     */
    public void setLogsetSavePeriod(Long LogsetSavePeriod) {
        this.LogsetSavePeriod = LogsetSavePeriod;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Deleted Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getDeleted() {
        return this.Deleted;
    }

    /**
     * Set Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Deleted Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDeleted(String Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get Whether English is used in this region
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RegionEn Whether English is used in this region
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRegionEn() {
        return this.RegionEn;
    }

    /**
     * Set Whether English is used in this region
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RegionEn Whether English is used in this region
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRegionEn(String RegionEn) {
        this.RegionEn = RegionEn;
    }

    public LogSetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogSetInfo(LogSetInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.LogsetSavePeriod != null) {
            this.LogsetSavePeriod = new Long(source.LogsetSavePeriod);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Deleted != null) {
            this.Deleted = new String(source.Deleted);
        }
        if (source.RegionEn != null) {
            this.RegionEn = new String(source.RegionEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "LogsetSavePeriod", this.LogsetSavePeriod);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "RegionEn", this.RegionEn);

    }
}

