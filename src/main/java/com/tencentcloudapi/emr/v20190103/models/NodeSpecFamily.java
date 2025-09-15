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

public class NodeSpecFamily extends AbstractModel {

    /**
    * Model.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Model name.
    */
    @SerializedName("FamilyName")
    @Expose
    private String FamilyName;

    /**
    * Order.
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * InstanceType List.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceTypes")
    @Expose
    private NodeSpecInstanceType [] InstanceTypes;

    /**
     * Get Model. 
     * @return InstanceFamily Model.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Model.
     * @param InstanceFamily Model.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get Model name. 
     * @return FamilyName Model name.
     */
    public String getFamilyName() {
        return this.FamilyName;
    }

    /**
     * Set Model name.
     * @param FamilyName Model name.
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
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
     * Get InstanceType List.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceTypes InstanceType List.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeSpecInstanceType [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set InstanceType List.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceTypes InstanceType List.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceTypes(NodeSpecInstanceType [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    public NodeSpecFamily() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSpecFamily(NodeSpecFamily source) {
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.FamilyName != null) {
            this.FamilyName = new String(source.FamilyName);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new NodeSpecInstanceType[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new NodeSpecInstanceType(source.InstanceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "FamilyName", this.FamilyName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "InstanceTypes.", this.InstanceTypes);

    }
}

