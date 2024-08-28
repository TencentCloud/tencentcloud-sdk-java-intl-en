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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudProtectService extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Type: new purchase in this case
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Configuration: information of purchased configuration
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * Service name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Time of purchase
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Type: new purchase in this case 
     * @return Type Type: new purchase in this case
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type: new purchase in this case
     * @param Type Type: new purchase in this case
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Configuration: information of purchased configuration 
     * @return Config Configuration: information of purchased configuration
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration: information of purchased configuration
     * @param Config Configuration: information of purchased configuration
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

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
     * Get Time of purchase 
     * @return BeginTime Time of purchase
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Time of purchase
     * @param BeginTime Time of purchase
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    public CloudProtectService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudProtectService(CloudProtectService source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);

    }
}

