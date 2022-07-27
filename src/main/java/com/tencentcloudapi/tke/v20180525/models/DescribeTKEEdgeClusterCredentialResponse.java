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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTKEEdgeClusterCredentialResponse extends AbstractModel{

    /**
    * Access address of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Addresses")
    @Expose
    private IPAddress [] Addresses;

    /**
    * Cluster authentication information
    */
    @SerializedName("Credential")
    @Expose
    private ClusterCredential Credential;

    /**
    * Public network access information of the cluster
    */
    @SerializedName("PublicLB")
    @Expose
    private EdgeClusterPublicLB PublicLB;

    /**
    * Private network access information of the cluster
    */
    @SerializedName("InternalLB")
    @Expose
    private EdgeClusterInternalLB InternalLB;

    /**
    * CoreDns deployment information of the cluster
    */
    @SerializedName("CoreDns")
    @Expose
    private String CoreDns;

    /**
    * Multi-region health check deployment information of the cluster
    */
    @SerializedName("HealthRegion")
    @Expose
    private String HealthRegion;

    /**
    * Health check deployment information of the cluster
    */
    @SerializedName("Health")
    @Expose
    private String Health;

    /**
    * Whether to deploy GridDaemon to support headless service
    */
    @SerializedName("GridDaemon")
    @Expose
    private String GridDaemon;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Access address of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Addresses Access address of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public IPAddress [] getAddresses() {
        return this.Addresses;
    }

    /**
     * Set Access address of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Addresses Access address of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAddresses(IPAddress [] Addresses) {
        this.Addresses = Addresses;
    }

    /**
     * Get Cluster authentication information 
     * @return Credential Cluster authentication information
     */
    public ClusterCredential getCredential() {
        return this.Credential;
    }

    /**
     * Set Cluster authentication information
     * @param Credential Cluster authentication information
     */
    public void setCredential(ClusterCredential Credential) {
        this.Credential = Credential;
    }

    /**
     * Get Public network access information of the cluster 
     * @return PublicLB Public network access information of the cluster
     */
    public EdgeClusterPublicLB getPublicLB() {
        return this.PublicLB;
    }

    /**
     * Set Public network access information of the cluster
     * @param PublicLB Public network access information of the cluster
     */
    public void setPublicLB(EdgeClusterPublicLB PublicLB) {
        this.PublicLB = PublicLB;
    }

    /**
     * Get Private network access information of the cluster 
     * @return InternalLB Private network access information of the cluster
     */
    public EdgeClusterInternalLB getInternalLB() {
        return this.InternalLB;
    }

    /**
     * Set Private network access information of the cluster
     * @param InternalLB Private network access information of the cluster
     */
    public void setInternalLB(EdgeClusterInternalLB InternalLB) {
        this.InternalLB = InternalLB;
    }

    /**
     * Get CoreDns deployment information of the cluster 
     * @return CoreDns CoreDns deployment information of the cluster
     */
    public String getCoreDns() {
        return this.CoreDns;
    }

    /**
     * Set CoreDns deployment information of the cluster
     * @param CoreDns CoreDns deployment information of the cluster
     */
    public void setCoreDns(String CoreDns) {
        this.CoreDns = CoreDns;
    }

    /**
     * Get Multi-region health check deployment information of the cluster 
     * @return HealthRegion Multi-region health check deployment information of the cluster
     */
    public String getHealthRegion() {
        return this.HealthRegion;
    }

    /**
     * Set Multi-region health check deployment information of the cluster
     * @param HealthRegion Multi-region health check deployment information of the cluster
     */
    public void setHealthRegion(String HealthRegion) {
        this.HealthRegion = HealthRegion;
    }

    /**
     * Get Health check deployment information of the cluster 
     * @return Health Health check deployment information of the cluster
     */
    public String getHealth() {
        return this.Health;
    }

    /**
     * Set Health check deployment information of the cluster
     * @param Health Health check deployment information of the cluster
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     * Get Whether to deploy GridDaemon to support headless service 
     * @return GridDaemon Whether to deploy GridDaemon to support headless service
     */
    public String getGridDaemon() {
        return this.GridDaemon;
    }

    /**
     * Set Whether to deploy GridDaemon to support headless service
     * @param GridDaemon Whether to deploy GridDaemon to support headless service
     */
    public void setGridDaemon(String GridDaemon) {
        this.GridDaemon = GridDaemon;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTKEEdgeClusterCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTKEEdgeClusterCredentialResponse(DescribeTKEEdgeClusterCredentialResponse source) {
        if (source.Addresses != null) {
            this.Addresses = new IPAddress[source.Addresses.length];
            for (int i = 0; i < source.Addresses.length; i++) {
                this.Addresses[i] = new IPAddress(source.Addresses[i]);
            }
        }
        if (source.Credential != null) {
            this.Credential = new ClusterCredential(source.Credential);
        }
        if (source.PublicLB != null) {
            this.PublicLB = new EdgeClusterPublicLB(source.PublicLB);
        }
        if (source.InternalLB != null) {
            this.InternalLB = new EdgeClusterInternalLB(source.InternalLB);
        }
        if (source.CoreDns != null) {
            this.CoreDns = new String(source.CoreDns);
        }
        if (source.HealthRegion != null) {
            this.HealthRegion = new String(source.HealthRegion);
        }
        if (source.Health != null) {
            this.Health = new String(source.Health);
        }
        if (source.GridDaemon != null) {
            this.GridDaemon = new String(source.GridDaemon);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Addresses.", this.Addresses);
        this.setParamObj(map, prefix + "Credential.", this.Credential);
        this.setParamObj(map, prefix + "PublicLB.", this.PublicLB);
        this.setParamObj(map, prefix + "InternalLB.", this.InternalLB);
        this.setParamSimple(map, prefix + "CoreDns", this.CoreDns);
        this.setParamSimple(map, prefix + "HealthRegion", this.HealthRegion);
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "GridDaemon", this.GridDaemon);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

