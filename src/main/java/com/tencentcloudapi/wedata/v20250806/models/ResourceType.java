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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceType extends AbstractModel {

    /**
    * Resource group type

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
    */
    @SerializedName("ResourceGroupType")
    @Expose
    private String ResourceGroupType;

    /**
    * Integration resource group, segmentation of real-time resource group and offline resource group (simultaneous purchase of integration, scheduling, and data service resource group not allowed).
    */
    @SerializedName("Integration")
    @Expose
    private IntegrationResource Integration;

    /**
    * Scheduling resource group (simultaneous purchase of integration, scheduling, and data service resource groups is not allowed).

-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).



    */
    @SerializedName("Schedule")
    @Expose
    private ResourceGroupSpecification Schedule;

    /**
    * Data service resource group (seamless integration, scheduling, simultaneous purchase not allowed).

-ds_t(Test specification).
-ds_s (basic specification).
-ds_m (general specifications).
-ds_l (professional specification).
    */
    @SerializedName("DataService")
    @Expose
    private ResourceGroupSpecification DataService;

    /**
     * Get Resource group type

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group. 
     * @return ResourceGroupType Resource group type

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
     */
    public String getResourceGroupType() {
        return this.ResourceGroupType;
    }

    /**
     * Set Resource group type

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
     * @param ResourceGroupType Resource group type

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
     */
    public void setResourceGroupType(String ResourceGroupType) {
        this.ResourceGroupType = ResourceGroupType;
    }

    /**
     * Get Integration resource group, segmentation of real-time resource group and offline resource group (simultaneous purchase of integration, scheduling, and data service resource group not allowed). 
     * @return Integration Integration resource group, segmentation of real-time resource group and offline resource group (simultaneous purchase of integration, scheduling, and data service resource group not allowed).
     */
    public IntegrationResource getIntegration() {
        return this.Integration;
    }

    /**
     * Set Integration resource group, segmentation of real-time resource group and offline resource group (simultaneous purchase of integration, scheduling, and data service resource group not allowed).
     * @param Integration Integration resource group, segmentation of real-time resource group and offline resource group (simultaneous purchase of integration, scheduling, and data service resource group not allowed).
     */
    public void setIntegration(IntegrationResource Integration) {
        this.Integration = Integration;
    }

    /**
     * Get Scheduling resource group (simultaneous purchase of integration, scheduling, and data service resource groups is not allowed).

-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).


 
     * @return Schedule Scheduling resource group (simultaneous purchase of integration, scheduling, and data service resource groups is not allowed).

-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).



     */
    public ResourceGroupSpecification getSchedule() {
        return this.Schedule;
    }

    /**
     * Set Scheduling resource group (simultaneous purchase of integration, scheduling, and data service resource groups is not allowed).

-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).



     * @param Schedule Scheduling resource group (simultaneous purchase of integration, scheduling, and data service resource groups is not allowed).

-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).



     */
    public void setSchedule(ResourceGroupSpecification Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get Data service resource group (seamless integration, scheduling, simultaneous purchase not allowed).

-ds_t(Test specification).
-ds_s (basic specification).
-ds_m (general specifications).
-ds_l (professional specification). 
     * @return DataService Data service resource group (seamless integration, scheduling, simultaneous purchase not allowed).

-ds_t(Test specification).
-ds_s (basic specification).
-ds_m (general specifications).
-ds_l (professional specification).
     */
    public ResourceGroupSpecification getDataService() {
        return this.DataService;
    }

    /**
     * Set Data service resource group (seamless integration, scheduling, simultaneous purchase not allowed).

-ds_t(Test specification).
-ds_s (basic specification).
-ds_m (general specifications).
-ds_l (professional specification).
     * @param DataService Data service resource group (seamless integration, scheduling, simultaneous purchase not allowed).

-ds_t(Test specification).
-ds_s (basic specification).
-ds_m (general specifications).
-ds_l (professional specification).
     */
    public void setDataService(ResourceGroupSpecification DataService) {
        this.DataService = DataService;
    }

    public ResourceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceType(ResourceType source) {
        if (source.ResourceGroupType != null) {
            this.ResourceGroupType = new String(source.ResourceGroupType);
        }
        if (source.Integration != null) {
            this.Integration = new IntegrationResource(source.Integration);
        }
        if (source.Schedule != null) {
            this.Schedule = new ResourceGroupSpecification(source.Schedule);
        }
        if (source.DataService != null) {
            this.DataService = new ResourceGroupSpecification(source.DataService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupType", this.ResourceGroupType);
        this.setParamObj(map, prefix + "Integration.", this.Integration);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);
        this.setParamObj(map, prefix + "DataService.", this.DataService);

    }
}

