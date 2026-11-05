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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentExternalToolConfig extends AbstractModel {

    /**
    * <p>Tool type</p><p>Input parameter limit: currently only support "function"</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Tool name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Tool description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Tool input parameter definition</p>
    */
    @SerializedName("Parameters")
    @Expose
    private RequestParam [] Parameters;

    /**
     * Get <p>Tool type</p><p>Input parameter limit: currently only support "function"</p> 
     * @return Type <p>Tool type</p><p>Input parameter limit: currently only support "function"</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Tool type</p><p>Input parameter limit: currently only support "function"</p>
     * @param Type <p>Tool type</p><p>Input parameter limit: currently only support "function"</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Tool name</p> 
     * @return Name <p>Tool name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Tool name</p>
     * @param Name <p>Tool name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Tool description</p> 
     * @return Description <p>Tool description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Tool description</p>
     * @param Description <p>Tool description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Tool input parameter definition</p> 
     * @return Parameters <p>Tool input parameter definition</p>
     */
    public RequestParam [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>Tool input parameter definition</p>
     * @param Parameters <p>Tool input parameter definition</p>
     */
    public void setParameters(RequestParam [] Parameters) {
        this.Parameters = Parameters;
    }

    public AgentExternalToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentExternalToolConfig(AgentExternalToolConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Parameters != null) {
            this.Parameters = new RequestParam[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new RequestParam(source.Parameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);

    }
}

