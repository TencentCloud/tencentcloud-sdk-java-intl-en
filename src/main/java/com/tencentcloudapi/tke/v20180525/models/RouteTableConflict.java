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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteTableConflict extends AbstractModel{

    /**
    * Route table type.
    */
    @SerializedName("RouteTableType")
    @Expose
    private String RouteTableType;

    /**
    * Route table CIDR.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteTableCidrBlock")
    @Expose
    private String RouteTableCidrBlock;

    /**
    * Route table name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * Route table ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
     * Get Route table type. 
     * @return RouteTableType Route table type.
     */
    public String getRouteTableType() {
        return this.RouteTableType;
    }

    /**
     * Set Route table type.
     * @param RouteTableType Route table type.
     */
    public void setRouteTableType(String RouteTableType) {
        this.RouteTableType = RouteTableType;
    }

    /**
     * Get Route table CIDR.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RouteTableCidrBlock Route table CIDR.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRouteTableCidrBlock() {
        return this.RouteTableCidrBlock;
    }

    /**
     * Set Route table CIDR.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RouteTableCidrBlock Route table CIDR.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteTableCidrBlock(String RouteTableCidrBlock) {
        this.RouteTableCidrBlock = RouteTableCidrBlock;
    }

    /**
     * Get Route table name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RouteTableName Route table name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set Route table name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RouteTableName Route table name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get Route table ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RouteTableId Route table ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set Route table ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RouteTableId Route table ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    public RouteTableConflict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteTableConflict(RouteTableConflict source) {
        if (source.RouteTableType != null) {
            this.RouteTableType = new String(source.RouteTableType);
        }
        if (source.RouteTableCidrBlock != null) {
            this.RouteTableCidrBlock = new String(source.RouteTableCidrBlock);
        }
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableType", this.RouteTableType);
        this.setParamSimple(map, prefix + "RouteTableCidrBlock", this.RouteTableCidrBlock);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);

    }
}

