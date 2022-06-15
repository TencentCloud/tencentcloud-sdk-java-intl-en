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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecificationInfo extends AbstractModel{

    /**
    * Region information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * AZ information
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Purchasable specification information
    */
    @SerializedName("SpecItems")
    @Expose
    private SpecItem [] SpecItems;

    /**
    * Whether cross-AZ deployment is supported. Valid values: `1` (yes), `0` (no).
    */
    @SerializedName("SupportMultiAZ")
    @Expose
    private Long SupportMultiAZ;

    /**
     * Get Region information 
     * @return Region Region information
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information
     * @param Region Region information
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get AZ information 
     * @return Zone AZ information
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ information
     * @param Zone AZ information
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Purchasable specification information 
     * @return SpecItems Purchasable specification information
     */
    public SpecItem [] getSpecItems() {
        return this.SpecItems;
    }

    /**
     * Set Purchasable specification information
     * @param SpecItems Purchasable specification information
     */
    public void setSpecItems(SpecItem [] SpecItems) {
        this.SpecItems = SpecItems;
    }

    /**
     * Get Whether cross-AZ deployment is supported. Valid values: `1` (yes), `0` (no). 
     * @return SupportMultiAZ Whether cross-AZ deployment is supported. Valid values: `1` (yes), `0` (no).
     */
    public Long getSupportMultiAZ() {
        return this.SupportMultiAZ;
    }

    /**
     * Set Whether cross-AZ deployment is supported. Valid values: `1` (yes), `0` (no).
     * @param SupportMultiAZ Whether cross-AZ deployment is supported. Valid values: `1` (yes), `0` (no).
     */
    public void setSupportMultiAZ(Long SupportMultiAZ) {
        this.SupportMultiAZ = SupportMultiAZ;
    }

    public SpecificationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecificationInfo(SpecificationInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SpecItems != null) {
            this.SpecItems = new SpecItem[source.SpecItems.length];
            for (int i = 0; i < source.SpecItems.length; i++) {
                this.SpecItems[i] = new SpecItem(source.SpecItems[i]);
            }
        }
        if (source.SupportMultiAZ != null) {
            this.SupportMultiAZ = new Long(source.SupportMultiAZ);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SpecItems.", this.SpecItems);
        this.setParamSimple(map, prefix + "SupportMultiAZ", this.SupportMultiAZ);

    }
}

