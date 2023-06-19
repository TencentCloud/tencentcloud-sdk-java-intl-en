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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CDNDomainInfo extends AbstractModel{

    /**
    * Domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Deployment status.
    */
    @SerializedName("DeployStatus")
    @Expose
    private String DeployStatus;

    /**
    * CNAME record.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * CDN domain configuration information.
    */
    @SerializedName("Config")
    @Expose
    private CDNDomainConfig Config;

    /**
     * Get Domain. 
     * @return Domain Domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain.
     * @param Domain Domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Deployment status. 
     * @return DeployStatus Deployment status.
     */
    public String getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set Deployment status.
     * @param DeployStatus Deployment status.
     */
    public void setDeployStatus(String DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get CNAME record. 
     * @return Cname CNAME record.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME record.
     * @param Cname CNAME record.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get CDN domain configuration information. 
     * @return Config CDN domain configuration information.
     */
    public CDNDomainConfig getConfig() {
        return this.Config;
    }

    /**
     * Set CDN domain configuration information.
     * @param Config CDN domain configuration information.
     */
    public void setConfig(CDNDomainConfig Config) {
        this.Config = Config;
    }

    public CDNDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CDNDomainInfo(CDNDomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DeployStatus != null) {
            this.DeployStatus = new String(source.DeployStatus);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Config != null) {
            this.Config = new CDNDomainConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DeployStatus", this.DeployStatus);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

