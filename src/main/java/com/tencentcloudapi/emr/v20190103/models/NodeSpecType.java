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
    * Model series.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Model series name.
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Order.
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * InstanceFamily array.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private NodeSpecFamily [] InstanceFamilies;

    /**
     * Get Model series. 
     * @return Type Model series.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Model series.
     * @param Type Model series.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Model series name. 
     * @return TypeName Model series name.
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Model series name.
     * @param TypeName Model series name.
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Order. 
     * @return Order Order.
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Order.
     * @param Order Order.
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get InstanceFamily array.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceFamilies InstanceFamily array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeSpecFamily [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * Set InstanceFamily array.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceFamilies InstanceFamily array.
Note: This field may return null, indicating that no valid values can be obtained.
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

