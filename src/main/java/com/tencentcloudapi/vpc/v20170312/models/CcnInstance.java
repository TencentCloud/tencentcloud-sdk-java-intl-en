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

public class CcnInstance extends AbstractModel{

    /**
    * The ID of the associated instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The region to which the associated instance ID belongs, such as `ap-guangzhou`.
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * The type of the associated instance. Available values are:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The ID of the route table associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

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
     * Get The region to which the associated instance ID belongs, such as `ap-guangzhou`. 
     * @return InstanceRegion The region to which the associated instance ID belongs, such as `ap-guangzhou`.
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set The region to which the associated instance ID belongs, such as `ap-guangzhou`.
     * @param InstanceRegion The region to which the associated instance ID belongs, such as `ap-guangzhou`.
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get The type of the associated instance. Available values are:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li> 
     * @return InstanceType The type of the associated instance. Available values are:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The type of the associated instance. Available values are:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li>
     * @param InstanceType The type of the associated instance. Available values are:
<li>`VPC`: VPC</li>
<li>`DIRECTCONNECT`: Direct Connect</li>
<li>`BMVPC`: BM VPC</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
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
     * Get The ID of the route table associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RouteTableId The ID of the route table associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set The ID of the route table associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RouteTableId The ID of the route table associated with the instance
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    public CcnInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnInstance(CcnInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);

    }
}

