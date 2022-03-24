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

public class CreateUpstreamRequest extends AbstractModel{

    /**
    * Backend protocol. Values: `HTTP`, `HTTPS`
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * The balancing method can only be `ROUND_ROBIN`.
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * Unique VPC ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Name of the upstream 
    */
    @SerializedName("UpstreamName")
    @Expose
    private String UpstreamName;

    /**
    * Description of the upstream
    */
    @SerializedName("UpstreamDescription")
    @Expose
    private String UpstreamDescription;

    /**
    * Retry attempts. It defaults to `3`.
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * The host header in the request sending to the backend
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

    /**
    * Backend nodes
    */
    @SerializedName("Nodes")
    @Expose
    private UpstreamNode [] Nodes;

    /**
    * The location of K8s service
    */
    @SerializedName("K8sService")
    @Expose
    private K8sService [] K8sService;

    /**
     * Get Backend protocol. Values: `HTTP`, `HTTPS` 
     * @return Scheme Backend protocol. Values: `HTTP`, `HTTPS`
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Backend protocol. Values: `HTTP`, `HTTPS`
     * @param Scheme Backend protocol. Values: `HTTP`, `HTTPS`
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get The balancing method can only be `ROUND_ROBIN`. 
     * @return Algorithm The balancing method can only be `ROUND_ROBIN`.
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set The balancing method can only be `ROUND_ROBIN`.
     * @param Algorithm The balancing method can only be `ROUND_ROBIN`.
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get Unique VPC ID 
     * @return UniqVpcId Unique VPC ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unique VPC ID
     * @param UniqVpcId Unique VPC ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Name of the upstream  
     * @return UpstreamName Name of the upstream 
     */
    public String getUpstreamName() {
        return this.UpstreamName;
    }

    /**
     * Set Name of the upstream 
     * @param UpstreamName Name of the upstream 
     */
    public void setUpstreamName(String UpstreamName) {
        this.UpstreamName = UpstreamName;
    }

    /**
     * Get Description of the upstream 
     * @return UpstreamDescription Description of the upstream
     */
    public String getUpstreamDescription() {
        return this.UpstreamDescription;
    }

    /**
     * Set Description of the upstream
     * @param UpstreamDescription Description of the upstream
     */
    public void setUpstreamDescription(String UpstreamDescription) {
        this.UpstreamDescription = UpstreamDescription;
    }

    /**
     * Get Retry attempts. It defaults to `3`. 
     * @return Retries Retry attempts. It defaults to `3`.
     */
    public Long getRetries() {
        return this.Retries;
    }

    /**
     * Set Retry attempts. It defaults to `3`.
     * @param Retries Retry attempts. It defaults to `3`.
     */
    public void setRetries(Long Retries) {
        this.Retries = Retries;
    }

    /**
     * Get The host header in the request sending to the backend 
     * @return UpstreamHost The host header in the request sending to the backend
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set The host header in the request sending to the backend
     * @param UpstreamHost The host header in the request sending to the backend
     */
    public void setUpstreamHost(String UpstreamHost) {
        this.UpstreamHost = UpstreamHost;
    }

    /**
     * Get Backend nodes 
     * @return Nodes Backend nodes
     */
    public UpstreamNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set Backend nodes
     * @param Nodes Backend nodes
     */
    public void setNodes(UpstreamNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get The location of K8s service 
     * @return K8sService The location of K8s service
     */
    public K8sService [] getK8sService() {
        return this.K8sService;
    }

    /**
     * Set The location of K8s service
     * @param K8sService The location of K8s service
     */
    public void setK8sService(K8sService [] K8sService) {
        this.K8sService = K8sService;
    }

    public CreateUpstreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUpstreamRequest(CreateUpstreamRequest source) {
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UpstreamName != null) {
            this.UpstreamName = new String(source.UpstreamName);
        }
        if (source.UpstreamDescription != null) {
            this.UpstreamDescription = new String(source.UpstreamDescription);
        }
        if (source.Retries != null) {
            this.Retries = new Long(source.Retries);
        }
        if (source.UpstreamHost != null) {
            this.UpstreamHost = new String(source.UpstreamHost);
        }
        if (source.Nodes != null) {
            this.Nodes = new UpstreamNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new UpstreamNode(source.Nodes[i]);
            }
        }
        if (source.K8sService != null) {
            this.K8sService = new K8sService[source.K8sService.length];
            for (int i = 0; i < source.K8sService.length; i++) {
                this.K8sService[i] = new K8sService(source.K8sService[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UpstreamName", this.UpstreamName);
        this.setParamSimple(map, prefix + "UpstreamDescription", this.UpstreamDescription);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamArrayObj(map, prefix + "K8sService.", this.K8sService);

    }
}

