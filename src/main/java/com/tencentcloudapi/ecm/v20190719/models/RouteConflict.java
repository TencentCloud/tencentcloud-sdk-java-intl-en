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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteConflict extends AbstractModel {

    /**
    * Route table instance ID
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * The conflicting destination ports to be checked
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * List of conflicting routing policies
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConflictSet")
    @Expose
    private Route [] ConflictSet;

    /**
     * Get Route table instance ID 
     * @return RouteTableId Route table instance ID
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set Route table instance ID
     * @param RouteTableId Route table instance ID
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get The conflicting destination ports to be checked 
     * @return DestinationCidrBlock The conflicting destination ports to be checked
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set The conflicting destination ports to be checked
     * @param DestinationCidrBlock The conflicting destination ports to be checked
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get List of conflicting routing policies
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConflictSet List of conflicting routing policies
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Route [] getConflictSet() {
        return this.ConflictSet;
    }

    /**
     * Set List of conflicting routing policies
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConflictSet List of conflicting routing policies
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConflictSet(Route [] ConflictSet) {
        this.ConflictSet = ConflictSet;
    }

    public RouteConflict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteConflict(RouteConflict source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.ConflictSet != null) {
            this.ConflictSet = new Route[source.ConflictSet.length];
            for (int i = 0; i < source.ConflictSet.length; i++) {
                this.ConflictSet[i] = new Route(source.ConflictSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamArrayObj(map, prefix + "ConflictSet.", this.ConflictSet);

    }
}

