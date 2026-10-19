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

public class CosAuditPayInfo extends AbstractModel {

    /**
    * <p>APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Order status. 0: Not purchased; 1: Normal; 2: Isolated; 3: Terminated; 6: In trial; 7: Expired</p>
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * <p>The number of purchased object storage entries</p>
    */
    @SerializedName("BucketNum")
    @Expose
    private Long BucketNum;

    /**
    * <p>Payment mode. 0: postpaid. 1: prepaid.</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Whether to purchase separately. 1: purchase separately; 2: shared by other accounts</p>
    */
    @SerializedName("IsSelfBuy")
    @Expose
    private Long IsSelfBuy;

    /**
    * <p>Order start time.</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>Order expiration time</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>0: not set by the user, 1: set to auto-renew by the user, 2: set not to auto-renew by the user</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>Order duration</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>Duration unit</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Resource id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>Open beta end time</p>
    */
    @SerializedName("BetaEndTime")
    @Expose
    private String BetaEndTime;

    /**
    * <p>Current system time.</p>
    */
    @SerializedName("TimeNow")
    @Expose
    private String TimeNow;

    /**
    * <p>Whether to share with other accounts. 1: yes; 2: no</p>
    */
    @SerializedName("IsShareToOther")
    @Expose
    private Long IsShareToOther;

    /**
    * <p>uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Nickname</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>Shared bucketIdSet</p>
    */
    @SerializedName("BindBucket")
    @Expose
    private CosBucketId [] BindBucket;

    /**
    * <p>Shared appid</p>
    */
    @SerializedName("SharedAppIdSet")
    @Expose
    private Long [] SharedAppIdSet;

    /**
    * <p>Whether pay-as-you-go is enabled</p>
    */
    @SerializedName("PostPayStatus")
    @Expose
    private Long PostPayStatus;

    /**
    * <p>0: No trial use yet   1: Trial use completed</p>
    */
    @SerializedName("IsTestUser")
    @Expose
    private Long IsTestUser;

    /**
    * <p>Remaining available quantity</p>
    */
    @SerializedName("AvailableBucketNum")
    @Expose
    private Long AvailableBucketNum;

    /**
    * <p>Number of buckets with monitoring on</p>
    */
    @SerializedName("MonitorBucketNum")
    @Expose
    private Long MonitorBucketNum;

    /**
    * <p>Total number of buckets</p>
    */
    @SerializedName("TotalBucketNum")
    @Expose
    private Long TotalBucketNum;

    /**
    * <p>Postpaid product switch state</p>
    */
    @SerializedName("PostProductStatusList")
    @Expose
    private Long [] PostProductStatusList;

    /**
    * <p>Purchase status of postpaid products.</p>
    */
    @SerializedName("PostProductBuyStatusList")
    @Expose
    private Long [] PostProductBuyStatusList;

    /**
    * <p>New postpaid resource ID</p>
    */
    @SerializedName("NewPostPayResourceId")
    @Expose
    private String NewPostPayResourceId;

    /**
     * Get <p>APPID</p> 
     * @return AppId <p>APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>APPID</p>
     * @param AppId <p>APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Order status. 0: Not purchased; 1: Normal; 2: Isolated; 3: Terminated; 6: In trial; 7: Expired</p> 
     * @return OrderStatus <p>Order status. 0: Not purchased; 1: Normal; 2: Isolated; 3: Terminated; 6: In trial; 7: Expired</p>
     */
    public Long getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set <p>Order status. 0: Not purchased; 1: Normal; 2: Isolated; 3: Terminated; 6: In trial; 7: Expired</p>
     * @param OrderStatus <p>Order status. 0: Not purchased; 1: Normal; 2: Isolated; 3: Terminated; 6: In trial; 7: Expired</p>
     */
    public void setOrderStatus(Long OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get <p>The number of purchased object storage entries</p> 
     * @return BucketNum <p>The number of purchased object storage entries</p>
     */
    public Long getBucketNum() {
        return this.BucketNum;
    }

    /**
     * Set <p>The number of purchased object storage entries</p>
     * @param BucketNum <p>The number of purchased object storage entries</p>
     */
    public void setBucketNum(Long BucketNum) {
        this.BucketNum = BucketNum;
    }

    /**
     * Get <p>Payment mode. 0: postpaid. 1: prepaid.</p> 
     * @return PayMode <p>Payment mode. 0: postpaid. 1: prepaid.</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode. 0: postpaid. 1: prepaid.</p>
     * @param PayMode <p>Payment mode. 0: postpaid. 1: prepaid.</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Whether to purchase separately. 1: purchase separately; 2: shared by other accounts</p> 
     * @return IsSelfBuy <p>Whether to purchase separately. 1: purchase separately; 2: shared by other accounts</p>
     */
    public Long getIsSelfBuy() {
        return this.IsSelfBuy;
    }

    /**
     * Set <p>Whether to purchase separately. 1: purchase separately; 2: shared by other accounts</p>
     * @param IsSelfBuy <p>Whether to purchase separately. 1: purchase separately; 2: shared by other accounts</p>
     */
    public void setIsSelfBuy(Long IsSelfBuy) {
        this.IsSelfBuy = IsSelfBuy;
    }

    /**
     * Get <p>Order start time.</p> 
     * @return BeginTime <p>Order start time.</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>Order start time.</p>
     * @param BeginTime <p>Order start time.</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>Order expiration time</p> 
     * @return EndTime <p>Order expiration time</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Order expiration time</p>
     * @param EndTime <p>Order expiration time</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>0: not set by the user, 1: set to auto-renew by the user, 2: set not to auto-renew by the user</p> 
     * @return AutoRenew <p>0: not set by the user, 1: set to auto-renew by the user, 2: set not to auto-renew by the user</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>0: not set by the user, 1: set to auto-renew by the user, 2: set not to auto-renew by the user</p>
     * @param AutoRenew <p>0: not set by the user, 1: set to auto-renew by the user, 2: set not to auto-renew by the user</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>Order duration</p> 
     * @return TimeSpan <p>Order duration</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Order duration</p>
     * @param TimeSpan <p>Order duration</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>Duration unit</p> 
     * @return TimeUnit <p>Duration unit</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>Duration unit</p>
     * @param TimeUnit <p>Duration unit</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>Resource id</p> 
     * @return ResourceId <p>Resource id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource id</p>
     * @param ResourceId <p>Resource id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>Open beta end time</p> 
     * @return BetaEndTime <p>Open beta end time</p>
     */
    public String getBetaEndTime() {
        return this.BetaEndTime;
    }

    /**
     * Set <p>Open beta end time</p>
     * @param BetaEndTime <p>Open beta end time</p>
     */
    public void setBetaEndTime(String BetaEndTime) {
        this.BetaEndTime = BetaEndTime;
    }

    /**
     * Get <p>Current system time.</p> 
     * @return TimeNow <p>Current system time.</p>
     */
    public String getTimeNow() {
        return this.TimeNow;
    }

    /**
     * Set <p>Current system time.</p>
     * @param TimeNow <p>Current system time.</p>
     */
    public void setTimeNow(String TimeNow) {
        this.TimeNow = TimeNow;
    }

    /**
     * Get <p>Whether to share with other accounts. 1: yes; 2: no</p> 
     * @return IsShareToOther <p>Whether to share with other accounts. 1: yes; 2: no</p>
     */
    public Long getIsShareToOther() {
        return this.IsShareToOther;
    }

    /**
     * Set <p>Whether to share with other accounts. 1: yes; 2: no</p>
     * @param IsShareToOther <p>Whether to share with other accounts. 1: yes; 2: no</p>
     */
    public void setIsShareToOther(Long IsShareToOther) {
        this.IsShareToOther = IsShareToOther;
    }

    /**
     * Get <p>uin</p> 
     * @return Uin <p>uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>uin</p>
     * @param Uin <p>uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Nickname</p> 
     * @return NickName <p>Nickname</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Nickname</p>
     * @param NickName <p>Nickname</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>Shared bucketIdSet</p> 
     * @return BindBucket <p>Shared bucketIdSet</p>
     */
    public CosBucketId [] getBindBucket() {
        return this.BindBucket;
    }

    /**
     * Set <p>Shared bucketIdSet</p>
     * @param BindBucket <p>Shared bucketIdSet</p>
     */
    public void setBindBucket(CosBucketId [] BindBucket) {
        this.BindBucket = BindBucket;
    }

    /**
     * Get <p>Shared appid</p> 
     * @return SharedAppIdSet <p>Shared appid</p>
     */
    public Long [] getSharedAppIdSet() {
        return this.SharedAppIdSet;
    }

    /**
     * Set <p>Shared appid</p>
     * @param SharedAppIdSet <p>Shared appid</p>
     */
    public void setSharedAppIdSet(Long [] SharedAppIdSet) {
        this.SharedAppIdSet = SharedAppIdSet;
    }

    /**
     * Get <p>Whether pay-as-you-go is enabled</p> 
     * @return PostPayStatus <p>Whether pay-as-you-go is enabled</p>
     */
    public Long getPostPayStatus() {
        return this.PostPayStatus;
    }

    /**
     * Set <p>Whether pay-as-you-go is enabled</p>
     * @param PostPayStatus <p>Whether pay-as-you-go is enabled</p>
     */
    public void setPostPayStatus(Long PostPayStatus) {
        this.PostPayStatus = PostPayStatus;
    }

    /**
     * Get <p>0: No trial use yet   1: Trial use completed</p> 
     * @return IsTestUser <p>0: No trial use yet   1: Trial use completed</p>
     */
    public Long getIsTestUser() {
        return this.IsTestUser;
    }

    /**
     * Set <p>0: No trial use yet   1: Trial use completed</p>
     * @param IsTestUser <p>0: No trial use yet   1: Trial use completed</p>
     */
    public void setIsTestUser(Long IsTestUser) {
        this.IsTestUser = IsTestUser;
    }

    /**
     * Get <p>Remaining available quantity</p> 
     * @return AvailableBucketNum <p>Remaining available quantity</p>
     */
    public Long getAvailableBucketNum() {
        return this.AvailableBucketNum;
    }

    /**
     * Set <p>Remaining available quantity</p>
     * @param AvailableBucketNum <p>Remaining available quantity</p>
     */
    public void setAvailableBucketNum(Long AvailableBucketNum) {
        this.AvailableBucketNum = AvailableBucketNum;
    }

    /**
     * Get <p>Number of buckets with monitoring on</p> 
     * @return MonitorBucketNum <p>Number of buckets with monitoring on</p>
     */
    public Long getMonitorBucketNum() {
        return this.MonitorBucketNum;
    }

    /**
     * Set <p>Number of buckets with monitoring on</p>
     * @param MonitorBucketNum <p>Number of buckets with monitoring on</p>
     */
    public void setMonitorBucketNum(Long MonitorBucketNum) {
        this.MonitorBucketNum = MonitorBucketNum;
    }

    /**
     * Get <p>Total number of buckets</p> 
     * @return TotalBucketNum <p>Total number of buckets</p>
     */
    public Long getTotalBucketNum() {
        return this.TotalBucketNum;
    }

    /**
     * Set <p>Total number of buckets</p>
     * @param TotalBucketNum <p>Total number of buckets</p>
     */
    public void setTotalBucketNum(Long TotalBucketNum) {
        this.TotalBucketNum = TotalBucketNum;
    }

    /**
     * Get <p>Postpaid product switch state</p> 
     * @return PostProductStatusList <p>Postpaid product switch state</p>
     */
    public Long [] getPostProductStatusList() {
        return this.PostProductStatusList;
    }

    /**
     * Set <p>Postpaid product switch state</p>
     * @param PostProductStatusList <p>Postpaid product switch state</p>
     */
    public void setPostProductStatusList(Long [] PostProductStatusList) {
        this.PostProductStatusList = PostProductStatusList;
    }

    /**
     * Get <p>Purchase status of postpaid products.</p> 
     * @return PostProductBuyStatusList <p>Purchase status of postpaid products.</p>
     */
    public Long [] getPostProductBuyStatusList() {
        return this.PostProductBuyStatusList;
    }

    /**
     * Set <p>Purchase status of postpaid products.</p>
     * @param PostProductBuyStatusList <p>Purchase status of postpaid products.</p>
     */
    public void setPostProductBuyStatusList(Long [] PostProductBuyStatusList) {
        this.PostProductBuyStatusList = PostProductBuyStatusList;
    }

    /**
     * Get <p>New postpaid resource ID</p> 
     * @return NewPostPayResourceId <p>New postpaid resource ID</p>
     */
    public String getNewPostPayResourceId() {
        return this.NewPostPayResourceId;
    }

    /**
     * Set <p>New postpaid resource ID</p>
     * @param NewPostPayResourceId <p>New postpaid resource ID</p>
     */
    public void setNewPostPayResourceId(String NewPostPayResourceId) {
        this.NewPostPayResourceId = NewPostPayResourceId;
    }

    public CosAuditPayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAuditPayInfo(CosAuditPayInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new Long(source.OrderStatus);
        }
        if (source.BucketNum != null) {
            this.BucketNum = new Long(source.BucketNum);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.IsSelfBuy != null) {
            this.IsSelfBuy = new Long(source.IsSelfBuy);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.BetaEndTime != null) {
            this.BetaEndTime = new String(source.BetaEndTime);
        }
        if (source.TimeNow != null) {
            this.TimeNow = new String(source.TimeNow);
        }
        if (source.IsShareToOther != null) {
            this.IsShareToOther = new Long(source.IsShareToOther);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.BindBucket != null) {
            this.BindBucket = new CosBucketId[source.BindBucket.length];
            for (int i = 0; i < source.BindBucket.length; i++) {
                this.BindBucket[i] = new CosBucketId(source.BindBucket[i]);
            }
        }
        if (source.SharedAppIdSet != null) {
            this.SharedAppIdSet = new Long[source.SharedAppIdSet.length];
            for (int i = 0; i < source.SharedAppIdSet.length; i++) {
                this.SharedAppIdSet[i] = new Long(source.SharedAppIdSet[i]);
            }
        }
        if (source.PostPayStatus != null) {
            this.PostPayStatus = new Long(source.PostPayStatus);
        }
        if (source.IsTestUser != null) {
            this.IsTestUser = new Long(source.IsTestUser);
        }
        if (source.AvailableBucketNum != null) {
            this.AvailableBucketNum = new Long(source.AvailableBucketNum);
        }
        if (source.MonitorBucketNum != null) {
            this.MonitorBucketNum = new Long(source.MonitorBucketNum);
        }
        if (source.TotalBucketNum != null) {
            this.TotalBucketNum = new Long(source.TotalBucketNum);
        }
        if (source.PostProductStatusList != null) {
            this.PostProductStatusList = new Long[source.PostProductStatusList.length];
            for (int i = 0; i < source.PostProductStatusList.length; i++) {
                this.PostProductStatusList[i] = new Long(source.PostProductStatusList[i]);
            }
        }
        if (source.PostProductBuyStatusList != null) {
            this.PostProductBuyStatusList = new Long[source.PostProductBuyStatusList.length];
            for (int i = 0; i < source.PostProductBuyStatusList.length; i++) {
                this.PostProductBuyStatusList[i] = new Long(source.PostProductBuyStatusList[i]);
            }
        }
        if (source.NewPostPayResourceId != null) {
            this.NewPostPayResourceId = new String(source.NewPostPayResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "BucketNum", this.BucketNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "IsSelfBuy", this.IsSelfBuy);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "BetaEndTime", this.BetaEndTime);
        this.setParamSimple(map, prefix + "TimeNow", this.TimeNow);
        this.setParamSimple(map, prefix + "IsShareToOther", this.IsShareToOther);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamArrayObj(map, prefix + "BindBucket.", this.BindBucket);
        this.setParamArraySimple(map, prefix + "SharedAppIdSet.", this.SharedAppIdSet);
        this.setParamSimple(map, prefix + "PostPayStatus", this.PostPayStatus);
        this.setParamSimple(map, prefix + "IsTestUser", this.IsTestUser);
        this.setParamSimple(map, prefix + "AvailableBucketNum", this.AvailableBucketNum);
        this.setParamSimple(map, prefix + "MonitorBucketNum", this.MonitorBucketNum);
        this.setParamSimple(map, prefix + "TotalBucketNum", this.TotalBucketNum);
        this.setParamArraySimple(map, prefix + "PostProductStatusList.", this.PostProductStatusList);
        this.setParamArraySimple(map, prefix + "PostProductBuyStatusList.", this.PostProductBuyStatusList);
        this.setParamSimple(map, prefix + "NewPostPayResourceId", this.NewPostPayResourceId);

    }
}

