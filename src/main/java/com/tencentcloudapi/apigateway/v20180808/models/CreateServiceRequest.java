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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceRequest extends AbstractModel {

    /**
    * Custom service name.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Service frontend request type, such as `http`, `https`, and `http&https`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Custom service description.
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * Dedicated cluster name, which is used to specify the dedicated cluster where the service is to be created.
    */
    @SerializedName("ExclusiveSetName")
    @Expose
    private String ExclusiveSetName;

    /**
    * Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER.
    */
    @SerializedName("NetTypes")
    @Expose
    private String [] NetTypes;

    /**
    * IP version number. Valid values: IPv4, IPv6. Default value: IPv4.
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * Cluster name, which is reserved and used by the `tsf serverless` type.
    */
    @SerializedName("SetServerName")
    @Expose
    private String SetServerName;

    /**
    * User type, which is reserved and can be used by `serverless` users.
    */
    @SerializedName("AppIdType")
    @Expose
    private String AppIdType;

    /**
    * Tag information.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Dedicated instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * VPC attribute
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
     * Get Custom service name. 
     * @return ServiceName Custom service name.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Custom service name.
     * @param ServiceName Custom service name.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Service frontend request type, such as `http`, `https`, and `http&https`. 
     * @return Protocol Service frontend request type, such as `http`, `https`, and `http&https`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Service frontend request type, such as `http`, `https`, and `http&https`.
     * @param Protocol Service frontend request type, such as `http`, `https`, and `http&https`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Custom service description. 
     * @return ServiceDesc Custom service description.
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set Custom service description.
     * @param ServiceDesc Custom service description.
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get Dedicated cluster name, which is used to specify the dedicated cluster where the service is to be created. 
     * @return ExclusiveSetName Dedicated cluster name, which is used to specify the dedicated cluster where the service is to be created.
     */
    public String getExclusiveSetName() {
        return this.ExclusiveSetName;
    }

    /**
     * Set Dedicated cluster name, which is used to specify the dedicated cluster where the service is to be created.
     * @param ExclusiveSetName Dedicated cluster name, which is used to specify the dedicated cluster where the service is to be created.
     */
    public void setExclusiveSetName(String ExclusiveSetName) {
        this.ExclusiveSetName = ExclusiveSetName;
    }

    /**
     * Get Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER. 
     * @return NetTypes Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER.
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER.
     * @param NetTypes Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER.
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    /**
     * Get IP version number. Valid values: IPv4, IPv6. Default value: IPv4. 
     * @return IpVersion IP version number. Valid values: IPv4, IPv6. Default value: IPv4.
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP version number. Valid values: IPv4, IPv6. Default value: IPv4.
     * @param IpVersion IP version number. Valid values: IPv4, IPv6. Default value: IPv4.
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get Cluster name, which is reserved and used by the `tsf serverless` type. 
     * @return SetServerName Cluster name, which is reserved and used by the `tsf serverless` type.
     */
    public String getSetServerName() {
        return this.SetServerName;
    }

    /**
     * Set Cluster name, which is reserved and used by the `tsf serverless` type.
     * @param SetServerName Cluster name, which is reserved and used by the `tsf serverless` type.
     */
    public void setSetServerName(String SetServerName) {
        this.SetServerName = SetServerName;
    }

    /**
     * Get User type, which is reserved and can be used by `serverless` users. 
     * @return AppIdType User type, which is reserved and can be used by `serverless` users.
     */
    public String getAppIdType() {
        return this.AppIdType;
    }

    /**
     * Set User type, which is reserved and can be used by `serverless` users.
     * @param AppIdType User type, which is reserved and can be used by `serverless` users.
     */
    public void setAppIdType(String AppIdType) {
        this.AppIdType = AppIdType;
    }

    /**
     * Get Tag information. 
     * @return Tags Tag information.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information.
     * @param Tags Tag information.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Dedicated instance ID 
     * @return InstanceId Dedicated instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Dedicated instance ID
     * @param InstanceId Dedicated instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get VPC attribute 
     * @return UniqVpcId VPC attribute
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC attribute
     * @param UniqVpcId VPC attribute
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    public CreateServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceRequest(CreateServiceRequest source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.ExclusiveSetName != null) {
            this.ExclusiveSetName = new String(source.ExclusiveSetName);
        }
        if (source.NetTypes != null) {
            this.NetTypes = new String[source.NetTypes.length];
            for (int i = 0; i < source.NetTypes.length; i++) {
                this.NetTypes[i] = new String(source.NetTypes[i]);
            }
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.SetServerName != null) {
            this.SetServerName = new String(source.SetServerName);
        }
        if (source.AppIdType != null) {
            this.AppIdType = new String(source.AppIdType);
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
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "ExclusiveSetName", this.ExclusiveSetName);
        this.setParamArraySimple(map, prefix + "NetTypes.", this.NetTypes);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "SetServerName", this.SetServerName);
        this.setParamSimple(map, prefix + "AppIdType", this.AppIdType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);

    }
}

