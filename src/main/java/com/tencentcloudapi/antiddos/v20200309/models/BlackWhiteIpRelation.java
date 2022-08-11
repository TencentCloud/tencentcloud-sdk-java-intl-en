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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlackWhiteIpRelation extends AbstractModel{

    /**
    * IP address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Anti-DDoS instance configured
    */
    @SerializedName("InstanceDetailList")
    @Expose
    private InstanceRelation [] InstanceDetailList;

    /**
    * IP mask. `0` indicates a 32-bit IP.
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get IP address 
     * @return Ip IP address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address
     * @param Ip IP address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP). 
     * @return Type IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
     * @param Type IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Anti-DDoS instance configured 
     * @return InstanceDetailList Anti-DDoS instance configured
     */
    public InstanceRelation [] getInstanceDetailList() {
        return this.InstanceDetailList;
    }

    /**
     * Set Anti-DDoS instance configured
     * @param InstanceDetailList Anti-DDoS instance configured
     */
    public void setInstanceDetailList(InstanceRelation [] InstanceDetailList) {
        this.InstanceDetailList = InstanceDetailList;
    }

    /**
     * Get IP mask. `0` indicates a 32-bit IP. 
     * @return Mask IP mask. `0` indicates a 32-bit IP.
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set IP mask. `0` indicates a 32-bit IP.
     * @param Mask IP mask. `0` indicates a 32-bit IP.
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public BlackWhiteIpRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlackWhiteIpRelation(BlackWhiteIpRelation source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceDetailList != null) {
            this.InstanceDetailList = new InstanceRelation[source.InstanceDetailList.length];
            for (int i = 0; i < source.InstanceDetailList.length; i++) {
                this.InstanceDetailList[i] = new InstanceRelation(source.InstanceDetailList[i]);
            }
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "InstanceDetailList.", this.InstanceDetailList);
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

