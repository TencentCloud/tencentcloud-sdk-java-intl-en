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
package com.tencentcloudapi.cdz.v20221123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudDedicatedZoneResourceStatisticsInfo extends AbstractModel {

    /**
    * Specifies the item name of resource statistics.
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * Resource statistics item measurement unit.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Total resource amount.
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Used resources.
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * Specifies the percentage of used resources.
    */
    @SerializedName("UsageRate")
    @Expose
    private String UsageRate;

    /**
    * Remaining resource.
    */
    @SerializedName("Remain")
    @Expose
    private String Remain;

    /**
    * Remaining resource percentage.
    */
    @SerializedName("RemainRate")
    @Expose
    private String RemainRate;

    /**
    * Resource utilization rate at midnight this monday.
    */
    @SerializedName("ThisMondayUsageRate")
    @Expose
    private String ThisMondayUsageRate;

    /**
    * Resource growth rate this week.
    */
    @SerializedName("ThisMondayUsageGrowthRate")
    @Expose
    private String ThisMondayUsageGrowthRate;

    /**
    * Resource growth rate last week.
    */
    @SerializedName("LastMondayUsageGrowthRate")
    @Expose
    private String LastMondayUsageGrowthRate;

    /**
     * Get Specifies the item name of resource statistics. 
     * @return Item Specifies the item name of resource statistics.
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set Specifies the item name of resource statistics.
     * @param Item Specifies the item name of resource statistics.
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get Resource statistics item measurement unit. 
     * @return Unit Resource statistics item measurement unit.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Resource statistics item measurement unit.
     * @param Unit Resource statistics item measurement unit.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Total resource amount. 
     * @return Total Total resource amount.
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Total resource amount.
     * @param Total Total resource amount.
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get Used resources. 
     * @return Usage Used resources.
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set Used resources.
     * @param Usage Used resources.
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Specifies the percentage of used resources. 
     * @return UsageRate Specifies the percentage of used resources.
     */
    public String getUsageRate() {
        return this.UsageRate;
    }

    /**
     * Set Specifies the percentage of used resources.
     * @param UsageRate Specifies the percentage of used resources.
     */
    public void setUsageRate(String UsageRate) {
        this.UsageRate = UsageRate;
    }

    /**
     * Get Remaining resource. 
     * @return Remain Remaining resource.
     */
    public String getRemain() {
        return this.Remain;
    }

    /**
     * Set Remaining resource.
     * @param Remain Remaining resource.
     */
    public void setRemain(String Remain) {
        this.Remain = Remain;
    }

    /**
     * Get Remaining resource percentage. 
     * @return RemainRate Remaining resource percentage.
     */
    public String getRemainRate() {
        return this.RemainRate;
    }

    /**
     * Set Remaining resource percentage.
     * @param RemainRate Remaining resource percentage.
     */
    public void setRemainRate(String RemainRate) {
        this.RemainRate = RemainRate;
    }

    /**
     * Get Resource utilization rate at midnight this monday. 
     * @return ThisMondayUsageRate Resource utilization rate at midnight this monday.
     */
    public String getThisMondayUsageRate() {
        return this.ThisMondayUsageRate;
    }

    /**
     * Set Resource utilization rate at midnight this monday.
     * @param ThisMondayUsageRate Resource utilization rate at midnight this monday.
     */
    public void setThisMondayUsageRate(String ThisMondayUsageRate) {
        this.ThisMondayUsageRate = ThisMondayUsageRate;
    }

    /**
     * Get Resource growth rate this week. 
     * @return ThisMondayUsageGrowthRate Resource growth rate this week.
     */
    public String getThisMondayUsageGrowthRate() {
        return this.ThisMondayUsageGrowthRate;
    }

    /**
     * Set Resource growth rate this week.
     * @param ThisMondayUsageGrowthRate Resource growth rate this week.
     */
    public void setThisMondayUsageGrowthRate(String ThisMondayUsageGrowthRate) {
        this.ThisMondayUsageGrowthRate = ThisMondayUsageGrowthRate;
    }

    /**
     * Get Resource growth rate last week. 
     * @return LastMondayUsageGrowthRate Resource growth rate last week.
     */
    public String getLastMondayUsageGrowthRate() {
        return this.LastMondayUsageGrowthRate;
    }

    /**
     * Set Resource growth rate last week.
     * @param LastMondayUsageGrowthRate Resource growth rate last week.
     */
    public void setLastMondayUsageGrowthRate(String LastMondayUsageGrowthRate) {
        this.LastMondayUsageGrowthRate = LastMondayUsageGrowthRate;
    }

    public CloudDedicatedZoneResourceStatisticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudDedicatedZoneResourceStatisticsInfo(CloudDedicatedZoneResourceStatisticsInfo source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.UsageRate != null) {
            this.UsageRate = new String(source.UsageRate);
        }
        if (source.Remain != null) {
            this.Remain = new String(source.Remain);
        }
        if (source.RemainRate != null) {
            this.RemainRate = new String(source.RemainRate);
        }
        if (source.ThisMondayUsageRate != null) {
            this.ThisMondayUsageRate = new String(source.ThisMondayUsageRate);
        }
        if (source.ThisMondayUsageGrowthRate != null) {
            this.ThisMondayUsageGrowthRate = new String(source.ThisMondayUsageGrowthRate);
        }
        if (source.LastMondayUsageGrowthRate != null) {
            this.LastMondayUsageGrowthRate = new String(source.LastMondayUsageGrowthRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "UsageRate", this.UsageRate);
        this.setParamSimple(map, prefix + "Remain", this.Remain);
        this.setParamSimple(map, prefix + "RemainRate", this.RemainRate);
        this.setParamSimple(map, prefix + "ThisMondayUsageRate", this.ThisMondayUsageRate);
        this.setParamSimple(map, prefix + "ThisMondayUsageGrowthRate", this.ThisMondayUsageGrowthRate);
        this.setParamSimple(map, prefix + "LastMondayUsageGrowthRate", this.LastMondayUsageGrowthRate);

    }
}

