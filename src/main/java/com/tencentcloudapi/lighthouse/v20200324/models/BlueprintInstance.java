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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlueprintInstance extends AbstractModel {

    /**
    * Image information.
    */
    @SerializedName("Blueprint")
    @Expose
    private Blueprint Blueprint;

    /**
    * Software list.
    */
    @SerializedName("SoftwareSet")
    @Expose
    private Software [] SoftwareSet;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Image information. 
     * @return Blueprint Image information.
     */
    public Blueprint getBlueprint() {
        return this.Blueprint;
    }

    /**
     * Set Image information.
     * @param Blueprint Image information.
     */
    public void setBlueprint(Blueprint Blueprint) {
        this.Blueprint = Blueprint;
    }

    /**
     * Get Software list. 
     * @return SoftwareSet Software list.
     */
    public Software [] getSoftwareSet() {
        return this.SoftwareSet;
    }

    /**
     * Set Software list.
     * @param SoftwareSet Software list.
     */
    public void setSoftwareSet(Software [] SoftwareSet) {
        this.SoftwareSet = SoftwareSet;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public BlueprintInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlueprintInstance(BlueprintInstance source) {
        if (source.Blueprint != null) {
            this.Blueprint = new Blueprint(source.Blueprint);
        }
        if (source.SoftwareSet != null) {
            this.SoftwareSet = new Software[source.SoftwareSet.length];
            for (int i = 0; i < source.SoftwareSet.length; i++) {
                this.SoftwareSet[i] = new Software(source.SoftwareSet[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Blueprint.", this.Blueprint);
        this.setParamArrayObj(map, prefix + "SoftwareSet.", this.SoftwareSet);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

