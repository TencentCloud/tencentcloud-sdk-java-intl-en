/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MiniExtendPkg extends AbstractModel {

    /**
    * Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * Status

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Region

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * Start time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Purchase quantity.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Billing item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
     * Get Resource ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceIds Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceIds Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Status

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Region

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set Region

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get Start time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BeginTime Start time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BeginTime Start time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Purchase quantity.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Purchase quantity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Purchase quantity.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Purchase quantity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Renewal flag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Billing item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BillingItem Billing item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set Billing item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BillingItem Billing item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    public MiniExtendPkg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MiniExtendPkg(MiniExtendPkg source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);

    }
}

