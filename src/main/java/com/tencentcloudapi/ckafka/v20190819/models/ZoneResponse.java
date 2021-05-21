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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneResponse extends AbstractModel{

    /**
    * Zone list
    */
    @SerializedName("ZoneList")
    @Expose
    private ZoneInfo [] ZoneList;

    /**
    * Maximum number of instances to be purchased
    */
    @SerializedName("MaxBuyInstanceNum")
    @Expose
    private Long MaxBuyInstanceNum;

    /**
    * Maximum bandwidth in MB/S
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * Pay-as-you-go unit price
    */
    @SerializedName("UnitPrice")
    @Expose
    private Price UnitPrice;

    /**
    * Pay-as-you-go unit message price
    */
    @SerializedName("MessagePrice")
    @Expose
    private Price MessagePrice;

    /**
    * Cluster information dedicated to a user
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterInfo")
    @Expose
    private ClusterInfo [] ClusterInfo;

    /**
    * Purchase of Standard Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
    * Purchase of Standard S2 Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("StandardS2")
    @Expose
    private String StandardS2;

    /**
    * Purchase of Pro Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * Purchase of Physical Dedicated Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Physical")
    @Expose
    private String Physical;

    /**
     * Get Zone list 
     * @return ZoneList Zone list
     */
    public ZoneInfo [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set Zone list
     * @param ZoneList Zone list
     */
    public void setZoneList(ZoneInfo [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get Maximum number of instances to be purchased 
     * @return MaxBuyInstanceNum Maximum number of instances to be purchased
     */
    public Long getMaxBuyInstanceNum() {
        return this.MaxBuyInstanceNum;
    }

    /**
     * Set Maximum number of instances to be purchased
     * @param MaxBuyInstanceNum Maximum number of instances to be purchased
     */
    public void setMaxBuyInstanceNum(Long MaxBuyInstanceNum) {
        this.MaxBuyInstanceNum = MaxBuyInstanceNum;
    }

    /**
     * Get Maximum bandwidth in MB/S 
     * @return MaxBandwidth Maximum bandwidth in MB/S
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set Maximum bandwidth in MB/S
     * @param MaxBandwidth Maximum bandwidth in MB/S
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get Pay-as-you-go unit price 
     * @return UnitPrice Pay-as-you-go unit price
     */
    public Price getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set Pay-as-you-go unit price
     * @param UnitPrice Pay-as-you-go unit price
     */
    public void setUnitPrice(Price UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get Pay-as-you-go unit message price 
     * @return MessagePrice Pay-as-you-go unit message price
     */
    public Price getMessagePrice() {
        return this.MessagePrice;
    }

    /**
     * Set Pay-as-you-go unit message price
     * @param MessagePrice Pay-as-you-go unit message price
     */
    public void setMessagePrice(Price MessagePrice) {
        this.MessagePrice = MessagePrice;
    }

    /**
     * Get Cluster information dedicated to a user
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return ClusterInfo Cluster information dedicated to a user
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public ClusterInfo [] getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set Cluster information dedicated to a user
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param ClusterInfo Cluster information dedicated to a user
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setClusterInfo(ClusterInfo [] ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get Purchase of Standard Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Standard Purchase of Standard Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set Purchase of Standard Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Standard Purchase of Standard Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    /**
     * Get Purchase of Standard S2 Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return StandardS2 Purchase of Standard S2 Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getStandardS2() {
        return this.StandardS2;
    }

    /**
     * Set Purchase of Standard S2 Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param StandardS2 Purchase of Standard S2 Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setStandardS2(String StandardS2) {
        this.StandardS2 = StandardS2;
    }

    /**
     * Get Purchase of Pro Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Profession Purchase of Pro Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set Purchase of Pro Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Profession Purchase of Pro Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get Purchase of Physical Dedicated Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Physical Purchase of Physical Dedicated Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getPhysical() {
        return this.Physical;
    }

    /**
     * Set Purchase of Physical Dedicated Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Physical Purchase of Physical Dedicated Edition configurations
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setPhysical(String Physical) {
        this.Physical = Physical;
    }

    public ZoneResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneResponse(ZoneResponse source) {
        if (source.ZoneList != null) {
            this.ZoneList = new ZoneInfo[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new ZoneInfo(source.ZoneList[i]);
            }
        }
        if (source.MaxBuyInstanceNum != null) {
            this.MaxBuyInstanceNum = new Long(source.MaxBuyInstanceNum);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new Price(source.UnitPrice);
        }
        if (source.MessagePrice != null) {
            this.MessagePrice = new Price(source.MessagePrice);
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new ClusterInfo[source.ClusterInfo.length];
            for (int i = 0; i < source.ClusterInfo.length; i++) {
                this.ClusterInfo[i] = new ClusterInfo(source.ClusterInfo[i]);
            }
        }
        if (source.Standard != null) {
            this.Standard = new String(source.Standard);
        }
        if (source.StandardS2 != null) {
            this.StandardS2 = new String(source.StandardS2);
        }
        if (source.Profession != null) {
            this.Profession = new String(source.Profession);
        }
        if (source.Physical != null) {
            this.Physical = new String(source.Physical);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamSimple(map, prefix + "MaxBuyInstanceNum", this.MaxBuyInstanceNum);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamObj(map, prefix + "UnitPrice.", this.UnitPrice);
        this.setParamObj(map, prefix + "MessagePrice.", this.MessagePrice);
        this.setParamArrayObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamSimple(map, prefix + "Standard", this.Standard);
        this.setParamSimple(map, prefix + "StandardS2", this.StandardS2);
        this.setParamSimple(map, prefix + "Profession", this.Profession);
        this.setParamSimple(map, prefix + "Physical", this.Physical);

    }
}

