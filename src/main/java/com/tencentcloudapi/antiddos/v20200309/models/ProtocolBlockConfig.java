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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtocolBlockConfig extends AbstractModel {

    /**
    * TCP blocking. Valid values: `0` (disabled), `1`(enabled).
    */
    @SerializedName("DropTcp")
    @Expose
    private Long DropTcp;

    /**
    * UDP blocking. Valid values: `0` (disabled), `1`(enabled).
    */
    @SerializedName("DropUdp")
    @Expose
    private Long DropUdp;

    /**
    * ICMP blocking. Valid values: `0` (disabled), `1`(enabled).
    */
    @SerializedName("DropIcmp")
    @Expose
    private Long DropIcmp;

    /**
    * Other protocol blocking. Valid values: `0` (disabled), `1`(enabled).
    */
    @SerializedName("DropOther")
    @Expose
    private Long DropOther;

    /**
    * Null connection protection. Valid values: `0` (disabled), `1` (enabled).
    */
    @SerializedName("CheckExceptNullConnect")
    @Expose
    private Long CheckExceptNullConnect;

    /**
    * PoD protection. Values: `0` (disable), `1` (enable).
    */
    @SerializedName("PingOfDeath")
    @Expose
    private Long PingOfDeath;

    /**
    * Teardrop protection. Values: `0` (disable), `1` (enable).
    */
    @SerializedName("TearDrop")
    @Expose
    private Long TearDrop;

    /**
     * Get TCP blocking. Valid values: `0` (disabled), `1`(enabled). 
     * @return DropTcp TCP blocking. Valid values: `0` (disabled), `1`(enabled).
     */
    public Long getDropTcp() {
        return this.DropTcp;
    }

    /**
     * Set TCP blocking. Valid values: `0` (disabled), `1`(enabled).
     * @param DropTcp TCP blocking. Valid values: `0` (disabled), `1`(enabled).
     */
    public void setDropTcp(Long DropTcp) {
        this.DropTcp = DropTcp;
    }

    /**
     * Get UDP blocking. Valid values: `0` (disabled), `1`(enabled). 
     * @return DropUdp UDP blocking. Valid values: `0` (disabled), `1`(enabled).
     */
    public Long getDropUdp() {
        return this.DropUdp;
    }

    /**
     * Set UDP blocking. Valid values: `0` (disabled), `1`(enabled).
     * @param DropUdp UDP blocking. Valid values: `0` (disabled), `1`(enabled).
     */
    public void setDropUdp(Long DropUdp) {
        this.DropUdp = DropUdp;
    }

    /**
     * Get ICMP blocking. Valid values: `0` (disabled), `1`(enabled). 
     * @return DropIcmp ICMP blocking. Valid values: `0` (disabled), `1`(enabled).
     */
    public Long getDropIcmp() {
        return this.DropIcmp;
    }

    /**
     * Set ICMP blocking. Valid values: `0` (disabled), `1`(enabled).
     * @param DropIcmp ICMP blocking. Valid values: `0` (disabled), `1`(enabled).
     */
    public void setDropIcmp(Long DropIcmp) {
        this.DropIcmp = DropIcmp;
    }

    /**
     * Get Other protocol blocking. Valid values: `0` (disabled), `1`(enabled). 
     * @return DropOther Other protocol blocking. Valid values: `0` (disabled), `1`(enabled).
     */
    public Long getDropOther() {
        return this.DropOther;
    }

    /**
     * Set Other protocol blocking. Valid values: `0` (disabled), `1`(enabled).
     * @param DropOther Other protocol blocking. Valid values: `0` (disabled), `1`(enabled).
     */
    public void setDropOther(Long DropOther) {
        this.DropOther = DropOther;
    }

    /**
     * Get Null connection protection. Valid values: `0` (disabled), `1` (enabled). 
     * @return CheckExceptNullConnect Null connection protection. Valid values: `0` (disabled), `1` (enabled).
     */
    public Long getCheckExceptNullConnect() {
        return this.CheckExceptNullConnect;
    }

    /**
     * Set Null connection protection. Valid values: `0` (disabled), `1` (enabled).
     * @param CheckExceptNullConnect Null connection protection. Valid values: `0` (disabled), `1` (enabled).
     */
    public void setCheckExceptNullConnect(Long CheckExceptNullConnect) {
        this.CheckExceptNullConnect = CheckExceptNullConnect;
    }

    /**
     * Get PoD protection. Values: `0` (disable), `1` (enable). 
     * @return PingOfDeath PoD protection. Values: `0` (disable), `1` (enable).
     */
    public Long getPingOfDeath() {
        return this.PingOfDeath;
    }

    /**
     * Set PoD protection. Values: `0` (disable), `1` (enable).
     * @param PingOfDeath PoD protection. Values: `0` (disable), `1` (enable).
     */
    public void setPingOfDeath(Long PingOfDeath) {
        this.PingOfDeath = PingOfDeath;
    }

    /**
     * Get Teardrop protection. Values: `0` (disable), `1` (enable). 
     * @return TearDrop Teardrop protection. Values: `0` (disable), `1` (enable).
     */
    public Long getTearDrop() {
        return this.TearDrop;
    }

    /**
     * Set Teardrop protection. Values: `0` (disable), `1` (enable).
     * @param TearDrop Teardrop protection. Values: `0` (disable), `1` (enable).
     */
    public void setTearDrop(Long TearDrop) {
        this.TearDrop = TearDrop;
    }

    public ProtocolBlockConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtocolBlockConfig(ProtocolBlockConfig source) {
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
        if (source.CheckExceptNullConnect != null) {
            this.CheckExceptNullConnect = new Long(source.CheckExceptNullConnect);
        }
        if (source.PingOfDeath != null) {
            this.PingOfDeath = new Long(source.PingOfDeath);
        }
        if (source.TearDrop != null) {
            this.TearDrop = new Long(source.TearDrop);
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
        this.setParamSimple(map, prefix + "CheckExceptNullConnect", this.CheckExceptNullConnect);
        this.setParamSimple(map, prefix + "PingOfDeath", this.PingOfDeath);
        this.setParamSimple(map, prefix + "TearDrop", this.TearDrop);

    }
}

