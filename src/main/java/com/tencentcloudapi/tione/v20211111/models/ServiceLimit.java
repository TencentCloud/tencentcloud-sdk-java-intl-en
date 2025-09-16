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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceLimit extends AbstractModel {

    /**
    * Whether to enable throttling and speed limit at the instance level. Valid values: true and false. If the value is true, InstanceRpsLimit is required. If the value is false, InstanceRpsLimit does not take effect.
    */
    @SerializedName("EnableInstanceRpsLimit")
    @Expose
    private Boolean EnableInstanceRpsLimit;

    /**
    * Speed limit for the requests per second (RPS) of each service instance. 0 indicates no throttling.
    */
    @SerializedName("InstanceRpsLimit")
    @Expose
    private Long InstanceRpsLimit;

    /**
    * Whether to enable the maximum concurrency quantity limit for a single instance. Valid values: true and false. If the value is true, InstanceReqLimit is required. If the value is false, InstanceReqLimit does not take effect.
    */
    @SerializedName("EnableInstanceReqLimit")
    @Expose
    private Boolean EnableInstanceReqLimit;

    /**
    * Maximum concurrency for each service instance.
    */
    @SerializedName("InstanceReqLimit")
    @Expose
    private Long InstanceReqLimit;

    /**
     * Get Whether to enable throttling and speed limit at the instance level. Valid values: true and false. If the value is true, InstanceRpsLimit is required. If the value is false, InstanceRpsLimit does not take effect. 
     * @return EnableInstanceRpsLimit Whether to enable throttling and speed limit at the instance level. Valid values: true and false. If the value is true, InstanceRpsLimit is required. If the value is false, InstanceRpsLimit does not take effect.
     */
    public Boolean getEnableInstanceRpsLimit() {
        return this.EnableInstanceRpsLimit;
    }

    /**
     * Set Whether to enable throttling and speed limit at the instance level. Valid values: true and false. If the value is true, InstanceRpsLimit is required. If the value is false, InstanceRpsLimit does not take effect.
     * @param EnableInstanceRpsLimit Whether to enable throttling and speed limit at the instance level. Valid values: true and false. If the value is true, InstanceRpsLimit is required. If the value is false, InstanceRpsLimit does not take effect.
     */
    public void setEnableInstanceRpsLimit(Boolean EnableInstanceRpsLimit) {
        this.EnableInstanceRpsLimit = EnableInstanceRpsLimit;
    }

    /**
     * Get Speed limit for the requests per second (RPS) of each service instance. 0 indicates no throttling. 
     * @return InstanceRpsLimit Speed limit for the requests per second (RPS) of each service instance. 0 indicates no throttling.
     */
    public Long getInstanceRpsLimit() {
        return this.InstanceRpsLimit;
    }

    /**
     * Set Speed limit for the requests per second (RPS) of each service instance. 0 indicates no throttling.
     * @param InstanceRpsLimit Speed limit for the requests per second (RPS) of each service instance. 0 indicates no throttling.
     */
    public void setInstanceRpsLimit(Long InstanceRpsLimit) {
        this.InstanceRpsLimit = InstanceRpsLimit;
    }

    /**
     * Get Whether to enable the maximum concurrency quantity limit for a single instance. Valid values: true and false. If the value is true, InstanceReqLimit is required. If the value is false, InstanceReqLimit does not take effect. 
     * @return EnableInstanceReqLimit Whether to enable the maximum concurrency quantity limit for a single instance. Valid values: true and false. If the value is true, InstanceReqLimit is required. If the value is false, InstanceReqLimit does not take effect.
     */
    public Boolean getEnableInstanceReqLimit() {
        return this.EnableInstanceReqLimit;
    }

    /**
     * Set Whether to enable the maximum concurrency quantity limit for a single instance. Valid values: true and false. If the value is true, InstanceReqLimit is required. If the value is false, InstanceReqLimit does not take effect.
     * @param EnableInstanceReqLimit Whether to enable the maximum concurrency quantity limit for a single instance. Valid values: true and false. If the value is true, InstanceReqLimit is required. If the value is false, InstanceReqLimit does not take effect.
     */
    public void setEnableInstanceReqLimit(Boolean EnableInstanceReqLimit) {
        this.EnableInstanceReqLimit = EnableInstanceReqLimit;
    }

    /**
     * Get Maximum concurrency for each service instance. 
     * @return InstanceReqLimit Maximum concurrency for each service instance.
     */
    public Long getInstanceReqLimit() {
        return this.InstanceReqLimit;
    }

    /**
     * Set Maximum concurrency for each service instance.
     * @param InstanceReqLimit Maximum concurrency for each service instance.
     */
    public void setInstanceReqLimit(Long InstanceReqLimit) {
        this.InstanceReqLimit = InstanceReqLimit;
    }

    public ServiceLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceLimit(ServiceLimit source) {
        if (source.EnableInstanceRpsLimit != null) {
            this.EnableInstanceRpsLimit = new Boolean(source.EnableInstanceRpsLimit);
        }
        if (source.InstanceRpsLimit != null) {
            this.InstanceRpsLimit = new Long(source.InstanceRpsLimit);
        }
        if (source.EnableInstanceReqLimit != null) {
            this.EnableInstanceReqLimit = new Boolean(source.EnableInstanceReqLimit);
        }
        if (source.InstanceReqLimit != null) {
            this.InstanceReqLimit = new Long(source.InstanceReqLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableInstanceRpsLimit", this.EnableInstanceRpsLimit);
        this.setParamSimple(map, prefix + "InstanceRpsLimit", this.InstanceRpsLimit);
        this.setParamSimple(map, prefix + "EnableInstanceReqLimit", this.EnableInstanceReqLimit);
        this.setParamSimple(map, prefix + "InstanceReqLimit", this.InstanceReqLimit);

    }
}

