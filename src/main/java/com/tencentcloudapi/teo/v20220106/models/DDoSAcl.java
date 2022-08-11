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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAcl extends AbstractModel{

    /**
    * Destination port used as the end port
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * Destination port used as the start port
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * Source port used as the end port
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * Source port used as the start port
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * Protocol. Values: `tcp`, `udp`, and `all`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Action. Values: `drop` (Drop the request); `transmit` (Allow the request); `forward` (Continue to offer protection).
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Whether it is a system configuration. Values: `0` (manual configuration); `1` (system configuration).
    */
    @SerializedName("Default")
    @Expose
    private Long Default;

    /**
     * Get Destination port used as the end port 
     * @return DportEnd Destination port used as the end port
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set Destination port used as the end port
     * @param DportEnd Destination port used as the end port
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get Destination port used as the start port 
     * @return DportStart Destination port used as the start port
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set Destination port used as the start port
     * @param DportStart Destination port used as the start port
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get Source port used as the end port 
     * @return SportEnd Source port used as the end port
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set Source port used as the end port
     * @param SportEnd Source port used as the end port
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get Source port used as the start port 
     * @return SportStart Source port used as the start port
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set Source port used as the start port
     * @param SportStart Source port used as the start port
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get Protocol. Values: `tcp`, `udp`, and `all`. 
     * @return Protocol Protocol. Values: `tcp`, `udp`, and `all`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Values: `tcp`, `udp`, and `all`.
     * @param Protocol Protocol. Values: `tcp`, `udp`, and `all`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Action. Values: `drop` (Drop the request); `transmit` (Allow the request); `forward` (Continue to offer protection). 
     * @return Action Action. Values: `drop` (Drop the request); `transmit` (Allow the request); `forward` (Continue to offer protection).
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Values: `drop` (Drop the request); `transmit` (Allow the request); `forward` (Continue to offer protection).
     * @param Action Action. Values: `drop` (Drop the request); `transmit` (Allow the request); `forward` (Continue to offer protection).
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Whether it is a system configuration. Values: `0` (manual configuration); `1` (system configuration). 
     * @return Default Whether it is a system configuration. Values: `0` (manual configuration); `1` (system configuration).
     */
    public Long getDefault() {
        return this.Default;
    }

    /**
     * Set Whether it is a system configuration. Values: `0` (manual configuration); `1` (system configuration).
     * @param Default Whether it is a system configuration. Values: `0` (manual configuration); `1` (system configuration).
     */
    public void setDefault(Long Default) {
        this.Default = Default;
    }

    public DDoSAcl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAcl(DDoSAcl source) {
        if (source.DportEnd != null) {
            this.DportEnd = new Long(source.DportEnd);
        }
        if (source.DportStart != null) {
            this.DportStart = new Long(source.DportStart);
        }
        if (source.SportEnd != null) {
            this.SportEnd = new Long(source.SportEnd);
        }
        if (source.SportStart != null) {
            this.SportStart = new Long(source.SportStart);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Default != null) {
            this.Default = new Long(source.Default);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Default", this.Default);

    }
}

