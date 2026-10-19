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

public class CosBucketBillingInfo extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>Nickname</p>
    */
    @SerializedName("OwnerNickName")
    @Expose
    private String OwnerNickName;

    /**
    * <p>Number of buckets</p>
    */
    @SerializedName("BucketCount")
    @Expose
    private Long BucketCount;

    /**
    * <p>0 Not purchased 1 Purchased separately 2 Shared</p>
    */
    @SerializedName("BuyStatus")
    @Expose
    private Long BuyStatus;

    /**
    * <p>Shared account appid.</p>
    */
    @SerializedName("ShareFromAppId")
    @Expose
    private Long ShareFromAppId;

    /**
    * <p>uin of the shared account</p>
    */
    @SerializedName("ShareFromUin")
    @Expose
    private String ShareFromUin;

    /**
    * <p>Shared account nickname</p>
    */
    @SerializedName("ShareFromNickName")
    @Expose
    private String ShareFromNickName;

    /**
    * <p>Number of monitored buckets</p>
    */
    @SerializedName("MonitorBucketCount")
    @Expose
    private Long MonitorBucketCount;

    /**
    * <p>0: disable; 1: enable</p>
    */
    @SerializedName("IsAutoMonitor")
    @Expose
    private Long IsAutoMonitor;

    /**
    * <p>Whether to enable the allowlist log feature</p>
    */
    @SerializedName("LogFeatureWhitelist")
    @Expose
    private Boolean LogFeatureWhitelist;

    /**
    * <p>Existence of new postpaid orders</p>
    */
    @SerializedName("IsHaveNewPostOrder")
    @Expose
    private Boolean IsHaveNewPostOrder;

    /**
    * <p>Existence of legacy postpaid orders</p>
    */
    @SerializedName("IsHaveOldPostOrder")
    @Expose
    private Boolean IsHaveOldPostOrder;

    /**
    * <p>Postpaid Product List</p>
    */
    @SerializedName("PostProductList")
    @Expose
    private Long [] PostProductList;

    /**
    * <p>Default sampling rate for newly-added buckets under this AppId, unit: ratio from 0 to 1</p><p>Value range: [0.001, 1]</p>
    */
    @SerializedName("DefaultSampleRate")
    @Expose
    private Float DefaultSampleRate;

    /**
    * <p>Whether it is a whitelist, used only to control the frontend range and accuracy</p>
    */
    @SerializedName("BucketSamplingRateWhitelist")
    @Expose
    private Boolean BucketSamplingRateWhitelist;

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>uin</p> 
     * @return OwnerUin <p>uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>uin</p>
     * @param OwnerUin <p>uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Nickname</p> 
     * @return OwnerNickName <p>Nickname</p>
     */
    public String getOwnerNickName() {
        return this.OwnerNickName;
    }

    /**
     * Set <p>Nickname</p>
     * @param OwnerNickName <p>Nickname</p>
     */
    public void setOwnerNickName(String OwnerNickName) {
        this.OwnerNickName = OwnerNickName;
    }

    /**
     * Get <p>Number of buckets</p> 
     * @return BucketCount <p>Number of buckets</p>
     */
    public Long getBucketCount() {
        return this.BucketCount;
    }

    /**
     * Set <p>Number of buckets</p>
     * @param BucketCount <p>Number of buckets</p>
     */
    public void setBucketCount(Long BucketCount) {
        this.BucketCount = BucketCount;
    }

    /**
     * Get <p>0 Not purchased 1 Purchased separately 2 Shared</p> 
     * @return BuyStatus <p>0 Not purchased 1 Purchased separately 2 Shared</p>
     */
    public Long getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set <p>0 Not purchased 1 Purchased separately 2 Shared</p>
     * @param BuyStatus <p>0 Not purchased 1 Purchased separately 2 Shared</p>
     */
    public void setBuyStatus(Long BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    /**
     * Get <p>Shared account appid.</p> 
     * @return ShareFromAppId <p>Shared account appid.</p>
     */
    public Long getShareFromAppId() {
        return this.ShareFromAppId;
    }

    /**
     * Set <p>Shared account appid.</p>
     * @param ShareFromAppId <p>Shared account appid.</p>
     */
    public void setShareFromAppId(Long ShareFromAppId) {
        this.ShareFromAppId = ShareFromAppId;
    }

    /**
     * Get <p>uin of the shared account</p> 
     * @return ShareFromUin <p>uin of the shared account</p>
     */
    public String getShareFromUin() {
        return this.ShareFromUin;
    }

    /**
     * Set <p>uin of the shared account</p>
     * @param ShareFromUin <p>uin of the shared account</p>
     */
    public void setShareFromUin(String ShareFromUin) {
        this.ShareFromUin = ShareFromUin;
    }

    /**
     * Get <p>Shared account nickname</p> 
     * @return ShareFromNickName <p>Shared account nickname</p>
     */
    public String getShareFromNickName() {
        return this.ShareFromNickName;
    }

    /**
     * Set <p>Shared account nickname</p>
     * @param ShareFromNickName <p>Shared account nickname</p>
     */
    public void setShareFromNickName(String ShareFromNickName) {
        this.ShareFromNickName = ShareFromNickName;
    }

    /**
     * Get <p>Number of monitored buckets</p> 
     * @return MonitorBucketCount <p>Number of monitored buckets</p>
     */
    public Long getMonitorBucketCount() {
        return this.MonitorBucketCount;
    }

    /**
     * Set <p>Number of monitored buckets</p>
     * @param MonitorBucketCount <p>Number of monitored buckets</p>
     */
    public void setMonitorBucketCount(Long MonitorBucketCount) {
        this.MonitorBucketCount = MonitorBucketCount;
    }

    /**
     * Get <p>0: disable; 1: enable</p> 
     * @return IsAutoMonitor <p>0: disable; 1: enable</p>
     */
    public Long getIsAutoMonitor() {
        return this.IsAutoMonitor;
    }

    /**
     * Set <p>0: disable; 1: enable</p>
     * @param IsAutoMonitor <p>0: disable; 1: enable</p>
     */
    public void setIsAutoMonitor(Long IsAutoMonitor) {
        this.IsAutoMonitor = IsAutoMonitor;
    }

    /**
     * Get <p>Whether to enable the allowlist log feature</p> 
     * @return LogFeatureWhitelist <p>Whether to enable the allowlist log feature</p>
     */
    public Boolean getLogFeatureWhitelist() {
        return this.LogFeatureWhitelist;
    }

    /**
     * Set <p>Whether to enable the allowlist log feature</p>
     * @param LogFeatureWhitelist <p>Whether to enable the allowlist log feature</p>
     */
    public void setLogFeatureWhitelist(Boolean LogFeatureWhitelist) {
        this.LogFeatureWhitelist = LogFeatureWhitelist;
    }

    /**
     * Get <p>Existence of new postpaid orders</p> 
     * @return IsHaveNewPostOrder <p>Existence of new postpaid orders</p>
     */
    public Boolean getIsHaveNewPostOrder() {
        return this.IsHaveNewPostOrder;
    }

    /**
     * Set <p>Existence of new postpaid orders</p>
     * @param IsHaveNewPostOrder <p>Existence of new postpaid orders</p>
     */
    public void setIsHaveNewPostOrder(Boolean IsHaveNewPostOrder) {
        this.IsHaveNewPostOrder = IsHaveNewPostOrder;
    }

    /**
     * Get <p>Existence of legacy postpaid orders</p> 
     * @return IsHaveOldPostOrder <p>Existence of legacy postpaid orders</p>
     */
    public Boolean getIsHaveOldPostOrder() {
        return this.IsHaveOldPostOrder;
    }

    /**
     * Set <p>Existence of legacy postpaid orders</p>
     * @param IsHaveOldPostOrder <p>Existence of legacy postpaid orders</p>
     */
    public void setIsHaveOldPostOrder(Boolean IsHaveOldPostOrder) {
        this.IsHaveOldPostOrder = IsHaveOldPostOrder;
    }

    /**
     * Get <p>Postpaid Product List</p> 
     * @return PostProductList <p>Postpaid Product List</p>
     */
    public Long [] getPostProductList() {
        return this.PostProductList;
    }

    /**
     * Set <p>Postpaid Product List</p>
     * @param PostProductList <p>Postpaid Product List</p>
     */
    public void setPostProductList(Long [] PostProductList) {
        this.PostProductList = PostProductList;
    }

    /**
     * Get <p>Default sampling rate for newly-added buckets under this AppId, unit: ratio from 0 to 1</p><p>Value range: [0.001, 1]</p> 
     * @return DefaultSampleRate <p>Default sampling rate for newly-added buckets under this AppId, unit: ratio from 0 to 1</p><p>Value range: [0.001, 1]</p>
     */
    public Float getDefaultSampleRate() {
        return this.DefaultSampleRate;
    }

    /**
     * Set <p>Default sampling rate for newly-added buckets under this AppId, unit: ratio from 0 to 1</p><p>Value range: [0.001, 1]</p>
     * @param DefaultSampleRate <p>Default sampling rate for newly-added buckets under this AppId, unit: ratio from 0 to 1</p><p>Value range: [0.001, 1]</p>
     */
    public void setDefaultSampleRate(Float DefaultSampleRate) {
        this.DefaultSampleRate = DefaultSampleRate;
    }

    /**
     * Get <p>Whether it is a whitelist, used only to control the frontend range and accuracy</p> 
     * @return BucketSamplingRateWhitelist <p>Whether it is a whitelist, used only to control the frontend range and accuracy</p>
     */
    public Boolean getBucketSamplingRateWhitelist() {
        return this.BucketSamplingRateWhitelist;
    }

    /**
     * Set <p>Whether it is a whitelist, used only to control the frontend range and accuracy</p>
     * @param BucketSamplingRateWhitelist <p>Whether it is a whitelist, used only to control the frontend range and accuracy</p>
     */
    public void setBucketSamplingRateWhitelist(Boolean BucketSamplingRateWhitelist) {
        this.BucketSamplingRateWhitelist = BucketSamplingRateWhitelist;
    }

    public CosBucketBillingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketBillingInfo(CosBucketBillingInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerNickName != null) {
            this.OwnerNickName = new String(source.OwnerNickName);
        }
        if (source.BucketCount != null) {
            this.BucketCount = new Long(source.BucketCount);
        }
        if (source.BuyStatus != null) {
            this.BuyStatus = new Long(source.BuyStatus);
        }
        if (source.ShareFromAppId != null) {
            this.ShareFromAppId = new Long(source.ShareFromAppId);
        }
        if (source.ShareFromUin != null) {
            this.ShareFromUin = new String(source.ShareFromUin);
        }
        if (source.ShareFromNickName != null) {
            this.ShareFromNickName = new String(source.ShareFromNickName);
        }
        if (source.MonitorBucketCount != null) {
            this.MonitorBucketCount = new Long(source.MonitorBucketCount);
        }
        if (source.IsAutoMonitor != null) {
            this.IsAutoMonitor = new Long(source.IsAutoMonitor);
        }
        if (source.LogFeatureWhitelist != null) {
            this.LogFeatureWhitelist = new Boolean(source.LogFeatureWhitelist);
        }
        if (source.IsHaveNewPostOrder != null) {
            this.IsHaveNewPostOrder = new Boolean(source.IsHaveNewPostOrder);
        }
        if (source.IsHaveOldPostOrder != null) {
            this.IsHaveOldPostOrder = new Boolean(source.IsHaveOldPostOrder);
        }
        if (source.PostProductList != null) {
            this.PostProductList = new Long[source.PostProductList.length];
            for (int i = 0; i < source.PostProductList.length; i++) {
                this.PostProductList[i] = new Long(source.PostProductList[i]);
            }
        }
        if (source.DefaultSampleRate != null) {
            this.DefaultSampleRate = new Float(source.DefaultSampleRate);
        }
        if (source.BucketSamplingRateWhitelist != null) {
            this.BucketSamplingRateWhitelist = new Boolean(source.BucketSamplingRateWhitelist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerNickName", this.OwnerNickName);
        this.setParamSimple(map, prefix + "BucketCount", this.BucketCount);
        this.setParamSimple(map, prefix + "BuyStatus", this.BuyStatus);
        this.setParamSimple(map, prefix + "ShareFromAppId", this.ShareFromAppId);
        this.setParamSimple(map, prefix + "ShareFromUin", this.ShareFromUin);
        this.setParamSimple(map, prefix + "ShareFromNickName", this.ShareFromNickName);
        this.setParamSimple(map, prefix + "MonitorBucketCount", this.MonitorBucketCount);
        this.setParamSimple(map, prefix + "IsAutoMonitor", this.IsAutoMonitor);
        this.setParamSimple(map, prefix + "LogFeatureWhitelist", this.LogFeatureWhitelist);
        this.setParamSimple(map, prefix + "IsHaveNewPostOrder", this.IsHaveNewPostOrder);
        this.setParamSimple(map, prefix + "IsHaveOldPostOrder", this.IsHaveOldPostOrder);
        this.setParamArraySimple(map, prefix + "PostProductList.", this.PostProductList);
        this.setParamSimple(map, prefix + "DefaultSampleRate", this.DefaultSampleRate);
        this.setParamSimple(map, prefix + "BucketSamplingRateWhitelist", this.BucketSamplingRateWhitelist);

    }
}

