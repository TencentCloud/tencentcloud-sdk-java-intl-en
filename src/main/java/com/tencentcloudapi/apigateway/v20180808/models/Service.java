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

public class Service extends AbstractModel{

    /**
    * Port for HTTPS access over private network.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InnerHttpsPort")
    @Expose
    private Long InnerHttpsPort;

    /**
    * Custom service description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * Service frontend request type, such as `http`, `https`, and `http&https`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Network types supported by service.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetTypes")
    @Expose
    private String [] NetTypes;

    /**
    * Dedicated cluster name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExclusiveSetName")
    @Expose
    private String ExclusiveSetName;

    /**
    * Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * IP version.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * List of published environments, such as test, prepub, and release.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableEnvironments")
    @Expose
    private String [] AvailableEnvironments;

    /**
    * Custom service name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Public domain name assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OuterSubDomain")
    @Expose
    private String OuterSubDomain;

    /**
    * Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Port for HTTP access over private network.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InnerHttpPort")
    @Expose
    private Long InnerHttpPort;

    /**
    * Private domain name automatically assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InnerSubDomain")
    @Expose
    private String InnerSubDomain;

    /**
    * Billing status of service.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TradeIsolateStatus")
    @Expose
    private Long TradeIsolateStatus;

    /**
    * Tags bound to a service.
Note: this field may return null, indicating that no valid values found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Dedicated instance
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cluster type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SetType")
    @Expose
    private String SetType;

    /**
     * Get Port for HTTPS access over private network.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InnerHttpsPort Port for HTTPS access over private network.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInnerHttpsPort() {
        return this.InnerHttpsPort;
    }

    /**
     * Set Port for HTTPS access over private network.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InnerHttpsPort Port for HTTPS access over private network.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInnerHttpsPort(Long InnerHttpsPort) {
        this.InnerHttpsPort = InnerHttpsPort;
    }

    /**
     * Get Custom service description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceDesc Custom service description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set Custom service description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceDesc Custom service description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get Service frontend request type, such as `http`, `https`, and `http&https`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Service frontend request type, such as `http`, `https`, and `http&https`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Service frontend request type, such as `http`, `https`, and `http&https`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Protocol Service frontend request type, such as `http`, `https`, and `http&https`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModifiedTime Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModifiedTime Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Network types supported by service.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NetTypes Network types supported by service.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set Network types supported by service.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NetTypes Network types supported by service.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    /**
     * Get Dedicated cluster name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExclusiveSetName Dedicated cluster name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExclusiveSetName() {
        return this.ExclusiveSetName;
    }

    /**
     * Set Dedicated cluster name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExclusiveSetName Dedicated cluster name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExclusiveSetName(String ExclusiveSetName) {
        this.ExclusiveSetName = ExclusiveSetName;
    }

    /**
     * Get Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceId Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceId Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
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
     * Get List of published environments, such as test, prepub, and release.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AvailableEnvironments List of published environments, such as test, prepub, and release.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAvailableEnvironments() {
        return this.AvailableEnvironments;
    }

    /**
     * Set List of published environments, such as test, prepub, and release.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AvailableEnvironments List of published environments, such as test, prepub, and release.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailableEnvironments(String [] AvailableEnvironments) {
        this.AvailableEnvironments = AvailableEnvironments;
    }

    /**
     * Get Custom service name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceName Custom service name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Custom service name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceName Custom service name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Public domain name assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OuterSubDomain Public domain name assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOuterSubDomain() {
        return this.OuterSubDomain;
    }

    /**
     * Set Public domain name assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OuterSubDomain Public domain name assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOuterSubDomain(String OuterSubDomain) {
        this.OuterSubDomain = OuterSubDomain;
    }

    /**
     * Get Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Port for HTTP access over private network.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InnerHttpPort Port for HTTP access over private network.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInnerHttpPort() {
        return this.InnerHttpPort;
    }

    /**
     * Set Port for HTTP access over private network.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InnerHttpPort Port for HTTP access over private network.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInnerHttpPort(Long InnerHttpPort) {
        this.InnerHttpPort = InnerHttpPort;
    }

    /**
     * Get Private domain name automatically assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InnerSubDomain Private domain name automatically assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInnerSubDomain() {
        return this.InnerSubDomain;
    }

    /**
     * Set Private domain name automatically assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InnerSubDomain Private domain name automatically assigned by the system for this service.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInnerSubDomain(String InnerSubDomain) {
        this.InnerSubDomain = InnerSubDomain;
    }

    /**
     * Get Billing status of service.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TradeIsolateStatus Billing status of service.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTradeIsolateStatus() {
        return this.TradeIsolateStatus;
    }

    /**
     * Set Billing status of service.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TradeIsolateStatus Billing status of service.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTradeIsolateStatus(Long TradeIsolateStatus) {
        this.TradeIsolateStatus = TradeIsolateStatus;
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
     * Get Dedicated instance
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Dedicated instance
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Dedicated instance
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Dedicated instance
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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

    public Service() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Service(Service source) {
        if (source.InnerHttpsPort != null) {
            this.InnerHttpsPort = new Long(source.InnerHttpsPort);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
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
        if (source.ExclusiveSetName != null) {
            this.ExclusiveSetName = new String(source.ExclusiveSetName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
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
        if (source.OuterSubDomain != null) {
            this.OuterSubDomain = new String(source.OuterSubDomain);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.InnerHttpPort != null) {
            this.InnerHttpPort = new Long(source.InnerHttpPort);
        }
        if (source.InnerSubDomain != null) {
            this.InnerSubDomain = new String(source.InnerSubDomain);
        }
        if (source.TradeIsolateStatus != null) {
            this.TradeIsolateStatus = new Long(source.TradeIsolateStatus);
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
        if (source.SetType != null) {
            this.SetType = new String(source.SetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InnerHttpsPort", this.InnerHttpsPort);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamArraySimple(map, prefix + "NetTypes.", this.NetTypes);
        this.setParamSimple(map, prefix + "ExclusiveSetName", this.ExclusiveSetName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamArraySimple(map, prefix + "AvailableEnvironments.", this.AvailableEnvironments);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "OuterSubDomain", this.OuterSubDomain);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "InnerHttpPort", this.InnerHttpPort);
        this.setParamSimple(map, prefix + "InnerSubDomain", this.InnerSubDomain);
        this.setParamSimple(map, prefix + "TradeIsolateStatus", this.TradeIsolateStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SetType", this.SetType);

    }
}

