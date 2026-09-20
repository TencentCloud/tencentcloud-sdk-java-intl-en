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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CDNDomainInfo extends AbstractModel {

    /**
    * Domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Deployment state.
    */
    @SerializedName("DeployStatus")
    @Expose
    private String DeployStatus;

    /**
    * Cname record.
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
    * cdn domain configuration information.
    */
    @SerializedName("Config")
    @Expose
    private CDNDomainConfig Config;

    /**
     * Get Domain name. 
     * @return Domain Domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name.
     * @param Domain Domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Deployment state. 
     * @return DeployStatus Deployment state.
     */
    public String getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set Deployment state.
     * @param DeployStatus Deployment state.
     */
    public void setDeployStatus(String DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get Cname record. 
     * @return Cname Cname record.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Cname record.
     * @param Cname Cname record.
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
     * Get cdn domain configuration information. 
     * @return Config cdn domain configuration information.
     */
    public CDNDomainConfig getConfig() {
        return this.Config;
    }

    /**
     * Set cdn domain configuration information.
     * @param Config cdn domain configuration information.
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

