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

public class ReservedInstanceConfigInfoItem extends AbstractModel{

    /**
    * Abbreviation name of the instance type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Full name of the instance type.
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Priority.
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * List of instance families.
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private ReservedInstanceFamilyItem [] InstanceFamilies;

    /**
     * Get Abbreviation name of the instance type. 
     * @return Type Abbreviation name of the instance type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Abbreviation name of the instance type.
     * @param Type Abbreviation name of the instance type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Full name of the instance type. 
     * @return TypeName Full name of the instance type.
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Full name of the instance type.
     * @param TypeName Full name of the instance type.
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
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
     * Get List of instance families. 
     * @return InstanceFamilies List of instance families.
     */
    public ReservedInstanceFamilyItem [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * Set List of instance families.
     * @param InstanceFamilies List of instance families.
     */
    public void setInstanceFamilies(ReservedInstanceFamilyItem [] InstanceFamilies) {
        this.InstanceFamilies = InstanceFamilies;
    }

    public ReservedInstanceConfigInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstanceConfigInfoItem(ReservedInstanceConfigInfoItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.InstanceFamilies != null) {
            this.InstanceFamilies = new ReservedInstanceFamilyItem[source.InstanceFamilies.length];
            for (int i = 0; i < source.InstanceFamilies.length; i++) {
                this.InstanceFamilies[i] = new ReservedInstanceFamilyItem(source.InstanceFamilies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "InstanceFamilies.", this.InstanceFamilies);

    }
}

