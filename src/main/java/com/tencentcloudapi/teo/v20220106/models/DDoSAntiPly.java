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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAntiPly extends AbstractModel {

    /**
    * Enables TCP protocol blocking. `on` (enable); `off` (disable).
    */
    @SerializedName("DropTcp")
    @Expose
    private String DropTcp;

    /**
    * Enables UDP protocol blocking. `on` (enable); `off` (disable).
    */
    @SerializedName("DropUdp")
    @Expose
    private String DropUdp;

    /**
    * Enables ICMP protocol blocking. `on` (enable); `off` (disable).
    */
    @SerializedName("DropIcmp")
    @Expose
    private String DropIcmp;

    /**
    * Enables blocking for other protocols. `on` (enable); `off` (disable).
    */
    @SerializedName("DropOther")
    @Expose
    private String DropOther;

    /**
    * Number of new connections the source port can establish. Value range: 0-4294967295.
    */
    @SerializedName("SourceCreateLimit")
    @Expose
    private Long SourceCreateLimit;

    /**
    * Number of concurrent connections the source port can establish. Value range: 0-4294967295.
    */
    @SerializedName("SourceConnectLimit")
    @Expose
    private Long SourceConnectLimit;

    /**
    * Number of new connections the destination port can establish. Value range: 0-4294967295.
    */
    @SerializedName("DestinationCreateLimit")
    @Expose
    private Long DestinationCreateLimit;

    /**
    * Number of concurrent connections the destination port can establish. Value range: 0-4294967295.
    */
    @SerializedName("DestinationConnectLimit")
    @Expose
    private Long DestinationConnectLimit;

    /**
    * Number of abnormal connections allowed. Value range: 0-4294967295.
    */
    @SerializedName("AbnormalConnectNum")
    @Expose
    private Long AbnormalConnectNum;

    /**
    * Specifies the ratio of SYN exceptions to trigger alerts. Value range: 0-100
    */
    @SerializedName("AbnormalSynRatio")
    @Expose
    private Long AbnormalSynRatio;

    /**
    * Specifies a max number of SYN packets that triggers alarms. Value range: 0-65535
    */
    @SerializedName("AbnormalSynNum")
    @Expose
    private Long AbnormalSynNum;

    /**
    * Connection timeout period. Value range: 0-65535.
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * Whether to enable null session protection. `0`: Disable; `1`: Enable.
    */
    @SerializedName("EmptyConnectProtect")
    @Expose
    private String EmptyConnectProtect;

    /**
    * Whether to enable UDP fragmentation. `off`: Disable; `on`: Enable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UdpShard")
    @Expose
    private String UdpShard;

    /**
     * Get Enables TCP protocol blocking. `on` (enable); `off` (disable). 
     * @return DropTcp Enables TCP protocol blocking. `on` (enable); `off` (disable).
     */
    public String getDropTcp() {
        return this.DropTcp;
    }

    /**
     * Set Enables TCP protocol blocking. `on` (enable); `off` (disable).
     * @param DropTcp Enables TCP protocol blocking. `on` (enable); `off` (disable).
     */
    public void setDropTcp(String DropTcp) {
        this.DropTcp = DropTcp;
    }

    /**
     * Get Enables UDP protocol blocking. `on` (enable); `off` (disable). 
     * @return DropUdp Enables UDP protocol blocking. `on` (enable); `off` (disable).
     */
    public String getDropUdp() {
        return this.DropUdp;
    }

    /**
     * Set Enables UDP protocol blocking. `on` (enable); `off` (disable).
     * @param DropUdp Enables UDP protocol blocking. `on` (enable); `off` (disable).
     */
    public void setDropUdp(String DropUdp) {
        this.DropUdp = DropUdp;
    }

    /**
     * Get Enables ICMP protocol blocking. `on` (enable); `off` (disable). 
     * @return DropIcmp Enables ICMP protocol blocking. `on` (enable); `off` (disable).
     */
    public String getDropIcmp() {
        return this.DropIcmp;
    }

    /**
     * Set Enables ICMP protocol blocking. `on` (enable); `off` (disable).
     * @param DropIcmp Enables ICMP protocol blocking. `on` (enable); `off` (disable).
     */
    public void setDropIcmp(String DropIcmp) {
        this.DropIcmp = DropIcmp;
    }

    /**
     * Get Enables blocking for other protocols. `on` (enable); `off` (disable). 
     * @return DropOther Enables blocking for other protocols. `on` (enable); `off` (disable).
     */
    public String getDropOther() {
        return this.DropOther;
    }

    /**
     * Set Enables blocking for other protocols. `on` (enable); `off` (disable).
     * @param DropOther Enables blocking for other protocols. `on` (enable); `off` (disable).
     */
    public void setDropOther(String DropOther) {
        this.DropOther = DropOther;
    }

    /**
     * Get Number of new connections the source port can establish. Value range: 0-4294967295. 
     * @return SourceCreateLimit Number of new connections the source port can establish. Value range: 0-4294967295.
     */
    public Long getSourceCreateLimit() {
        return this.SourceCreateLimit;
    }

    /**
     * Set Number of new connections the source port can establish. Value range: 0-4294967295.
     * @param SourceCreateLimit Number of new connections the source port can establish. Value range: 0-4294967295.
     */
    public void setSourceCreateLimit(Long SourceCreateLimit) {
        this.SourceCreateLimit = SourceCreateLimit;
    }

    /**
     * Get Number of concurrent connections the source port can establish. Value range: 0-4294967295. 
     * @return SourceConnectLimit Number of concurrent connections the source port can establish. Value range: 0-4294967295.
     */
    public Long getSourceConnectLimit() {
        return this.SourceConnectLimit;
    }

    /**
     * Set Number of concurrent connections the source port can establish. Value range: 0-4294967295.
     * @param SourceConnectLimit Number of concurrent connections the source port can establish. Value range: 0-4294967295.
     */
    public void setSourceConnectLimit(Long SourceConnectLimit) {
        this.SourceConnectLimit = SourceConnectLimit;
    }

    /**
     * Get Number of new connections the destination port can establish. Value range: 0-4294967295. 
     * @return DestinationCreateLimit Number of new connections the destination port can establish. Value range: 0-4294967295.
     */
    public Long getDestinationCreateLimit() {
        return this.DestinationCreateLimit;
    }

    /**
     * Set Number of new connections the destination port can establish. Value range: 0-4294967295.
     * @param DestinationCreateLimit Number of new connections the destination port can establish. Value range: 0-4294967295.
     */
    public void setDestinationCreateLimit(Long DestinationCreateLimit) {
        this.DestinationCreateLimit = DestinationCreateLimit;
    }

    /**
     * Get Number of concurrent connections the destination port can establish. Value range: 0-4294967295. 
     * @return DestinationConnectLimit Number of concurrent connections the destination port can establish. Value range: 0-4294967295.
     */
    public Long getDestinationConnectLimit() {
        return this.DestinationConnectLimit;
    }

    /**
     * Set Number of concurrent connections the destination port can establish. Value range: 0-4294967295.
     * @param DestinationConnectLimit Number of concurrent connections the destination port can establish. Value range: 0-4294967295.
     */
    public void setDestinationConnectLimit(Long DestinationConnectLimit) {
        this.DestinationConnectLimit = DestinationConnectLimit;
    }

    /**
     * Get Number of abnormal connections allowed. Value range: 0-4294967295. 
     * @return AbnormalConnectNum Number of abnormal connections allowed. Value range: 0-4294967295.
     */
    public Long getAbnormalConnectNum() {
        return this.AbnormalConnectNum;
    }

    /**
     * Set Number of abnormal connections allowed. Value range: 0-4294967295.
     * @param AbnormalConnectNum Number of abnormal connections allowed. Value range: 0-4294967295.
     */
    public void setAbnormalConnectNum(Long AbnormalConnectNum) {
        this.AbnormalConnectNum = AbnormalConnectNum;
    }

    /**
     * Get Specifies the ratio of SYN exceptions to trigger alerts. Value range: 0-100 
     * @return AbnormalSynRatio Specifies the ratio of SYN exceptions to trigger alerts. Value range: 0-100
     */
    public Long getAbnormalSynRatio() {
        return this.AbnormalSynRatio;
    }

    /**
     * Set Specifies the ratio of SYN exceptions to trigger alerts. Value range: 0-100
     * @param AbnormalSynRatio Specifies the ratio of SYN exceptions to trigger alerts. Value range: 0-100
     */
    public void setAbnormalSynRatio(Long AbnormalSynRatio) {
        this.AbnormalSynRatio = AbnormalSynRatio;
    }

    /**
     * Get Specifies a max number of SYN packets that triggers alarms. Value range: 0-65535 
     * @return AbnormalSynNum Specifies a max number of SYN packets that triggers alarms. Value range: 0-65535
     */
    public Long getAbnormalSynNum() {
        return this.AbnormalSynNum;
    }

    /**
     * Set Specifies a max number of SYN packets that triggers alarms. Value range: 0-65535
     * @param AbnormalSynNum Specifies a max number of SYN packets that triggers alarms. Value range: 0-65535
     */
    public void setAbnormalSynNum(Long AbnormalSynNum) {
        this.AbnormalSynNum = AbnormalSynNum;
    }

    /**
     * Get Connection timeout period. Value range: 0-65535. 
     * @return ConnectTimeout Connection timeout period. Value range: 0-65535.
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set Connection timeout period. Value range: 0-65535.
     * @param ConnectTimeout Connection timeout period. Value range: 0-65535.
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get Whether to enable null session protection. `0`: Disable; `1`: Enable. 
     * @return EmptyConnectProtect Whether to enable null session protection. `0`: Disable; `1`: Enable.
     */
    public String getEmptyConnectProtect() {
        return this.EmptyConnectProtect;
    }

    /**
     * Set Whether to enable null session protection. `0`: Disable; `1`: Enable.
     * @param EmptyConnectProtect Whether to enable null session protection. `0`: Disable; `1`: Enable.
     */
    public void setEmptyConnectProtect(String EmptyConnectProtect) {
        this.EmptyConnectProtect = EmptyConnectProtect;
    }

    /**
     * Get Whether to enable UDP fragmentation. `off`: Disable; `on`: Enable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UdpShard Whether to enable UDP fragmentation. `off`: Disable; `on`: Enable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUdpShard() {
        return this.UdpShard;
    }

    /**
     * Set Whether to enable UDP fragmentation. `off`: Disable; `on`: Enable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UdpShard Whether to enable UDP fragmentation. `off`: Disable; `on`: Enable.
Note: This field may return null, indicating that no valid values can be obtained.
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

