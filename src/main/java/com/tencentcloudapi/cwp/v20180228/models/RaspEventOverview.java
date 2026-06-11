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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspEventOverview extends AbstractModel {

    /**
    * Number of protectable vulnerabilities
    */
    @SerializedName("DefenceVuls")
    @Expose
    private Long DefenceVuls;

    /**
    * Number of accurately prevented vulnerabilities
    */
    @SerializedName("PreciseDefenseVuls")
    @Expose
    private Long PreciseDefenseVuls;

    /**
    * Unprocessed application defense event count
    */
    @SerializedName("UnhandledRaspEvents")
    @Expose
    private Long UnhandledRaspEvents;

    /**
    * Number of unprocessed Java Webshell scan events
    */
    @SerializedName("UnhandledMemShellScanEvents")
    @Expose
    private Long UnhandledMemShellScanEvents;

    /**
    * Number of unprocessed memory shell injection events
    */
    @SerializedName("UnhandledMemShellInjectEvents")
    @Expose
    private Long UnhandledMemShellInjectEvents;

    /**
    * Daily event handling trend
    */
    @SerializedName("UnHandledEvents")
    @Expose
    private Long [] UnHandledEvents;

    /**
    * Daily vulnerability detect event trend
    */
    @SerializedName("RaspAttackCounts")
    @Expose
    private Long [] RaspAttackCounts;

    /**
    * Daily vulnerability defense event trend
    */
    @SerializedName("RaspDefendCounts")
    @Expose
    private Long [] RaspDefendCounts;

    /**
    * Daily Java Webshell detect event trend
    */
    @SerializedName("MemShellAttackCounts")
    @Expose
    private Long [] MemShellAttackCounts;

    /**
    * Daily Java Webshell defense event trends
    */
    @SerializedName("MemShellDefendCounts")
    @Expose
    private Long [] MemShellDefendCounts;

    /**
    * Date
    */
    @SerializedName("Date")
    @Expose
    private String [] Date;

    /**
    * Enable RASP protection switch number of assets
    */
    @SerializedName("ProtectAssetOpenCount")
    @Expose
    private Long ProtectAssetOpenCount;

    /**
    * Total number of assets
    */
    @SerializedName("ProtectAssetCount")
    @Expose
    private Long ProtectAssetCount;

    /**
    * Number of asset protection bound to the flagship edition
    */
    @SerializedName("UltimateAssetCount")
    @Expose
    private Long UltimateAssetCount;

    /**
    * Number of assets bound to the Prioritized Protection package
    */
    @SerializedName("RaspAssetCount")
    @Expose
    private Long RaspAssetCount;

    /**
    * Number of unauthorized assets
    */
    @SerializedName("NotProtectAssetCount")
    @Expose
    private Long NotProtectAssetCount;

    /**
    * Pending events count in the last 7 days
    */
    @SerializedName("RecentUnhandledEvents")
    @Expose
    private Long RecentUnhandledEvents;

    /**
    * Total Number of Successful Defenses
    */
    @SerializedName("RaspDefendCount")
    @Expose
    private Long RaspDefendCount;

    /**
     * Get Number of protectable vulnerabilities 
     * @return DefenceVuls Number of protectable vulnerabilities
     */
    public Long getDefenceVuls() {
        return this.DefenceVuls;
    }

    /**
     * Set Number of protectable vulnerabilities
     * @param DefenceVuls Number of protectable vulnerabilities
     */
    public void setDefenceVuls(Long DefenceVuls) {
        this.DefenceVuls = DefenceVuls;
    }

    /**
     * Get Number of accurately prevented vulnerabilities 
     * @return PreciseDefenseVuls Number of accurately prevented vulnerabilities
     */
    public Long getPreciseDefenseVuls() {
        return this.PreciseDefenseVuls;
    }

    /**
     * Set Number of accurately prevented vulnerabilities
     * @param PreciseDefenseVuls Number of accurately prevented vulnerabilities
     */
    public void setPreciseDefenseVuls(Long PreciseDefenseVuls) {
        this.PreciseDefenseVuls = PreciseDefenseVuls;
    }

    /**
     * Get Unprocessed application defense event count 
     * @return UnhandledRaspEvents Unprocessed application defense event count
     */
    public Long getUnhandledRaspEvents() {
        return this.UnhandledRaspEvents;
    }

    /**
     * Set Unprocessed application defense event count
     * @param UnhandledRaspEvents Unprocessed application defense event count
     */
    public void setUnhandledRaspEvents(Long UnhandledRaspEvents) {
        this.UnhandledRaspEvents = UnhandledRaspEvents;
    }

    /**
     * Get Number of unprocessed Java Webshell scan events 
     * @return UnhandledMemShellScanEvents Number of unprocessed Java Webshell scan events
     */
    public Long getUnhandledMemShellScanEvents() {
        return this.UnhandledMemShellScanEvents;
    }

    /**
     * Set Number of unprocessed Java Webshell scan events
     * @param UnhandledMemShellScanEvents Number of unprocessed Java Webshell scan events
     */
    public void setUnhandledMemShellScanEvents(Long UnhandledMemShellScanEvents) {
        this.UnhandledMemShellScanEvents = UnhandledMemShellScanEvents;
    }

    /**
     * Get Number of unprocessed memory shell injection events 
     * @return UnhandledMemShellInjectEvents Number of unprocessed memory shell injection events
     */
    public Long getUnhandledMemShellInjectEvents() {
        return this.UnhandledMemShellInjectEvents;
    }

    /**
     * Set Number of unprocessed memory shell injection events
     * @param UnhandledMemShellInjectEvents Number of unprocessed memory shell injection events
     */
    public void setUnhandledMemShellInjectEvents(Long UnhandledMemShellInjectEvents) {
        this.UnhandledMemShellInjectEvents = UnhandledMemShellInjectEvents;
    }

    /**
     * Get Daily event handling trend 
     * @return UnHandledEvents Daily event handling trend
     */
    public Long [] getUnHandledEvents() {
        return this.UnHandledEvents;
    }

    /**
     * Set Daily event handling trend
     * @param UnHandledEvents Daily event handling trend
     */
    public void setUnHandledEvents(Long [] UnHandledEvents) {
        this.UnHandledEvents = UnHandledEvents;
    }

    /**
     * Get Daily vulnerability detect event trend 
     * @return RaspAttackCounts Daily vulnerability detect event trend
     */
    public Long [] getRaspAttackCounts() {
        return this.RaspAttackCounts;
    }

    /**
     * Set Daily vulnerability detect event trend
     * @param RaspAttackCounts Daily vulnerability detect event trend
     */
    public void setRaspAttackCounts(Long [] RaspAttackCounts) {
        this.RaspAttackCounts = RaspAttackCounts;
    }

    /**
     * Get Daily vulnerability defense event trend 
     * @return RaspDefendCounts Daily vulnerability defense event trend
     */
    public Long [] getRaspDefendCounts() {
        return this.RaspDefendCounts;
    }

    /**
     * Set Daily vulnerability defense event trend
     * @param RaspDefendCounts Daily vulnerability defense event trend
     */
    public void setRaspDefendCounts(Long [] RaspDefendCounts) {
        this.RaspDefendCounts = RaspDefendCounts;
    }

    /**
     * Get Daily Java Webshell detect event trend 
     * @return MemShellAttackCounts Daily Java Webshell detect event trend
     */
    public Long [] getMemShellAttackCounts() {
        return this.MemShellAttackCounts;
    }

    /**
     * Set Daily Java Webshell detect event trend
     * @param MemShellAttackCounts Daily Java Webshell detect event trend
     */
    public void setMemShellAttackCounts(Long [] MemShellAttackCounts) {
        this.MemShellAttackCounts = MemShellAttackCounts;
    }

    /**
     * Get Daily Java Webshell defense event trends 
     * @return MemShellDefendCounts Daily Java Webshell defense event trends
     */
    public Long [] getMemShellDefendCounts() {
        return this.MemShellDefendCounts;
    }

    /**
     * Set Daily Java Webshell defense event trends
     * @param MemShellDefendCounts Daily Java Webshell defense event trends
     */
    public void setMemShellDefendCounts(Long [] MemShellDefendCounts) {
        this.MemShellDefendCounts = MemShellDefendCounts;
    }

    /**
     * Get Date 
     * @return Date Date
     */
    public String [] getDate() {
        return this.Date;
    }

    /**
     * Set Date
     * @param Date Date
     */
    public void setDate(String [] Date) {
        this.Date = Date;
    }

    /**
     * Get Enable RASP protection switch number of assets 
     * @return ProtectAssetOpenCount Enable RASP protection switch number of assets
     */
    public Long getProtectAssetOpenCount() {
        return this.ProtectAssetOpenCount;
    }

    /**
     * Set Enable RASP protection switch number of assets
     * @param ProtectAssetOpenCount Enable RASP protection switch number of assets
     */
    public void setProtectAssetOpenCount(Long ProtectAssetOpenCount) {
        this.ProtectAssetOpenCount = ProtectAssetOpenCount;
    }

    /**
     * Get Total number of assets 
     * @return ProtectAssetCount Total number of assets
     */
    public Long getProtectAssetCount() {
        return this.ProtectAssetCount;
    }

    /**
     * Set Total number of assets
     * @param ProtectAssetCount Total number of assets
     */
    public void setProtectAssetCount(Long ProtectAssetCount) {
        this.ProtectAssetCount = ProtectAssetCount;
    }

    /**
     * Get Number of asset protection bound to the flagship edition 
     * @return UltimateAssetCount Number of asset protection bound to the flagship edition
     */
    public Long getUltimateAssetCount() {
        return this.UltimateAssetCount;
    }

    /**
     * Set Number of asset protection bound to the flagship edition
     * @param UltimateAssetCount Number of asset protection bound to the flagship edition
     */
    public void setUltimateAssetCount(Long UltimateAssetCount) {
        this.UltimateAssetCount = UltimateAssetCount;
    }

    /**
     * Get Number of assets bound to the Prioritized Protection package 
     * @return RaspAssetCount Number of assets bound to the Prioritized Protection package
     */
    public Long getRaspAssetCount() {
        return this.RaspAssetCount;
    }

    /**
     * Set Number of assets bound to the Prioritized Protection package
     * @param RaspAssetCount Number of assets bound to the Prioritized Protection package
     */
    public void setRaspAssetCount(Long RaspAssetCount) {
        this.RaspAssetCount = RaspAssetCount;
    }

    /**
     * Get Number of unauthorized assets 
     * @return NotProtectAssetCount Number of unauthorized assets
     */
    public Long getNotProtectAssetCount() {
        return this.NotProtectAssetCount;
    }

    /**
     * Set Number of unauthorized assets
     * @param NotProtectAssetCount Number of unauthorized assets
     */
    public void setNotProtectAssetCount(Long NotProtectAssetCount) {
        this.NotProtectAssetCount = NotProtectAssetCount;
    }

    /**
     * Get Pending events count in the last 7 days 
     * @return RecentUnhandledEvents Pending events count in the last 7 days
     */
    public Long getRecentUnhandledEvents() {
        return this.RecentUnhandledEvents;
    }

    /**
     * Set Pending events count in the last 7 days
     * @param RecentUnhandledEvents Pending events count in the last 7 days
     */
    public void setRecentUnhandledEvents(Long RecentUnhandledEvents) {
        this.RecentUnhandledEvents = RecentUnhandledEvents;
    }

    /**
     * Get Total Number of Successful Defenses 
     * @return RaspDefendCount Total Number of Successful Defenses
     */
    public Long getRaspDefendCount() {
        return this.RaspDefendCount;
    }

    /**
     * Set Total Number of Successful Defenses
     * @param RaspDefendCount Total Number of Successful Defenses
     */
    public void setRaspDefendCount(Long RaspDefendCount) {
        this.RaspDefendCount = RaspDefendCount;
    }

    public RaspEventOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspEventOverview(RaspEventOverview source) {
        if (source.DefenceVuls != null) {
            this.DefenceVuls = new Long(source.DefenceVuls);
        }
        if (source.PreciseDefenseVuls != null) {
            this.PreciseDefenseVuls = new Long(source.PreciseDefenseVuls);
        }
        if (source.UnhandledRaspEvents != null) {
            this.UnhandledRaspEvents = new Long(source.UnhandledRaspEvents);
        }
        if (source.UnhandledMemShellScanEvents != null) {
            this.UnhandledMemShellScanEvents = new Long(source.UnhandledMemShellScanEvents);
        }
        if (source.UnhandledMemShellInjectEvents != null) {
            this.UnhandledMemShellInjectEvents = new Long(source.UnhandledMemShellInjectEvents);
        }
        if (source.UnHandledEvents != null) {
            this.UnHandledEvents = new Long[source.UnHandledEvents.length];
            for (int i = 0; i < source.UnHandledEvents.length; i++) {
                this.UnHandledEvents[i] = new Long(source.UnHandledEvents[i]);
            }
        }
        if (source.RaspAttackCounts != null) {
            this.RaspAttackCounts = new Long[source.RaspAttackCounts.length];
            for (int i = 0; i < source.RaspAttackCounts.length; i++) {
                this.RaspAttackCounts[i] = new Long(source.RaspAttackCounts[i]);
            }
        }
        if (source.RaspDefendCounts != null) {
            this.RaspDefendCounts = new Long[source.RaspDefendCounts.length];
            for (int i = 0; i < source.RaspDefendCounts.length; i++) {
                this.RaspDefendCounts[i] = new Long(source.RaspDefendCounts[i]);
            }
        }
        if (source.MemShellAttackCounts != null) {
            this.MemShellAttackCounts = new Long[source.MemShellAttackCounts.length];
            for (int i = 0; i < source.MemShellAttackCounts.length; i++) {
                this.MemShellAttackCounts[i] = new Long(source.MemShellAttackCounts[i]);
            }
        }
        if (source.MemShellDefendCounts != null) {
            this.MemShellDefendCounts = new Long[source.MemShellDefendCounts.length];
            for (int i = 0; i < source.MemShellDefendCounts.length; i++) {
                this.MemShellDefendCounts[i] = new Long(source.MemShellDefendCounts[i]);
            }
        }
        if (source.Date != null) {
            this.Date = new String[source.Date.length];
            for (int i = 0; i < source.Date.length; i++) {
                this.Date[i] = new String(source.Date[i]);
            }
        }
        if (source.ProtectAssetOpenCount != null) {
            this.ProtectAssetOpenCount = new Long(source.ProtectAssetOpenCount);
        }
        if (source.ProtectAssetCount != null) {
            this.ProtectAssetCount = new Long(source.ProtectAssetCount);
        }
        if (source.UltimateAssetCount != null) {
            this.UltimateAssetCount = new Long(source.UltimateAssetCount);
        }
        if (source.RaspAssetCount != null) {
            this.RaspAssetCount = new Long(source.RaspAssetCount);
        }
        if (source.NotProtectAssetCount != null) {
            this.NotProtectAssetCount = new Long(source.NotProtectAssetCount);
        }
        if (source.RecentUnhandledEvents != null) {
            this.RecentUnhandledEvents = new Long(source.RecentUnhandledEvents);
        }
        if (source.RaspDefendCount != null) {
            this.RaspDefendCount = new Long(source.RaspDefendCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefenceVuls", this.DefenceVuls);
        this.setParamSimple(map, prefix + "PreciseDefenseVuls", this.PreciseDefenseVuls);
        this.setParamSimple(map, prefix + "UnhandledRaspEvents", this.UnhandledRaspEvents);
        this.setParamSimple(map, prefix + "UnhandledMemShellScanEvents", this.UnhandledMemShellScanEvents);
        this.setParamSimple(map, prefix + "UnhandledMemShellInjectEvents", this.UnhandledMemShellInjectEvents);
        this.setParamArraySimple(map, prefix + "UnHandledEvents.", this.UnHandledEvents);
        this.setParamArraySimple(map, prefix + "RaspAttackCounts.", this.RaspAttackCounts);
        this.setParamArraySimple(map, prefix + "RaspDefendCounts.", this.RaspDefendCounts);
        this.setParamArraySimple(map, prefix + "MemShellAttackCounts.", this.MemShellAttackCounts);
        this.setParamArraySimple(map, prefix + "MemShellDefendCounts.", this.MemShellDefendCounts);
        this.setParamArraySimple(map, prefix + "Date.", this.Date);
        this.setParamSimple(map, prefix + "ProtectAssetOpenCount", this.ProtectAssetOpenCount);
        this.setParamSimple(map, prefix + "ProtectAssetCount", this.ProtectAssetCount);
        this.setParamSimple(map, prefix + "UltimateAssetCount", this.UltimateAssetCount);
        this.setParamSimple(map, prefix + "RaspAssetCount", this.RaspAssetCount);
        this.setParamSimple(map, prefix + "NotProtectAssetCount", this.NotProtectAssetCount);
        this.setParamSimple(map, prefix + "RecentUnhandledEvents", this.RecentUnhandledEvents);
        this.setParamSimple(map, prefix + "RaspDefendCount", this.RaspDefendCount);

    }
}

