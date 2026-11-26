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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceServiceConfig extends AbstractModel {

    /**
    * <p>Ports monitored by the model service.</p>
    */
    @SerializedName("ListenPort")
    @Expose
    private Long ListenPort;

    /**
    * <p>Request path list of the inference service.</p>
    */
    @SerializedName("RequestPaths")
    @Expose
    private String [] RequestPaths;

    /**
    * <p>Container configuration for the inference service.</p>
    */
    @SerializedName("Containers")
    @Expose
    private InferenceContainerConfig [] Containers;

    /**
    * <p>Resource configuration of the inference service.</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private InferenceResourceConfig ResourceConfig;

    /**
    * <p>Inference service affinity configuration.</p>
    */
    @SerializedName("AffinityConfig")
    @Expose
    private InferenceAffinityConfig AffinityConfig;

    /**
     * Get <p>Ports monitored by the model service.</p> 
     * @return ListenPort <p>Ports monitored by the model service.</p>
     */
    public Long getListenPort() {
        return this.ListenPort;
    }

    /**
     * Set <p>Ports monitored by the model service.</p>
     * @param ListenPort <p>Ports monitored by the model service.</p>
     */
    public void setListenPort(Long ListenPort) {
        this.ListenPort = ListenPort;
    }

    /**
     * Get <p>Request path list of the inference service.</p> 
     * @return RequestPaths <p>Request path list of the inference service.</p>
     */
    public String [] getRequestPaths() {
        return this.RequestPaths;
    }

    /**
     * Set <p>Request path list of the inference service.</p>
     * @param RequestPaths <p>Request path list of the inference service.</p>
     */
    public void setRequestPaths(String [] RequestPaths) {
        this.RequestPaths = RequestPaths;
    }

    /**
     * Get <p>Container configuration for the inference service.</p> 
     * @return Containers <p>Container configuration for the inference service.</p>
     */
    public InferenceContainerConfig [] getContainers() {
        return this.Containers;
    }

    /**
     * Set <p>Container configuration for the inference service.</p>
     * @param Containers <p>Container configuration for the inference service.</p>
     */
    public void setContainers(InferenceContainerConfig [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get <p>Resource configuration of the inference service.</p> 
     * @return ResourceConfig <p>Resource configuration of the inference service.</p>
     */
    public InferenceResourceConfig getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>Resource configuration of the inference service.</p>
     * @param ResourceConfig <p>Resource configuration of the inference service.</p>
     */
    public void setResourceConfig(InferenceResourceConfig ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>Inference service affinity configuration.</p> 
     * @return AffinityConfig <p>Inference service affinity configuration.</p>
     */
    public InferenceAffinityConfig getAffinityConfig() {
        return this.AffinityConfig;
    }

    /**
     * Set <p>Inference service affinity configuration.</p>
     * @param AffinityConfig <p>Inference service affinity configuration.</p>
     */
    public void setAffinityConfig(InferenceAffinityConfig AffinityConfig) {
        this.AffinityConfig = AffinityConfig;
    }

    public InferenceServiceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceServiceConfig(InferenceServiceConfig source) {
        if (source.ListenPort != null) {
            this.ListenPort = new Long(source.ListenPort);
        }
        if (source.RequestPaths != null) {
            this.RequestPaths = new String[source.RequestPaths.length];
            for (int i = 0; i < source.RequestPaths.length; i++) {
                this.RequestPaths[i] = new String(source.RequestPaths[i]);
            }
        }
        if (source.Containers != null) {
            this.Containers = new InferenceContainerConfig[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new InferenceContainerConfig(source.Containers[i]);
            }
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new InferenceResourceConfig(source.ResourceConfig);
        }
        if (source.AffinityConfig != null) {
            this.AffinityConfig = new InferenceAffinityConfig(source.AffinityConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenPort", this.ListenPort);
        this.setParamArraySimple(map, prefix + "RequestPaths.", this.RequestPaths);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamObj(map, prefix + "AffinityConfig.", this.AffinityConfig);

    }
}

