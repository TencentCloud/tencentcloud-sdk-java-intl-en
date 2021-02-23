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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteTable extends AbstractModel{

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The route table instance ID, such as `rtb-azd4dt1c`.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * Route table name.
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * The association relationships of the route table.
    */
    @SerializedName("AssociationSet")
    @Expose
    private RouteTableAssociation [] AssociationSet;

    /**
    * IPv4 routing policy set.
    */
    @SerializedName("RouteSet")
    @Expose
    private Route [] RouteSet;

    /**
    * Whether it is the default route table.
    */
    @SerializedName("Main")
    @Expose
    private Boolean Main;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Tag key-value pairs.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Whether the local route is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LocalCidrForCcn")
    @Expose
    private CidrForCcn [] LocalCidrForCcn;

    /**
     * Get VPC instance ID. 
     * @return VpcId VPC instance ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID.
     * @param VpcId VPC instance ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The route table instance ID, such as `rtb-azd4dt1c`. 
     * @return RouteTableId The route table instance ID, such as `rtb-azd4dt1c`.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set The route table instance ID, such as `rtb-azd4dt1c`.
     * @param RouteTableId The route table instance ID, such as `rtb-azd4dt1c`.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get Route table name. 
     * @return RouteTableName Route table name.
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set Route table name.
     * @param RouteTableName Route table name.
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get The association relationships of the route table. 
     * @return AssociationSet The association relationships of the route table.
     */
    public RouteTableAssociation [] getAssociationSet() {
        return this.AssociationSet;
    }

    /**
     * Set The association relationships of the route table.
     * @param AssociationSet The association relationships of the route table.
     */
    public void setAssociationSet(RouteTableAssociation [] AssociationSet) {
        this.AssociationSet = AssociationSet;
    }

    /**
     * Get IPv4 routing policy set. 
     * @return RouteSet IPv4 routing policy set.
     */
    public Route [] getRouteSet() {
        return this.RouteSet;
    }

    /**
     * Set IPv4 routing policy set.
     * @param RouteSet IPv4 routing policy set.
     */
    public void setRouteSet(Route [] RouteSet) {
        this.RouteSet = RouteSet;
    }

    /**
     * Get Whether it is the default route table. 
     * @return Main Whether it is the default route table.
     */
    public Boolean getMain() {
        return this.Main;
    }

    /**
     * Set Whether it is the default route table.
     * @param Main Whether it is the default route table.
     */
    public void setMain(Boolean Main) {
        this.Main = Main;
    }

    /**
     * Get Creation Time. 
     * @return CreatedTime Creation Time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation Time.
     * @param CreatedTime Creation Time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Tag key-value pairs. 
     * @return TagSet Tag key-value pairs.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pairs.
     * @param TagSet Tag key-value pairs.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Whether the local route is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LocalCidrForCcn Whether the local route is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public CidrForCcn [] getLocalCidrForCcn() {
        return this.LocalCidrForCcn;
    }

    /**
     * Set Whether the local route is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LocalCidrForCcn Whether the local route is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLocalCidrForCcn(CidrForCcn [] LocalCidrForCcn) {
        this.LocalCidrForCcn = LocalCidrForCcn;
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
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "LocalCidrForCcn.", this.LocalCidrForCcn);

    }
}

