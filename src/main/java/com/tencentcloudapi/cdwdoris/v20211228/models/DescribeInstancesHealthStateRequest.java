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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesHealthStateRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * If this parameter is left blank, all clusters corresponding to the current appId are involved. Otherwise, a specific cluster is involved.
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
     * Get Cluster ID 
     * @return InstanceID Cluster ID
     * @deprecated
     */
    @Deprecated
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Cluster ID
     * @param InstanceID Cluster ID
     * @deprecated
     */
    @Deprecated
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get If this parameter is left blank, all clusters corresponding to the current appId are involved. Otherwise, a specific cluster is involved. 
     * @return Input If this parameter is left blank, all clusters corresponding to the current appId are involved. Otherwise, a specific cluster is involved.
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set If this parameter is left blank, all clusters corresponding to the current appId are involved. Otherwise, a specific cluster is involved.
     * @param Input If this parameter is left blank, all clusters corresponding to the current appId are involved. Otherwise, a specific cluster is involved.
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    public DescribeInstancesHealthStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesHealthStateRequest(DescribeInstancesHealthStateRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Input", this.Input);

    }
}

