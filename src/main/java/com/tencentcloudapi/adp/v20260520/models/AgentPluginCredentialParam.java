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

public class AgentPluginCredentialParam extends AbstractModel {

    /**
    * <p>Parameter location</p><p>Enumeration values:</p><ul><li>0: Header authentication</li><li>1: Query authentication</li></ul>
    */
    @SerializedName("KeyLocation")
    @Expose
    private Long KeyLocation;

    /**
    * <p>Parameter name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Source of parameter value</p>
    */
    @SerializedName("Input")
    @Expose
    private AgentInput Input;

    /**
     * Get <p>Parameter location</p><p>Enumeration values:</p><ul><li>0: Header authentication</li><li>1: Query authentication</li></ul> 
     * @return KeyLocation <p>Parameter location</p><p>Enumeration values:</p><ul><li>0: Header authentication</li><li>1: Query authentication</li></ul>
     */
    public Long getKeyLocation() {
        return this.KeyLocation;
    }

    /**
     * Set <p>Parameter location</p><p>Enumeration values:</p><ul><li>0: Header authentication</li><li>1: Query authentication</li></ul>
     * @param KeyLocation <p>Parameter location</p><p>Enumeration values:</p><ul><li>0: Header authentication</li><li>1: Query authentication</li></ul>
     */
    public void setKeyLocation(Long KeyLocation) {
        this.KeyLocation = KeyLocation;
    }

    /**
     * Get <p>Parameter name</p> 
     * @return Name <p>Parameter name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Parameter name</p>
     * @param Name <p>Parameter name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Source of parameter value</p> 
     * @return Input <p>Source of parameter value</p>
     */
    public AgentInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>Source of parameter value</p>
     * @param Input <p>Source of parameter value</p>
     */
    public void setInput(AgentInput Input) {
        this.Input = Input;
    }

    public AgentPluginCredentialParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginCredentialParam(AgentPluginCredentialParam source) {
        if (source.KeyLocation != null) {
            this.KeyLocation = new Long(source.KeyLocation);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Input != null) {
            this.Input = new AgentInput(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyLocation", this.KeyLocation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}

