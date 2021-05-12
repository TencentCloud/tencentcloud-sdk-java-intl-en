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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstanceFamilyItem extends AbstractModel{

    /**
    * Instance family.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Priority.
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * List of instance types.
    */
    @SerializedName("InstanceTypes")
    @Expose
    private ReservedInstanceTypeItem [] InstanceTypes;

    /**
     * Get Instance family. 
     * @return InstanceFamily Instance family.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Instance family.
     * @param InstanceFamily Instance family.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get Priority. 
     * @return Order Priority.
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Priority.
     * @param Order Priority.
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get List of instance types. 
     * @return InstanceTypes List of instance types.
     */
    public ReservedInstanceTypeItem [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set List of instance types.
     * @param InstanceTypes List of instance types.
     */
    public void setInstanceTypes(ReservedInstanceTypeItem [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    public ReservedInstanceFamilyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstanceFamilyItem(ReservedInstanceFamilyItem source) {
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new ReservedInstanceTypeItem[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new ReservedInstanceTypeItem(source.InstanceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "InstanceTypes.", this.InstanceTypes);

    }
}

