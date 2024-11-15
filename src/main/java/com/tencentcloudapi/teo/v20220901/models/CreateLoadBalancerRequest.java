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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * LoadBalancer name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * LoadBalancer type. Valid values:
<li>HTTP: HTTP-specific LoadBalancer. It supports adding HTTP-specific and general origin server groups. It can only be referenced by site acceleration services (such as domain name service and rule engine).</li>
<li>GENERAL: general LoadBalancer. It only supports adding general origin server groups. It can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxy.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in [Quickly Create Load Balancers](https://intl.cloud.tencent.com/document/product/1552/104223?from_cn_redirect=1).
    */
    @SerializedName("OriginGroups")
    @Expose
    private OriginGroupInLoadBalancer [] OriginGroups;

    /**
    * Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1). If left empty, health check is disabled by default.
    */
    @SerializedName("HealthChecker")
    @Expose
    private HealthChecker HealthChecker;

    /**
    * Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li>The default value is Priority.
    */
    @SerializedName("SteeringPolicy")
    @Expose
    private String SteeringPolicy;

    /**
    * Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li> The default value is OtherRecordInOriginGroup.
    */
    @SerializedName("FailoverPolicy")
    @Expose
    private String FailoverPolicy;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get LoadBalancer name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-). 
     * @return Name LoadBalancer name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set LoadBalancer name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).
     * @param Name LoadBalancer name, which can contain 1 to 200 characters, including a-z, A-Z, 0-9, underscores (_), and hyphens (-).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get LoadBalancer type. Valid values:
<li>HTTP: HTTP-specific LoadBalancer. It supports adding HTTP-specific and general origin server groups. It can only be referenced by site acceleration services (such as domain name service and rule engine).</li>
<li>GENERAL: general LoadBalancer. It only supports adding general origin server groups. It can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxy.</li> 
     * @return Type LoadBalancer type. Valid values:
<li>HTTP: HTTP-specific LoadBalancer. It supports adding HTTP-specific and general origin server groups. It can only be referenced by site acceleration services (such as domain name service and rule engine).</li>
<li>GENERAL: general LoadBalancer. It only supports adding general origin server groups. It can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxy.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set LoadBalancer type. Valid values:
<li>HTTP: HTTP-specific LoadBalancer. It supports adding HTTP-specific and general origin server groups. It can only be referenced by site acceleration services (such as domain name service and rule engine).</li>
<li>GENERAL: general LoadBalancer. It only supports adding general origin server groups. It can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxy.</li>
     * @param Type LoadBalancer type. Valid values:
<li>HTTP: HTTP-specific LoadBalancer. It supports adding HTTP-specific and general origin server groups. It can only be referenced by site acceleration services (such as domain name service and rule engine).</li>
<li>GENERAL: general LoadBalancer. It only supports adding general origin server groups. It can be referenced by site acceleration services (such as domain name service and rule engine) and Layer-4 proxy.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in [Quickly Create Load Balancers](https://intl.cloud.tencent.com/document/product/1552/104223?from_cn_redirect=1). 
     * @return OriginGroups List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in [Quickly Create Load Balancers](https://intl.cloud.tencent.com/document/product/1552/104223?from_cn_redirect=1).
     */
    public OriginGroupInLoadBalancer [] getOriginGroups() {
        return this.OriginGroups;
    }

    /**
     * Set List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in [Quickly Create Load Balancers](https://intl.cloud.tencent.com/document/product/1552/104223?from_cn_redirect=1).
     * @param OriginGroups List of origin server groups and their corresponding disaster recovery scheduling priorities. For details, refer to Sample Scenario in [Quickly Create Load Balancers](https://intl.cloud.tencent.com/document/product/1552/104223?from_cn_redirect=1).
     */
    public void setOriginGroups(OriginGroupInLoadBalancer [] OriginGroups) {
        this.OriginGroups = OriginGroups;
    }

    /**
     * Get Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1). If left empty, health check is disabled by default. 
     * @return HealthChecker Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1). If left empty, health check is disabled by default.
     */
    public HealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1). If left empty, health check is disabled by default.
     * @param HealthChecker Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1). If left empty, health check is disabled by default.
     */
    public void setHealthChecker(HealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li>The default value is Priority. 
     * @return SteeringPolicy Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li>The default value is Priority.
     */
    public String getSteeringPolicy() {
        return this.SteeringPolicy;
    }

    /**
     * Set Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li>The default value is Priority.
     * @param SteeringPolicy Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li>The default value is Priority.
     */
    public void setSteeringPolicy(String SteeringPolicy) {
        this.SteeringPolicy = SteeringPolicy;
    }

    /**
     * Get Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li> The default value is OtherRecordInOriginGroup. 
     * @return FailoverPolicy Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li> The default value is OtherRecordInOriginGroup.
     */
    public String getFailoverPolicy() {
        return this.FailoverPolicy;
    }

    /**
     * Set Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li> The default value is OtherRecordInOriginGroup.
     * @param FailoverPolicy Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li> The default value is OtherRecordInOriginGroup.
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

