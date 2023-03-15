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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEnvironmentRequest extends AbstractModel{

    /**
    * Environment name
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Environment description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * VPC name
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * List of subnets
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Kubernetes version
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
    * Whether to enable the TSW service
    */
    @SerializedName("EnableTswTraceService")
    @Expose
    private Boolean EnableTswTraceService;

    /**
    * Tag
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Environment type. Values: `test`, `pre`, `prod`
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * The region to create the environment
    */
    @SerializedName("CreateRegion")
    @Expose
    private String CreateRegion;

    /**
    * Whether to create a VPC
    */
    @SerializedName("SetupVpc")
    @Expose
    private Boolean SetupVpc;

    /**
    * Whether to create a TMP instance
    */
    @SerializedName("SetupPrometheus")
    @Expose
    private Boolean SetupPrometheus;

    /**
    * TMP instance ID
    */
    @SerializedName("PrometheusId")
    @Expose
    private String PrometheusId;

    /**
    * APM ID
    */
    @SerializedName("ApmId")
    @Expose
    private String ApmId;

    /**
     * Get Environment name 
     * @return EnvironmentName Environment name
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment name
     * @param EnvironmentName Environment name
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get Environment description 
     * @return Description Environment description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Environment description
     * @param Description Environment description
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get List of subnets 
     * @return SubnetIds List of subnets
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set List of subnets
     * @param SubnetIds List of subnets
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Kubernetes version 
     * @return K8sVersion Kubernetes version
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set Kubernetes version
     * @param K8sVersion Kubernetes version
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
     * Get Whether to enable the TSW service 
     * @return EnableTswTraceService Whether to enable the TSW service
     */
    public Boolean getEnableTswTraceService() {
        return this.EnableTswTraceService;
    }

    /**
     * Set Whether to enable the TSW service
     * @param EnableTswTraceService Whether to enable the TSW service
     */
    public void setEnableTswTraceService(Boolean EnableTswTraceService) {
        this.EnableTswTraceService = EnableTswTraceService;
    }

    /**
     * Get Tag 
     * @return Tags Tag
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
     * @param Tags Tag
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Environment type. Values: `test`, `pre`, `prod` 
     * @return EnvType Environment type. Values: `test`, `pre`, `prod`
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set Environment type. Values: `test`, `pre`, `prod`
     * @param EnvType Environment type. Values: `test`, `pre`, `prod`
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get The region to create the environment 
     * @return CreateRegion The region to create the environment
     */
    public String getCreateRegion() {
        return this.CreateRegion;
    }

    /**
     * Set The region to create the environment
     * @param CreateRegion The region to create the environment
     */
    public void setCreateRegion(String CreateRegion) {
        this.CreateRegion = CreateRegion;
    }

    /**
     * Get Whether to create a VPC 
     * @return SetupVpc Whether to create a VPC
     */
    public Boolean getSetupVpc() {
        return this.SetupVpc;
    }

    /**
     * Set Whether to create a VPC
     * @param SetupVpc Whether to create a VPC
     */
    public void setSetupVpc(Boolean SetupVpc) {
        this.SetupVpc = SetupVpc;
    }

    /**
     * Get Whether to create a TMP instance 
     * @return SetupPrometheus Whether to create a TMP instance
     */
    public Boolean getSetupPrometheus() {
        return this.SetupPrometheus;
    }

    /**
     * Set Whether to create a TMP instance
     * @param SetupPrometheus Whether to create a TMP instance
     */
    public void setSetupPrometheus(Boolean SetupPrometheus) {
        this.SetupPrometheus = SetupPrometheus;
    }

    /**
     * Get TMP instance ID 
     * @return PrometheusId TMP instance ID
     */
    public String getPrometheusId() {
        return this.PrometheusId;
    }

    /**
     * Set TMP instance ID
     * @param PrometheusId TMP instance ID
     */
    public void setPrometheusId(String PrometheusId) {
        this.PrometheusId = PrometheusId;
    }

    /**
     * Get APM ID 
     * @return ApmId APM ID
     */
    public String getApmId() {
        return this.ApmId;
    }

    /**
     * Set APM ID
     * @param ApmId APM ID
     */
    public void setApmId(String ApmId) {
        this.ApmId = ApmId;
    }

    public CreateEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEnvironmentRequest(CreateEnvironmentRequest source) {
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.EnableTswTraceService != null) {
            this.EnableTswTraceService = new Boolean(source.EnableTswTraceService);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.CreateRegion != null) {
            this.CreateRegion = new String(source.CreateRegion);
        }
        if (source.SetupVpc != null) {
            this.SetupVpc = new Boolean(source.SetupVpc);
        }
        if (source.SetupPrometheus != null) {
            this.SetupPrometheus = new Boolean(source.SetupPrometheus);
        }
        if (source.PrometheusId != null) {
            this.PrometheusId = new String(source.PrometheusId);
        }
        if (source.ApmId != null) {
            this.ApmId = new String(source.ApmId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "EnableTswTraceService", this.EnableTswTraceService);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "CreateRegion", this.CreateRegion);
        this.setParamSimple(map, prefix + "SetupVpc", this.SetupVpc);
        this.setParamSimple(map, prefix + "SetupPrometheus", this.SetupPrometheus);
        this.setParamSimple(map, prefix + "PrometheusId", this.PrometheusId);
        this.setParamSimple(map, prefix + "ApmId", this.ApmId);

    }
}

