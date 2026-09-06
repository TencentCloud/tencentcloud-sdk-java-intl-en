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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("RangeMin")
    @Expose
    private Float RangeMin;

    /**
    * 
    */
    @SerializedName("RangeMax")
    @Expose
    private Float RangeMax;

    /**
    * 
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get  
     * @return RangeMin 
     */
    public Float getRangeMin() {
        return this.RangeMin;
    }

    /**
     * Set 
     * @param RangeMin 
     */
    public void setRangeMin(Float RangeMin) {
        this.RangeMin = RangeMin;
    }

    /**
     * Get  
     * @return RangeMax 
     */
    public Float getRangeMax() {
        return this.RangeMax;
    }

    /**
     * Set 
     * @param RangeMax 
     */
    public void setRangeMax(Float RangeMax) {
        this.RangeMax = RangeMax;
    }

    /**
     * Get  
     * @return ResourceType 
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 
     * @param ResourceType 
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public AutoScalingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalingConfig(AutoScalingConfig source) {
        if (source.RangeMin != null) {
            this.RangeMin = new Float(source.RangeMin);
        }
        if (source.RangeMax != null) {
            this.RangeMax = new Float(source.RangeMax);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RangeMin", this.RangeMin);
        this.setParamSimple(map, prefix + "RangeMax", this.RangeMax);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

