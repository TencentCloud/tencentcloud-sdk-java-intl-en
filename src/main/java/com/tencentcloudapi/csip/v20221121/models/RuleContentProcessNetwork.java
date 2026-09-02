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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleContentProcessNetwork extends AbstractModel {

    /**
    * <p>Current process</p>
    */
    @SerializedName("Process")
    @Expose
    private RuleContentProcessInfo Process;

    /**
    * <p>Destination IP (required): enable individually IP/IP range/CIDR. Both IPv4 and IPv6 are supported.</p>
    */
    @SerializedName("DstIP")
    @Expose
    private String DstIP;

    /**
    * <p>Parent process</p>
    */
    @SerializedName("ParentProcess")
    @Expose
    private RuleContentProcessInfo ParentProcess;

    /**
    * <p>Destination port list (optional): supports 1-65535, being empty indicates no port limit</p>
    */
    @SerializedName("DstPorts")
    @Expose
    private Long [] DstPorts;

    /**
     * Get <p>Current process</p> 
     * @return Process <p>Current process</p>
     */
    public RuleContentProcessInfo getProcess() {
        return this.Process;
    }

    /**
     * Set <p>Current process</p>
     * @param Process <p>Current process</p>
     */
    public void setProcess(RuleContentProcessInfo Process) {
        this.Process = Process;
    }

    /**
     * Get <p>Destination IP (required): enable individually IP/IP range/CIDR. Both IPv4 and IPv6 are supported.</p> 
     * @return DstIP <p>Destination IP (required): enable individually IP/IP range/CIDR. Both IPv4 and IPv6 are supported.</p>
     */
    public String getDstIP() {
        return this.DstIP;
    }

    /**
     * Set <p>Destination IP (required): enable individually IP/IP range/CIDR. Both IPv4 and IPv6 are supported.</p>
     * @param DstIP <p>Destination IP (required): enable individually IP/IP range/CIDR. Both IPv4 and IPv6 are supported.</p>
     */
    public void setDstIP(String DstIP) {
        this.DstIP = DstIP;
    }

    /**
     * Get <p>Parent process</p> 
     * @return ParentProcess <p>Parent process</p>
     */
    public RuleContentProcessInfo getParentProcess() {
        return this.ParentProcess;
    }

    /**
     * Set <p>Parent process</p>
     * @param ParentProcess <p>Parent process</p>
     */
    public void setParentProcess(RuleContentProcessInfo ParentProcess) {
        this.ParentProcess = ParentProcess;
    }

    /**
     * Get <p>Destination port list (optional): supports 1-65535, being empty indicates no port limit</p> 
     * @return DstPorts <p>Destination port list (optional): supports 1-65535, being empty indicates no port limit</p>
     */
    public Long [] getDstPorts() {
        return this.DstPorts;
    }

    /**
     * Set <p>Destination port list (optional): supports 1-65535, being empty indicates no port limit</p>
     * @param DstPorts <p>Destination port list (optional): supports 1-65535, being empty indicates no port limit</p>
     */
    public void setDstPorts(Long [] DstPorts) {
        this.DstPorts = DstPorts;
    }

    public RuleContentProcessNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleContentProcessNetwork(RuleContentProcessNetwork source) {
        if (source.Process != null) {
            this.Process = new RuleContentProcessInfo(source.Process);
        }
        if (source.DstIP != null) {
            this.DstIP = new String(source.DstIP);
        }
        if (source.ParentProcess != null) {
            this.ParentProcess = new RuleContentProcessInfo(source.ParentProcess);
        }
        if (source.DstPorts != null) {
            this.DstPorts = new Long[source.DstPorts.length];
            for (int i = 0; i < source.DstPorts.length; i++) {
                this.DstPorts[i] = new Long(source.DstPorts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Process.", this.Process);
        this.setParamSimple(map, prefix + "DstIP", this.DstIP);
        this.setParamObj(map, prefix + "ParentProcess.", this.ParentProcess);
        this.setParamArraySimple(map, prefix + "DstPorts.", this.DstPorts);

    }
}

