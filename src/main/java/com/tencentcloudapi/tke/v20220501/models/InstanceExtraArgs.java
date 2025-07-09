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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceExtraArgs extends AbstractModel {

    /**
    * kubelet custom parameters, whose format is ["k1=v1", "k1=v2"], for example ["root-dir=/var/lib/kubelet","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Kubelet")
    @Expose
    private String [] Kubelet;

    /**
     * Get kubelet custom parameters, whose format is ["k1=v1", "k1=v2"], for example ["root-dir=/var/lib/kubelet","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Kubelet kubelet custom parameters, whose format is ["k1=v1", "k1=v2"], for example ["root-dir=/var/lib/kubelet","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getKubelet() {
        return this.Kubelet;
    }

    /**
     * Set kubelet custom parameters, whose format is ["k1=v1", "k1=v2"], for example ["root-dir=/var/lib/kubelet","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Kubelet kubelet custom parameters, whose format is ["k1=v1", "k1=v2"], for example ["root-dir=/var/lib/kubelet","feature-gates=PodShareProcessNamespace=true,DynamicKubeletConfig=true"]
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setKubelet(String [] Kubelet) {
        this.Kubelet = Kubelet;
    }

    public InstanceExtraArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceExtraArgs(InstanceExtraArgs source) {
        if (source.Kubelet != null) {
            this.Kubelet = new String[source.Kubelet.length];
            for (int i = 0; i < source.Kubelet.length; i++) {
                this.Kubelet[i] = new String(source.Kubelet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Kubelet.", this.Kubelet);

    }
}

