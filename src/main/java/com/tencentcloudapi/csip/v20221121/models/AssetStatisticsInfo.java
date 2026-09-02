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

public class AssetStatisticsInfo extends AbstractModel {

    /**
    * <p>Total number of assets</p>
    */
    @SerializedName("AssetTotalCount")
    @Expose
    private Long AssetTotalCount;

    /**
    * <p>New asset count in the last 7 days</p>
    */
    @SerializedName("AssetAddCount")
    @Expose
    private Long AssetAddCount;

    /**
    * <p>Number of risky assets</p>
    */
    @SerializedName("RiskAssetCount")
    @Expose
    private Long RiskAssetCount;

    /**
    * <p>Number of assets with alarms.</p>
    */
    @SerializedName("AlarmAssetCount")
    @Expose
    private Long AlarmAssetCount;

    /**
    * <p>Number of public network assets</p>
    */
    @SerializedName("PublicAssetCount")
    @Expose
    private Long PublicAssetCount;

    /**
    * <p>Number of exposed assets</p>
    */
    @SerializedName("ExposeAssetCount")
    @Expose
    private Long ExposeAssetCount;

    /**
    * <p>Host asset quantity</p>
    */
    @SerializedName("CloudHostAssetCount")
    @Expose
    private Long CloudHostAssetCount;

    /**
     * Get <p>Total number of assets</p> 
     * @return AssetTotalCount <p>Total number of assets</p>
     */
    public Long getAssetTotalCount() {
        return this.AssetTotalCount;
    }

    /**
     * Set <p>Total number of assets</p>
     * @param AssetTotalCount <p>Total number of assets</p>
     */
    public void setAssetTotalCount(Long AssetTotalCount) {
        this.AssetTotalCount = AssetTotalCount;
    }

    /**
     * Get <p>New asset count in the last 7 days</p> 
     * @return AssetAddCount <p>New asset count in the last 7 days</p>
     */
    public Long getAssetAddCount() {
        return this.AssetAddCount;
    }

    /**
     * Set <p>New asset count in the last 7 days</p>
     * @param AssetAddCount <p>New asset count in the last 7 days</p>
     */
    public void setAssetAddCount(Long AssetAddCount) {
        this.AssetAddCount = AssetAddCount;
    }

    /**
     * Get <p>Number of risky assets</p> 
     * @return RiskAssetCount <p>Number of risky assets</p>
     */
    public Long getRiskAssetCount() {
        return this.RiskAssetCount;
    }

    /**
     * Set <p>Number of risky assets</p>
     * @param RiskAssetCount <p>Number of risky assets</p>
     */
    public void setRiskAssetCount(Long RiskAssetCount) {
        this.RiskAssetCount = RiskAssetCount;
    }

    /**
     * Get <p>Number of assets with alarms.</p> 
     * @return AlarmAssetCount <p>Number of assets with alarms.</p>
     */
    public Long getAlarmAssetCount() {
        return this.AlarmAssetCount;
    }

    /**
     * Set <p>Number of assets with alarms.</p>
     * @param AlarmAssetCount <p>Number of assets with alarms.</p>
     */
    public void setAlarmAssetCount(Long AlarmAssetCount) {
        this.AlarmAssetCount = AlarmAssetCount;
    }

    /**
     * Get <p>Number of public network assets</p> 
     * @return PublicAssetCount <p>Number of public network assets</p>
     */
    public Long getPublicAssetCount() {
        return this.PublicAssetCount;
    }

    /**
     * Set <p>Number of public network assets</p>
     * @param PublicAssetCount <p>Number of public network assets</p>
     */
    public void setPublicAssetCount(Long PublicAssetCount) {
        this.PublicAssetCount = PublicAssetCount;
    }

    /**
     * Get <p>Number of exposed assets</p> 
     * @return ExposeAssetCount <p>Number of exposed assets</p>
     */
    public Long getExposeAssetCount() {
        return this.ExposeAssetCount;
    }

    /**
     * Set <p>Number of exposed assets</p>
     * @param ExposeAssetCount <p>Number of exposed assets</p>
     */
    public void setExposeAssetCount(Long ExposeAssetCount) {
        this.ExposeAssetCount = ExposeAssetCount;
    }

    /**
     * Get <p>Host asset quantity</p> 
     * @return CloudHostAssetCount <p>Host asset quantity</p>
     */
    public Long getCloudHostAssetCount() {
        return this.CloudHostAssetCount;
    }

    /**
     * Set <p>Host asset quantity</p>
     * @param CloudHostAssetCount <p>Host asset quantity</p>
     */
    public void setCloudHostAssetCount(Long CloudHostAssetCount) {
        this.CloudHostAssetCount = CloudHostAssetCount;
    }

    public AssetStatisticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetStatisticsInfo(AssetStatisticsInfo source) {
        if (source.AssetTotalCount != null) {
            this.AssetTotalCount = new Long(source.AssetTotalCount);
        }
        if (source.AssetAddCount != null) {
            this.AssetAddCount = new Long(source.AssetAddCount);
        }
        if (source.RiskAssetCount != null) {
            this.RiskAssetCount = new Long(source.RiskAssetCount);
        }
        if (source.AlarmAssetCount != null) {
            this.AlarmAssetCount = new Long(source.AlarmAssetCount);
        }
        if (source.PublicAssetCount != null) {
            this.PublicAssetCount = new Long(source.PublicAssetCount);
        }
        if (source.ExposeAssetCount != null) {
            this.ExposeAssetCount = new Long(source.ExposeAssetCount);
        }
        if (source.CloudHostAssetCount != null) {
            this.CloudHostAssetCount = new Long(source.CloudHostAssetCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetTotalCount", this.AssetTotalCount);
        this.setParamSimple(map, prefix + "AssetAddCount", this.AssetAddCount);
        this.setParamSimple(map, prefix + "RiskAssetCount", this.RiskAssetCount);
        this.setParamSimple(map, prefix + "AlarmAssetCount", this.AlarmAssetCount);
        this.setParamSimple(map, prefix + "PublicAssetCount", this.PublicAssetCount);
        this.setParamSimple(map, prefix + "ExposeAssetCount", this.ExposeAssetCount);
        this.setParamSimple(map, prefix + "CloudHostAssetCount", this.CloudHostAssetCount);

    }
}

