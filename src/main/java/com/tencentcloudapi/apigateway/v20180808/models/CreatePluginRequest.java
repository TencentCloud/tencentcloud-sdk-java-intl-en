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

public class CreatePluginRequest extends AbstractModel {

    /**
    * Custom plugin name. A plugin name should contain 2-50 characters out of a-z, A-Z, 0-9, and _, which must begin with a letter and end with a letter or a number.
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * Plugin type. Valid values: `IPControl`, `TrafficControl`, `Cors`, `CustomReq`, `CustomAuth`, `Routing`, `TrafficControlByParameter`, `CircuitBreaker`, `ProxyCache`
    */
    @SerializedName("PluginType")
    @Expose
    private String PluginType;

    /**
    * Plugin definition statement in json format
    */
    @SerializedName("PluginData")
    @Expose
    private String PluginData;

    /**
    * Plugin description within 200 characters
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Label
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Custom plugin name. A plugin name should contain 2-50 characters out of a-z, A-Z, 0-9, and _, which must begin with a letter and end with a letter or a number. 
     * @return PluginName Custom plugin name. A plugin name should contain 2-50 characters out of a-z, A-Z, 0-9, and _, which must begin with a letter and end with a letter or a number.
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set Custom plugin name. A plugin name should contain 2-50 characters out of a-z, A-Z, 0-9, and _, which must begin with a letter and end with a letter or a number.
     * @param PluginName Custom plugin name. A plugin name should contain 2-50 characters out of a-z, A-Z, 0-9, and _, which must begin with a letter and end with a letter or a number.
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get Plugin type. Valid values: `IPControl`, `TrafficControl`, `Cors`, `CustomReq`, `CustomAuth`, `Routing`, `TrafficControlByParameter`, `CircuitBreaker`, `ProxyCache` 
     * @return PluginType Plugin type. Valid values: `IPControl`, `TrafficControl`, `Cors`, `CustomReq`, `CustomAuth`, `Routing`, `TrafficControlByParameter`, `CircuitBreaker`, `ProxyCache`
     */
    public String getPluginType() {
        return this.PluginType;
    }

    /**
     * Set Plugin type. Valid values: `IPControl`, `TrafficControl`, `Cors`, `CustomReq`, `CustomAuth`, `Routing`, `TrafficControlByParameter`, `CircuitBreaker`, `ProxyCache`
     * @param PluginType Plugin type. Valid values: `IPControl`, `TrafficControl`, `Cors`, `CustomReq`, `CustomAuth`, `Routing`, `TrafficControlByParameter`, `CircuitBreaker`, `ProxyCache`
     */
    public void setPluginType(String PluginType) {
        this.PluginType = PluginType;
    }

    /**
     * Get Plugin definition statement in json format 
     * @return PluginData Plugin definition statement in json format
     */
    public String getPluginData() {
        return this.PluginData;
    }

    /**
     * Set Plugin definition statement in json format
     * @param PluginData Plugin definition statement in json format
     */
    public void setPluginData(String PluginData) {
        this.PluginData = PluginData;
    }

    /**
     * Get Plugin description within 200 characters 
     * @return Description Plugin description within 200 characters
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Plugin description within 200 characters
     * @param Description Plugin description within 200 characters
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Label 
     * @return Tags Label
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Label
     * @param Tags Label
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreatePluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePluginRequest(CreatePluginRequest source) {
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginType != null) {
            this.PluginType = new String(source.PluginType);
        }
        if (source.PluginData != null) {
            this.PluginData = new String(source.PluginData);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "PluginData", this.PluginData);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

