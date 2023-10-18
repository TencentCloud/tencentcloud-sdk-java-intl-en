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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostItem extends AbstractModel {

    /**
    * CDH instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * CDH instance ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * CDH instance type
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * CDH instance name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * CDH instance billing mode
    */
    @SerializedName("HostChargeType")
    @Expose
    private String HostChargeType;

    /**
    * CDH instance renewal flag
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * CDH instance creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * CDH instance expiry time
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * List of IDs of CVMs created on a CDH instance
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * CDH instance status
    */
    @SerializedName("HostState")
    @Expose
    private String HostState;

    /**
    * CDH instance IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * CDH instance resource information
    */
    @SerializedName("HostResource")
    @Expose
    private HostResource HostResource;

    /**
    * Cage ID of the CDH instance. This parameter is only valid for CDH instances in the cages of finance availability zones.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
     * Get CDH instance location. This parameter is used to specify the AZ, project, and other attributes of the instance. 
     * @return Placement CDH instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set CDH instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     * @param Placement CDH instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get CDH instance ID 
     * @return HostId CDH instance ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set CDH instance ID
     * @param HostId CDH instance ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get CDH instance type 
     * @return HostType CDH instance type
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set CDH instance type
     * @param HostType CDH instance type
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get CDH instance name 
     * @return HostName CDH instance name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set CDH instance name
     * @param HostName CDH instance name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get CDH instance billing mode 
     * @return HostChargeType CDH instance billing mode
     */
    public String getHostChargeType() {
        return this.HostChargeType;
    }

    /**
     * Set CDH instance billing mode
     * @param HostChargeType CDH instance billing mode
     */
    public void setHostChargeType(String HostChargeType) {
        this.HostChargeType = HostChargeType;
    }

    /**
     * Get CDH instance renewal flag 
     * @return RenewFlag CDH instance renewal flag
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set CDH instance renewal flag
     * @param RenewFlag CDH instance renewal flag
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get CDH instance creation time 
     * @return CreatedTime CDH instance creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set CDH instance creation time
     * @param CreatedTime CDH instance creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get CDH instance expiry time 
     * @return ExpiredTime CDH instance expiry time
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set CDH instance expiry time
     * @param ExpiredTime CDH instance expiry time
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get List of IDs of CVMs created on a CDH instance 
     * @return InstanceIds List of IDs of CVMs created on a CDH instance
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of IDs of CVMs created on a CDH instance
     * @param InstanceIds List of IDs of CVMs created on a CDH instance
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get CDH instance status 
     * @return HostState CDH instance status
     */
    public String getHostState() {
        return this.HostState;
    }

    /**
     * Set CDH instance status
     * @param HostState CDH instance status
     */
    public void setHostState(String HostState) {
        this.HostState = HostState;
    }

    /**
     * Get CDH instance IP 
     * @return HostIp CDH instance IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set CDH instance IP
     * @param HostIp CDH instance IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get CDH instance resource information 
     * @return HostResource CDH instance resource information
     */
    public HostResource getHostResource() {
        return this.HostResource;
    }

    /**
     * Set CDH instance resource information
     * @param HostResource CDH instance resource information
     */
    public void setHostResource(HostResource HostResource) {
        this.HostResource = HostResource;
    }

    /**
     * Get Cage ID of the CDH instance. This parameter is only valid for CDH instances in the cages of finance availability zones.
Note: This field may return null, indicating that no valid value is found. 
     * @return CageId Cage ID of the CDH instance. This parameter is only valid for CDH instances in the cages of finance availability zones.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set Cage ID of the CDH instance. This parameter is only valid for CDH instances in the cages of finance availability zones.
Note: This field may return null, indicating that no valid value is found.
     * @param CageId Cage ID of the CDH instance. This parameter is only valid for CDH instances in the cages of finance availability zones.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    public HostItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostItem(HostItem source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostType != null) {
            this.HostType = new String(source.HostType);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostChargeType != null) {
            this.HostChargeType = new String(source.HostChargeType);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.HostState != null) {
            this.HostState = new String(source.HostState);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.HostResource != null) {
            this.HostResource = new HostResource(source.HostResource);
        }
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostChargeType", this.HostChargeType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "HostState", this.HostState);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamObj(map, prefix + "HostResource.", this.HostResource);
        this.setParamSimple(map, prefix + "CageId", this.CageId);

    }
}

