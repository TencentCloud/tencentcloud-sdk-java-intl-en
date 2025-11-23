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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneResponse extends AbstractModel {

    /**
    * <P>Specifies the zone list.</p>.
    */
    @SerializedName("ZoneList")
    @Expose
    private ZoneInfo [] ZoneList;

    /**
    * <P>Maximum number of instances that can be purchased.</p>.
    */
    @SerializedName("MaxBuyInstanceNum")
    @Expose
    private Long MaxBuyInstanceNum;

    /**
    * <p>Maximum purchase bandwidth in Mb/s.</p>.
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * <P>Unit price for postpayment.</p>.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Price UnitPrice;

    /**
    * <P>Message unit price for postpayment.</p>.
    */
    @SerializedName("MessagePrice")
    @Expose
    private Price MessagePrice;

    /**
    * <P>User-Exclusive cluster information.</p>.
    */
    @SerializedName("ClusterInfo")
    @Expose
    private ClusterInfo [] ClusterInfo;

    /**
    * <P>Specifies the standard version configuration to purchase.</p>.
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
    * <P>Specifies the purchase of standard version s2 configuration.</p>.
    */
    @SerializedName("StandardS2")
    @Expose
    private String StandardS2;

    /**
    * <P>Specifies the configuration for purchasing professional edition.</p>.
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * <P>Purchase physical dedicated edition configuration.</p>.
    */
    @SerializedName("Physical")
    @Expose
    private String Physical;

    /**
    * <p>Specifies the public network bandwidth. valid values: 3Mbps to 999Mbps. only supported in pro edition. abandoned, meaningless.</p>.
    */
    @SerializedName("PublicNetwork")
    @Expose
    private String PublicNetwork;

    /**
    * <P>Public network bandwidth configuration.</p>.
    */
    @SerializedName("PublicNetworkLimit")
    @Expose
    private String PublicNetworkLimit;

    /**
    * <p>Request Id.</p>.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <P>Specifies the pagination offset.</p>.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <P>Specifies the pagination limit.</p>.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <P>Specifies whether the tag is mandatory.</p>.
    */
    @SerializedName("ForceCheckTag")
    @Expose
    private Boolean ForceCheckTag;

    /**
     * Get <P>Specifies the zone list.</p>. 
     * @return ZoneList <P>Specifies the zone list.</p>.
     */
    public ZoneInfo [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set <P>Specifies the zone list.</p>.
     * @param ZoneList <P>Specifies the zone list.</p>.
     */
    public void setZoneList(ZoneInfo [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get <P>Maximum number of instances that can be purchased.</p>. 
     * @return MaxBuyInstanceNum <P>Maximum number of instances that can be purchased.</p>.
     */
    public Long getMaxBuyInstanceNum() {
        return this.MaxBuyInstanceNum;
    }

    /**
     * Set <P>Maximum number of instances that can be purchased.</p>.
     * @param MaxBuyInstanceNum <P>Maximum number of instances that can be purchased.</p>.
     */
    public void setMaxBuyInstanceNum(Long MaxBuyInstanceNum) {
        this.MaxBuyInstanceNum = MaxBuyInstanceNum;
    }

    /**
     * Get <p>Maximum purchase bandwidth in Mb/s.</p>. 
     * @return MaxBandwidth <p>Maximum purchase bandwidth in Mb/s.</p>.
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set <p>Maximum purchase bandwidth in Mb/s.</p>.
     * @param MaxBandwidth <p>Maximum purchase bandwidth in Mb/s.</p>.
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get <P>Unit price for postpayment.</p>. 
     * @return UnitPrice <P>Unit price for postpayment.</p>.
     */
    public Price getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set <P>Unit price for postpayment.</p>.
     * @param UnitPrice <P>Unit price for postpayment.</p>.
     */
    public void setUnitPrice(Price UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get <P>Message unit price for postpayment.</p>. 
     * @return MessagePrice <P>Message unit price for postpayment.</p>.
     */
    public Price getMessagePrice() {
        return this.MessagePrice;
    }

    /**
     * Set <P>Message unit price for postpayment.</p>.
     * @param MessagePrice <P>Message unit price for postpayment.</p>.
     */
    public void setMessagePrice(Price MessagePrice) {
        this.MessagePrice = MessagePrice;
    }

    /**
     * Get <P>User-Exclusive cluster information.</p>. 
     * @return ClusterInfo <P>User-Exclusive cluster information.</p>.
     */
    public ClusterInfo [] getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set <P>User-Exclusive cluster information.</p>.
     * @param ClusterInfo <P>User-Exclusive cluster information.</p>.
     */
    public void setClusterInfo(ClusterInfo [] ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get <P>Specifies the standard version configuration to purchase.</p>. 
     * @return Standard <P>Specifies the standard version configuration to purchase.</p>.
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set <P>Specifies the standard version configuration to purchase.</p>.
     * @param Standard <P>Specifies the standard version configuration to purchase.</p>.
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    /**
     * Get <P>Specifies the purchase of standard version s2 configuration.</p>. 
     * @return StandardS2 <P>Specifies the purchase of standard version s2 configuration.</p>.
     */
    public String getStandardS2() {
        return this.StandardS2;
    }

    /**
     * Set <P>Specifies the purchase of standard version s2 configuration.</p>.
     * @param StandardS2 <P>Specifies the purchase of standard version s2 configuration.</p>.
     */
    public void setStandardS2(String StandardS2) {
        this.StandardS2 = StandardS2;
    }

    /**
     * Get <P>Specifies the configuration for purchasing professional edition.</p>. 
     * @return Profession <P>Specifies the configuration for purchasing professional edition.</p>.
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set <P>Specifies the configuration for purchasing professional edition.</p>.
     * @param Profession <P>Specifies the configuration for purchasing professional edition.</p>.
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get <P>Purchase physical dedicated edition configuration.</p>. 
     * @return Physical <P>Purchase physical dedicated edition configuration.</p>.
     */
    public String getPhysical() {
        return this.Physical;
    }

    /**
     * Set <P>Purchase physical dedicated edition configuration.</p>.
     * @param Physical <P>Purchase physical dedicated edition configuration.</p>.
     */
    public void setPhysical(String Physical) {
        this.Physical = Physical;
    }

    /**
     * Get <p>Specifies the public network bandwidth. valid values: 3Mbps to 999Mbps. only supported in pro edition. abandoned, meaningless.</p>. 
     * @return PublicNetwork <p>Specifies the public network bandwidth. valid values: 3Mbps to 999Mbps. only supported in pro edition. abandoned, meaningless.</p>.
     */
    public String getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <p>Specifies the public network bandwidth. valid values: 3Mbps to 999Mbps. only supported in pro edition. abandoned, meaningless.</p>.
     * @param PublicNetwork <p>Specifies the public network bandwidth. valid values: 3Mbps to 999Mbps. only supported in pro edition. abandoned, meaningless.</p>.
     */
    public void setPublicNetwork(String PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <P>Public network bandwidth configuration.</p>. 
     * @return PublicNetworkLimit <P>Public network bandwidth configuration.</p>.
     */
    public String getPublicNetworkLimit() {
        return this.PublicNetworkLimit;
    }

    /**
     * Set <P>Public network bandwidth configuration.</p>.
     * @param PublicNetworkLimit <P>Public network bandwidth configuration.</p>.
     */
    public void setPublicNetworkLimit(String PublicNetworkLimit) {
        this.PublicNetworkLimit = PublicNetworkLimit;
    }

    /**
     * Get <p>Request Id.</p>. 
     * @return RequestId <p>Request Id.</p>.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>Request Id.</p>.
     * @param RequestId <p>Request Id.</p>.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <P>Specifies the pagination offset.</p>. 
     * @return Offset <P>Specifies the pagination offset.</p>.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <P>Specifies the pagination offset.</p>.
     * @param Offset <P>Specifies the pagination offset.</p>.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <P>Specifies the pagination limit.</p>. 
     * @return Limit <P>Specifies the pagination limit.</p>.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <P>Specifies the pagination limit.</p>.
     * @param Limit <P>Specifies the pagination limit.</p>.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <P>Specifies whether the tag is mandatory.</p>. 
     * @return ForceCheckTag <P>Specifies whether the tag is mandatory.</p>.
     */
    public Boolean getForceCheckTag() {
        return this.ForceCheckTag;
    }

    /**
     * Set <P>Specifies whether the tag is mandatory.</p>.
     * @param ForceCheckTag <P>Specifies whether the tag is mandatory.</p>.
     */
    public void setForceCheckTag(Boolean ForceCheckTag) {
        this.ForceCheckTag = ForceCheckTag;
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
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new String(source.PublicNetwork);
        }
        if (source.PublicNetworkLimit != null) {
            this.PublicNetworkLimit = new String(source.PublicNetworkLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ForceCheckTag != null) {
            this.ForceCheckTag = new Boolean(source.ForceCheckTag);
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
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "PublicNetworkLimit", this.PublicNetworkLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ForceCheckTag", this.ForceCheckTag);

    }
}

