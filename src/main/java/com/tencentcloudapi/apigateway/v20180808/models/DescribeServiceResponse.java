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

public class DescribeServiceResponse extends AbstractModel {

    /**
    * Unique service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Service environment list.
    */
    @SerializedName("AvailableEnvironments")
    @Expose
    private String [] AvailableEnvironments;

    /**
    * Service name.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Service description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * Protocol supported by service. Valid values: http, https, http&https.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Service creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Service modification time.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Network type list. INNER: private network access; OUTER: public network access.
    */
    @SerializedName("NetTypes")
    @Expose
    private String [] NetTypes;

    /**
    * Subdomain name for private network access.
    */
    @SerializedName("InternalSubDomain")
    @Expose
    private String InternalSubDomain;

    /**
    * Subdomain name for public network access.
    */
    @SerializedName("OuterSubDomain")
    @Expose
    private String OuterSubDomain;

    /**
    * Service port number for HTTP access over private network.
    */
    @SerializedName("InnerHttpPort")
    @Expose
    private Long InnerHttpPort;

    /**
    * Port number for HTTPS access over private network.
    */
    @SerializedName("InnerHttpsPort")
    @Expose
    private Long InnerHttpsPort;

    /**
    * Total number of APIs.
    */
    @SerializedName("ApiTotalCount")
    @Expose
    private Long ApiTotalCount;

    /**
    * API list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiIdStatusSet")
    @Expose
    private ApiIdStatus [] ApiIdStatusSet;

    /**
    * Total number of usage plans.
    */
    @SerializedName("UsagePlanTotalCount")
    @Expose
    private Long UsagePlanTotalCount;

    /**
    * Usage plan array.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsagePlanList")
    @Expose
    private UsagePlan [] UsagePlanList;

    /**
    * IP version.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * Service user type.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * Reserved field.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SetId")
    @Expose
    private Long SetId;

    /**
    * Tags bound to a service.
Note: this field may return null, indicating that no valid values found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Dedicated instance ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Dedicated instance name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Cluster type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SetType")
    @Expose
    private String SetType;

    /**
    * Cluster type for service deployment
Note: this field may return null, indicating that no valid values found.
    */
    @SerializedName("DeploymentType")
    @Expose
    private String DeploymentType;

    /**
    * Whether the service if for special usage. Valid values: `DEFAULT` (general usage), `HTTP_DNS`.
Note: This field may return `NULL`, indicating that no valid value was found.
    */
    @SerializedName("SpecialUse")
    @Expose
    private String SpecialUse;

    /**
    * 
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Unique service ID. 
     * @return ServiceId Unique service ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID.
     * @param ServiceId Unique service ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Service environment list. 
     * @return AvailableEnvironments Service environment list.
     */
    public String [] getAvailableEnvironments() {
        return this.AvailableEnvironments;
    }

    /**
     * Set Service environment list.
     * @param AvailableEnvironments Service environment list.
     */
    public void setAvailableEnvironments(String [] AvailableEnvironments) {
        this.AvailableEnvironments = AvailableEnvironments;
    }

    /**
     * Get Service name. 
     * @return ServiceName Service name.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name.
     * @param ServiceName Service name.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Service description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceDesc Service description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set Service description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceDesc Service description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get Protocol supported by service. Valid values: http, https, http&https. 
     * @return Protocol Protocol supported by service. Valid values: http, https, http&https.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol supported by service. Valid values: http, https, http&https.
     * @param Protocol Protocol supported by service. Valid values: http, https, http&https.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Service creation time. 
     * @return CreatedTime Service creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Service creation time.
     * @param CreatedTime Service creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Service modification time. 
     * @return ModifiedTime Service modification time.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Service modification time.
     * @param ModifiedTime Service modification time.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Network type list. INNER: private network access; OUTER: public network access. 
     * @return NetTypes Network type list. INNER: private network access; OUTER: public network access.
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set Network type list. INNER: private network access; OUTER: public network access.
     * @param NetTypes Network type list. INNER: private network access; OUTER: public network access.
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    /**
     * Get Subdomain name for private network access. 
     * @return InternalSubDomain Subdomain name for private network access.
     */
    public String getInternalSubDomain() {
        return this.InternalSubDomain;
    }

    /**
     * Set Subdomain name for private network access.
     * @param InternalSubDomain Subdomain name for private network access.
     */
    public void setInternalSubDomain(String InternalSubDomain) {
        this.InternalSubDomain = InternalSubDomain;
    }

    /**
     * Get Subdomain name for public network access. 
     * @return OuterSubDomain Subdomain name for public network access.
     */
    public String getOuterSubDomain() {
        return this.OuterSubDomain;
    }

    /**
     * Set Subdomain name for public network access.
     * @param OuterSubDomain Subdomain name for public network access.
     */
    public void setOuterSubDomain(String OuterSubDomain) {
        this.OuterSubDomain = OuterSubDomain;
    }

    /**
     * Get Service port number for HTTP access over private network. 
     * @return InnerHttpPort Service port number for HTTP access over private network.
     */
    public Long getInnerHttpPort() {
        return this.InnerHttpPort;
    }

    /**
     * Set Service port number for HTTP access over private network.
     * @param InnerHttpPort Service port number for HTTP access over private network.
     */
    public void setInnerHttpPort(Long InnerHttpPort) {
        this.InnerHttpPort = InnerHttpPort;
    }

    /**
     * Get Port number for HTTPS access over private network. 
     * @return InnerHttpsPort Port number for HTTPS access over private network.
     */
    public Long getInnerHttpsPort() {
        return this.InnerHttpsPort;
    }

    /**
     * Set Port number for HTTPS access over private network.
     * @param InnerHttpsPort Port number for HTTPS access over private network.
     */
    public void setInnerHttpsPort(Long InnerHttpsPort) {
        this.InnerHttpsPort = InnerHttpsPort;
    }

    /**
     * Get Total number of APIs. 
     * @return ApiTotalCount Total number of APIs.
     */
    public Long getApiTotalCount() {
        return this.ApiTotalCount;
    }

    /**
     * Set Total number of APIs.
     * @param ApiTotalCount Total number of APIs.
     */
    public void setApiTotalCount(Long ApiTotalCount) {
        this.ApiTotalCount = ApiTotalCount;
    }

    /**
     * Get API list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiIdStatusSet API list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ApiIdStatus [] getApiIdStatusSet() {
        return this.ApiIdStatusSet;
    }

    /**
     * Set API list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiIdStatusSet API list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiIdStatusSet(ApiIdStatus [] ApiIdStatusSet) {
        this.ApiIdStatusSet = ApiIdStatusSet;
    }

    /**
     * Get Total number of usage plans. 
     * @return UsagePlanTotalCount Total number of usage plans.
     */
    public Long getUsagePlanTotalCount() {
        return this.UsagePlanTotalCount;
    }

    /**
     * Set Total number of usage plans.
     * @param UsagePlanTotalCount Total number of usage plans.
     */
    public void setUsagePlanTotalCount(Long UsagePlanTotalCount) {
        this.UsagePlanTotalCount = UsagePlanTotalCount;
    }

    /**
     * Get Usage plan array.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UsagePlanList Usage plan array.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UsagePlan [] getUsagePlanList() {
        return this.UsagePlanList;
    }

    /**
     * Set Usage plan array.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UsagePlanList Usage plan array.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsagePlanList(UsagePlan [] UsagePlanList) {
        this.UsagePlanList = UsagePlanList;
    }

    /**
     * Get IP version.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IpVersion IP version.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP version.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IpVersion IP version.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get Service user type.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserType Service user type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set Service user type.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserType Service user type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Reserved field.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SetId Reserved field.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSetId() {
        return this.SetId;
    }

    /**
     * Set Reserved field.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SetId Reserved field.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSetId(Long SetId) {
        this.SetId = SetId;
    }

    /**
     * Get Tags bound to a service.
Note: this field may return null, indicating that no valid values found. 
     * @return Tags Tags bound to a service.
Note: this field may return null, indicating that no valid values found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags bound to a service.
Note: this field may return null, indicating that no valid values found.
     * @param Tags Tags bound to a service.
Note: this field may return null, indicating that no valid values found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Dedicated instance ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Dedicated instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Dedicated instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Dedicated instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Dedicated instance name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Dedicated instance name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Dedicated instance name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Dedicated instance name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Cluster type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SetType Cluster type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSetType() {
        return this.SetType;
    }

    /**
     * Set Cluster type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SetType Cluster type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSetType(String SetType) {
        this.SetType = SetType;
    }

    /**
     * Get Cluster type for service deployment
Note: this field may return null, indicating that no valid values found. 
     * @return DeploymentType Cluster type for service deployment
Note: this field may return null, indicating that no valid values found.
     */
    public String getDeploymentType() {
        return this.DeploymentType;
    }

    /**
     * Set Cluster type for service deployment
Note: this field may return null, indicating that no valid values found.
     * @param DeploymentType Cluster type for service deployment
Note: this field may return null, indicating that no valid values found.
     */
    public void setDeploymentType(String DeploymentType) {
        this.DeploymentType = DeploymentType;
    }

    /**
     * Get Whether the service if for special usage. Valid values: `DEFAULT` (general usage), `HTTP_DNS`.
Note: This field may return `NULL`, indicating that no valid value was found. 
     * @return SpecialUse Whether the service if for special usage. Valid values: `DEFAULT` (general usage), `HTTP_DNS`.
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public String getSpecialUse() {
        return this.SpecialUse;
    }

    /**
     * Set Whether the service if for special usage. Valid values: `DEFAULT` (general usage), `HTTP_DNS`.
Note: This field may return `NULL`, indicating that no valid value was found.
     * @param SpecialUse Whether the service if for special usage. Valid values: `DEFAULT` (general usage), `HTTP_DNS`.
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public void setSpecialUse(String SpecialUse) {
        this.SpecialUse = SpecialUse;
    }

    /**
     * Get  
     * @return UniqVpcId 
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 
     * @param UniqVpcId 
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceResponse(DescribeServiceResponse source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.AvailableEnvironments != null) {
            this.AvailableEnvironments = new String[source.AvailableEnvironments.length];
            for (int i = 0; i < source.AvailableEnvironments.length; i++) {
                this.AvailableEnvironments[i] = new String(source.AvailableEnvironments[i]);
            }
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.NetTypes != null) {
            this.NetTypes = new String[source.NetTypes.length];
            for (int i = 0; i < source.NetTypes.length; i++) {
                this.NetTypes[i] = new String(source.NetTypes[i]);
            }
        }
        if (source.InternalSubDomain != null) {
            this.InternalSubDomain = new String(source.InternalSubDomain);
        }
        if (source.OuterSubDomain != null) {
            this.OuterSubDomain = new String(source.OuterSubDomain);
        }
        if (source.InnerHttpPort != null) {
            this.InnerHttpPort = new Long(source.InnerHttpPort);
        }
        if (source.InnerHttpsPort != null) {
            this.InnerHttpsPort = new Long(source.InnerHttpsPort);
        }
        if (source.ApiTotalCount != null) {
            this.ApiTotalCount = new Long(source.ApiTotalCount);
        }
        if (source.ApiIdStatusSet != null) {
            this.ApiIdStatusSet = new ApiIdStatus[source.ApiIdStatusSet.length];
            for (int i = 0; i < source.ApiIdStatusSet.length; i++) {
                this.ApiIdStatusSet[i] = new ApiIdStatus(source.ApiIdStatusSet[i]);
            }
        }
        if (source.UsagePlanTotalCount != null) {
            this.UsagePlanTotalCount = new Long(source.UsagePlanTotalCount);
        }
        if (source.UsagePlanList != null) {
            this.UsagePlanList = new UsagePlan[source.UsagePlanList.length];
            for (int i = 0; i < source.UsagePlanList.length; i++) {
                this.UsagePlanList[i] = new UsagePlan(source.UsagePlanList[i]);
            }
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.SetId != null) {
            this.SetId = new Long(source.SetId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SetType != null) {
            this.SetType = new String(source.SetType);
        }
        if (source.DeploymentType != null) {
            this.DeploymentType = new String(source.DeploymentType);
        }
        if (source.SpecialUse != null) {
            this.SpecialUse = new String(source.SpecialUse);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArraySimple(map, prefix + "AvailableEnvironments.", this.AvailableEnvironments);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamArraySimple(map, prefix + "NetTypes.", this.NetTypes);
        this.setParamSimple(map, prefix + "InternalSubDomain", this.InternalSubDomain);
        this.setParamSimple(map, prefix + "OuterSubDomain", this.OuterSubDomain);
        this.setParamSimple(map, prefix + "InnerHttpPort", this.InnerHttpPort);
        this.setParamSimple(map, prefix + "InnerHttpsPort", this.InnerHttpsPort);
        this.setParamSimple(map, prefix + "ApiTotalCount", this.ApiTotalCount);
        this.setParamArrayObj(map, prefix + "ApiIdStatusSet.", this.ApiIdStatusSet);
        this.setParamSimple(map, prefix + "UsagePlanTotalCount", this.UsagePlanTotalCount);
        this.setParamArrayObj(map, prefix + "UsagePlanList.", this.UsagePlanList);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "SetType", this.SetType);
        this.setParamSimple(map, prefix + "DeploymentType", this.DeploymentType);
        this.setParamSimple(map, prefix + "SpecialUse", this.SpecialUse);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

