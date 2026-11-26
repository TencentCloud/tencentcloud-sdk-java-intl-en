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

public class CreateLoadBalancerRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Instance name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type supports selecting the region to initiate probes, which can significantly reduce probe request volume but has lower sensitivity to origin server health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li><li>GENERAL: General type. Supports adding general origin server groups only. Can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in <a href="https://www.tencentcloud.com/document/product/1552/104223?from_cn_redirect=1">Quickly Create Load Balancers</a>.</p>
    */
    @SerializedName("OriginGroups")
    @Expose
    private OriginGroupInLoadBalancer [] OriginGroups;

    /**
    * <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>. If left empty, health check is disabled by default.</p>
    */
    @SerializedName("HealthChecker")
    @Expose
    private HealthChecker HealthChecker;

    /**
    * <p>Traffic scheduling policy between origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li>Default value: Pritory.
    */
    @SerializedName("SteeringPolicy")
    @Expose
    private String SteeringPolicy;

    /**
    * <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>The default value is OtherRecordInOriginGroup.
    */
    @SerializedName("FailoverPolicy")
    @Expose
    private String FailoverPolicy;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type supports selecting the region to initiate probes, which can significantly reduce probe request volume but has lower sensitivity to origin server health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li><li>GENERAL: General type. Supports adding general origin server groups only. Can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li> 
     * @return Type <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type supports selecting the region to initiate probes, which can significantly reduce probe request volume but has lower sensitivity to origin server health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li><li>GENERAL: General type. Supports adding general origin server groups only. Can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type supports selecting the region to initiate probes, which can significantly reduce probe request volume but has lower sensitivity to origin server health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li><li>GENERAL: General type. Supports adding general origin server groups only. Can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li>
     * @param Type <p>Instance type. Valid values:</p><li>HTTP_V2: HTTP dedicated (V2). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type supports selecting the region to initiate probes, which can significantly reduce probe request volume but has lower sensitivity to origin server health awareness.</li><li>HTTP: HTTP dedicated (V1). Supports adding HTTP dedicated and general origin server groups. Site acceleration services reference only (such as domain name service and rule engine). This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li><li>GENERAL: General type. Supports adding general origin server groups only. Can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxies. This instance type does not support selecting the region to initiate probes. The probe request volume is large but has higher sensitivity to origin server health awareness.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in <a href="https://www.tencentcloud.com/document/product/1552/104223?from_cn_redirect=1">Quickly Create Load Balancers</a>.</p> 
     * @return OriginGroups <p>List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in <a href="https://www.tencentcloud.com/document/product/1552/104223?from_cn_redirect=1">Quickly Create Load Balancers</a>.</p>
     */
    public OriginGroupInLoadBalancer [] getOriginGroups() {
        return this.OriginGroups;
    }

    /**
     * Set <p>List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in <a href="https://www.tencentcloud.com/document/product/1552/104223?from_cn_redirect=1">Quickly Create Load Balancers</a>.</p>
     * @param OriginGroups <p>List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in <a href="https://www.tencentcloud.com/document/product/1552/104223?from_cn_redirect=1">Quickly Create Load Balancers</a>.</p>
     */
    public void setOriginGroups(OriginGroupInLoadBalancer [] OriginGroups) {
        this.OriginGroups = OriginGroups;
    }

    /**
     * Get <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>. If left empty, health check is disabled by default.</p> 
     * @return HealthChecker <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>. If left empty, health check is disabled by default.</p>
     */
    public HealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>. If left empty, health check is disabled by default.</p>
     * @param HealthChecker <p>Health check policy. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104228?from_cn_redirect=1">Health Check Policies</a>. If left empty, health check is disabled by default.</p>
     */
    public void setHealthChecker(HealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get <p>Traffic scheduling policy between origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li>Default value: Pritory. 
     * @return SteeringPolicy <p>Traffic scheduling policy between origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li>Default value: Pritory.
     */
    public String getSteeringPolicy() {
        return this.SteeringPolicy;
    }

    /**
     * Set <p>Traffic scheduling policy between origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li>Default value: Pritory.
     * @param SteeringPolicy <p>Traffic scheduling policy between origin server groups. Valid values:</p><li>Pritory: Perform failover according to priority.</li>Default value: Pritory.
     */
    public void setSteeringPolicy(String SteeringPolicy) {
        this.SteeringPolicy = SteeringPolicy;
    }

    /**
     * Get <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>The default value is OtherRecordInOriginGroup. 
     * @return FailoverPolicy <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>The default value is OtherRecordInOriginGroup.
     */
    public String getFailoverPolicy() {
        return this.FailoverPolicy;
    }

    /**
     * Set <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>The default value is OtherRecordInOriginGroup.
     * @param FailoverPolicy <p>Request retry policy when access to an origin server fails. For details, refer to <a href="https://www.tencentcloud.com/document/product/1552/104227?from_cn_redirect=1">Introduction to Request Retry Strategy</a>. Valid values:</p><li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li><li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>The default value is OtherRecordInOriginGroup.
     */
    public void setFailoverPolicy(String FailoverPolicy) {
        this.FailoverPolicy = FailoverPolicy;
    }

    public CreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerRequest(CreateLoadBalancerRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OriginGroups != null) {
            this.OriginGroups = new OriginGroupInLoadBalancer[source.OriginGroups.length];
            for (int i = 0; i < source.OriginGroups.length; i++) {
                this.OriginGroups[i] = new OriginGroupInLoadBalancer(source.OriginGroups[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "OriginGroups.", this.OriginGroups);
        this.setParamObj(map, prefix + "HealthChecker.", this.HealthChecker);
        this.setParamSimple(map, prefix + "SteeringPolicy", this.SteeringPolicy);
        this.setParamSimple(map, prefix + "FailoverPolicy", this.FailoverPolicy);

    }
}

