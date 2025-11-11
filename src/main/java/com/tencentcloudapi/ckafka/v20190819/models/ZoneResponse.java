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
    * Specifies the user-exclusive cluster info.
    */
    @SerializedName("ClusterInfo")
    @Expose
    private ClusterInfo [] ClusterInfo;

    /**
    * Purchase the standard version configuration.
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
    * Purchase the standard version S2 configuration.
    */
    @SerializedName("StandardS2")
    @Expose
    private String StandardS2;

    /**
    * Specifies the configuration for purchasing the professional edition.
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * Purchase physical dedicated edition configuration.
    */
    @SerializedName("Physical")
    @Expose
    private String Physical;

    /**
    * Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in. abandoned, meaningless.
    */
    @SerializedName("PublicNetwork")
    @Expose
    private String PublicNetwork;

    /**
    * Configures the public network bandwidth.
    */
    @SerializedName("PublicNetworkLimit")
    @Expose
    private String PublicNetworkLimit;

    /**
    * Request ID.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * Pagination Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Mandatory. input tag.
    */
    @SerializedName("ForceCheckTag")
    @Expose
    private Boolean ForceCheckTag;

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
     * Get Specifies the user-exclusive cluster info. 
     * @return ClusterInfo Specifies the user-exclusive cluster info.
     */
    public ClusterInfo [] getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set Specifies the user-exclusive cluster info.
     * @param ClusterInfo Specifies the user-exclusive cluster info.
     */
    public void setClusterInfo(ClusterInfo [] ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get Purchase the standard version configuration. 
     * @return Standard Purchase the standard version configuration.
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set Purchase the standard version configuration.
     * @param Standard Purchase the standard version configuration.
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    /**
     * Get Purchase the standard version S2 configuration. 
     * @return StandardS2 Purchase the standard version S2 configuration.
     */
    public String getStandardS2() {
        return this.StandardS2;
    }

    /**
     * Set Purchase the standard version S2 configuration.
     * @param StandardS2 Purchase the standard version S2 configuration.
     */
    public void setStandardS2(String StandardS2) {
        this.StandardS2 = StandardS2;
    }

    /**
     * Get Specifies the configuration for purchasing the professional edition. 
     * @return Profession Specifies the configuration for purchasing the professional edition.
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set Specifies the configuration for purchasing the professional edition.
     * @param Profession Specifies the configuration for purchasing the professional edition.
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get Purchase physical dedicated edition configuration. 
     * @return Physical Purchase physical dedicated edition configuration.
     */
    public String getPhysical() {
        return this.Physical;
    }

    /**
     * Set Purchase physical dedicated edition configuration.
     * @param Physical Purchase physical dedicated edition configuration.
     */
    public void setPhysical(String Physical) {
        this.Physical = Physical;
    }

    /**
     * Get Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in. abandoned, meaningless. 
     * @return PublicNetwork Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in. abandoned, meaningless.
     */
    public String getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in. abandoned, meaningless.
     * @param PublicNetwork Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in. abandoned, meaningless.
     */
    public void setPublicNetwork(String PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get Configures the public network bandwidth. 
     * @return PublicNetworkLimit Configures the public network bandwidth.
     */
    public String getPublicNetworkLimit() {
        return this.PublicNetworkLimit;
    }

    /**
     * Set Configures the public network bandwidth.
     * @param PublicNetworkLimit Configures the public network bandwidth.
     */
    public void setPublicNetworkLimit(String PublicNetworkLimit) {
        this.PublicNetworkLimit = PublicNetworkLimit;
    }

    /**
     * Get Request ID. 
     * @return RequestId Request ID.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Request ID.
     * @param RequestId Request ID.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get Pagination Offset 
     * @return Offset Pagination Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination Offset
     * @param Offset Pagination Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination Limit 
     * @return Limit Pagination Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination Limit
     * @param Limit Pagination Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Mandatory. input tag. 
     * @return ForceCheckTag Mandatory. input tag.
     */
    public Boolean getForceCheckTag() {
        return this.ForceCheckTag;
    }

    /**
     * Set Mandatory. input tag.
     * @param ForceCheckTag Mandatory. input tag.
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

