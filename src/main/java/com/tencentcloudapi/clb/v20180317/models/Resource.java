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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel{

    /**
    * Specific ISP resource information, Vaules: `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`.
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * ISP information, such as `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`.
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * Available resources
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailabilitySet")
    @Expose
    private ResourceAvailability [] AvailabilitySet;

    /**
     * Get Specific ISP resource information, Vaules: `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`. 
     * @return Type Specific ISP resource information, Vaules: `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`.
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set Specific ISP resource information, Vaules: `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`.
     * @param Type Specific ISP resource information, Vaules: `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`.
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get ISP information, such as `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`. 
     * @return Isp ISP information, such as `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`.
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set ISP information, such as `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`.
     * @param Isp ISP information, such as `CMCC`, `CUCC`, `CTCC`, `BGP`, and `INTERNAL`.
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get Available resources
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AvailabilitySet Available resources
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public ResourceAvailability [] getAvailabilitySet() {
        return this.AvailabilitySet;
    }

    /**
     * Set Available resources
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AvailabilitySet Available resources
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAvailabilitySet(ResourceAvailability [] AvailabilitySet) {
        this.AvailabilitySet = AvailabilitySet;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.AvailabilitySet != null) {
            this.AvailabilitySet = new ResourceAvailability[source.AvailabilitySet.length];
            for (int i = 0; i < source.AvailabilitySet.length; i++) {
                this.AvailabilitySet[i] = new ResourceAvailability(source.AvailabilitySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamArrayObj(map, prefix + "AvailabilitySet.", this.AvailabilitySet);

    }
}

