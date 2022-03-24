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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sService extends AbstractModel{

    /**
    * Weight
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * K8s cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace of the container
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Name of the service
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Service port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * The additional Label of the Pod
    */
    @SerializedName("ExtraLabels")
    @Expose
    private K8sLabel [] ExtraLabels;

    /**
    * (Optional) Custom name of the service
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Weight 
     * @return Weight Weight
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight
     * @param Weight Weight
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get K8s cluster ID 
     * @return ClusterId K8s cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set K8s cluster ID
     * @param ClusterId K8s cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Namespace of the container 
     * @return Namespace Namespace of the container
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace of the container
     * @param Namespace Namespace of the container
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Name of the service 
     * @return ServiceName Name of the service
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Name of the service
     * @param ServiceName Name of the service
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Service port 
     * @return Port Service port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Service port
     * @param Port Service port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get The additional Label of the Pod 
     * @return ExtraLabels The additional Label of the Pod
     */
    public K8sLabel [] getExtraLabels() {
        return this.ExtraLabels;
    }

    /**
     * Set The additional Label of the Pod
     * @param ExtraLabels The additional Label of the Pod
     */
    public void setExtraLabels(K8sLabel [] ExtraLabels) {
        this.ExtraLabels = ExtraLabels;
    }

    /**
     * Get (Optional) Custom name of the service 
     * @return Name (Optional) Custom name of the service
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set (Optional) Custom name of the service
     * @param Name (Optional) Custom name of the service
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public K8sService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sService(K8sService source) {
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ExtraLabels != null) {
            this.ExtraLabels = new K8sLabel[source.ExtraLabels.length];
            for (int i = 0; i < source.ExtraLabels.length; i++) {
                this.ExtraLabels[i] = new K8sLabel(source.ExtraLabels[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "ExtraLabels.", this.ExtraLabels);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

