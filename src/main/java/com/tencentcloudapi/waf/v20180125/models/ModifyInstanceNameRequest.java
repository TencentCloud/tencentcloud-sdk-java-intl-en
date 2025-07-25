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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceNameRequest extends AbstractModel {

    /**
    * New name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Version
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
     * Get New name. 
     * @return InstanceName New name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set New name.
     * @param InstanceName New name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Version 
     * @return Edition Version
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Version
     * @param Edition Version
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    public ModifyInstanceNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceNameRequest(ModifyInstanceNameRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Edition", this.Edition);

    }
}

