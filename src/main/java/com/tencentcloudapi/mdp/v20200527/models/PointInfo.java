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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PointInfo extends AbstractModel{

    /**
    * Channel input list.
    */
    @SerializedName("Inputs")
    @Expose
    private InputInfo [] Inputs;

    /**
    * Channel output list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointInfo [] Endpoints;

    /**
     * Get Channel input list. 
     * @return Inputs Channel input list.
     */
    public InputInfo [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set Channel input list.
     * @param Inputs Channel input list.
     */
    public void setInputs(InputInfo [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get Channel output list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Endpoints Channel output list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public EndpointInfo [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set Channel output list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Endpoints Channel output list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndpoints(EndpointInfo [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    public PointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PointInfo(PointInfo source) {
        if (source.Inputs != null) {
            this.Inputs = new InputInfo[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new InputInfo(source.Inputs[i]);
            }
        }
        if (source.Endpoints != null) {
            this.Endpoints = new EndpointInfo[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new EndpointInfo(source.Endpoints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);

    }
}

