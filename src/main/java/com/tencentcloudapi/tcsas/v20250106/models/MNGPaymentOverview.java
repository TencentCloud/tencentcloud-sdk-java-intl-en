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

public class MNGPaymentOverview extends AbstractModel {

    /**
    * Paid revenue / Number of paying users * 100%
    */
    @SerializedName("ARPPu")
    @Expose
    private String ARPPu;

    /**
    * Data time in YYYYMMDD format
    */
    @SerializedName("DataTime")
    @Expose
    private String DataTime;

    /**
    * New paying user ratio = NewUserNum / OrderUserNum * 100%
    */
    @SerializedName("NewPaidUseRatio")
    @Expose
    private String NewPaidUseRatio;

    /**
    * Number of new paying users
    */
    @SerializedName("NewPaidUserNum")
    @Expose
    private Long NewPaidUserNum;

    /**
    * Total payment amount from new users
    */
    @SerializedName("NewUserPaidAmount")
    @Expose
    private String NewUserPaidAmount;

    /**
    * Total payment amount
    */
    @SerializedName("PaidAmount")
    @Expose
    private String PaidAmount;

    /**
    * Number of paying users
    */
    @SerializedName("PaidUserNum")
    @Expose
    private Long PaidUserNum;

    /**
    * Refund amount
    */
    @SerializedName("RefundAmount")
    @Expose
    private String RefundAmount;

    /**
    * Number of refund orders
    */
    @SerializedName("RefundNum")
    @Expose
    private Long RefundNum;

    /**
    * Update time (timestamp in seconds)
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Paid revenue / Number of paying users * 100% 
     * @return ARPPu Paid revenue / Number of paying users * 100%
     */
    public String getARPPu() {
        return this.ARPPu;
    }

    /**
     * Set Paid revenue / Number of paying users * 100%
     * @param ARPPu Paid revenue / Number of paying users * 100%
     */
    public void setARPPu(String ARPPu) {
        this.ARPPu = ARPPu;
    }

    /**
     * Get Data time in YYYYMMDD format 
     * @return DataTime Data time in YYYYMMDD format
     */
    public String getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Data time in YYYYMMDD format
     * @param DataTime Data time in YYYYMMDD format
     */
    public void setDataTime(String DataTime) {
        this.DataTime = DataTime;
    }

    /**
     * Get New paying user ratio = NewUserNum / OrderUserNum * 100% 
     * @return NewPaidUseRatio New paying user ratio = NewUserNum / OrderUserNum * 100%
     */
    public String getNewPaidUseRatio() {
        return this.NewPaidUseRatio;
    }

    /**
     * Set New paying user ratio = NewUserNum / OrderUserNum * 100%
     * @param NewPaidUseRatio New paying user ratio = NewUserNum / OrderUserNum * 100%
     */
    public void setNewPaidUseRatio(String NewPaidUseRatio) {
        this.NewPaidUseRatio = NewPaidUseRatio;
    }

    /**
     * Get Number of new paying users 
     * @return NewPaidUserNum Number of new paying users
     */
    public Long getNewPaidUserNum() {
        return this.NewPaidUserNum;
    }

    /**
     * Set Number of new paying users
     * @param NewPaidUserNum Number of new paying users
     */
    public void setNewPaidUserNum(Long NewPaidUserNum) {
        this.NewPaidUserNum = NewPaidUserNum;
    }

    /**
     * Get Total payment amount from new users 
     * @return NewUserPaidAmount Total payment amount from new users
     */
    public String getNewUserPaidAmount() {
        return this.NewUserPaidAmount;
    }

    /**
     * Set Total payment amount from new users
     * @param NewUserPaidAmount Total payment amount from new users
     */
    public void setNewUserPaidAmount(String NewUserPaidAmount) {
        this.NewUserPaidAmount = NewUserPaidAmount;
    }

    /**
     * Get Total payment amount 
     * @return PaidAmount Total payment amount
     */
    public String getPaidAmount() {
        return this.PaidAmount;
    }

    /**
     * Set Total payment amount
     * @param PaidAmount Total payment amount
     */
    public void setPaidAmount(String PaidAmount) {
        this.PaidAmount = PaidAmount;
    }

    /**
     * Get Number of paying users 
     * @return PaidUserNum Number of paying users
     */
    public Long getPaidUserNum() {
        return this.PaidUserNum;
    }

    /**
     * Set Number of paying users
     * @param PaidUserNum Number of paying users
     */
    public void setPaidUserNum(Long PaidUserNum) {
        this.PaidUserNum = PaidUserNum;
    }

    /**
     * Get Refund amount 
     * @return RefundAmount Refund amount
     */
    public String getRefundAmount() {
        return this.RefundAmount;
    }

    /**
     * Set Refund amount
     * @param RefundAmount Refund amount
     */
    public void setRefundAmount(String RefundAmount) {
        this.RefundAmount = RefundAmount;
    }

    /**
     * Get Number of refund orders 
     * @return RefundNum Number of refund orders
     */
    public Long getRefundNum() {
        return this.RefundNum;
    }

    /**
     * Set Number of refund orders
     * @param RefundNum Number of refund orders
     */
    public void setRefundNum(Long RefundNum) {
        this.RefundNum = RefundNum;
    }

    /**
     * Get Update time (timestamp in seconds) 
     * @return UpdateTime Update time (timestamp in seconds)
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time (timestamp in seconds)
     * @param UpdateTime Update time (timestamp in seconds)
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public MNGPaymentOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MNGPaymentOverview(MNGPaymentOverview source) {
        if (source.ARPPu != null) {
            this.ARPPu = new String(source.ARPPu);
        }
        if (source.DataTime != null) {
            this.DataTime = new String(source.DataTime);
        }
        if (source.NewPaidUseRatio != null) {
            this.NewPaidUseRatio = new String(source.NewPaidUseRatio);
        }
        if (source.NewPaidUserNum != null) {
            this.NewPaidUserNum = new Long(source.NewPaidUserNum);
        }
        if (source.NewUserPaidAmount != null) {
            this.NewUserPaidAmount = new String(source.NewUserPaidAmount);
        }
        if (source.PaidAmount != null) {
            this.PaidAmount = new String(source.PaidAmount);
        }
        if (source.PaidUserNum != null) {
            this.PaidUserNum = new Long(source.PaidUserNum);
        }
        if (source.RefundAmount != null) {
            this.RefundAmount = new String(source.RefundAmount);
        }
        if (source.RefundNum != null) {
            this.RefundNum = new Long(source.RefundNum);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ARPPu", this.ARPPu);
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);
        this.setParamSimple(map, prefix + "NewPaidUseRatio", this.NewPaidUseRatio);
        this.setParamSimple(map, prefix + "NewPaidUserNum", this.NewPaidUserNum);
        this.setParamSimple(map, prefix + "NewUserPaidAmount", this.NewUserPaidAmount);
        this.setParamSimple(map, prefix + "PaidAmount", this.PaidAmount);
        this.setParamSimple(map, prefix + "PaidUserNum", this.PaidUserNum);
        this.setParamSimple(map, prefix + "RefundAmount", this.RefundAmount);
        this.setParamSimple(map, prefix + "RefundNum", this.RefundNum);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

