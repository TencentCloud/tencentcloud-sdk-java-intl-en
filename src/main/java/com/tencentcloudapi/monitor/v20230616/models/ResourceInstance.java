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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceInstance extends AbstractModel {

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Service name</p>
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Ready?</p>
    */
    @SerializedName("IsReady")
    @Expose
    private Boolean IsReady;

    /**
     * Get <p>Instance ID</p> 
     * @return Id <p>Instance ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Instance ID</p>
     * @param Id <p>Instance ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Service name</p> 
     * @return Service <p>Service name</p>
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set <p>Service name</p>
     * @param Service <p>Service name</p>
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Ready?</p> 
     * @return IsReady <p>Ready?</p>
     */
    public Boolean getIsReady() {
        return this.IsReady;
    }

    /**
     * Set <p>Ready?</p>
     * @param IsReady <p>Ready?</p>
     */
    public void setIsReady(Boolean IsReady) {
        this.IsReady = IsReady;
    }

    public ResourceInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceInstance(ResourceInstance source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IsReady != null) {
            this.IsReady = new Boolean(source.IsReady);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IsReady", this.IsReady);

    }
}

