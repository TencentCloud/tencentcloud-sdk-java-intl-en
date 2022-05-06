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

public class UpstreamInfo extends AbstractModel{

    /**
    * Unique upstream ID
    */
    @SerializedName("UpstreamId")
    @Expose
    private String UpstreamId;

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
    * Backend protocol. Valid values: `HTTP`, `HTTPS`
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Load balancing algorithm. Valid value: `ROUND_ROBIN`
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
    * Number of retry attempts
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * Backend nodes
    */
    @SerializedName("Nodes")
    @Expose
    private UpstreamNode [] Nodes;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Label
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Health check configuration
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("HealthChecker")
    @Expose
    private UpstreamHealthChecker HealthChecker;

    /**
    * Upstream type. Valid values: `IP_PORT`, `K8S`
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * Configuration of TKE service
Note: This field may return `NULL`, indicating that no valid value was found.
    */
    @SerializedName("K8sServices")
    @Expose
    private K8sService [] K8sServices;

    /**
    * The Host header that the gateway forwards to the upstream
Note: This field may return `NULL`, indicating that no valid value was found.
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

    /**
     * Get Unique upstream ID 
     * @return UpstreamId Unique upstream ID
     */
    public String getUpstreamId() {
        return this.UpstreamId;
    }

    /**
     * Set Unique upstream ID
     * @param UpstreamId Unique upstream ID
     */
    public void setUpstreamId(String UpstreamId) {
        this.UpstreamId = UpstreamId;
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
     * Get Load balancing algorithm. Valid value: `ROUND_ROBIN` 
     * @return Algorithm Load balancing algorithm. Valid value: `ROUND_ROBIN`
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set Load balancing algorithm. Valid value: `ROUND_ROBIN`
     * @param Algorithm Load balancing algorithm. Valid value: `ROUND_ROBIN`
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
     * Get Number of retry attempts 
     * @return Retries Number of retry attempts
     */
    public Long getRetries() {
        return this.Retries;
    }

    /**
     * Set Number of retry attempts
     * @param Retries Number of retry attempts
     */
    public void setRetries(Long Retries) {
        this.Retries = Retries;
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
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Label
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Tags Label
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Label
Note: This field may return `null`, indicating that no valid value was found.
     * @param Tags Label
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Health check configuration
Note: This field may return `null`, indicating that no valid value was found. 
     * @return HealthChecker Health check configuration
Note: This field may return `null`, indicating that no valid value was found.
     */
    public UpstreamHealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set Health check configuration
Note: This field may return `null`, indicating that no valid value was found.
     * @param HealthChecker Health check configuration
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setHealthChecker(UpstreamHealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get Upstream type. Valid values: `IP_PORT`, `K8S` 
     * @return UpstreamType Upstream type. Valid values: `IP_PORT`, `K8S`
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set Upstream type. Valid values: `IP_PORT`, `K8S`
     * @param UpstreamType Upstream type. Valid values: `IP_PORT`, `K8S`
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get Configuration of TKE service
Note: This field may return `NULL`, indicating that no valid value was found. 
     * @return K8sServices Configuration of TKE service
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public K8sService [] getK8sServices() {
        return this.K8sServices;
    }

    /**
     * Set Configuration of TKE service
Note: This field may return `NULL`, indicating that no valid value was found.
     * @param K8sServices Configuration of TKE service
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public void setK8sServices(K8sService [] K8sServices) {
        this.K8sServices = K8sServices;
    }

    /**
     * Get The Host header that the gateway forwards to the upstream
Note: This field may return `NULL`, indicating that no valid value was found. 
     * @return UpstreamHost The Host header that the gateway forwards to the upstream
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set The Host header that the gateway forwards to the upstream
Note: This field may return `NULL`, indicating that no valid value was found.
     * @param UpstreamHost The Host header that the gateway forwards to the upstream
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public void setUpstreamHost(String UpstreamHost) {
        this.UpstreamHost = UpstreamHost;
    }

    public UpstreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamInfo(UpstreamInfo source) {
        if (source.UpstreamId != null) {
            this.UpstreamId = new String(source.UpstreamId);
        }
        if (source.UpstreamName != null) {
            this.UpstreamName = new String(source.UpstreamName);
        }
        if (source.UpstreamDescription != null) {
            this.UpstreamDescription = new String(source.UpstreamDescription);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Retries != null) {
            this.Retries = new Long(source.Retries);
        }
        if (source.Nodes != null) {
            this.Nodes = new UpstreamNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new UpstreamNode(source.Nodes[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
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
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.K8sServices != null) {
            this.K8sServices = new K8sService[source.K8sServices.length];
            for (int i = 0; i < source.K8sServices.length; i++) {
                this.K8sServices[i] = new K8sService(source.K8sServices[i]);
            }
        }
        if (source.UpstreamHost != null) {
            this.UpstreamHost = new String(source.UpstreamHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UpstreamId", this.UpstreamId);
        this.setParamSimple(map, prefix + "UpstreamName", this.UpstreamName);
        this.setParamSimple(map, prefix + "UpstreamDescription", this.UpstreamDescription);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "HealthChecker.", this.HealthChecker);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamArrayObj(map, prefix + "K8sServices.", this.K8sServices);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);

    }
}

