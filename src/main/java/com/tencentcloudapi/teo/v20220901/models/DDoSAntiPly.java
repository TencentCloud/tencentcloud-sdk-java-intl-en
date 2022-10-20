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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAntiPly extends AbstractModel{

    /**
    * Whether to enable TCP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
    */
    @SerializedName("DropTcp")
    @Expose
    private String DropTcp;

    /**
    * Whether to enable UDP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
    */
    @SerializedName("DropUdp")
    @Expose
    private String DropUdp;

    /**
    * Whether to enable ICMP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
    */
    @SerializedName("DropIcmp")
    @Expose
    private String DropIcmp;

    /**
    * Whether to enable blocking of other protocols. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
    */
    @SerializedName("DropOther")
    @Expose
    private String DropOther;

    /**
    * Maximum number of new connections to the origin per second. Value range: 0–4294967295.
    */
    @SerializedName("SourceCreateLimit")
    @Expose
    private Long SourceCreateLimit;

    /**
    * Maximum number of concurrent connections to the origin. Value range: 0–4294967295.
    */
    @SerializedName("SourceConnectLimit")
    @Expose
    private Long SourceConnectLimit;

    /**
    * Maximum number of new connections to the destination port per second. Value range: 0–4294967295.
    */
    @SerializedName("DestinationCreateLimit")
    @Expose
    private Long DestinationCreateLimit;

    /**
    * Maximum number of concurrent connections to the destination port. Value range: 0–4294967295.
    */
    @SerializedName("DestinationConnectLimit")
    @Expose
    private Long DestinationConnectLimit;

    /**
    * Maximum number of abnormal connections per second. Value range: 0–4294967295.
    */
    @SerializedName("AbnormalConnectNum")
    @Expose
    private Long AbnormalConnectNum;

    /**
    * Maximum percentage of abnormal SYN packets. Value range: 0–100.
    */
    @SerializedName("AbnormalSynRatio")
    @Expose
    private Long AbnormalSynRatio;

    /**
    * Maximum number of abnormal SYN packets. Value range: 0–65535.
    */
    @SerializedName("AbnormalSynNum")
    @Expose
    private Long AbnormalSynNum;

    /**
    * Maximum number of detected connections timed out per second. Value range: 0–65535.
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * Whether to enable null session protection. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
    */
    @SerializedName("EmptyConnectProtect")
    @Expose
    private String EmptyConnectProtect;

    /**
    * Whether to enable UDP fragmentation. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
    */
    @SerializedName("UdpShard")
    @Expose
    private String UdpShard;

    /**
     * Get Whether to enable TCP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li> 
     * @return DropTcp Whether to enable TCP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public String getDropTcp() {
        return this.DropTcp;
    }

    /**
     * Set Whether to enable TCP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     * @param DropTcp Whether to enable TCP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public void setDropTcp(String DropTcp) {
        this.DropTcp = DropTcp;
    }

    /**
     * Get Whether to enable UDP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li> 
     * @return DropUdp Whether to enable UDP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public String getDropUdp() {
        return this.DropUdp;
    }

    /**
     * Set Whether to enable UDP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     * @param DropUdp Whether to enable UDP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public void setDropUdp(String DropUdp) {
        this.DropUdp = DropUdp;
    }

    /**
     * Get Whether to enable ICMP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li> 
     * @return DropIcmp Whether to enable ICMP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public String getDropIcmp() {
        return this.DropIcmp;
    }

    /**
     * Set Whether to enable ICMP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     * @param DropIcmp Whether to enable ICMP protocol blocking. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public void setDropIcmp(String DropIcmp) {
        this.DropIcmp = DropIcmp;
    }

    /**
     * Get Whether to enable blocking of other protocols. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li> 
     * @return DropOther Whether to enable blocking of other protocols. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public String getDropOther() {
        return this.DropOther;
    }

    /**
     * Set Whether to enable blocking of other protocols. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     * @param DropOther Whether to enable blocking of other protocols. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public void setDropOther(String DropOther) {
        this.DropOther = DropOther;
    }

    /**
     * Get Maximum number of new connections to the origin per second. Value range: 0–4294967295. 
     * @return SourceCreateLimit Maximum number of new connections to the origin per second. Value range: 0–4294967295.
     */
    public Long getSourceCreateLimit() {
        return this.SourceCreateLimit;
    }

    /**
     * Set Maximum number of new connections to the origin per second. Value range: 0–4294967295.
     * @param SourceCreateLimit Maximum number of new connections to the origin per second. Value range: 0–4294967295.
     */
    public void setSourceCreateLimit(Long SourceCreateLimit) {
        this.SourceCreateLimit = SourceCreateLimit;
    }

    /**
     * Get Maximum number of concurrent connections to the origin. Value range: 0–4294967295. 
     * @return SourceConnectLimit Maximum number of concurrent connections to the origin. Value range: 0–4294967295.
     */
    public Long getSourceConnectLimit() {
        return this.SourceConnectLimit;
    }

    /**
     * Set Maximum number of concurrent connections to the origin. Value range: 0–4294967295.
     * @param SourceConnectLimit Maximum number of concurrent connections to the origin. Value range: 0–4294967295.
     */
    public void setSourceConnectLimit(Long SourceConnectLimit) {
        this.SourceConnectLimit = SourceConnectLimit;
    }

    /**
     * Get Maximum number of new connections to the destination port per second. Value range: 0–4294967295. 
     * @return DestinationCreateLimit Maximum number of new connections to the destination port per second. Value range: 0–4294967295.
     */
    public Long getDestinationCreateLimit() {
        return this.DestinationCreateLimit;
    }

    /**
     * Set Maximum number of new connections to the destination port per second. Value range: 0–4294967295.
     * @param DestinationCreateLimit Maximum number of new connections to the destination port per second. Value range: 0–4294967295.
     */
    public void setDestinationCreateLimit(Long DestinationCreateLimit) {
        this.DestinationCreateLimit = DestinationCreateLimit;
    }

    /**
     * Get Maximum number of concurrent connections to the destination port. Value range: 0–4294967295. 
     * @return DestinationConnectLimit Maximum number of concurrent connections to the destination port. Value range: 0–4294967295.
     */
    public Long getDestinationConnectLimit() {
        return this.DestinationConnectLimit;
    }

    /**
     * Set Maximum number of concurrent connections to the destination port. Value range: 0–4294967295.
     * @param DestinationConnectLimit Maximum number of concurrent connections to the destination port. Value range: 0–4294967295.
     */
    public void setDestinationConnectLimit(Long DestinationConnectLimit) {
        this.DestinationConnectLimit = DestinationConnectLimit;
    }

    /**
     * Get Maximum number of abnormal connections per second. Value range: 0–4294967295. 
     * @return AbnormalConnectNum Maximum number of abnormal connections per second. Value range: 0–4294967295.
     */
    public Long getAbnormalConnectNum() {
        return this.AbnormalConnectNum;
    }

    /**
     * Set Maximum number of abnormal connections per second. Value range: 0–4294967295.
     * @param AbnormalConnectNum Maximum number of abnormal connections per second. Value range: 0–4294967295.
     */
    public void setAbnormalConnectNum(Long AbnormalConnectNum) {
        this.AbnormalConnectNum = AbnormalConnectNum;
    }

    /**
     * Get Maximum percentage of abnormal SYN packets. Value range: 0–100. 
     * @return AbnormalSynRatio Maximum percentage of abnormal SYN packets. Value range: 0–100.
     */
    public Long getAbnormalSynRatio() {
        return this.AbnormalSynRatio;
    }

    /**
     * Set Maximum percentage of abnormal SYN packets. Value range: 0–100.
     * @param AbnormalSynRatio Maximum percentage of abnormal SYN packets. Value range: 0–100.
     */
    public void setAbnormalSynRatio(Long AbnormalSynRatio) {
        this.AbnormalSynRatio = AbnormalSynRatio;
    }

    /**
     * Get Maximum number of abnormal SYN packets. Value range: 0–65535. 
     * @return AbnormalSynNum Maximum number of abnormal SYN packets. Value range: 0–65535.
     */
    public Long getAbnormalSynNum() {
        return this.AbnormalSynNum;
    }

    /**
     * Set Maximum number of abnormal SYN packets. Value range: 0–65535.
     * @param AbnormalSynNum Maximum number of abnormal SYN packets. Value range: 0–65535.
     */
    public void setAbnormalSynNum(Long AbnormalSynNum) {
        this.AbnormalSynNum = AbnormalSynNum;
    }

    /**
     * Get Maximum number of detected connections timed out per second. Value range: 0–65535. 
     * @return ConnectTimeout Maximum number of detected connections timed out per second. Value range: 0–65535.
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set Maximum number of detected connections timed out per second. Value range: 0–65535.
     * @param ConnectTimeout Maximum number of detected connections timed out per second. Value range: 0–65535.
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get Whether to enable null session protection. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li> 
     * @return EmptyConnectProtect Whether to enable null session protection. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public String getEmptyConnectProtect() {
        return this.EmptyConnectProtect;
    }

    /**
     * Set Whether to enable null session protection. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     * @param EmptyConnectProtect Whether to enable null session protection. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public void setEmptyConnectProtect(String EmptyConnectProtect) {
        this.EmptyConnectProtect = EmptyConnectProtect;
    }

    /**
     * Get Whether to enable UDP fragmentation. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li> 
     * @return UdpShard Whether to enable UDP fragmentation. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public String getUdpShard() {
        return this.UdpShard;
    }

    /**
     * Set Whether to enable UDP fragmentation. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     * @param UdpShard Whether to enable UDP fragmentation. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public void setUdpShard(String UdpShard) {
        this.UdpShard = UdpShard;
    }

    public DDoSAntiPly() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAntiPly(DDoSAntiPly source) {
        if (source.DropTcp != null) {
            this.DropTcp = new String(source.DropTcp);
        }
        if (source.DropUdp != null) {
            this.DropUdp = new String(source.DropUdp);
        }
        if (source.DropIcmp != null) {
            this.DropIcmp = new String(source.DropIcmp);
        }
        if (source.DropOther != null) {
            this.DropOther = new String(source.DropOther);
        }
        if (source.SourceCreateLimit != null) {
            this.SourceCreateLimit = new Long(source.SourceCreateLimit);
        }
        if (source.SourceConnectLimit != null) {
            this.SourceConnectLimit = new Long(source.SourceConnectLimit);
        }
        if (source.DestinationCreateLimit != null) {
            this.DestinationCreateLimit = new Long(source.DestinationCreateLimit);
        }
        if (source.DestinationConnectLimit != null) {
            this.DestinationConnectLimit = new Long(source.DestinationConnectLimit);
        }
        if (source.AbnormalConnectNum != null) {
            this.AbnormalConnectNum = new Long(source.AbnormalConnectNum);
        }
        if (source.AbnormalSynRatio != null) {
            this.AbnormalSynRatio = new Long(source.AbnormalSynRatio);
        }
        if (source.AbnormalSynNum != null) {
            this.AbnormalSynNum = new Long(source.AbnormalSynNum);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.EmptyConnectProtect != null) {
            this.EmptyConnectProtect = new String(source.EmptyConnectProtect);
        }
        if (source.UdpShard != null) {
            this.UdpShard = new String(source.UdpShard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DropTcp", this.DropTcp);
        this.setParamSimple(map, prefix + "DropUdp", this.DropUdp);
        this.setParamSimple(map, prefix + "DropIcmp", this.DropIcmp);
        this.setParamSimple(map, prefix + "DropOther", this.DropOther);
        this.setParamSimple(map, prefix + "SourceCreateLimit", this.SourceCreateLimit);
        this.setParamSimple(map, prefix + "SourceConnectLimit", this.SourceConnectLimit);
        this.setParamSimple(map, prefix + "DestinationCreateLimit", this.DestinationCreateLimit);
        this.setParamSimple(map, prefix + "DestinationConnectLimit", this.DestinationConnectLimit);
        this.setParamSimple(map, prefix + "AbnormalConnectNum", this.AbnormalConnectNum);
        this.setParamSimple(map, prefix + "AbnormalSynRatio", this.AbnormalSynRatio);
        this.setParamSimple(map, prefix + "AbnormalSynNum", this.AbnormalSynNum);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "EmptyConnectProtect", this.EmptyConnectProtect);
        this.setParamSimple(map, prefix + "UdpShard", this.UdpShard);

    }
}

