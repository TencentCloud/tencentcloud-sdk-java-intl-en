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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindInstanceInfo extends AbstractModel {

    /**
    * Bound cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Region of the bound instance
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * Bound instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance ID under the bound cluster
    */
    @SerializedName("ExtendIds")
    @Expose
    private String [] ExtendIds;

    /**
     * Get Bound cluster ID. 
     * @return InstanceId Bound cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Bound cluster ID.
     * @param InstanceId Bound cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Region of the bound instance 
     * @return InstanceRegion Region of the bound instance
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set Region of the bound instance
     * @param InstanceRegion Region of the bound instance
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get Bound instance type 
     * @return InstanceType Bound instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Bound instance type
     * @param InstanceType Bound instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance ID under the bound cluster 
     * @return ExtendIds Instance ID under the bound cluster
     */
    public String [] getExtendIds() {
        return this.ExtendIds;
    }

    /**
     * Set Instance ID under the bound cluster
     * @param ExtendIds Instance ID under the bound cluster
     */
    public void setExtendIds(String [] ExtendIds) {
        this.ExtendIds = ExtendIds;
    }

    public BindInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindInstanceInfo(BindInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ExtendIds != null) {
            this.ExtendIds = new String[source.ExtendIds.length];
            for (int i = 0; i < source.ExtendIds.length; i++) {
                this.ExtendIds[i] = new String(source.ExtendIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "ExtendIds.", this.ExtendIds);

    }
}

