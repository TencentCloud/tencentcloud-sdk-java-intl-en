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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonthNetwork extends AbstractModel {

    /**
    * Zone information of the node
    */
    @SerializedName("ZoneInfo")
    @Expose
    private ZoneInfo ZoneInfo;

    /**
    * Bandwidth month, such as `202103`
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Bandwidth package ID format, such as `bwp-xxxxxxxx`
    */
    @SerializedName("BandwidthPkgId")
    @Expose
    private String BandwidthPkgId;

    /**
    * ISP abbreviation. Valid values: CUCC, CTCC, CMCC
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * Inbound bandwidth package peak. Value range: 0.0–xxx.xxx
    */
    @SerializedName("TrafficMaxIn")
    @Expose
    private Float TrafficMaxIn;

    /**
    * Outbound bandwidth package peak. Value range: 0.0–xxx.xxx
    */
    @SerializedName("TrafficMaxOut")
    @Expose
    private Float TrafficMaxOut;

    /**
    * Billable bandwidth. Value range: 0.0–xxx.xxx
    */
    @SerializedName("FeeTraffic")
    @Expose
    private Float FeeTraffic;

    /**
    * Start time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of actual valid days for the monthly billable bandwidth, which must be an integer greater than or equal to 0
    */
    @SerializedName("EffectiveDays")
    @Expose
    private Long EffectiveDays;

    /**
    * Actual number of days in the specified month, such as 30
    */
    @SerializedName("MonthDays")
    @Expose
    private Long MonthDays;

    /**
    * Proportion of the number of valid days, accurate to four decimal places, such as `0.2134`
    */
    @SerializedName("EffectiveDaysRate")
    @Expose
    private Float EffectiveDaysRate;

    /**
    * Billable bandwidth package type. Valid values: Address, LoadBalance, AddressIpv6
    */
    @SerializedName("BandwidthPkgType")
    @Expose
    private String BandwidthPkgType;

    /**
     * Get Zone information of the node 
     * @return ZoneInfo Zone information of the node
     */
    public ZoneInfo getZoneInfo() {
        return this.ZoneInfo;
    }

    /**
     * Set Zone information of the node
     * @param ZoneInfo Zone information of the node
     */
    public void setZoneInfo(ZoneInfo ZoneInfo) {
        this.ZoneInfo = ZoneInfo;
    }

    /**
     * Get Bandwidth month, such as `202103` 
     * @return Month Bandwidth month, such as `202103`
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bandwidth month, such as `202103`
     * @param Month Bandwidth month, such as `202103`
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Bandwidth package ID format, such as `bwp-xxxxxxxx` 
     * @return BandwidthPkgId Bandwidth package ID format, such as `bwp-xxxxxxxx`
     */
    public String getBandwidthPkgId() {
        return this.BandwidthPkgId;
    }

    /**
     * Set Bandwidth package ID format, such as `bwp-xxxxxxxx`
     * @param BandwidthPkgId Bandwidth package ID format, such as `bwp-xxxxxxxx`
     */
    public void setBandwidthPkgId(String BandwidthPkgId) {
        this.BandwidthPkgId = BandwidthPkgId;
    }

    /**
     * Get ISP abbreviation. Valid values: CUCC, CTCC, CMCC 
     * @return Isp ISP abbreviation. Valid values: CUCC, CTCC, CMCC
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set ISP abbreviation. Valid values: CUCC, CTCC, CMCC
     * @param Isp ISP abbreviation. Valid values: CUCC, CTCC, CMCC
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get Inbound bandwidth package peak. Value range: 0.0–xxx.xxx 
     * @return TrafficMaxIn Inbound bandwidth package peak. Value range: 0.0–xxx.xxx
     */
    public Float getTrafficMaxIn() {
        return this.TrafficMaxIn;
    }

    /**
     * Set Inbound bandwidth package peak. Value range: 0.0–xxx.xxx
     * @param TrafficMaxIn Inbound bandwidth package peak. Value range: 0.0–xxx.xxx
     */
    public void setTrafficMaxIn(Float TrafficMaxIn) {
        this.TrafficMaxIn = TrafficMaxIn;
    }

    /**
     * Get Outbound bandwidth package peak. Value range: 0.0–xxx.xxx 
     * @return TrafficMaxOut Outbound bandwidth package peak. Value range: 0.0–xxx.xxx
     */
    public Float getTrafficMaxOut() {
        return this.TrafficMaxOut;
    }

    /**
     * Set Outbound bandwidth package peak. Value range: 0.0–xxx.xxx
     * @param TrafficMaxOut Outbound bandwidth package peak. Value range: 0.0–xxx.xxx
     */
    public void setTrafficMaxOut(Float TrafficMaxOut) {
        this.TrafficMaxOut = TrafficMaxOut;
    }

    /**
     * Get Billable bandwidth. Value range: 0.0–xxx.xxx 
     * @return FeeTraffic Billable bandwidth. Value range: 0.0–xxx.xxx
     */
    public Float getFeeTraffic() {
        return this.FeeTraffic;
    }

    /**
     * Set Billable bandwidth. Value range: 0.0–xxx.xxx
     * @param FeeTraffic Billable bandwidth. Value range: 0.0–xxx.xxx
     */
    public void setFeeTraffic(Float FeeTraffic) {
        this.FeeTraffic = FeeTraffic;
    }

    /**
     * Get Start time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss` 
     * @return StartTime Start time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss`
     * @param StartTime Start time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss` 
     * @return EndTime End time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss`
     * @param EndTime End time of the monthly billable bandwidth in the format of `yyyy-mm-dd HH:mm:ss`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of actual valid days for the monthly billable bandwidth, which must be an integer greater than or equal to 0 
     * @return EffectiveDays Number of actual valid days for the monthly billable bandwidth, which must be an integer greater than or equal to 0
     */
    public Long getEffectiveDays() {
        return this.EffectiveDays;
    }

    /**
     * Set Number of actual valid days for the monthly billable bandwidth, which must be an integer greater than or equal to 0
     * @param EffectiveDays Number of actual valid days for the monthly billable bandwidth, which must be an integer greater than or equal to 0
     */
    public void setEffectiveDays(Long EffectiveDays) {
        this.EffectiveDays = EffectiveDays;
    }

    /**
     * Get Actual number of days in the specified month, such as 30 
     * @return MonthDays Actual number of days in the specified month, such as 30
     */
    public Long getMonthDays() {
        return this.MonthDays;
    }

    /**
     * Set Actual number of days in the specified month, such as 30
     * @param MonthDays Actual number of days in the specified month, such as 30
     */
    public void setMonthDays(Long MonthDays) {
        this.MonthDays = MonthDays;
    }

    /**
     * Get Proportion of the number of valid days, accurate to four decimal places, such as `0.2134` 
     * @return EffectiveDaysRate Proportion of the number of valid days, accurate to four decimal places, such as `0.2134`
     */
    public Float getEffectiveDaysRate() {
        return this.EffectiveDaysRate;
    }

    /**
     * Set Proportion of the number of valid days, accurate to four decimal places, such as `0.2134`
     * @param EffectiveDaysRate Proportion of the number of valid days, accurate to four decimal places, such as `0.2134`
     */
    public void setEffectiveDaysRate(Float EffectiveDaysRate) {
        this.EffectiveDaysRate = EffectiveDaysRate;
    }

    /**
     * Get Billable bandwidth package type. Valid values: Address, LoadBalance, AddressIpv6 
     * @return BandwidthPkgType Billable bandwidth package type. Valid values: Address, LoadBalance, AddressIpv6
     */
    public String getBandwidthPkgType() {
        return this.BandwidthPkgType;
    }

    /**
     * Set Billable bandwidth package type. Valid values: Address, LoadBalance, AddressIpv6
     * @param BandwidthPkgType Billable bandwidth package type. Valid values: Address, LoadBalance, AddressIpv6
     */
    public void setBandwidthPkgType(String BandwidthPkgType) {
        this.BandwidthPkgType = BandwidthPkgType;
    }

    public MonthNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonthNetwork(MonthNetwork source) {
        if (source.ZoneInfo != null) {
            this.ZoneInfo = new ZoneInfo(source.ZoneInfo);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.BandwidthPkgId != null) {
            this.BandwidthPkgId = new String(source.BandwidthPkgId);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.TrafficMaxIn != null) {
            this.TrafficMaxIn = new Float(source.TrafficMaxIn);
        }
        if (source.TrafficMaxOut != null) {
            this.TrafficMaxOut = new Float(source.TrafficMaxOut);
        }
        if (source.FeeTraffic != null) {
            this.FeeTraffic = new Float(source.FeeTraffic);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.EffectiveDays != null) {
            this.EffectiveDays = new Long(source.EffectiveDays);
        }
        if (source.MonthDays != null) {
            this.MonthDays = new Long(source.MonthDays);
        }
        if (source.EffectiveDaysRate != null) {
            this.EffectiveDaysRate = new Float(source.EffectiveDaysRate);
        }
        if (source.BandwidthPkgType != null) {
            this.BandwidthPkgType = new String(source.BandwidthPkgType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ZoneInfo.", this.ZoneInfo);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "BandwidthPkgId", this.BandwidthPkgId);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "TrafficMaxIn", this.TrafficMaxIn);
        this.setParamSimple(map, prefix + "TrafficMaxOut", this.TrafficMaxOut);
        this.setParamSimple(map, prefix + "FeeTraffic", this.FeeTraffic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EffectiveDays", this.EffectiveDays);
        this.setParamSimple(map, prefix + "MonthDays", this.MonthDays);
        this.setParamSimple(map, prefix + "EffectiveDaysRate", this.EffectiveDaysRate);
        this.setParamSimple(map, prefix + "BandwidthPkgType", this.BandwidthPkgType);

    }
}

