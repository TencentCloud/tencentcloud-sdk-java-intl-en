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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteTable extends AbstractModel{

    /**
    * VPC instance ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Route table instance ID
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * Route table name
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * Association relationships of the route table
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociationSet")
    @Expose
    private RouteTableAssociation [] AssociationSet;

    /**
    * IPv4 routing policy set
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteSet")
    @Expose
    private Route [] RouteSet;

    /**
    * Whether it is the default route table
    */
    @SerializedName("Main")
    @Expose
    private Boolean Main;

    /**
    * Creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get VPC instance ID 
     * @return VpcId VPC instance ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID
     * @param VpcId VPC instance ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

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
     * Get Route table name 
     * @return RouteTableName Route table name
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set Route table name
     * @param RouteTableName Route table name
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get Association relationships of the route table
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AssociationSet Association relationships of the route table
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RouteTableAssociation [] getAssociationSet() {
        return this.AssociationSet;
    }

    /**
     * Set Association relationships of the route table
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AssociationSet Association relationships of the route table
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociationSet(RouteTableAssociation [] AssociationSet) {
        this.AssociationSet = AssociationSet;
    }

    /**
     * Get IPv4 routing policy set
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RouteSet IPv4 routing policy set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Route [] getRouteSet() {
        return this.RouteSet;
    }

    /**
     * Set IPv4 routing policy set
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RouteSet IPv4 routing policy set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteSet(Route [] RouteSet) {
        this.RouteSet = RouteSet;
    }

    /**
     * Get Whether it is the default route table 
     * @return Main Whether it is the default route table
     */
    public Boolean getMain() {
        return this.Main;
    }

    /**
     * Set Whether it is the default route table
     * @param Main Whether it is the default route table
     */
    public void setMain(Boolean Main) {
        this.Main = Main;
    }

    /**
     * Get Creation time 
     * @return CreatedTime Creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
     * @param CreatedTime Creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public RouteTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteTable(RouteTable source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
        }
        if (source.AssociationSet != null) {
            this.AssociationSet = new RouteTableAssociation[source.AssociationSet.length];
            for (int i = 0; i < source.AssociationSet.length; i++) {
                this.AssociationSet[i] = new RouteTableAssociation(source.AssociationSet[i]);
            }
        }
        if (source.RouteSet != null) {
            this.RouteSet = new Route[source.RouteSet.length];
            for (int i = 0; i < source.RouteSet.length; i++) {
                this.RouteSet[i] = new Route(source.RouteSet[i]);
            }
        }
        if (source.Main != null) {
            this.Main = new Boolean(source.Main);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamArrayObj(map, prefix + "AssociationSet.", this.AssociationSet);
        this.setParamArrayObj(map, prefix + "RouteSet.", this.RouteSet);
        this.setParamSimple(map, prefix + "Main", this.Main);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

