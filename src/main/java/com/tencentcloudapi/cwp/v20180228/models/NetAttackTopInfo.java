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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetAttackTopInfo extends AbstractModel {

    /**
    * Top Statistical Data on Network Attack Host Dimension
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Agent")
    @Expose
    private TopInfo [] Agent;

    /**
    * Top Statistical Data on Network Attack IP Source Dimension
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcIp")
    @Expose
    private TopInfo [] SrcIp;

    /**
    * Top Statistical Data on Network Attack Target Port Dimension
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstPort")
    @Expose
    private TopInfo [] DstPort;

    /**
    * Top Statistical Data on Network Attack Vulnerability Dimension
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vul")
    @Expose
    private TopInfo [] Vul;

    /**
     * Get Top Statistical Data on Network Attack Host Dimension
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Agent Top Statistical Data on Network Attack Host Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TopInfo [] getAgent() {
        return this.Agent;
    }

    /**
     * Set Top Statistical Data on Network Attack Host Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Agent Top Statistical Data on Network Attack Host Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAgent(TopInfo [] Agent) {
        this.Agent = Agent;
    }

    /**
     * Get Top Statistical Data on Network Attack IP Source Dimension
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcIp Top Statistical Data on Network Attack IP Source Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TopInfo [] getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Top Statistical Data on Network Attack IP Source Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcIp Top Statistical Data on Network Attack IP Source Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcIp(TopInfo [] SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Top Statistical Data on Network Attack Target Port Dimension
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstPort Top Statistical Data on Network Attack Target Port Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TopInfo [] getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Top Statistical Data on Network Attack Target Port Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstPort Top Statistical Data on Network Attack Target Port Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDstPort(TopInfo [] DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get Top Statistical Data on Network Attack Vulnerability Dimension
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vul Top Statistical Data on Network Attack Vulnerability Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TopInfo [] getVul() {
        return this.Vul;
    }

    /**
     * Set Top Statistical Data on Network Attack Vulnerability Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vul Top Statistical Data on Network Attack Vulnerability Dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVul(TopInfo [] Vul) {
        this.Vul = Vul;
    }

    public NetAttackTopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackTopInfo(NetAttackTopInfo source) {
        if (source.Agent != null) {
            this.Agent = new TopInfo[source.Agent.length];
            for (int i = 0; i < source.Agent.length; i++) {
                this.Agent[i] = new TopInfo(source.Agent[i]);
            }
        }
        if (source.SrcIp != null) {
            this.SrcIp = new TopInfo[source.SrcIp.length];
            for (int i = 0; i < source.SrcIp.length; i++) {
                this.SrcIp[i] = new TopInfo(source.SrcIp[i]);
            }
        }
        if (source.DstPort != null) {
            this.DstPort = new TopInfo[source.DstPort.length];
            for (int i = 0; i < source.DstPort.length; i++) {
                this.DstPort[i] = new TopInfo(source.DstPort[i]);
            }
        }
        if (source.Vul != null) {
            this.Vul = new TopInfo[source.Vul.length];
            for (int i = 0; i < source.Vul.length; i++) {
                this.Vul[i] = new TopInfo(source.Vul[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "SrcIp.", this.SrcIp);
        this.setParamArrayObj(map, prefix + "DstPort.", this.DstPort);
        this.setParamArrayObj(map, prefix + "Vul.", this.Vul);

    }
}

