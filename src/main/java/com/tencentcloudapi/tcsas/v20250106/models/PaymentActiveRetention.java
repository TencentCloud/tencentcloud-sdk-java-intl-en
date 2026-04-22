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

public class PaymentActiveRetention extends AbstractModel {

    /**
    * Day 1 active retention of paying users
    */
    @SerializedName("OneDayRetentionUsers")
    @Expose
    private Long OneDayRetentionUsers;

    /**
    * Day 2 active retention of paying users
    */
    @SerializedName("TwoDayRetentionUsers")
    @Expose
    private Long TwoDayRetentionUsers;

    /**
    * Day 3 active retention of paying users
    */
    @SerializedName("ThreeDayRetentionUsers")
    @Expose
    private Long ThreeDayRetentionUsers;

    /**
    * Day 4 active retention of paying users
    */
    @SerializedName("FourDayRetentionUsers")
    @Expose
    private Long FourDayRetentionUsers;

    /**
    * Day 5 active retention of paying users
    */
    @SerializedName("FiveDayRetentionUsers")
    @Expose
    private Long FiveDayRetentionUsers;

    /**
    * Day 6 active retention of paying users
    */
    @SerializedName("SixDayRetentionUsers")
    @Expose
    private Long SixDayRetentionUsers;

    /**
    * Day 7 active retention of paying users
    */
    @SerializedName("SevenDayRetentionUsers")
    @Expose
    private Long SevenDayRetentionUsers;

    /**
    * Day 14 active retention of paying users
    */
    @SerializedName("FourteenDayRetentionUsers")
    @Expose
    private Long FourteenDayRetentionUsers;

    /**
    * Day 15 active retention of paying users
    */
    @SerializedName("FifteenDayRetentionUsers")
    @Expose
    private Long FifteenDayRetentionUsers;

    /**
    * Day 30 active retention of paying users
    */
    @SerializedName("ThirtyDayRetentionUsers")
    @Expose
    private Long ThirtyDayRetentionUsers;

    /**
    * Number of paying users
    */
    @SerializedName("PaymentUserNum")
    @Expose
    private Long PaymentUserNum;

    /**
    * Data time in YYYYMMDD format
    */
    @SerializedName("DataTime")
    @Expose
    private String DataTime;

    /**
     * Get Day 1 active retention of paying users 
     * @return OneDayRetentionUsers Day 1 active retention of paying users
     */
    public Long getOneDayRetentionUsers() {
        return this.OneDayRetentionUsers;
    }

    /**
     * Set Day 1 active retention of paying users
     * @param OneDayRetentionUsers Day 1 active retention of paying users
     */
    public void setOneDayRetentionUsers(Long OneDayRetentionUsers) {
        this.OneDayRetentionUsers = OneDayRetentionUsers;
    }

    /**
     * Get Day 2 active retention of paying users 
     * @return TwoDayRetentionUsers Day 2 active retention of paying users
     */
    public Long getTwoDayRetentionUsers() {
        return this.TwoDayRetentionUsers;
    }

    /**
     * Set Day 2 active retention of paying users
     * @param TwoDayRetentionUsers Day 2 active retention of paying users
     */
    public void setTwoDayRetentionUsers(Long TwoDayRetentionUsers) {
        this.TwoDayRetentionUsers = TwoDayRetentionUsers;
    }

    /**
     * Get Day 3 active retention of paying users 
     * @return ThreeDayRetentionUsers Day 3 active retention of paying users
     */
    public Long getThreeDayRetentionUsers() {
        return this.ThreeDayRetentionUsers;
    }

    /**
     * Set Day 3 active retention of paying users
     * @param ThreeDayRetentionUsers Day 3 active retention of paying users
     */
    public void setThreeDayRetentionUsers(Long ThreeDayRetentionUsers) {
        this.ThreeDayRetentionUsers = ThreeDayRetentionUsers;
    }

    /**
     * Get Day 4 active retention of paying users 
     * @return FourDayRetentionUsers Day 4 active retention of paying users
     */
    public Long getFourDayRetentionUsers() {
        return this.FourDayRetentionUsers;
    }

    /**
     * Set Day 4 active retention of paying users
     * @param FourDayRetentionUsers Day 4 active retention of paying users
     */
    public void setFourDayRetentionUsers(Long FourDayRetentionUsers) {
        this.FourDayRetentionUsers = FourDayRetentionUsers;
    }

    /**
     * Get Day 5 active retention of paying users 
     * @return FiveDayRetentionUsers Day 5 active retention of paying users
     */
    public Long getFiveDayRetentionUsers() {
        return this.FiveDayRetentionUsers;
    }

    /**
     * Set Day 5 active retention of paying users
     * @param FiveDayRetentionUsers Day 5 active retention of paying users
     */
    public void setFiveDayRetentionUsers(Long FiveDayRetentionUsers) {
        this.FiveDayRetentionUsers = FiveDayRetentionUsers;
    }

    /**
     * Get Day 6 active retention of paying users 
     * @return SixDayRetentionUsers Day 6 active retention of paying users
     */
    public Long getSixDayRetentionUsers() {
        return this.SixDayRetentionUsers;
    }

    /**
     * Set Day 6 active retention of paying users
     * @param SixDayRetentionUsers Day 6 active retention of paying users
     */
    public void setSixDayRetentionUsers(Long SixDayRetentionUsers) {
        this.SixDayRetentionUsers = SixDayRetentionUsers;
    }

    /**
     * Get Day 7 active retention of paying users 
     * @return SevenDayRetentionUsers Day 7 active retention of paying users
     */
    public Long getSevenDayRetentionUsers() {
        return this.SevenDayRetentionUsers;
    }

    /**
     * Set Day 7 active retention of paying users
     * @param SevenDayRetentionUsers Day 7 active retention of paying users
     */
    public void setSevenDayRetentionUsers(Long SevenDayRetentionUsers) {
        this.SevenDayRetentionUsers = SevenDayRetentionUsers;
    }

    /**
     * Get Day 14 active retention of paying users 
     * @return FourteenDayRetentionUsers Day 14 active retention of paying users
     */
    public Long getFourteenDayRetentionUsers() {
        return this.FourteenDayRetentionUsers;
    }

    /**
     * Set Day 14 active retention of paying users
     * @param FourteenDayRetentionUsers Day 14 active retention of paying users
     */
    public void setFourteenDayRetentionUsers(Long FourteenDayRetentionUsers) {
        this.FourteenDayRetentionUsers = FourteenDayRetentionUsers;
    }

    /**
     * Get Day 15 active retention of paying users 
     * @return FifteenDayRetentionUsers Day 15 active retention of paying users
     */
    public Long getFifteenDayRetentionUsers() {
        return this.FifteenDayRetentionUsers;
    }

    /**
     * Set Day 15 active retention of paying users
     * @param FifteenDayRetentionUsers Day 15 active retention of paying users
     */
    public void setFifteenDayRetentionUsers(Long FifteenDayRetentionUsers) {
        this.FifteenDayRetentionUsers = FifteenDayRetentionUsers;
    }

    /**
     * Get Day 30 active retention of paying users 
     * @return ThirtyDayRetentionUsers Day 30 active retention of paying users
     */
    public Long getThirtyDayRetentionUsers() {
        return this.ThirtyDayRetentionUsers;
    }

    /**
     * Set Day 30 active retention of paying users
     * @param ThirtyDayRetentionUsers Day 30 active retention of paying users
     */
    public void setThirtyDayRetentionUsers(Long ThirtyDayRetentionUsers) {
        this.ThirtyDayRetentionUsers = ThirtyDayRetentionUsers;
    }

    /**
     * Get Number of paying users 
     * @return PaymentUserNum Number of paying users
     */
    public Long getPaymentUserNum() {
        return this.PaymentUserNum;
    }

    /**
     * Set Number of paying users
     * @param PaymentUserNum Number of paying users
     */
    public void setPaymentUserNum(Long PaymentUserNum) {
        this.PaymentUserNum = PaymentUserNum;
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

    public PaymentActiveRetention() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaymentActiveRetention(PaymentActiveRetention source) {
        if (source.OneDayRetentionUsers != null) {
            this.OneDayRetentionUsers = new Long(source.OneDayRetentionUsers);
        }
        if (source.TwoDayRetentionUsers != null) {
            this.TwoDayRetentionUsers = new Long(source.TwoDayRetentionUsers);
        }
        if (source.ThreeDayRetentionUsers != null) {
            this.ThreeDayRetentionUsers = new Long(source.ThreeDayRetentionUsers);
        }
        if (source.FourDayRetentionUsers != null) {
            this.FourDayRetentionUsers = new Long(source.FourDayRetentionUsers);
        }
        if (source.FiveDayRetentionUsers != null) {
            this.FiveDayRetentionUsers = new Long(source.FiveDayRetentionUsers);
        }
        if (source.SixDayRetentionUsers != null) {
            this.SixDayRetentionUsers = new Long(source.SixDayRetentionUsers);
        }
        if (source.SevenDayRetentionUsers != null) {
            this.SevenDayRetentionUsers = new Long(source.SevenDayRetentionUsers);
        }
        if (source.FourteenDayRetentionUsers != null) {
            this.FourteenDayRetentionUsers = new Long(source.FourteenDayRetentionUsers);
        }
        if (source.FifteenDayRetentionUsers != null) {
            this.FifteenDayRetentionUsers = new Long(source.FifteenDayRetentionUsers);
        }
        if (source.ThirtyDayRetentionUsers != null) {
            this.ThirtyDayRetentionUsers = new Long(source.ThirtyDayRetentionUsers);
        }
        if (source.PaymentUserNum != null) {
            this.PaymentUserNum = new Long(source.PaymentUserNum);
        }
        if (source.DataTime != null) {
            this.DataTime = new String(source.DataTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OneDayRetentionUsers", this.OneDayRetentionUsers);
        this.setParamSimple(map, prefix + "TwoDayRetentionUsers", this.TwoDayRetentionUsers);
        this.setParamSimple(map, prefix + "ThreeDayRetentionUsers", this.ThreeDayRetentionUsers);
        this.setParamSimple(map, prefix + "FourDayRetentionUsers", this.FourDayRetentionUsers);
        this.setParamSimple(map, prefix + "FiveDayRetentionUsers", this.FiveDayRetentionUsers);
        this.setParamSimple(map, prefix + "SixDayRetentionUsers", this.SixDayRetentionUsers);
        this.setParamSimple(map, prefix + "SevenDayRetentionUsers", this.SevenDayRetentionUsers);
        this.setParamSimple(map, prefix + "FourteenDayRetentionUsers", this.FourteenDayRetentionUsers);
        this.setParamSimple(map, prefix + "FifteenDayRetentionUsers", this.FifteenDayRetentionUsers);
        this.setParamSimple(map, prefix + "ThirtyDayRetentionUsers", this.ThirtyDayRetentionUsers);
        this.setParamSimple(map, prefix + "PaymentUserNum", this.PaymentUserNum);
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);

    }
}

