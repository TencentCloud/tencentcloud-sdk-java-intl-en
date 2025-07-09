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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionSummaryOverviewItem extends AbstractModel {

    /**
    * Region id.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region name.
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Actual total consumption, up to 8 decimal places.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * Voucher payment amount, up to 8 decimal places.
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Total consumption, up to 8 decimal places.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get Region id. 
     * @return RegionId Region id.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region id.
     * @param RegionId Region id.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name. 
     * @return RegionName Region name.
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name.
     * @param RegionName Region name.
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Actual total consumption, up to 8 decimal places. 
     * @return OriginalCost Actual total consumption, up to 8 decimal places.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set Actual total consumption, up to 8 decimal places.
     * @param OriginalCost Actual total consumption, up to 8 decimal places.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get Voucher payment amount, up to 8 decimal places. 
     * @return VoucherPayAmount Voucher payment amount, up to 8 decimal places.
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Voucher payment amount, up to 8 decimal places.
     * @param VoucherPayAmount Voucher payment amount, up to 8 decimal places.
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Total consumption, up to 8 decimal places. 
     * @return TotalCost Total consumption, up to 8 decimal places.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Total consumption, up to 8 decimal places.
     * @param TotalCost Total consumption, up to 8 decimal places.
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

