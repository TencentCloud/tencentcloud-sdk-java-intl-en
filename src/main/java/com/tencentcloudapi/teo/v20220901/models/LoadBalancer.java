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

public class LoadBalancer extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type supports selecting the region to trigger probes, which can significantly reduce probe request volume but has lower sensitivity to origin health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li><li>GENERAL: General type. Supports adding general origin groups only. It can be referenced by site acceleration services (for example, domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>.</p>
    */
    @SerializedName("HealthChecker")
    @Expose
    private HealthChecker HealthChecker;

    /**
    * <p>Traffic scheduling policy among origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li>
    */
    @SerializedName("SteeringPolicy")
    @Expose
    private String SteeringPolicy;

    /**
    * <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group;</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>
    */
    @SerializedName("FailoverPolicy")
    @Expose
    private String FailoverPolicy;

    /**
    * <p>Origin server group health status.</p>
    */
    @SerializedName("OriginGroupHealthStatus")
    @Expose
    private OriginGroupHealthStatus [] OriginGroupHealthStatus;

    /**
    * <p>Load balancing status. Valid values:</p><li>Pending: deploying;</li><li>Deleting: deleting;</li><li>Running: effective.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>List of L4 proxy instances bound to the load balancing instance.</p>
    */
    @SerializedName("L4UsedList")
    @Expose
    private String [] L4UsedList;

    /**
    * <p>List of Layer-7 domain names bound to the load balancing instance.</p>
    */
    @SerializedName("L7UsedList")
    @Expose
    private String [] L7UsedList;

    /**
    * <p>List of referenced instances of the load balancer.</p>
    */
    @SerializedName("References")
    @Expose
    private OriginGroupReference [] References;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).</p> 
     * @return Name <p>Instance name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Instance name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).</p>
     * @param Name <p>Instance name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type supports selecting the region to trigger probes, which can significantly reduce probe request volume but has lower sensitivity to origin health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li><li>GENERAL: General type. Supports adding general origin groups only. It can be referenced by site acceleration services (for example, domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li> 
     * @return Type <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type supports selecting the region to trigger probes, which can significantly reduce probe request volume but has lower sensitivity to origin health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li><li>GENERAL: General type. Supports adding general origin groups only. It can be referenced by site acceleration services (for example, domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type supports selecting the region to trigger probes, which can significantly reduce probe request volume but has lower sensitivity to origin health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li><li>GENERAL: General type. Supports adding general origin groups only. It can be referenced by site acceleration services (for example, domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li>
     * @param Type <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type supports selecting the region to trigger probes, which can significantly reduce probe request volume but has lower sensitivity to origin health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin groups. Site acceleration services reference only (for example, domain name service and rule engine). This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li><li>GENERAL: General type. Supports adding general origin groups only. It can be referenced by site acceleration services (for example, domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to trigger probes. The probe request volume is large, but the sensitivity to origin health awareness is higher.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>.</p> 
     * @return HealthChecker <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>.</p>
     */
    public HealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>.</p>
     * @param HealthChecker <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>.</p>
     */
    public void setHealthChecker(HealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get <p>Traffic scheduling policy among origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li> 
     * @return SteeringPolicy <p>Traffic scheduling policy among origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li>
     */
    public String getSteeringPolicy() {
        return this.SteeringPolicy;
    }

    /**
     * Set <p>Traffic scheduling policy among origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li>
     * @param SteeringPolicy <p>Traffic scheduling policy among origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li>
     */
    public void setSteeringPolicy(String SteeringPolicy) {
        this.SteeringPolicy = SteeringPolicy;
    }

    /**
     * Get <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group;</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li> 
     * @return FailoverPolicy <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group;</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>
     */
    public String getFailoverPolicy() {
        return this.FailoverPolicy;
    }

    /**
     * Set <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group;</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>
     * @param FailoverPolicy <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group;</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>
     */
    public void setFailoverPolicy(String FailoverPolicy) {
        this.FailoverPolicy = FailoverPolicy;
    }

    /**
     * Get <p>Origin server group health status.</p> 
     * @return OriginGroupHealthStatus <p>Origin server group health status.</p>
     */
    public OriginGroupHealthStatus [] getOriginGroupHealthStatus() {
        return this.OriginGroupHealthStatus;
    }

    /**
     * Set <p>Origin server group health status.</p>
     * @param OriginGroupHealthStatus <p>Origin server group health status.</p>
     */
    public void setOriginGroupHealthStatus(OriginGroupHealthStatus [] OriginGroupHealthStatus) {
        this.OriginGroupHealthStatus = OriginGroupHealthStatus;
    }

    /**
     * Get <p>Load balancing status. Valid values:</p><li>Pending: deploying;</li><li>Deleting: deleting;</li><li>Running: effective.</li> 
     * @return Status <p>Load balancing status. Valid values:</p><li>Pending: deploying;</li><li>Deleting: deleting;</li><li>Running: effective.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Load balancing status. Valid values:</p><li>Pending: deploying;</li><li>Deleting: deleting;</li><li>Running: effective.</li>
     * @param Status <p>Load balancing status. Valid values:</p><li>Pending: deploying;</li><li>Deleting: deleting;</li><li>Running: effective.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>List of L4 proxy instances bound to the load balancing instance.</p> 
     * @return L4UsedList <p>List of L4 proxy instances bound to the load balancing instance.</p>
     */
    public String [] getL4UsedList() {
        return this.L4UsedList;
    }

    /**
     * Set <p>List of L4 proxy instances bound to the load balancing instance.</p>
     * @param L4UsedList <p>List of L4 proxy instances bound to the load balancing instance.</p>
     */
    public void setL4UsedList(String [] L4UsedList) {
        this.L4UsedList = L4UsedList;
    }

    /**
     * Get <p>List of Layer-7 domain names bound to the load balancing instance.</p> 
     * @return L7UsedList <p>List of Layer-7 domain names bound to the load balancing instance.</p>
     */
    public String [] getL7UsedList() {
        return this.L7UsedList;
    }

    /**
     * Set <p>List of Layer-7 domain names bound to the load balancing instance.</p>
     * @param L7UsedList <p>List of Layer-7 domain names bound to the load balancing instance.</p>
     */
    public void setL7UsedList(String [] L7UsedList) {
        this.L7UsedList = L7UsedList;
    }

    /**
     * Get <p>List of referenced instances of the load balancer.</p> 
     * @return References <p>List of referenced instances of the load balancer.</p>
     */
    public OriginGroupReference [] getReferences() {
        return this.References;
    }

    /**
     * Set <p>List of referenced instances of the load balancer.</p>
     * @param References <p>List of referenced instances of the load balancer.</p>
     */
    public void setReferences(OriginGroupReference [] References) {
        this.References = References;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.HealthChecker != null) {
            this.HealthChecker = new HealthChecker(source.HealthChecker);
        }
        if (source.SteeringPolicy != null) {
            this.SteeringPolicy = new String(source.SteeringPolicy);
        }
        if (source.FailoverPolicy != null) {
            this.FailoverPolicy = new String(source.FailoverPolicy);
        }
        if (source.OriginGroupHealthStatus != null) {
            this.OriginGroupHealthStatus = new OriginGroupHealthStatus[source.OriginGroupHealthStatus.length];
            for (int i = 0; i < source.OriginGroupHealthStatus.length; i++) {
                this.OriginGroupHealthStatus[i] = new OriginGroupHealthStatus(source.OriginGroupHealthStatus[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.L4UsedList != null) {
            this.L4UsedList = new String[source.L4UsedList.length];
            for (int i = 0; i < source.L4UsedList.length; i++) {
                this.L4UsedList[i] = new String(source.L4UsedList[i]);
            }
        }
        if (source.L7UsedList != null) {
            this.L7UsedList = new String[source.L7UsedList.length];
            for (int i = 0; i < source.L7UsedList.length; i++) {
                this.L7UsedList[i] = new String(source.L7UsedList[i]);
            }
        }
        if (source.References != null) {
            this.References = new OriginGroupReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new OriginGroupReference(source.References[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "HealthChecker.", this.HealthChecker);
        this.setParamSimple(map, prefix + "SteeringPolicy", this.SteeringPolicy);
        this.setParamSimple(map, prefix + "FailoverPolicy", this.FailoverPolicy);
        this.setParamArrayObj(map, prefix + "OriginGroupHealthStatus.", this.OriginGroupHealthStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "L4UsedList.", this.L4UsedList);
        this.setParamArraySimple(map, prefix + "L7UsedList.", this.L7UsedList);
        this.setParamArrayObj(map, prefix + "References.", this.References);

    }
}

