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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSPolicyDropOption extends AbstractModel{

    /**
    * Blocks all TCP traffic. Valid values: [0,1]
    */
    @SerializedName("DropTcp")
    @Expose
    private Long DropTcp;

    /**
    * Blocks all UDP traffic. Valid values: [0,1]
    */
    @SerializedName("DropUdp")
    @Expose
    private Long DropUdp;

    /**
    * Blocks all ICMP traffic. Valid values: [0,1]
    */
    @SerializedName("DropIcmp")
    @Expose
    private Long DropIcmp;

    /**
    * Blocks traffic of other protocols. Valid values: [0,1]
    */
    @SerializedName("DropOther")
    @Expose
    private Long DropOther;

    /**
    * Rejects traffic from outside Mainland China. Valid values: [0,1]
    */
    @SerializedName("DropAbroad")
    @Expose
    private Long DropAbroad;

    /**
    * Null session protection. Valid values: [0,1]
    */
    @SerializedName("CheckSyncConn")
    @Expose
    private Long CheckSyncConn;

    /**
    * New connection suppression based on source IP and destination IP. Value range: [0,4294967295]
    */
    @SerializedName("SdNewLimit")
    @Expose
    private Long SdNewLimit;

    /**
    * New connection suppression based on destination IP. Value range: [0,4294967295]
    */
    @SerializedName("DstNewLimit")
    @Expose
    private Long DstNewLimit;

    /**
    * Concurrent connection suppression based on source IP and destination IP. Value range: [0,4294967295]
    */
    @SerializedName("SdConnLimit")
    @Expose
    private Long SdConnLimit;

    /**
    * Concurrent connection suppression based on destination IP. Value range: [0,4294967295]
    */
    @SerializedName("DstConnLimit")
    @Expose
    private Long DstConnLimit;

    /**
    * Threshold for triggering connection suppression. Value range: [0,4294967295]
    */
    @SerializedName("BadConnThreshold")
    @Expose
    private Long BadConnThreshold;

    /**
    * Exceptional connection detection condition: null session protection status. Valid values: [0,1]
    */
    @SerializedName("NullConnEnable")
    @Expose
    private Long NullConnEnable;

    /**
    * Exceptional connection detection condition: connection timeout. Valid values: [0,65535]
    */
    @SerializedName("ConnTimeout")
    @Expose
    private Long ConnTimeout;

    /**
    * Exceptional connection detection condition: percentage of SYN out of ACK. Valid values: [0,100]
    */
    @SerializedName("SynRate")
    @Expose
    private Long SynRate;

    /**
    * Exceptional connection detection condition: SYN threshold. Valid values: [0,100]
    */
    @SerializedName("SynLimit")
    @Expose
    private Long SynLimit;

    /**
    * TCP speed limit. Value range: [0,4294967295]
    */
    @SerializedName("DTcpMbpsLimit")
    @Expose
    private Long DTcpMbpsLimit;

    /**
    * UDP speed limit. Value range: [0,4294967295]
    */
    @SerializedName("DUdpMbpsLimit")
    @Expose
    private Long DUdpMbpsLimit;

    /**
    * ICMP speed limit. Value range: [0,4294967295]
    */
    @SerializedName("DIcmpMbpsLimit")
    @Expose
    private Long DIcmpMbpsLimit;

    /**
    * Other protocol speed limit. Value range: [0,4294967295]
    */
    @SerializedName("DOtherMbpsLimit")
    @Expose
    private Long DOtherMbpsLimit;

    /**
     * Get Blocks all TCP traffic. Valid values: [0,1] 
     * @return DropTcp Blocks all TCP traffic. Valid values: [0,1]
     */
    public Long getDropTcp() {
        return this.DropTcp;
    }

    /**
     * Set Blocks all TCP traffic. Valid values: [0,1]
     * @param DropTcp Blocks all TCP traffic. Valid values: [0,1]
     */
    public void setDropTcp(Long DropTcp) {
        this.DropTcp = DropTcp;
    }

    /**
     * Get Blocks all UDP traffic. Valid values: [0,1] 
     * @return DropUdp Blocks all UDP traffic. Valid values: [0,1]
     */
    public Long getDropUdp() {
        return this.DropUdp;
    }

    /**
     * Set Blocks all UDP traffic. Valid values: [0,1]
     * @param DropUdp Blocks all UDP traffic. Valid values: [0,1]
     */
    public void setDropUdp(Long DropUdp) {
        this.DropUdp = DropUdp;
    }

    /**
     * Get Blocks all ICMP traffic. Valid values: [0,1] 
     * @return DropIcmp Blocks all ICMP traffic. Valid values: [0,1]
     */
    public Long getDropIcmp() {
        return this.DropIcmp;
    }

    /**
     * Set Blocks all ICMP traffic. Valid values: [0,1]
     * @param DropIcmp Blocks all ICMP traffic. Valid values: [0,1]
     */
    public void setDropIcmp(Long DropIcmp) {
        this.DropIcmp = DropIcmp;
    }

    /**
     * Get Blocks traffic of other protocols. Valid values: [0,1] 
     * @return DropOther Blocks traffic of other protocols. Valid values: [0,1]
     */
    public Long getDropOther() {
        return this.DropOther;
    }

    /**
     * Set Blocks traffic of other protocols. Valid values: [0,1]
     * @param DropOther Blocks traffic of other protocols. Valid values: [0,1]
     */
    public void setDropOther(Long DropOther) {
        this.DropOther = DropOther;
    }

    /**
     * Get Rejects traffic from outside Mainland China. Valid values: [0,1] 
     * @return DropAbroad Rejects traffic from outside Mainland China. Valid values: [0,1]
     */
    public Long getDropAbroad() {
        return this.DropAbroad;
    }

    /**
     * Set Rejects traffic from outside Mainland China. Valid values: [0,1]
     * @param DropAbroad Rejects traffic from outside Mainland China. Valid values: [0,1]
     */
    public void setDropAbroad(Long DropAbroad) {
        this.DropAbroad = DropAbroad;
    }

    /**
     * Get Null session protection. Valid values: [0,1] 
     * @return CheckSyncConn Null session protection. Valid values: [0,1]
     */
    public Long getCheckSyncConn() {
        return this.CheckSyncConn;
    }

    /**
     * Set Null session protection. Valid values: [0,1]
     * @param CheckSyncConn Null session protection. Valid values: [0,1]
     */
    public void setCheckSyncConn(Long CheckSyncConn) {
        this.CheckSyncConn = CheckSyncConn;
    }

    /**
     * Get New connection suppression based on source IP and destination IP. Value range: [0,4294967295] 
     * @return SdNewLimit New connection suppression based on source IP and destination IP. Value range: [0,4294967295]
     */
    public Long getSdNewLimit() {
        return this.SdNewLimit;
    }

    /**
     * Set New connection suppression based on source IP and destination IP. Value range: [0,4294967295]
     * @param SdNewLimit New connection suppression based on source IP and destination IP. Value range: [0,4294967295]
     */
    public void setSdNewLimit(Long SdNewLimit) {
        this.SdNewLimit = SdNewLimit;
    }

    /**
     * Get New connection suppression based on destination IP. Value range: [0,4294967295] 
     * @return DstNewLimit New connection suppression based on destination IP. Value range: [0,4294967295]
     */
    public Long getDstNewLimit() {
        return this.DstNewLimit;
    }

    /**
     * Set New connection suppression based on destination IP. Value range: [0,4294967295]
     * @param DstNewLimit New connection suppression based on destination IP. Value range: [0,4294967295]
     */
    public void setDstNewLimit(Long DstNewLimit) {
        this.DstNewLimit = DstNewLimit;
    }

    /**
     * Get Concurrent connection suppression based on source IP and destination IP. Value range: [0,4294967295] 
     * @return SdConnLimit Concurrent connection suppression based on source IP and destination IP. Value range: [0,4294967295]
     */
    public Long getSdConnLimit() {
        return this.SdConnLimit;
    }

    /**
     * Set Concurrent connection suppression based on source IP and destination IP. Value range: [0,4294967295]
     * @param SdConnLimit Concurrent connection suppression based on source IP and destination IP. Value range: [0,4294967295]
     */
    public void setSdConnLimit(Long SdConnLimit) {
        this.SdConnLimit = SdConnLimit;
    }

    /**
     * Get Concurrent connection suppression based on destination IP. Value range: [0,4294967295] 
     * @return DstConnLimit Concurrent connection suppression based on destination IP. Value range: [0,4294967295]
     */
    public Long getDstConnLimit() {
        return this.DstConnLimit;
    }

    /**
     * Set Concurrent connection suppression based on destination IP. Value range: [0,4294967295]
     * @param DstConnLimit Concurrent connection suppression based on destination IP. Value range: [0,4294967295]
     */
    public void setDstConnLimit(Long DstConnLimit) {
        this.DstConnLimit = DstConnLimit;
    }

    /**
     * Get Threshold for triggering connection suppression. Value range: [0,4294967295] 
     * @return BadConnThreshold Threshold for triggering connection suppression. Value range: [0,4294967295]
     */
    public Long getBadConnThreshold() {
        return this.BadConnThreshold;
    }

    /**
     * Set Threshold for triggering connection suppression. Value range: [0,4294967295]
     * @param BadConnThreshold Threshold for triggering connection suppression. Value range: [0,4294967295]
     */
    public void setBadConnThreshold(Long BadConnThreshold) {
        this.BadConnThreshold = BadConnThreshold;
    }

    /**
     * Get Exceptional connection detection condition: null session protection status. Valid values: [0,1] 
     * @return NullConnEnable Exceptional connection detection condition: null session protection status. Valid values: [0,1]
     */
    public Long getNullConnEnable() {
        return this.NullConnEnable;
    }

    /**
     * Set Exceptional connection detection condition: null session protection status. Valid values: [0,1]
     * @param NullConnEnable Exceptional connection detection condition: null session protection status. Valid values: [0,1]
     */
    public void setNullConnEnable(Long NullConnEnable) {
        this.NullConnEnable = NullConnEnable;
    }

    /**
     * Get Exceptional connection detection condition: connection timeout. Valid values: [0,65535] 
     * @return ConnTimeout Exceptional connection detection condition: connection timeout. Valid values: [0,65535]
     */
    public Long getConnTimeout() {
        return this.ConnTimeout;
    }

    /**
     * Set Exceptional connection detection condition: connection timeout. Valid values: [0,65535]
     * @param ConnTimeout Exceptional connection detection condition: connection timeout. Valid values: [0,65535]
     */
    public void setConnTimeout(Long ConnTimeout) {
        this.ConnTimeout = ConnTimeout;
    }

    /**
     * Get Exceptional connection detection condition: percentage of SYN out of ACK. Valid values: [0,100] 
     * @return SynRate Exceptional connection detection condition: percentage of SYN out of ACK. Valid values: [0,100]
     */
    public Long getSynRate() {
        return this.SynRate;
    }

    /**
     * Set Exceptional connection detection condition: percentage of SYN out of ACK. Valid values: [0,100]
     * @param SynRate Exceptional connection detection condition: percentage of SYN out of ACK. Valid values: [0,100]
     */
    public void setSynRate(Long SynRate) {
        this.SynRate = SynRate;
    }

    /**
     * Get Exceptional connection detection condition: SYN threshold. Valid values: [0,100] 
     * @return SynLimit Exceptional connection detection condition: SYN threshold. Valid values: [0,100]
     */
    public Long getSynLimit() {
        return this.SynLimit;
    }

    /**
     * Set Exceptional connection detection condition: SYN threshold. Valid values: [0,100]
     * @param SynLimit Exceptional connection detection condition: SYN threshold. Valid values: [0,100]
     */
    public void setSynLimit(Long SynLimit) {
        this.SynLimit = SynLimit;
    }

    /**
     * Get TCP speed limit. Value range: [0,4294967295] 
     * @return DTcpMbpsLimit TCP speed limit. Value range: [0,4294967295]
     */
    public Long getDTcpMbpsLimit() {
        return this.DTcpMbpsLimit;
    }

    /**
     * Set TCP speed limit. Value range: [0,4294967295]
     * @param DTcpMbpsLimit TCP speed limit. Value range: [0,4294967295]
     */
    public void setDTcpMbpsLimit(Long DTcpMbpsLimit) {
        this.DTcpMbpsLimit = DTcpMbpsLimit;
    }

    /**
     * Get UDP speed limit. Value range: [0,4294967295] 
     * @return DUdpMbpsLimit UDP speed limit. Value range: [0,4294967295]
     */
    public Long getDUdpMbpsLimit() {
        return this.DUdpMbpsLimit;
    }

    /**
     * Set UDP speed limit. Value range: [0,4294967295]
     * @param DUdpMbpsLimit UDP speed limit. Value range: [0,4294967295]
     */
    public void setDUdpMbpsLimit(Long DUdpMbpsLimit) {
        this.DUdpMbpsLimit = DUdpMbpsLimit;
    }

    /**
     * Get ICMP speed limit. Value range: [0,4294967295] 
     * @return DIcmpMbpsLimit ICMP speed limit. Value range: [0,4294967295]
     */
    public Long getDIcmpMbpsLimit() {
        return this.DIcmpMbpsLimit;
    }

    /**
     * Set ICMP speed limit. Value range: [0,4294967295]
     * @param DIcmpMbpsLimit ICMP speed limit. Value range: [0,4294967295]
     */
    public void setDIcmpMbpsLimit(Long DIcmpMbpsLimit) {
        this.DIcmpMbpsLimit = DIcmpMbpsLimit;
    }

    /**
     * Get Other protocol speed limit. Value range: [0,4294967295] 
     * @return DOtherMbpsLimit Other protocol speed limit. Value range: [0,4294967295]
     */
    public Long getDOtherMbpsLimit() {
        return this.DOtherMbpsLimit;
    }

    /**
     * Set Other protocol speed limit. Value range: [0,4294967295]
     * @param DOtherMbpsLimit Other protocol speed limit. Value range: [0,4294967295]
     */
    public void setDOtherMbpsLimit(Long DOtherMbpsLimit) {
        this.DOtherMbpsLimit = DOtherMbpsLimit;
    }

    public DDoSPolicyDropOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSPolicyDropOption(DDoSPolicyDropOption source) {
        if (source.DropTcp != null) {
            this.DropTcp = new Long(source.DropTcp);
        }
        if (source.DropUdp != null) {
            this.DropUdp = new Long(source.DropUdp);
        }
        if (source.DropIcmp != null) {
            this.DropIcmp = new Long(source.DropIcmp);
        }
        if (source.DropOther != null) {
            this.DropOther = new Long(source.DropOther);
        }
        if (source.DropAbroad != null) {
            this.DropAbroad = new Long(source.DropAbroad);
        }
        if (source.CheckSyncConn != null) {
            this.CheckSyncConn = new Long(source.CheckSyncConn);
        }
        if (source.SdNewLimit != null) {
            this.SdNewLimit = new Long(source.SdNewLimit);
        }
        if (source.DstNewLimit != null) {
            this.DstNewLimit = new Long(source.DstNewLimit);
        }
        if (source.SdConnLimit != null) {
            this.SdConnLimit = new Long(source.SdConnLimit);
        }
        if (source.DstConnLimit != null) {
            this.DstConnLimit = new Long(source.DstConnLimit);
        }
        if (source.BadConnThreshold != null) {
            this.BadConnThreshold = new Long(source.BadConnThreshold);
        }
        if (source.NullConnEnable != null) {
            this.NullConnEnable = new Long(source.NullConnEnable);
        }
        if (source.ConnTimeout != null) {
            this.ConnTimeout = new Long(source.ConnTimeout);
        }
        if (source.SynRate != null) {
            this.SynRate = new Long(source.SynRate);
        }
        if (source.SynLimit != null) {
            this.SynLimit = new Long(source.SynLimit);
        }
        if (source.DTcpMbpsLimit != null) {
            this.DTcpMbpsLimit = new Long(source.DTcpMbpsLimit);
        }
        if (source.DUdpMbpsLimit != null) {
            this.DUdpMbpsLimit = new Long(source.DUdpMbpsLimit);
        }
        if (source.DIcmpMbpsLimit != null) {
            this.DIcmpMbpsLimit = new Long(source.DIcmpMbpsLimit);
        }
        if (source.DOtherMbpsLimit != null) {
            this.DOtherMbpsLimit = new Long(source.DOtherMbpsLimit);
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
        this.setParamSimple(map, prefix + "DropAbroad", this.DropAbroad);
        this.setParamSimple(map, prefix + "CheckSyncConn", this.CheckSyncConn);
        this.setParamSimple(map, prefix + "SdNewLimit", this.SdNewLimit);
        this.setParamSimple(map, prefix + "DstNewLimit", this.DstNewLimit);
        this.setParamSimple(map, prefix + "SdConnLimit", this.SdConnLimit);
        this.setParamSimple(map, prefix + "DstConnLimit", this.DstConnLimit);
        this.setParamSimple(map, prefix + "BadConnThreshold", this.BadConnThreshold);
        this.setParamSimple(map, prefix + "NullConnEnable", this.NullConnEnable);
        this.setParamSimple(map, prefix + "ConnTimeout", this.ConnTimeout);
        this.setParamSimple(map, prefix + "SynRate", this.SynRate);
        this.setParamSimple(map, prefix + "SynLimit", this.SynLimit);
        this.setParamSimple(map, prefix + "DTcpMbpsLimit", this.DTcpMbpsLimit);
        this.setParamSimple(map, prefix + "DUdpMbpsLimit", this.DUdpMbpsLimit);
        this.setParamSimple(map, prefix + "DIcmpMbpsLimit", this.DIcmpMbpsLimit);
        this.setParamSimple(map, prefix + "DOtherMbpsLimit", this.DOtherMbpsLimit);

    }
}

