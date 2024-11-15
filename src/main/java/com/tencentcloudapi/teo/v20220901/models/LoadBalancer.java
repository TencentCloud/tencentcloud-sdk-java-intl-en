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

public class LoadBalancer extends AbstractModel {

    /**
    * LoadBalancer ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
    * Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1).
    */
    @SerializedName("HealthChecker")
    @Expose
    private HealthChecker HealthChecker;

    /**
    * Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li>
    */
    @SerializedName("SteeringPolicy")
    @Expose
    private String SteeringPolicy;

    /**
    * Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>
    */
    @SerializedName("FailoverPolicy")
    @Expose
    private String FailoverPolicy;

    /**
    * Origin server group health status.
    */
    @SerializedName("OriginGroupHealthStatus")
    @Expose
    private OriginGroupHealthStatus [] OriginGroupHealthStatus;

    /**
    * LoadBalancer status. Valid values:
<li>Pending: deploying.</li>
<li>Deleting: deleting.</li>
<li>Running: effective.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * List of Layer-4 proxy instances bound to a LoadBalancer.
    */
    @SerializedName("L4UsedList")
    @Expose
    private String [] L4UsedList;

    /**
    * List of Layer-7 domain names bound to a LoadBalancer.
    */
    @SerializedName("L7UsedList")
    @Expose
    private String [] L7UsedList;

    /**
     * Get LoadBalancer ID. 
     * @return InstanceId LoadBalancer ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set LoadBalancer ID.
     * @param InstanceId LoadBalancer ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1). 
     * @return HealthChecker Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1).
     */
    public HealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1).
     * @param HealthChecker Health check policy. For details, refer to [Health Check Policies](https://intl.cloud.tencent.com/document/product/1552/104228?from_cn_redirect=1).
     */
    public void setHealthChecker(HealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li> 
     * @return SteeringPolicy Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li>
     */
    public String getSteeringPolicy() {
        return this.SteeringPolicy;
    }

    /**
     * Set Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li>
     * @param SteeringPolicy Traffic scheduling policy among origin server groups. Valid values:
<li>Priority: Perform failover according to priority.</li>
     */
    public void setSteeringPolicy(String SteeringPolicy) {
        this.SteeringPolicy = SteeringPolicy;
    }

    /**
     * Get Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li> 
     * @return FailoverPolicy Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>
     */
    public String getFailoverPolicy() {
        return this.FailoverPolicy;
    }

    /**
     * Set Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>
     * @param FailoverPolicy Request retry policy when access to an origin server fails. For details, refer to [Introduction to Request Retry Strategy](https://intl.cloud.tencent.com/document/product/1552/104227?from_cn_redirect=1). Valid values:
<li>OtherOriginGroup: After a single request fails, retry with another origin server within the next lower priority origin server group.</li>
<li>OtherRecordInOriginGroup: After a single request fails, retry with another origin server within the same origin server group.</li>
     */
    public void setFailoverPolicy(String FailoverPolicy) {
        this.FailoverPolicy = FailoverPolicy;
    }

    /**
     * Get Origin server group health status. 
     * @return OriginGroupHealthStatus Origin server group health status.
     */
    public OriginGroupHealthStatus [] getOriginGroupHealthStatus() {
        return this.OriginGroupHealthStatus;
    }

    /**
     * Set Origin server group health status.
     * @param OriginGroupHealthStatus Origin server group health status.
     */
    public void setOriginGroupHealthStatus(OriginGroupHealthStatus [] OriginGroupHealthStatus) {
        this.OriginGroupHealthStatus = OriginGroupHealthStatus;
    }

    /**
     * Get LoadBalancer status. Valid values:
<li>Pending: deploying.</li>
<li>Deleting: deleting.</li>
<li>Running: effective.</li> 
     * @return Status LoadBalancer status. Valid values:
<li>Pending: deploying.</li>
<li>Deleting: deleting.</li>
<li>Running: effective.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set LoadBalancer status. Valid values:
<li>Pending: deploying.</li>
<li>Deleting: deleting.</li>
<li>Running: effective.</li>
     * @param Status LoadBalancer status. Valid values:
<li>Pending: deploying.</li>
<li>Deleting: deleting.</li>
<li>Running: effective.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get List of Layer-4 proxy instances bound to a LoadBalancer. 
     * @return L4UsedList List of Layer-4 proxy instances bound to a LoadBalancer.
     */
    public String [] getL4UsedList() {
        return this.L4UsedList;
    }

    /**
     * Set List of Layer-4 proxy instances bound to a LoadBalancer.
     * @param L4UsedList List of Layer-4 proxy instances bound to a LoadBalancer.
     */
    public void setL4UsedList(String [] L4UsedList) {
        this.L4UsedList = L4UsedList;
    }

    /**
     * Get List of Layer-7 domain names bound to a LoadBalancer. 
     * @return L7UsedList List of Layer-7 domain names bound to a LoadBalancer.
     */
    public String [] getL7UsedList() {
        return this.L7UsedList;
    }

    /**
     * Set List of Layer-7 domain names bound to a LoadBalancer.
     * @param L7UsedList List of Layer-7 domain names bound to a LoadBalancer.
     */
    public void setL7UsedList(String [] L7UsedList) {
        this.L7UsedList = L7UsedList;
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

    }
}

