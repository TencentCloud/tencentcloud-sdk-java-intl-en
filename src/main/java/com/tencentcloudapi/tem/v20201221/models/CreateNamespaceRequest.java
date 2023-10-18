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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNamespaceRequest extends AbstractModel {

    /**
    * Namespace name
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * VPC name
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * Subnet list
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Namespace description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * K8s version
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * Source channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * Whether to enable the TSW service.
    */
    @SerializedName("EnableTswTraceService")
    @Expose
    private Boolean EnableTswTraceService;

    /**
     * Get Namespace name 
     * @return NamespaceName Namespace name
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace name
     * @param NamespaceName Namespace name
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get VPC name 
     * @return Vpc VPC name
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set VPC name
     * @param Vpc VPC name
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get Subnet list 
     * @return SubnetIds Subnet list
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set Subnet list
     * @param SubnetIds Subnet list
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Namespace description 
     * @return Description Namespace description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Namespace description
     * @param Description Namespace description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get K8s version 
     * @return K8sVersion K8s version
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set K8s version
     * @param K8sVersion K8s version
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get Source channel 
     * @return SourceChannel Source channel
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set Source channel
     * @param SourceChannel Source channel
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get Whether to enable the TSW service. 
     * @return EnableTswTraceService Whether to enable the TSW service.
     */
    public Boolean getEnableTswTraceService() {
        return this.EnableTswTraceService;
    }

    /**
     * Set Whether to enable the TSW service.
     * @param EnableTswTraceService Whether to enable the TSW service.
     */
    public void setEnableTswTraceService(Boolean EnableTswTraceService) {
        this.EnableTswTraceService = EnableTswTraceService;
    }

    public CreateNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNamespaceRequest(CreateNamespaceRequest source) {
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.EnableTswTraceService != null) {
            this.EnableTswTraceService = new Boolean(source.EnableTswTraceService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "EnableTswTraceService", this.EnableTswTraceService);

    }
}

