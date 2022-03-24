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
    * Unique ID of the upstream
    */
    @SerializedName("UpstreamId")
    @Expose
    private String UpstreamId;

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
    * Protocol
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Load balancing algorithm
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * Unique VPC ID.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Number of retried attempts
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
    * Type of the upstream
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * Configuration of K8s service
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("K8sServices")
    @Expose
    private K8sService [] K8sServices;

    /**
    * Host of the upstream
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

    /**
     * Get Unique ID of the upstream 
     * @return UpstreamId Unique ID of the upstream
     */
    public String getUpstreamId() {
        return this.UpstreamId;
    }

    /**
     * Set Unique ID of the upstream
     * @param UpstreamId Unique ID of the upstream
     */
    public void setUpstreamId(String UpstreamId) {
        this.UpstreamId = UpstreamId;
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
     * Get Protocol 
     * @return Scheme Protocol
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Protocol
     * @param Scheme Protocol
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Load balancing algorithm 
     * @return Algorithm Load balancing algorithm
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set Load balancing algorithm
     * @param Algorithm Load balancing algorithm
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get Unique VPC ID. 
     * @return UniqVpcId Unique VPC ID.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unique VPC ID.
     * @param UniqVpcId Unique VPC ID.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Number of retried attempts 
     * @return Retries Number of retried attempts
     */
    public Long getRetries() {
        return this.Retries;
    }

    /**
     * Set Number of retried attempts
     * @param Retries Number of retried attempts
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
     * Get Type of the upstream 
     * @return UpstreamType Type of the upstream
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set Type of the upstream
     * @param UpstreamType Type of the upstream
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get Configuration of K8s service
Note: This field may return `null`, indicating that no valid value was found. 
     * @return K8sServices Configuration of K8s service
Note: This field may return `null`, indicating that no valid value was found.
     */
    public K8sService [] getK8sServices() {
        return this.K8sServices;
    }

    /**
     * Set Configuration of K8s service
Note: This field may return `null`, indicating that no valid value was found.
     * @param K8sServices Configuration of K8s service
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setK8sServices(K8sService [] K8sServices) {
        this.K8sServices = K8sServices;
    }

    /**
     * Get Host of the upstream
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UpstreamHost Host of the upstream
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set Host of the upstream
Note: This field may return `null`, indicating that no valid value was found.
     * @param UpstreamHost Host of the upstream
Note: This field may return `null`, indicating that no valid value was found.
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

