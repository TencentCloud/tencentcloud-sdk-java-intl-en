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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAttackSourceRecord extends AbstractModel {

    /**
    * Attack source IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Province (valid for Mainland China)
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * Country/region
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * Total number of attack packets
    */
    @SerializedName("PacketSum")
    @Expose
    private Long PacketSum;

    /**
    * Total attack traffic
    */
    @SerializedName("PacketLen")
    @Expose
    private Long PacketLen;

    /**
     * Get Attack source IP 
     * @return SrcIp Attack source IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Attack source IP
     * @param SrcIp Attack source IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Province (valid for Mainland China) 
     * @return Province Province (valid for Mainland China)
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set Province (valid for Mainland China)
     * @param Province Province (valid for Mainland China)
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get Country/region 
     * @return Nation Country/region
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set Country/region
     * @param Nation Country/region
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get Total number of attack packets 
     * @return PacketSum Total number of attack packets
     */
    public Long getPacketSum() {
        return this.PacketSum;
    }

    /**
     * Set Total number of attack packets
     * @param PacketSum Total number of attack packets
     */
    public void setPacketSum(Long PacketSum) {
        this.PacketSum = PacketSum;
    }

    /**
     * Get Total attack traffic 
     * @return PacketLen Total attack traffic
     */
    public Long getPacketLen() {
        return this.PacketLen;
    }

    /**
     * Set Total attack traffic
     * @param PacketLen Total attack traffic
     */
    public void setPacketLen(Long PacketLen) {
        this.PacketLen = PacketLen;
    }

    public DDoSAttackSourceRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAttackSourceRecord(DDoSAttackSourceRecord source) {
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.PacketSum != null) {
            this.PacketSum = new Long(source.PacketSum);
        }
        if (source.PacketLen != null) {
            this.PacketLen = new Long(source.PacketLen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "PacketSum", this.PacketSum);
        this.setParamSimple(map, prefix + "PacketLen", this.PacketLen);

    }
}

