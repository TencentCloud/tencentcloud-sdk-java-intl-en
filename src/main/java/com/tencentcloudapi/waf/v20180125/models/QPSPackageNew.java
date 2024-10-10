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

public class QPSPackageNew extends AbstractModel {

    /**
    * Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * Expiration time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * Auto-renewal, 1: Enabled, 0: Disabled

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Number of Package Purchases

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Package Purchase Region, currently not used in CLB-WAF

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

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
     * Get Expiration time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidTime Expiration time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set Expiration time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidTime Expiration time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get Auto-renewal, 1: Enabled, 0: Disabled

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Auto-renewal, 1: Enabled, 0: Disabled

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal, 1: Enabled, 0: Disabled

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Auto-renewal, 1: Enabled, 0: Disabled

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Number of Package Purchases

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Number of Package Purchases

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of Package Purchases

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Number of Package Purchases

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Package Purchase Region, currently not used in CLB-WAF

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Package Purchase Region, currently not used in CLB-WAF

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Package Purchase Region, currently not used in CLB-WAF

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Package Purchase Region, currently not used in CLB-WAF

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
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

    public QPSPackageNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QPSPackageNew(QPSPackageNew source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new String(source.ValidTime);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
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
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);

    }
}

