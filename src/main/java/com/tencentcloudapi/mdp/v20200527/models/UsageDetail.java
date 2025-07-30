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

public class UsageDetail extends AbstractModel {

    /**
    * Ad insertion configuration uniq_id.
    */
    @SerializedName("UniqId")
    @Expose
    private String UniqId;

    /**
    * Ad insertion configuration id.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Ad insertion configuration name.
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Ad type.
    */
    @SerializedName("AdType")
    @Expose
    private String AdType;

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
    * Number of ad exposures.
    */
    @SerializedName("Impression")
    @Expose
    private Long Impression;

    /**
    * Number of ad playbacks started.
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * Ad plays at 1/4 point.
    */
    @SerializedName("FirstQuarter")
    @Expose
    private Long FirstQuarter;

    /**
    * Ad plays at 1/2 point.
    */
    @SerializedName("Midpoint")
    @Expose
    private Long Midpoint;

    /**
    * Ad plays at 3/4 point.
    */
    @SerializedName("ThirdQuarter")
    @Expose
    private Long ThirdQuarter;

    /**
    * Number of ad playbacks completed.
    */
    @SerializedName("Complete")
    @Expose
    private Long Complete;

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
    * Fill factor for personalized ads.
    */
    @SerializedName("MidFillRate")
    @Expose
    private Float MidFillRate;

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
    * Ad replacement rate.
    */
    @SerializedName("PreReplaceRate")
    @Expose
    private Float PreReplaceRate;

    /**
     * Get Ad insertion configuration uniq_id. 
     * @return UniqId Ad insertion configuration uniq_id.
     */
    public String getUniqId() {
        return this.UniqId;
    }

    /**
     * Set Ad insertion configuration uniq_id.
     * @param UniqId Ad insertion configuration uniq_id.
     */
    public void setUniqId(String UniqId) {
        this.UniqId = UniqId;
    }

    /**
     * Get Ad insertion configuration id. 
     * @return ChannelId Ad insertion configuration id.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Ad insertion configuration id.
     * @param ChannelId Ad insertion configuration id.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Ad insertion configuration name. 
     * @return ChannelName Ad insertion configuration name.
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Ad insertion configuration name.
     * @param ChannelName Ad insertion configuration name.
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Ad type. 
     * @return AdType Ad type.
     */
    public String getAdType() {
        return this.AdType;
    }

    /**
     * Set Ad type.
     * @param AdType Ad type.
     */
    public void setAdType(String AdType) {
        this.AdType = AdType;
    }

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
     * Get Number of ad exposures. 
     * @return Impression Number of ad exposures.
     */
    public Long getImpression() {
        return this.Impression;
    }

    /**
     * Set Number of ad exposures.
     * @param Impression Number of ad exposures.
     */
    public void setImpression(Long Impression) {
        this.Impression = Impression;
    }

    /**
     * Get Number of ad playbacks started. 
     * @return Start Number of ad playbacks started.
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set Number of ad playbacks started.
     * @param Start Number of ad playbacks started.
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get Ad plays at 1/4 point. 
     * @return FirstQuarter Ad plays at 1/4 point.
     */
    public Long getFirstQuarter() {
        return this.FirstQuarter;
    }

    /**
     * Set Ad plays at 1/4 point.
     * @param FirstQuarter Ad plays at 1/4 point.
     */
    public void setFirstQuarter(Long FirstQuarter) {
        this.FirstQuarter = FirstQuarter;
    }

    /**
     * Get Ad plays at 1/2 point. 
     * @return Midpoint Ad plays at 1/2 point.
     */
    public Long getMidpoint() {
        return this.Midpoint;
    }

    /**
     * Set Ad plays at 1/2 point.
     * @param Midpoint Ad plays at 1/2 point.
     */
    public void setMidpoint(Long Midpoint) {
        this.Midpoint = Midpoint;
    }

    /**
     * Get Ad plays at 3/4 point. 
     * @return ThirdQuarter Ad plays at 3/4 point.
     */
    public Long getThirdQuarter() {
        return this.ThirdQuarter;
    }

    /**
     * Set Ad plays at 3/4 point.
     * @param ThirdQuarter Ad plays at 3/4 point.
     */
    public void setThirdQuarter(Long ThirdQuarter) {
        this.ThirdQuarter = ThirdQuarter;
    }

    /**
     * Get Number of ad playbacks completed. 
     * @return Complete Number of ad playbacks completed.
     */
    public Long getComplete() {
        return this.Complete;
    }

    /**
     * Set Number of ad playbacks completed.
     * @param Complete Number of ad playbacks completed.
     */
    public void setComplete(Long Complete) {
        this.Complete = Complete;
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

    public UsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetail(UsageDetail source) {
        if (source.UniqId != null) {
            this.UniqId = new String(source.UniqId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.AdType != null) {
            this.AdType = new String(source.AdType);
        }
        if (source.AdRequestSuccess != null) {
            this.AdRequestSuccess = new Long(source.AdRequestSuccess);
        }
        if (source.AdRequestFail != null) {
            this.AdRequestFail = new Long(source.AdRequestFail);
        }
        if (source.Impression != null) {
            this.Impression = new Long(source.Impression);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.FirstQuarter != null) {
            this.FirstQuarter = new Long(source.FirstQuarter);
        }
        if (source.Midpoint != null) {
            this.Midpoint = new Long(source.Midpoint);
        }
        if (source.ThirdQuarter != null) {
            this.ThirdQuarter = new Long(source.ThirdQuarter);
        }
        if (source.Complete != null) {
            this.Complete = new Long(source.Complete);
        }
        if (source.AdMarkerTime != null) {
            this.AdMarkerTime = new Float(source.AdMarkerTime);
        }
        if (source.ReplacedTime != null) {
            this.ReplacedTime = new Float(source.ReplacedTime);
        }
        if (source.MidFillRate != null) {
            this.MidFillRate = new Float(source.MidFillRate);
        }
        if (source.PreReqNum != null) {
            this.PreReqNum = new Long(source.PreReqNum);
        }
        if (source.PreReplacedNum != null) {
            this.PreReplacedNum = new Long(source.PreReplacedNum);
        }
        if (source.PreReplaceRate != null) {
            this.PreReplaceRate = new Float(source.PreReplaceRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqId", this.UniqId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "AdType", this.AdType);
        this.setParamSimple(map, prefix + "AdRequestSuccess", this.AdRequestSuccess);
        this.setParamSimple(map, prefix + "AdRequestFail", this.AdRequestFail);
        this.setParamSimple(map, prefix + "Impression", this.Impression);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "FirstQuarter", this.FirstQuarter);
        this.setParamSimple(map, prefix + "Midpoint", this.Midpoint);
        this.setParamSimple(map, prefix + "ThirdQuarter", this.ThirdQuarter);
        this.setParamSimple(map, prefix + "Complete", this.Complete);
        this.setParamSimple(map, prefix + "AdMarkerTime", this.AdMarkerTime);
        this.setParamSimple(map, prefix + "ReplacedTime", this.ReplacedTime);
        this.setParamSimple(map, prefix + "MidFillRate", this.MidFillRate);
        this.setParamSimple(map, prefix + "PreReqNum", this.PreReqNum);
        this.setParamSimple(map, prefix + "PreReplacedNum", this.PreReplacedNum);
        this.setParamSimple(map, prefix + "PreReplaceRate", this.PreReplaceRate);

    }
}

