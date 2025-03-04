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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceByApiRequest extends AbstractModel {

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Availability zone.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Virtual Private Cloud (VPC).
    */
    @SerializedName("UserVPCId")
    @Expose
    private String UserVPCId;

    /**
    * Subnet.
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * Billing method.
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * Instance password.
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * Resource information.
    */
    @SerializedName("Resources")
    @Expose
    private ResourceSpecNew [] Resources;

    /**
    * Tag list.
    */
    @SerializedName("Tags")
    @Expose
    private Tag Tags;

    /**
    * Version.
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Availability zone. 
     * @return Zone Availability zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone.
     * @param Zone Availability zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Virtual Private Cloud (VPC). 
     * @return UserVPCId Virtual Private Cloud (VPC).
     */
    public String getUserVPCId() {
        return this.UserVPCId;
    }

    /**
     * Set Virtual Private Cloud (VPC).
     * @param UserVPCId Virtual Private Cloud (VPC).
     */
    public void setUserVPCId(String UserVPCId) {
        this.UserVPCId = UserVPCId;
    }

    /**
     * Get Subnet. 
     * @return UserSubnetId Subnet.
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set Subnet.
     * @param UserSubnetId Subnet.
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get Billing method. 
     * @return ChargeProperties Billing method.
     */
    public ChargeProperties getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set Billing method.
     * @param ChargeProperties Billing method.
     */
    public void setChargeProperties(ChargeProperties ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get Instance password. 
     * @return AdminPassword Instance password.
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set Instance password.
     * @param AdminPassword Instance password.
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get Resource information. 
     * @return Resources Resource information.
     */
    public ResourceSpecNew [] getResources() {
        return this.Resources;
    }

    /**
     * Set Resource information.
     * @param Resources Resource information.
     */
    public void setResources(ResourceSpecNew [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Tag list. 
     * @return Tags Tag list.
     */
    public Tag getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list.
     * @param Tags Tag list.
     */
    public void setTags(Tag Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Version. 
     * @return ProductVersion Version.
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set Version.
     * @param ProductVersion Version.
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    public CreateInstanceByApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceByApiRequest(CreateInstanceByApiRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.UserVPCId != null) {
            this.UserVPCId = new String(source.UserVPCId);
        }
        if (source.UserSubnetId != null) {
            this.UserSubnetId = new String(source.UserSubnetId);
        }
        if (source.ChargeProperties != null) {
            this.ChargeProperties = new ChargeProperties(source.ChargeProperties);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.Resources != null) {
            this.Resources = new ResourceSpecNew[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourceSpecNew(source.Resources[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag(source.Tags);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UserVPCId", this.UserVPCId);
        this.setParamSimple(map, prefix + "UserSubnetId", this.UserSubnetId);
        this.setParamObj(map, prefix + "ChargeProperties.", this.ChargeProperties);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);

    }
}

