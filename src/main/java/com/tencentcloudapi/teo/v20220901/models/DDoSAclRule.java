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

public class DDoSAclRule extends AbstractModel{

    /**
    * End of the destination port. Value range: 0–65535.
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * Start of the destination port. Value range: 0–65535.
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * End of the source port. Value range: 0–65535.
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * Start of the source port. Value range: 0–65535.
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`all`: All protocols</li>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Action to be executed. Values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`forward`: Continue protection</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get End of the destination port. Value range: 0–65535. 
     * @return DportEnd End of the destination port. Value range: 0–65535.
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set End of the destination port. Value range: 0–65535.
     * @param DportEnd End of the destination port. Value range: 0–65535.
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get Start of the destination port. Value range: 0–65535. 
     * @return DportStart Start of the destination port. Value range: 0–65535.
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set Start of the destination port. Value range: 0–65535.
     * @param DportStart Start of the destination port. Value range: 0–65535.
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get End of the source port. Value range: 0–65535. 
     * @return SportEnd End of the source port. Value range: 0–65535.
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set End of the source port. Value range: 0–65535.
     * @param SportEnd End of the source port. Value range: 0–65535.
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get Start of the source port. Value range: 0–65535. 
     * @return SportStart Start of the source port. Value range: 0–65535.
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set Start of the source port. Value range: 0–65535.
     * @param SportStart Start of the source port. Value range: 0–65535.
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`all`: All protocols</li> 
     * @return Protocol The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`all`: All protocols</li>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`all`: All protocols</li>
     * @param Protocol The protocol. Values:
<li>`tcp`: TCP protocol</li>
<li>`udp`: UDP protocol</li>
<li>`all`: All protocols</li>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Action to be executed. Values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`forward`: Continue protection</li> 
     * @return Action Action to be executed. Values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`forward`: Continue protection</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to be executed. Values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`forward`: Continue protection</li>
     * @param Action Action to be executed. Values:
<li>`drop`: Discard</li>
<li>`transmit`: Allow</li>
<li>`forward`: Continue protection</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public DDoSAclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAclRule(DDoSAclRule source) {
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

    }
}

