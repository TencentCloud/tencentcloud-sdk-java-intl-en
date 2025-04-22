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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleUpInstanceRequest extends AbstractModel {

    /**
    * InstanceId.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Modifies the resource type.
    */
    @SerializedName("Case")
    @Expose
    private String Case;

    /**
    * Modified parameters.
    */
    @SerializedName("ModifySpec")
    @Expose
    private CNResourceSpec ModifySpec;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get InstanceId. 
     * @return InstanceId InstanceId.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set InstanceId.
     * @param InstanceId InstanceId.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Modifies the resource type. 
     * @return Case Modifies the resource type.
     */
    public String getCase() {
        return this.Case;
    }

    /**
     * Set Modifies the resource type.
     * @param Case Modifies the resource type.
     */
    public void setCase(String Case) {
        this.Case = Case;
    }

    /**
     * Get Modified parameters. 
     * @return ModifySpec Modified parameters.
     */
    public CNResourceSpec getModifySpec() {
        return this.ModifySpec;
    }

    /**
     * Set Modified parameters.
     * @param ModifySpec Modified parameters.
     */
    public void setModifySpec(CNResourceSpec ModifySpec) {
        this.ModifySpec = ModifySpec;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public ScaleUpInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleUpInstanceRequest(ScaleUpInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Case != null) {
            this.Case = new String(source.Case);
        }
        if (source.ModifySpec != null) {
            this.ModifySpec = new CNResourceSpec(source.ModifySpec);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Case", this.Case);
        this.setParamObj(map, prefix + "ModifySpec.", this.ModifySpec);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

