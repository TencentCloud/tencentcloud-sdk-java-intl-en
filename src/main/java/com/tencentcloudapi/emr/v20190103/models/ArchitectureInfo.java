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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ArchitectureInfo extends AbstractModel {

    /**
    * <p>Architecture type.</p>
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * <p>Architecture type name.</p>
    */
    @SerializedName("ArchitectureName")
    @Expose
    private String ArchitectureName;

    /**
    * <p>Architecture type display order.</p>
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * <p>Instance specification families included in the architecture.</p>
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private String [] InstanceFamilies;

    /**
     * Get <p>Architecture type.</p> 
     * @return Architecture <p>Architecture type.</p>
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set <p>Architecture type.</p>
     * @param Architecture <p>Architecture type.</p>
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get <p>Architecture type name.</p> 
     * @return ArchitectureName <p>Architecture type name.</p>
     */
    public String getArchitectureName() {
        return this.ArchitectureName;
    }

    /**
     * Set <p>Architecture type name.</p>
     * @param ArchitectureName <p>Architecture type name.</p>
     */
    public void setArchitectureName(String ArchitectureName) {
        this.ArchitectureName = ArchitectureName;
    }

    /**
     * Get <p>Architecture type display order.</p> 
     * @return Order <p>Architecture type display order.</p>
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Architecture type display order.</p>
     * @param Order <p>Architecture type display order.</p>
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Instance specification families included in the architecture.</p> 
     * @return InstanceFamilies <p>Instance specification families included in the architecture.</p>
     */
    public String [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * Set <p>Instance specification families included in the architecture.</p>
     * @param InstanceFamilies <p>Instance specification families included in the architecture.</p>
     */
    public void setInstanceFamilies(String [] InstanceFamilies) {
        this.InstanceFamilies = InstanceFamilies;
    }

    public ArchitectureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArchitectureInfo(ArchitectureInfo source) {
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.ArchitectureName != null) {
            this.ArchitectureName = new String(source.ArchitectureName);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.InstanceFamilies != null) {
            this.InstanceFamilies = new String[source.InstanceFamilies.length];
            for (int i = 0; i < source.InstanceFamilies.length; i++) {
                this.InstanceFamilies[i] = new String(source.InstanceFamilies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "ArchitectureName", this.ArchitectureName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "InstanceFamilies.", this.InstanceFamilies);

    }
}

