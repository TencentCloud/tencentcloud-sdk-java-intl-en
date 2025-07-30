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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSAIUsageInfo extends AbstractModel {

    /**
    * Number of successful ad requests.
    */
    @SerializedName("AdRequestSuccess")
    @Expose
    private Long AdRequestSuccess;

    /**
    * Number of failed ad requests.
    */
    @SerializedName("AdRequestFail")
    @Expose
    private Long AdRequestFail;

    /**
    * Exposure count.
    */
    @SerializedName("Impression")
    @Expose
    private Long Impression;

    /**
    * Fill factor for personalized ads.
    */
    @SerializedName("MidFillRate")
    @Expose
    private Float MidFillRate;

    /**
    * Advertising tag time.
    */
    @SerializedName("AdMarkerTime")
    @Expose
    private Float AdMarkerTime;

    /**
    * Personalization replacement time.
    */
    @SerializedName("ReplacedTime")
    @Expose
    private Float ReplacedTime;

    /**
    * Ad replacement rate.
    */
    @SerializedName("PreReplaceRate")
    @Expose
    private Float PreReplaceRate;

    /**
    * Number of pre-roll ad requests.
    */
    @SerializedName("PreReqNum")
    @Expose
    private Long PreReqNum;

    /**
    * Number of pre-roll ad replacements.
    */
    @SerializedName("PreReplacedNum")
    @Expose
    private Long PreReplacedNum;

    /**
    * Configures usage for each ad.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsageDetails")
    @Expose
    private UsageDetail [] UsageDetails;

    /**
     * Get Number of successful ad requests. 
     * @return AdRequestSuccess Number of successful ad requests.
     */
    public Long getAdRequestSuccess() {
        return this.AdRequestSuccess;
    }

    /**
     * Set Number of successful ad requests.
     * @param AdRequestSuccess Number of successful ad requests.
     */
    public void setAdRequestSuccess(Long AdRequestSuccess) {
        this.AdRequestSuccess = AdRequestSuccess;
    }

    /**
     * Get Number of failed ad requests. 
     * @return AdRequestFail Number of failed ad requests.
     */
    public Long getAdRequestFail() {
        return this.AdRequestFail;
    }

    /**
     * Set Number of failed ad requests.
     * @param AdRequestFail Number of failed ad requests.
     */
    public void setAdRequestFail(Long AdRequestFail) {
        this.AdRequestFail = AdRequestFail;
    }

    /**
     * Get Exposure count. 
     * @return Impression Exposure count.
     */
    public Long getImpression() {
        return this.Impression;
    }

    /**
     * Set Exposure count.
     * @param Impression Exposure count.
     */
    public void setImpression(Long Impression) {
        this.Impression = Impression;
    }

    /**
     * Get Fill factor for personalized ads. 
     * @return MidFillRate Fill factor for personalized ads.
     */
    public Float getMidFillRate() {
        return this.MidFillRate;
    }

    /**
     * Set Fill factor for personalized ads.
     * @param MidFillRate Fill factor for personalized ads.
     */
    public void setMidFillRate(Float MidFillRate) {
        this.MidFillRate = MidFillRate;
    }

    /**
     * Get Advertising tag time. 
     * @return AdMarkerTime Advertising tag time.
     */
    public Float getAdMarkerTime() {
        return this.AdMarkerTime;
    }

    /**
     * Set Advertising tag time.
     * @param AdMarkerTime Advertising tag time.
     */
    public void setAdMarkerTime(Float AdMarkerTime) {
        this.AdMarkerTime = AdMarkerTime;
    }

    /**
     * Get Personalization replacement time. 
     * @return ReplacedTime Personalization replacement time.
     */
    public Float getReplacedTime() {
        return this.ReplacedTime;
    }

    /**
     * Set Personalization replacement time.
     * @param ReplacedTime Personalization replacement time.
     */
    public void setReplacedTime(Float ReplacedTime) {
        this.ReplacedTime = ReplacedTime;
    }

    /**
     * Get Ad replacement rate. 
     * @return PreReplaceRate Ad replacement rate.
     */
    public Float getPreReplaceRate() {
        return this.PreReplaceRate;
    }

    /**
     * Set Ad replacement rate.
     * @param PreReplaceRate Ad replacement rate.
     */
    public void setPreReplaceRate(Float PreReplaceRate) {
        this.PreReplaceRate = PreReplaceRate;
    }

    /**
     * Get Number of pre-roll ad requests. 
     * @return PreReqNum Number of pre-roll ad requests.
     */
    public Long getPreReqNum() {
        return this.PreReqNum;
    }

    /**
     * Set Number of pre-roll ad requests.
     * @param PreReqNum Number of pre-roll ad requests.
     */
    public void setPreReqNum(Long PreReqNum) {
        this.PreReqNum = PreReqNum;
    }

    /**
     * Get Number of pre-roll ad replacements. 
     * @return PreReplacedNum Number of pre-roll ad replacements.
     */
    public Long getPreReplacedNum() {
        return this.PreReplacedNum;
    }

    /**
     * Set Number of pre-roll ad replacements.
     * @param PreReplacedNum Number of pre-roll ad replacements.
     */
    public void setPreReplacedNum(Long PreReplacedNum) {
        this.PreReplacedNum = PreReplacedNum;
    }

    /**
     * Get Configures usage for each ad.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UsageDetails Configures usage for each ad.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UsageDetail [] getUsageDetails() {
        return this.UsageDetails;
    }

    /**
     * Set Configures usage for each ad.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UsageDetails Configures usage for each ad.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsageDetails(UsageDetail [] UsageDetails) {
        this.UsageDetails = UsageDetails;
    }

    public SSAIUsageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSAIUsageInfo(SSAIUsageInfo source) {
        if (source.AdRequestSuccess != null) {
            this.AdRequestSuccess = new Long(source.AdRequestSuccess);
        }
        if (source.AdRequestFail != null) {
            this.AdRequestFail = new Long(source.AdRequestFail);
        }
        if (source.Impression != null) {
            this.Impression = new Long(source.Impression);
        }
        if (source.MidFillRate != null) {
            this.MidFillRate = new Float(source.MidFillRate);
        }
        if (source.AdMarkerTime != null) {
            this.AdMarkerTime = new Float(source.AdMarkerTime);
        }
        if (source.ReplacedTime != null) {
            this.ReplacedTime = new Float(source.ReplacedTime);
        }
        if (source.PreReplaceRate != null) {
            this.PreReplaceRate = new Float(source.PreReplaceRate);
        }
        if (source.PreReqNum != null) {
            this.PreReqNum = new Long(source.PreReqNum);
        }
        if (source.PreReplacedNum != null) {
            this.PreReplacedNum = new Long(source.PreReplacedNum);
        }
        if (source.UsageDetails != null) {
            this.UsageDetails = new UsageDetail[source.UsageDetails.length];
            for (int i = 0; i < source.UsageDetails.length; i++) {
                this.UsageDetails[i] = new UsageDetail(source.UsageDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AdRequestSuccess", this.AdRequestSuccess);
        this.setParamSimple(map, prefix + "AdRequestFail", this.AdRequestFail);
        this.setParamSimple(map, prefix + "Impression", this.Impression);
        this.setParamSimple(map, prefix + "MidFillRate", this.MidFillRate);
        this.setParamSimple(map, prefix + "AdMarkerTime", this.AdMarkerTime);
        this.setParamSimple(map, prefix + "ReplacedTime", this.ReplacedTime);
        this.setParamSimple(map, prefix + "PreReplaceRate", this.PreReplaceRate);
        this.setParamSimple(map, prefix + "PreReqNum", this.PreReqNum);
        this.setParamSimple(map, prefix + "PreReplacedNum", this.PreReplacedNum);
        this.setParamArrayObj(map, prefix + "UsageDetails.", this.UsageDetails);

    }
}

