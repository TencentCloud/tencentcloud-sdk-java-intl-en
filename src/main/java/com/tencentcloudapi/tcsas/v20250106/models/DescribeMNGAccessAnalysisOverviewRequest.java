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

public class DescribeMNGAccessAnalysisOverviewRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("TimeBegin")
    @Expose
    private Long TimeBegin;

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
    * End time
    */
    @SerializedName("TimeEnd")
    @Expose
    private Long TimeEnd;

    /**
    * 1 Production data, 0 Non-production data
    */
    @SerializedName("ProdData")
    @Expose
    private Long ProdData;

    /**
    * Operating system: 0 All, 2-Android, 3 iOS
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
     * Get Start time 
     * @return TimeBegin Start time
     */
    public Long getTimeBegin() {
        return this.TimeBegin;
    }

    /**
     * Set Start time
     * @param TimeBegin Start time
     */
    public void setTimeBegin(Long TimeBegin) {
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
     * Get End time 
     * @return TimeEnd End time
     */
    public Long getTimeEnd() {
        return this.TimeEnd;
    }

    /**
     * Set End time
     * @param TimeEnd End time
     */
    public void setTimeEnd(Long TimeEnd) {
        this.TimeEnd = TimeEnd;
    }

    /**
     * Get 1 Production data, 0 Non-production data 
     * @return ProdData 1 Production data, 0 Non-production data
     */
    public Long getProdData() {
        return this.ProdData;
    }

    /**
     * Set 1 Production data, 0 Non-production data
     * @param ProdData 1 Production data, 0 Non-production data
     */
    public void setProdData(Long ProdData) {
        this.ProdData = ProdData;
    }

    /**
     * Get Operating system: 0 All, 2-Android, 3 iOS 
     * @return Platform Operating system: 0 All, 2-Android, 3 iOS
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set Operating system: 0 All, 2-Android, 3 iOS
     * @param Platform Operating system: 0 All, 2-Android, 3 iOS
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    public DescribeMNGAccessAnalysisOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGAccessAnalysisOverviewRequest(DescribeMNGAccessAnalysisOverviewRequest source) {
        if (source.TimeBegin != null) {
            this.TimeBegin = new Long(source.TimeBegin);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.TimeEnd != null) {
            this.TimeEnd = new Long(source.TimeEnd);
        }
        if (source.ProdData != null) {
            this.ProdData = new Long(source.ProdData);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
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
        this.setParamSimple(map, prefix + "ProdData", this.ProdData);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

