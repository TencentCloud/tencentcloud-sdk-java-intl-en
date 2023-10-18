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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionSummaryOverviewItem extends AbstractModel {

    /**
    * Region ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get Region ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionName Region name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionName Region name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalCost The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalCost The actual total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoucherPayAmount The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoucherPayAmount The deducted voucher amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCost Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCost Total consumption amount accurate down to eight decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public RegionSummaryOverviewItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionSummaryOverviewItem(RegionSummaryOverviewItem source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new String(source.OriginalCost);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}

