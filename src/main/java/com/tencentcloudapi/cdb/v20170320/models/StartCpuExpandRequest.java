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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartCpuExpandRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Scale-out mode. Valid values: auto and
manual.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Number of CPU cores to increase during manual scale-out. This parameter is required when Type is set to manual.
    */
    @SerializedName("ExpandCpu")
    @Expose
    private Long ExpandCpu;

    /**
    * Automatic scale-out policy. This parameter is required when Type is set to auto.
    */
    @SerializedName("AutoStrategy")
    @Expose
    private AutoStrategy AutoStrategy;

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

    /**
     * Get Scale-out mode. Valid values: auto and
manual. 
     * @return Type Scale-out mode. Valid values: auto and
manual.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Scale-out mode. Valid values: auto and
manual.
     * @param Type Scale-out mode. Valid values: auto and
manual.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Number of CPU cores to increase during manual scale-out. This parameter is required when Type is set to manual. 
     * @return ExpandCpu Number of CPU cores to increase during manual scale-out. This parameter is required when Type is set to manual.
     */
    public Long getExpandCpu() {
        return this.ExpandCpu;
    }

    /**
     * Set Number of CPU cores to increase during manual scale-out. This parameter is required when Type is set to manual.
     * @param ExpandCpu Number of CPU cores to increase during manual scale-out. This parameter is required when Type is set to manual.
     */
    public void setExpandCpu(Long ExpandCpu) {
        this.ExpandCpu = ExpandCpu;
    }

    /**
     * Get Automatic scale-out policy. This parameter is required when Type is set to auto. 
     * @return AutoStrategy Automatic scale-out policy. This parameter is required when Type is set to auto.
     */
    public AutoStrategy getAutoStrategy() {
        return this.AutoStrategy;
    }

    /**
     * Set Automatic scale-out policy. This parameter is required when Type is set to auto.
     * @param AutoStrategy Automatic scale-out policy. This parameter is required when Type is set to auto.
     */
    public void setAutoStrategy(AutoStrategy AutoStrategy) {
        this.AutoStrategy = AutoStrategy;
    }

    public StartCpuExpandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartCpuExpandRequest(StartCpuExpandRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExpandCpu != null) {
            this.ExpandCpu = new Long(source.ExpandCpu);
        }
        if (source.AutoStrategy != null) {
            this.AutoStrategy = new AutoStrategy(source.AutoStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpandCpu", this.ExpandCpu);
        this.setParamObj(map, prefix + "AutoStrategy.", this.AutoStrategy);

    }
}

