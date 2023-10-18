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

public class CreateServiceV2Request extends AbstractModel {

    /**
    * Service name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether to use the default image service. 1: yes; 0: no
    */
    @SerializedName("UseDefaultImageService")
    @Expose
    private Long UseDefaultImageService;

    /**
    * Type of the bound repository. 0: Personal Edition; 1: Enterprise Edition
    */
    @SerializedName("RepoType")
    @Expose
    private Long RepoType;

    /**
    * Instance ID of Enterprise Edition image service
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Address of the bound image server
    */
    @SerializedName("RepoServer")
    @Expose
    private String RepoServer;

    /**
    * Name of the bound image repository
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * Source channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * Service subnet
    */
    @SerializedName("SubnetList")
    @Expose
    private String [] SubnetList;

    /**
    * Programming language 
- JAVA
- OTHER
    */
    @SerializedName("CodingLanguage")
    @Expose
    private String CodingLanguage;

    /**
    * Deployment mode 
- IMAGE
- JAR
- WAR
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
     * Get Service name 
     * @return ServiceName Service name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name
     * @param ServiceName Service name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether to use the default image service. 1: yes; 0: no 
     * @return UseDefaultImageService Whether to use the default image service. 1: yes; 0: no
     */
    public Long getUseDefaultImageService() {
        return this.UseDefaultImageService;
    }

    /**
     * Set Whether to use the default image service. 1: yes; 0: no
     * @param UseDefaultImageService Whether to use the default image service. 1: yes; 0: no
     */
    public void setUseDefaultImageService(Long UseDefaultImageService) {
        this.UseDefaultImageService = UseDefaultImageService;
    }

    /**
     * Get Type of the bound repository. 0: Personal Edition; 1: Enterprise Edition 
     * @return RepoType Type of the bound repository. 0: Personal Edition; 1: Enterprise Edition
     */
    public Long getRepoType() {
        return this.RepoType;
    }

    /**
     * Set Type of the bound repository. 0: Personal Edition; 1: Enterprise Edition
     * @param RepoType Type of the bound repository. 0: Personal Edition; 1: Enterprise Edition
     */
    public void setRepoType(Long RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get Instance ID of Enterprise Edition image service 
     * @return InstanceId Instance ID of Enterprise Edition image service
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID of Enterprise Edition image service
     * @param InstanceId Instance ID of Enterprise Edition image service
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Address of the bound image server 
     * @return RepoServer Address of the bound image server
     */
    public String getRepoServer() {
        return this.RepoServer;
    }

    /**
     * Set Address of the bound image server
     * @param RepoServer Address of the bound image server
     */
    public void setRepoServer(String RepoServer) {
        this.RepoServer = RepoServer;
    }

    /**
     * Get Name of the bound image repository 
     * @return RepoName Name of the bound image repository
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set Name of the bound image repository
     * @param RepoName Name of the bound image repository
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
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
     * Get Service subnet 
     * @return SubnetList Service subnet
     */
    public String [] getSubnetList() {
        return this.SubnetList;
    }

    /**
     * Set Service subnet
     * @param SubnetList Service subnet
     */
    public void setSubnetList(String [] SubnetList) {
        this.SubnetList = SubnetList;
    }

    /**
     * Get Programming language 
- JAVA
- OTHER 
     * @return CodingLanguage Programming language 
- JAVA
- OTHER
     */
    public String getCodingLanguage() {
        return this.CodingLanguage;
    }

    /**
     * Set Programming language 
- JAVA
- OTHER
     * @param CodingLanguage Programming language 
- JAVA
- OTHER
     */
    public void setCodingLanguage(String CodingLanguage) {
        this.CodingLanguage = CodingLanguage;
    }

    /**
     * Get Deployment mode 
- IMAGE
- JAR
- WAR 
     * @return DeployMode Deployment mode 
- IMAGE
- JAR
- WAR
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Deployment mode 
- IMAGE
- JAR
- WAR
     * @param DeployMode Deployment mode 
- IMAGE
- JAR
- WAR
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    public CreateServiceV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceV2Request(CreateServiceV2Request source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UseDefaultImageService != null) {
            this.UseDefaultImageService = new Long(source.UseDefaultImageService);
        }
        if (source.RepoType != null) {
            this.RepoType = new Long(source.RepoType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RepoServer != null) {
            this.RepoServer = new String(source.RepoServer);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.SubnetList != null) {
            this.SubnetList = new String[source.SubnetList.length];
            for (int i = 0; i < source.SubnetList.length; i++) {
                this.SubnetList[i] = new String(source.SubnetList[i]);
            }
        }
        if (source.CodingLanguage != null) {
            this.CodingLanguage = new String(source.CodingLanguage);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UseDefaultImageService", this.UseDefaultImageService);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RepoServer", this.RepoServer);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamArraySimple(map, prefix + "SubnetList.", this.SubnetList);
        this.setParamSimple(map, prefix + "CodingLanguage", this.CodingLanguage);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);

    }
}

