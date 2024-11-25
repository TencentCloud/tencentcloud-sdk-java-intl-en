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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagementConfig extends AbstractModel {

    /**
    * dns configuration
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Nameservers")
    @Expose
    private String [] Nameservers;

    /**
    * hosts configuration
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Kernel parameter configuration
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("KernelArgs")
    @Expose
    private String [] KernelArgs;

    /**
     * Get dns configuration
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Nameservers dns configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getNameservers() {
        return this.Nameservers;
    }

    /**
     * Set dns configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Nameservers dns configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNameservers(String [] Nameservers) {
        this.Nameservers = Nameservers;
    }

    /**
     * Get hosts configuration
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Hosts hosts configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set hosts configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Hosts hosts configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Kernel parameter configuration
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return KernelArgs Kernel parameter configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getKernelArgs() {
        return this.KernelArgs;
    }

    /**
     * Set Kernel parameter configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param KernelArgs Kernel parameter configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setKernelArgs(String [] KernelArgs) {
        this.KernelArgs = KernelArgs;
    }

    public ManagementConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagementConfig(ManagementConfig source) {
        if (source.Nameservers != null) {
            this.Nameservers = new String[source.Nameservers.length];
            for (int i = 0; i < source.Nameservers.length; i++) {
                this.Nameservers[i] = new String(source.Nameservers[i]);
            }
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.KernelArgs != null) {
            this.KernelArgs = new String[source.KernelArgs.length];
            for (int i = 0; i < source.KernelArgs.length; i++) {
                this.KernelArgs[i] = new String(source.KernelArgs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Nameservers.", this.Nameservers);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamArraySimple(map, prefix + "KernelArgs.", this.KernelArgs);

    }
}

