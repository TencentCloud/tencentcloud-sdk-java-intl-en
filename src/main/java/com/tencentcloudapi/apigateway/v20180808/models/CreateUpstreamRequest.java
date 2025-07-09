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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUpstreamRequest extends AbstractModel {

    /**
    * Backend protocol. Valid values: `HTTP`, `HTTPS`
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Load balancing algorithm. Valid value: `ROUND-ROBIN`
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
    * Upstream name
    */
    @SerializedName("UpstreamName")
    @Expose
    private String UpstreamName;

    /**
    * Upstream description
    */
    @SerializedName("UpstreamDescription")
    @Expose
    private String UpstreamDescription;

    /**
    * Upstream access type. Valid values: `IP_PORT`, `K8S`
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * Retry attempts. It defaults to `3`.
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * The Host request header that forwarded from the gateway to backend
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
    * Label
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Health check configuration
    */
    @SerializedName("HealthChecker")
    @Expose
    private UpstreamHealthChecker HealthChecker;

    /**
    * Configuration of TKE service
    */
    @SerializedName("K8sService")
    @Expose
    private K8sService [] K8sService;

    /**
     * Get Backend protocol. Valid values: `HTTP`, `HTTPS` 
     * @return Scheme Backend protocol. Valid values: `HTTP`, `HTTPS`
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Backend protocol. Valid values: `HTTP`, `HTTPS`
     * @param Scheme Backend protocol. Valid values: `HTTP`, `HTTPS`
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Load balancing algorithm. Valid value: `ROUND-ROBIN` 
     * @return Algorithm Load balancing algorithm. Valid value: `ROUND-ROBIN`
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set Load balancing algorithm. Valid value: `ROUND-ROBIN`
     * @param Algorithm Load balancing algorithm. Valid value: `ROUND-ROBIN`
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
     * Get Upstream name 
     * @return UpstreamName Upstream name
     */
    public String getUpstreamName() {
        return this.UpstreamName;
    }

    /**
     * Set Upstream name
     * @param UpstreamName Upstream name
     */
    public void setUpstreamName(String UpstreamName) {
        this.UpstreamName = UpstreamName;
    }

    /**
     * Get Upstream description 
     * @return UpstreamDescription Upstream description
     */
    public String getUpstreamDescription() {
        return this.UpstreamDescription;
    }

    /**
     * Set Upstream description
     * @param UpstreamDescription Upstream description
     */
    public void setUpstreamDescription(String UpstreamDescription) {
        this.UpstreamDescription = UpstreamDescription;
    }

    /**
     * Get Upstream access type. Valid values: `IP_PORT`, `K8S` 
     * @return UpstreamType Upstream access type. Valid values: `IP_PORT`, `K8S`
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set Upstream access type. Valid values: `IP_PORT`, `K8S`
     * @param UpstreamType Upstream access type. Valid values: `IP_PORT`, `K8S`
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
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
     * Get The Host request header that forwarded from the gateway to backend 
     * @return UpstreamHost The Host request header that forwarded from the gateway to backend
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set The Host request header that forwarded from the gateway to backend
     * @param UpstreamHost The Host request header that forwarded from the gateway to backend
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
     * Get Label 
     * @return Tags Label
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Label
     * @param Tags Label
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Health check configuration 
     * @return HealthChecker Health check configuration
     */
    public UpstreamHealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set Health check configuration
     * @param HealthChecker Health check configuration
     */
    public void setHealthChecker(UpstreamHealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get Configuration of TKE service 
     * @return K8sService Configuration of TKE service
     */
    public K8sService [] getK8sService() {
        return this.K8sService;
    }

    /**
     * Set Configuration of TKE service
     * @param K8sService Configuration of TKE service
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
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HealthChecker != null) {
            this.HealthChecker = new UpstreamHealthChecker(source.HealthChecker);
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
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "HealthChecker.", this.HealthChecker);
        this.setParamArrayObj(map, prefix + "K8sService.", this.K8sService);

    }
}

