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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpotMixedAllocationPolicy extends AbstractModel{

    /**
    * 
    */
    @SerializedName("BaseCapacity")
    @Expose
    private Long BaseCapacity;

    /**
    * 
    */
    @SerializedName("OnDemandPercentageAboveBaseCapacity")
    @Expose
    private Long OnDemandPercentageAboveBaseCapacity;

    /**
    * 
    */
    @SerializedName("SpotAllocationStrategy")
    @Expose
    private String SpotAllocationStrategy;

    /**
    * 
    */
    @SerializedName("CompensateWithBaseInstance")
    @Expose
    private Boolean CompensateWithBaseInstance;

    /**
     * Get  
     * @return BaseCapacity 
     */
    public Long getBaseCapacity() {
        return this.BaseCapacity;
    }

    /**
     * Set 
     * @param BaseCapacity 
     */
    public void setBaseCapacity(Long BaseCapacity) {
        this.BaseCapacity = BaseCapacity;
    }

    /**
     * Get  
     * @return OnDemandPercentageAboveBaseCapacity 
     */
    public Long getOnDemandPercentageAboveBaseCapacity() {
        return this.OnDemandPercentageAboveBaseCapacity;
    }

    /**
     * Set 
     * @param OnDemandPercentageAboveBaseCapacity 
     */
    public void setOnDemandPercentageAboveBaseCapacity(Long OnDemandPercentageAboveBaseCapacity) {
        this.OnDemandPercentageAboveBaseCapacity = OnDemandPercentageAboveBaseCapacity;
    }

    /**
     * Get  
     * @return SpotAllocationStrategy 
     */
    public String getSpotAllocationStrategy() {
        return this.SpotAllocationStrategy;
    }

    /**
     * Set 
     * @param SpotAllocationStrategy 
     */
    public void setSpotAllocationStrategy(String SpotAllocationStrategy) {
        this.SpotAllocationStrategy = SpotAllocationStrategy;
    }

    /**
     * Get  
     * @return CompensateWithBaseInstance 
     */
    public Boolean getCompensateWithBaseInstance() {
        return this.CompensateWithBaseInstance;
    }

    /**
     * Set 
     * @param CompensateWithBaseInstance 
     */
    public void setCompensateWithBaseInstance(Boolean CompensateWithBaseInstance) {
        this.CompensateWithBaseInstance = CompensateWithBaseInstance;
    }

    public SpotMixedAllocationPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpotMixedAllocationPolicy(SpotMixedAllocationPolicy source) {
        if (source.BaseCapacity != null) {
            this.BaseCapacity = new Long(source.BaseCapacity);
        }
        if (source.OnDemandPercentageAboveBaseCapacity != null) {
            this.OnDemandPercentageAboveBaseCapacity = new Long(source.OnDemandPercentageAboveBaseCapacity);
        }
        if (source.SpotAllocationStrategy != null) {
            this.SpotAllocationStrategy = new String(source.SpotAllocationStrategy);
        }
        if (source.CompensateWithBaseInstance != null) {
            this.CompensateWithBaseInstance = new Boolean(source.CompensateWithBaseInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaseCapacity", this.BaseCapacity);
        this.setParamSimple(map, prefix + "OnDemandPercentageAboveBaseCapacity", this.OnDemandPercentageAboveBaseCapacity);
        this.setParamSimple(map, prefix + "SpotAllocationStrategy", this.SpotAllocationStrategy);
        this.setParamSimple(map, prefix + "CompensateWithBaseInstance", this.CompensateWithBaseInstance);

    }
}

