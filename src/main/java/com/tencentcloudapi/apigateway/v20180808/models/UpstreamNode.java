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

public class UpstreamNode extends AbstractModel {

    /**
    * IP or domain name
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * The port number. Range: [0, 65535]
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Value range: [0, 100]. `0` refers to disable it.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * CVM Instance ID
Note: This field may return `NULL`, indicating that no valid value was found.
    */
    @SerializedName("VmInstanceId")
    @Expose
    private String VmInstanceId;

    /**
    * Tag
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Health status of the node. Values: `OFF`, `HEALTHY`, `UNHEALTHY` and `NO_DATA`. It’s not required for creating and editing actions. It only supports VPC upstreams.
Note: This field may return `NULL`, indicating that no valid value was found.
    */
    @SerializedName("Healthy")
    @Expose
    private String Healthy;

    /**
    * TKE container name
Note: This field may return `NULL`, indicating that no valid value was found.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * TKE namespace
Note: This field may return `NULL`, indicating that no valid value was found.
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * ID of the TKE cluster
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Node source. Valid value: `K8S`
Note: This field may return `NULL`, indicating that no valid value was found.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * The unique service name in API Gateway
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UniqueServiceName")
    @Expose
    private String UniqueServiceName;

    /**
     * Get IP or domain name 
     * @return Host IP or domain name
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set IP or domain name
     * @param Host IP or domain name
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get The port number. Range: [0, 65535] 
     * @return Port The port number. Range: [0, 65535]
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set The port number. Range: [0, 65535]
     * @param Port The port number. Range: [0, 65535]
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Value range: [0, 100]. `0` refers to disable it. 
     * @return Weight Value range: [0, 100]. `0` refers to disable it.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Value range: [0, 100]. `0` refers to disable it.
     * @param Weight Value range: [0, 100]. `0` refers to disable it.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get CVM Instance ID
Note: This field may return `NULL`, indicating that no valid value was found. 
     * @return VmInstanceId CVM Instance ID
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public String getVmInstanceId() {
        return this.VmInstanceId;
    }

    /**
     * Set CVM Instance ID
Note: This field may return `NULL`, indicating that no valid value was found.
     * @param VmInstanceId CVM Instance ID
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public void setVmInstanceId(String VmInstanceId) {
        this.VmInstanceId = VmInstanceId;
    }

    /**
     * Get Tag
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Tags Tag
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: This field may return `null`, indicating that no valid value was found.
     * @param Tags Tag
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Health status of the node. Values: `OFF`, `HEALTHY`, `UNHEALTHY` and `NO_DATA`. It’s not required for creating and editing actions. It only supports VPC upstreams.
Note: This field may return `NULL`, indicating that no valid value was found. 
     * @return Healthy Health status of the node. Values: `OFF`, `HEALTHY`, `UNHEALTHY` and `NO_DATA`. It’s not required for creating and editing actions. It only supports VPC upstreams.
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public String getHealthy() {
        return this.Healthy;
    }

    /**
     * Set Health status of the node. Values: `OFF`, `HEALTHY`, `UNHEALTHY` and `NO_DATA`. It’s not required for creating and editing actions. It only supports VPC upstreams.
Note: This field may return `NULL`, indicating that no valid value was found.
     * @param Healthy Health status of the node. Values: `OFF`, `HEALTHY`, `UNHEALTHY` and `NO_DATA`. It’s not required for creating and editing actions. It only supports VPC upstreams.
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public void setHealthy(String Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get TKE container name
Note: This field may return `NULL`, indicating that no valid value was found. 
     * @return ServiceName TKE container name
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set TKE container name
Note: This field may return `NULL`, indicating that no valid value was found.
     * @param ServiceName TKE container name
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get TKE namespace
Note: This field may return `NULL`, indicating that no valid value was found. 
     * @return NameSpace TKE namespace
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set TKE namespace
Note: This field may return `NULL`, indicating that no valid value was found.
     * @param NameSpace TKE namespace
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get ID of the TKE cluster
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ClusterId ID of the TKE cluster
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the TKE cluster
Note: This field may return `null`, indicating that no valid value was found.
     * @param ClusterId ID of the TKE cluster
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Node source. Valid value: `K8S`
Note: This field may return `NULL`, indicating that no valid value was found. 
     * @return Source Node source. Valid value: `K8S`
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Node source. Valid value: `K8S`
Note: This field may return `NULL`, indicating that no valid value was found.
     * @param Source Node source. Valid value: `K8S`
Note: This field may return `NULL`, indicating that no valid value was found.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get The unique service name in API Gateway
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UniqueServiceName The unique service name in API Gateway
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getUniqueServiceName() {
        return this.UniqueServiceName;
    }

    /**
     * Set The unique service name in API Gateway
Note: This field may return `null`, indicating that no valid value was found.
     * @param UniqueServiceName The unique service name in API Gateway
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUniqueServiceName(String UniqueServiceName) {
        this.UniqueServiceName = UniqueServiceName;
    }

    public UpstreamNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamNode(UpstreamNode source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.VmInstanceId != null) {
            this.VmInstanceId = new String(source.VmInstanceId);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Healthy != null) {
            this.Healthy = new String(source.Healthy);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.UniqueServiceName != null) {
            this.UniqueServiceName = new String(source.UniqueServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "VmInstanceId", this.VmInstanceId);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "UniqueServiceName", this.UniqueServiceName);

    }
}

