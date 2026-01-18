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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAdvertisingOverviewRequest extends AbstractModel {

    /**
    * Start time in YYYYMMDD format
    */
    @SerializedName("TimeBegin")
    @Expose
    private String TimeBegin;

    /**
    * Mini program appid
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Tenant ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * End time in YYYYMMDD format
    */
    @SerializedName("TimeEnd")
    @Expose
    private String TimeEnd;

    /**
    * // 0 All, 2-Android, 3 iOS
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * //1-BANNER  2-REWARDED
    */
    @SerializedName("AdUnitType")
    @Expose
    private String AdUnitType;

    /**
     * Get Start time in YYYYMMDD format 
     * @return TimeBegin Start time in YYYYMMDD format
     */
    public String getTimeBegin() {
        return this.TimeBegin;
    }

    /**
     * Set Start time in YYYYMMDD format
     * @param TimeBegin Start time in YYYYMMDD format
     */
    public void setTimeBegin(String TimeBegin) {
        this.TimeBegin = TimeBegin;
    }

    /**
     * Get Mini program appid 
     * @return MNPId Mini program appid
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program appid
     * @param MNPId Mini program appid
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Tenant ID 
     * @return PlatformId Tenant ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Tenant ID
     * @param PlatformId Tenant ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get End time in YYYYMMDD format 
     * @return TimeEnd End time in YYYYMMDD format
     */
    public String getTimeEnd() {
        return this.TimeEnd;
    }

    /**
     * Set End time in YYYYMMDD format
     * @param TimeEnd End time in YYYYMMDD format
     */
    public void setTimeEnd(String TimeEnd) {
        this.TimeEnd = TimeEnd;
    }

    /**
     * Get // 0 All, 2-Android, 3 iOS 
     * @return Platform // 0 All, 2-Android, 3 iOS
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set // 0 All, 2-Android, 3 iOS
     * @param Platform // 0 All, 2-Android, 3 iOS
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get //1-BANNER  2-REWARDED 
     * @return AdUnitType //1-BANNER  2-REWARDED
     */
    public String getAdUnitType() {
        return this.AdUnitType;
    }

    /**
     * Set //1-BANNER  2-REWARDED
     * @param AdUnitType //1-BANNER  2-REWARDED
     */
    public void setAdUnitType(String AdUnitType) {
        this.AdUnitType = AdUnitType;
    }

    public DescribeAdvertisingOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAdvertisingOverviewRequest(DescribeAdvertisingOverviewRequest source) {
        if (source.TimeBegin != null) {
            this.TimeBegin = new String(source.TimeBegin);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.TimeEnd != null) {
            this.TimeEnd = new String(source.TimeEnd);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.AdUnitType != null) {
            this.AdUnitType = new String(source.AdUnitType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeBegin", this.TimeBegin);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "TimeEnd", this.TimeEnd);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AdUnitType", this.AdUnitType);

    }
}

