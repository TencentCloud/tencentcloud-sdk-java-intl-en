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

public class NodeSpecType extends AbstractModel {

    /**
    * Instance type series.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Instance type series name.
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Sorting order.
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * Array of instance families.
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private NodeSpecFamily [] InstanceFamilies;

    /**
     * Get Instance type series. 
     * @return Type Instance type series.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance type series.
     * @param Type Instance type series.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Instance type series name. 
     * @return TypeName Instance type series name.
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Instance type series name.
     * @param TypeName Instance type series name.
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Sorting order. 
     * @return Order Sorting order.
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order.
     * @param Order Sorting order.
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get Array of instance families. 
     * @return InstanceFamilies Array of instance families.
     */
    public NodeSpecFamily [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * Set Array of instance families.
     * @param InstanceFamilies Array of instance families.
     */
    public void setInstanceFamilies(NodeSpecFamily [] InstanceFamilies) {
        this.InstanceFamilies = InstanceFamilies;
    }

    public NodeSpecType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSpecType(NodeSpecType source) {
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
            this.InstanceFamilies = new NodeSpecFamily[source.InstanceFamilies.length];
            for (int i = 0; i < source.InstanceFamilies.length; i++) {
                this.InstanceFamilies[i] = new NodeSpecFamily(source.InstanceFamilies[i]);
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

