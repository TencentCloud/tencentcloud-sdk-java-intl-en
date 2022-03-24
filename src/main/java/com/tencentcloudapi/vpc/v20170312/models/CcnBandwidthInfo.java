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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnBandwidthInfo extends AbstractModel{

    /**
    * The CCN ID that the bandwidth belongs to.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The creation time of the instance.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * The expiration time of the instance.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * The unique ID of the bandwidth instance.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("RegionFlowControlId")
    @Expose
    private String RegionFlowControlId;

    /**
    * The billing flag.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * The information of the bandwidth regions and bandwidth caps. The parameter is only returned for the cross-region limit mode, but not for egress limit.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("CcnRegionBandwidthLimit")
    @Expose
    private CcnRegionBandwidthLimit CcnRegionBandwidthLimit;

    /**
    * Cloud marketplace instance ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MarketId")
    @Expose
    private String MarketId;

    /**
     * Get The CCN ID that the bandwidth belongs to.
Note: this field may return null, indicating that no valid value was found. 
     * @return CcnId The CCN ID that the bandwidth belongs to.
Note: this field may return null, indicating that no valid value was found.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The CCN ID that the bandwidth belongs to.
Note: this field may return null, indicating that no valid value was found.
     * @param CcnId The CCN ID that the bandwidth belongs to.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get The creation time of the instance.
Note: this field may return null, indicating that no valid value was found. 
     * @return CreatedTime The creation time of the instance.
Note: this field may return null, indicating that no valid value was found.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set The creation time of the instance.
Note: this field may return null, indicating that no valid value was found.
     * @param CreatedTime The creation time of the instance.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get The expiration time of the instance.
Note: this field may return null, indicating that no valid value was found. 
     * @return ExpiredTime The expiration time of the instance.
Note: this field may return null, indicating that no valid value was found.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set The expiration time of the instance.
Note: this field may return null, indicating that no valid value was found.
     * @param ExpiredTime The expiration time of the instance.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get The unique ID of the bandwidth instance.
Note: this field may return null, indicating that no valid value was found. 
     * @return RegionFlowControlId The unique ID of the bandwidth instance.
Note: this field may return null, indicating that no valid value was found.
     */
    public String getRegionFlowControlId() {
        return this.RegionFlowControlId;
    }

    /**
     * Set The unique ID of the bandwidth instance.
Note: this field may return null, indicating that no valid value was found.
     * @param RegionFlowControlId The unique ID of the bandwidth instance.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setRegionFlowControlId(String RegionFlowControlId) {
        this.RegionFlowControlId = RegionFlowControlId;
    }

    /**
     * Get The billing flag.
Note: this field may return null, indicating that no valid value was found. 
     * @return RenewFlag The billing flag.
Note: this field may return null, indicating that no valid value was found.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set The billing flag.
Note: this field may return null, indicating that no valid value was found.
     * @param RenewFlag The billing flag.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get The information of the bandwidth regions and bandwidth caps. The parameter is only returned for the cross-region limit mode, but not for egress limit.
Note: this field may return null, indicating that no valid value was found. 
     * @return CcnRegionBandwidthLimit The information of the bandwidth regions and bandwidth caps. The parameter is only returned for the cross-region limit mode, but not for egress limit.
Note: this field may return null, indicating that no valid value was found.
     */
    public CcnRegionBandwidthLimit getCcnRegionBandwidthLimit() {
        return this.CcnRegionBandwidthLimit;
    }

    /**
     * Set The information of the bandwidth regions and bandwidth caps. The parameter is only returned for the cross-region limit mode, but not for egress limit.
Note: this field may return null, indicating that no valid value was found.
     * @param CcnRegionBandwidthLimit The information of the bandwidth regions and bandwidth caps. The parameter is only returned for the cross-region limit mode, but not for egress limit.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setCcnRegionBandwidthLimit(CcnRegionBandwidthLimit CcnRegionBandwidthLimit) {
        this.CcnRegionBandwidthLimit = CcnRegionBandwidthLimit;
    }

    /**
     * Get Cloud marketplace instance ID.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return MarketId Cloud marketplace instance ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMarketId() {
        return this.MarketId;
    }

    /**
     * Set Cloud marketplace instance ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param MarketId Cloud marketplace instance ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMarketId(String MarketId) {
        this.MarketId = MarketId;
    }

    public CcnBandwidthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnBandwidthInfo(CcnBandwidthInfo source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.RegionFlowControlId != null) {
            this.RegionFlowControlId = new String(source.RegionFlowControlId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.CcnRegionBandwidthLimit != null) {
            this.CcnRegionBandwidthLimit = new CcnRegionBandwidthLimit(source.CcnRegionBandwidthLimit);
        }
        if (source.MarketId != null) {
            this.MarketId = new String(source.MarketId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RegionFlowControlId", this.RegionFlowControlId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamObj(map, prefix + "CcnRegionBandwidthLimit.", this.CcnRegionBandwidthLimit);
        this.setParamSimple(map, prefix + "MarketId", this.MarketId);

    }
}

