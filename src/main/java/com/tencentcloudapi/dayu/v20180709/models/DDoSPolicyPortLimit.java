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

public class DDoSPolicyPortLimit extends AbstractModel {

    /**
    * Protocol. Valid values: [tcp, udp, all]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Start destination port. Value range: [0,65535]
    */
    @SerializedName("DPortStart")
    @Expose
    private Long DPortStart;

    /**
    * End destination port, which must be greater than or equal to the start destination port. Value range: [0,65535]
    */
    @SerializedName("DPortEnd")
    @Expose
    private Long DPortEnd;

    /**
    * Start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SPortStart")
    @Expose
    private Long SPortStart;

    /**
    * End source port, which must be greater than or equal to the start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SPortEnd")
    @Expose
    private Long SPortEnd;

    /**
    * Action to be executed. Valid values: [drop (discard) , transmit (forward)]
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Type of port to be disabled. Valid values: [0 (destination port range), 1 (source port range), 2 (destination port range and source port range)]
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
     * Get Protocol. Valid values: [tcp, udp, all] 
     * @return Protocol Protocol. Valid values: [tcp, udp, all]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: [tcp, udp, all]
     * @param Protocol Protocol. Valid values: [tcp, udp, all]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Start destination port. Value range: [0,65535] 
     * @return DPortStart Start destination port. Value range: [0,65535]
     */
    public Long getDPortStart() {
        return this.DPortStart;
    }

    /**
     * Set Start destination port. Value range: [0,65535]
     * @param DPortStart Start destination port. Value range: [0,65535]
     */
    public void setDPortStart(Long DPortStart) {
        this.DPortStart = DPortStart;
    }

    /**
     * Get End destination port, which must be greater than or equal to the start destination port. Value range: [0,65535] 
     * @return DPortEnd End destination port, which must be greater than or equal to the start destination port. Value range: [0,65535]
     */
    public Long getDPortEnd() {
        return this.DPortEnd;
    }

    /**
     * Set End destination port, which must be greater than or equal to the start destination port. Value range: [0,65535]
     * @param DPortEnd End destination port, which must be greater than or equal to the start destination port. Value range: [0,65535]
     */
    public void setDPortEnd(Long DPortEnd) {
        this.DPortEnd = DPortEnd;
    }

    /**
     * Get Start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SPortStart Start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSPortStart() {
        return this.SPortStart;
    }

    /**
     * Set Start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SPortStart Start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSPortStart(Long SPortStart) {
        this.SPortStart = SPortStart;
    }

    /**
     * Get End source port, which must be greater than or equal to the start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SPortEnd End source port, which must be greater than or equal to the start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSPortEnd() {
        return this.SPortEnd;
    }

    /**
     * Set End source port, which must be greater than or equal to the start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SPortEnd End source port, which must be greater than or equal to the start source port. Value range: [0,65535]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSPortEnd(Long SPortEnd) {
        this.SPortEnd = SPortEnd;
    }

    /**
     * Get Action to be executed. Valid values: [drop (discard) , transmit (forward)]
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Action Action to be executed. Valid values: [drop (discard) , transmit (forward)]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to be executed. Valid values: [drop (discard) , transmit (forward)]
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Action Action to be executed. Valid values: [drop (discard) , transmit (forward)]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Type of port to be disabled. Valid values: [0 (destination port range), 1 (source port range), 2 (destination port range and source port range)]
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Kind Type of port to be disabled. Valid values: [0 (destination port range), 1 (source port range), 2 (destination port range and source port range)]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set Type of port to be disabled. Valid values: [0 (destination port range), 1 (source port range), 2 (destination port range and source port range)]
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Kind Type of port to be disabled. Valid values: [0 (destination port range), 1 (source port range), 2 (destination port range and source port range)]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    public DDoSPolicyPortLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSPolicyPortLimit(DDoSPolicyPortLimit source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.DPortStart != null) {
            this.DPortStart = new Long(source.DPortStart);
        }
        if (source.DPortEnd != null) {
            this.DPortEnd = new Long(source.DPortEnd);
        }
        if (source.SPortStart != null) {
            this.SPortStart = new Long(source.SPortStart);
        }
        if (source.SPortEnd != null) {
            this.SPortEnd = new Long(source.SPortEnd);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "DPortStart", this.DPortStart);
        this.setParamSimple(map, prefix + "DPortEnd", this.DPortEnd);
        this.setParamSimple(map, prefix + "SPortStart", this.SPortStart);
        this.setParamSimple(map, prefix + "SPortEnd", this.SPortEnd);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

