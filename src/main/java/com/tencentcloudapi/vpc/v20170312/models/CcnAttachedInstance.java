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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnAttachedInstance extends AbstractModel {

    /**
    * The ID of a CCN instance.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The type of associated instances:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * The ID of the associated instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The name of the associated instance.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * The region to which the associated instance belongs, such as `ap-guangzhou`.
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * The UIN (root account) to which the associated instance belongs.
    */
    @SerializedName("InstanceUin")
    @Expose
    private String InstanceUin;

    /**
    * The CIDR of the associated instance.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String [] CidrBlock;

    /**
    * The status of the associated instance:
<li>`PENDING`: In application</li>
<li>`ACTIVE`: Connected</li>
<li>`EXPIRED`: Expired</li>
<li>`REJECTED`: Rejected</li>
<li>`DELETED`: Deleted</li>
<li>`FAILED`: Failed (it will be asynchronously unbound after 2 hours)</li>
<li>`ATTACHING`: binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DETACHFAILED`: The unbinding failed (it will be asynchronously unbound after 2 hours)</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Association Time.
    */
    @SerializedName("AttachedTime")
    @Expose
    private String AttachedTime;

    /**
    * The UIN (root account) to which the CCN belongs.
    */
    @SerializedName("CcnUin")
    @Expose
    private String CcnUin;

    /**
    * General location of the associated instance, such as CHINA_MAINLAND.
    */
    @SerializedName("InstanceArea")
    @Expose
    private String InstanceArea;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Route table ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * Route table name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
     * Get The ID of a CCN instance. 
     * @return CcnId The ID of a CCN instance.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The ID of a CCN instance.
     * @param CcnId The ID of a CCN instance.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get The type of associated instances:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li> 
     * @return InstanceType The type of associated instances:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The type of associated instances:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li>
     * @param InstanceType The type of associated instances:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get The ID of the associated instance. 
     * @return InstanceId The ID of the associated instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ID of the associated instance.
     * @param InstanceId The ID of the associated instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The name of the associated instance. 
     * @return InstanceName The name of the associated instance.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set The name of the associated instance.
     * @param InstanceName The name of the associated instance.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get The region to which the associated instance belongs, such as `ap-guangzhou`. 
     * @return InstanceRegion The region to which the associated instance belongs, such as `ap-guangzhou`.
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set The region to which the associated instance belongs, such as `ap-guangzhou`.
     * @param InstanceRegion The region to which the associated instance belongs, such as `ap-guangzhou`.
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get The UIN (root account) to which the associated instance belongs. 
     * @return InstanceUin The UIN (root account) to which the associated instance belongs.
     */
    public String getInstanceUin() {
        return this.InstanceUin;
    }

    /**
     * Set The UIN (root account) to which the associated instance belongs.
     * @param InstanceUin The UIN (root account) to which the associated instance belongs.
     */
    public void setInstanceUin(String InstanceUin) {
        this.InstanceUin = InstanceUin;
    }

    /**
     * Get The CIDR of the associated instance. 
     * @return CidrBlock The CIDR of the associated instance.
     */
    public String [] getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set The CIDR of the associated instance.
     * @param CidrBlock The CIDR of the associated instance.
     */
    public void setCidrBlock(String [] CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get The status of the associated instance:
<li>`PENDING`: In application</li>
<li>`ACTIVE`: Connected</li>
<li>`EXPIRED`: Expired</li>
<li>`REJECTED`: Rejected</li>
<li>`DELETED`: Deleted</li>
<li>`FAILED`: Failed (it will be asynchronously unbound after 2 hours)</li>
<li>`ATTACHING`: binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DETACHFAILED`: The unbinding failed (it will be asynchronously unbound after 2 hours)</li> 
     * @return State The status of the associated instance:
<li>`PENDING`: In application</li>
<li>`ACTIVE`: Connected</li>
<li>`EXPIRED`: Expired</li>
<li>`REJECTED`: Rejected</li>
<li>`DELETED`: Deleted</li>
<li>`FAILED`: Failed (it will be asynchronously unbound after 2 hours)</li>
<li>`ATTACHING`: binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DETACHFAILED`: The unbinding failed (it will be asynchronously unbound after 2 hours)</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set The status of the associated instance:
<li>`PENDING`: In application</li>
<li>`ACTIVE`: Connected</li>
<li>`EXPIRED`: Expired</li>
<li>`REJECTED`: Rejected</li>
<li>`DELETED`: Deleted</li>
<li>`FAILED`: Failed (it will be asynchronously unbound after 2 hours)</li>
<li>`ATTACHING`: binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DETACHFAILED`: The unbinding failed (it will be asynchronously unbound after 2 hours)</li>
     * @param State The status of the associated instance:
<li>`PENDING`: In application</li>
<li>`ACTIVE`: Connected</li>
<li>`EXPIRED`: Expired</li>
<li>`REJECTED`: Rejected</li>
<li>`DELETED`: Deleted</li>
<li>`FAILED`: Failed (it will be asynchronously unbound after 2 hours)</li>
<li>`ATTACHING`: binding</li>
<li>`DETACHING`: Unbinding</li>
<li>`DETACHFAILED`: The unbinding failed (it will be asynchronously unbound after 2 hours)</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Association Time. 
     * @return AttachedTime Association Time.
     */
    public String getAttachedTime() {
        return this.AttachedTime;
    }

    /**
     * Set Association Time.
     * @param AttachedTime Association Time.
     */
    public void setAttachedTime(String AttachedTime) {
        this.AttachedTime = AttachedTime;
    }

    /**
     * Get The UIN (root account) to which the CCN belongs. 
     * @return CcnUin The UIN (root account) to which the CCN belongs.
     */
    public String getCcnUin() {
        return this.CcnUin;
    }

    /**
     * Set The UIN (root account) to which the CCN belongs.
     * @param CcnUin The UIN (root account) to which the CCN belongs.
     */
    public void setCcnUin(String CcnUin) {
        this.CcnUin = CcnUin;
    }

    /**
     * Get General location of the associated instance, such as CHINA_MAINLAND. 
     * @return InstanceArea General location of the associated instance, such as CHINA_MAINLAND.
     */
    public String getInstanceArea() {
        return this.InstanceArea;
    }

    /**
     * Set General location of the associated instance, such as CHINA_MAINLAND.
     * @param InstanceArea General location of the associated instance, such as CHINA_MAINLAND.
     */
    public void setInstanceArea(String InstanceArea) {
        this.InstanceArea = InstanceArea;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Route table ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RouteTableId Route table ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set Route table ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RouteTableId Route table ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get Route table name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RouteTableName Route table name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set Route table name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RouteTableName Route table name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    public CcnAttachedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnAttachedInstance(CcnAttachedInstance source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.InstanceUin != null) {
            this.InstanceUin = new String(source.InstanceUin);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String[source.CidrBlock.length];
            for (int i = 0; i < source.CidrBlock.length; i++) {
                this.CidrBlock[i] = new String(source.CidrBlock[i]);
            }
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AttachedTime != null) {
            this.AttachedTime = new String(source.AttachedTime);
        }
        if (source.CcnUin != null) {
            this.CcnUin = new String(source.CcnUin);
        }
        if (source.InstanceArea != null) {
            this.InstanceArea = new String(source.InstanceArea);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "InstanceUin", this.InstanceUin);
        this.setParamArraySimple(map, prefix + "CidrBlock.", this.CidrBlock);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AttachedTime", this.AttachedTime);
        this.setParamSimple(map, prefix + "CcnUin", this.CcnUin);
        this.setParamSimple(map, prefix + "InstanceArea", this.InstanceArea);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);

    }
}

