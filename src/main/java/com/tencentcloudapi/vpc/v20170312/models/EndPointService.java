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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndPointService extends AbstractModel {

    /**
    * Endpoint service ID
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * APP ID
    */
    @SerializedName("ServiceOwner")
    @Expose
    private String ServiceOwner;

    /**
    * Endpoint service name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Real server VIP
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * Real server ID in the format of `lb-xxx`.
    */
    @SerializedName("ServiceInstanceId")
    @Expose
    private String ServiceInstanceId;

    /**
    * Whether to automatically accept
    */
    @SerializedName("AutoAcceptFlag")
    @Expose
    private Boolean AutoAcceptFlag;

    /**
    * Number of associated endpoints
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EndPointCount")
    @Expose
    private Long EndPointCount;

    /**
    * Array of endpoints
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EndPointSet")
    @Expose
    private EndPoint [] EndPointSet;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Mounted PaaS service type. Values: `CLB`, `CDB`, `CRS`
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
     * Get Endpoint service ID 
     * @return EndPointServiceId Endpoint service ID
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set Endpoint service ID
     * @param EndPointServiceId Endpoint service ID
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get APP ID 
     * @return ServiceOwner APP ID
     */
    public String getServiceOwner() {
        return this.ServiceOwner;
    }

    /**
     * Set APP ID
     * @param ServiceOwner APP ID
     */
    public void setServiceOwner(String ServiceOwner) {
        this.ServiceOwner = ServiceOwner;
    }

    /**
     * Get Endpoint service name 
     * @return ServiceName Endpoint service name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Endpoint service name
     * @param ServiceName Endpoint service name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Real server VIP 
     * @return ServiceVip Real server VIP
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set Real server VIP
     * @param ServiceVip Real server VIP
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get Real server ID in the format of `lb-xxx`. 
     * @return ServiceInstanceId Real server ID in the format of `lb-xxx`.
     */
    public String getServiceInstanceId() {
        return this.ServiceInstanceId;
    }

    /**
     * Set Real server ID in the format of `lb-xxx`.
     * @param ServiceInstanceId Real server ID in the format of `lb-xxx`.
     */
    public void setServiceInstanceId(String ServiceInstanceId) {
        this.ServiceInstanceId = ServiceInstanceId;
    }

    /**
     * Get Whether to automatically accept 
     * @return AutoAcceptFlag Whether to automatically accept
     */
    public Boolean getAutoAcceptFlag() {
        return this.AutoAcceptFlag;
    }

    /**
     * Set Whether to automatically accept
     * @param AutoAcceptFlag Whether to automatically accept
     */
    public void setAutoAcceptFlag(Boolean AutoAcceptFlag) {
        this.AutoAcceptFlag = AutoAcceptFlag;
    }

    /**
     * Get Number of associated endpoints
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EndPointCount Number of associated endpoints
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEndPointCount() {
        return this.EndPointCount;
    }

    /**
     * Set Number of associated endpoints
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EndPointCount Number of associated endpoints
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEndPointCount(Long EndPointCount) {
        this.EndPointCount = EndPointCount;
    }

    /**
     * Get Array of endpoints
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EndPointSet Array of endpoints
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public EndPoint [] getEndPointSet() {
        return this.EndPointSet;
    }

    /**
     * Set Array of endpoints
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EndPointSet Array of endpoints
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEndPointSet(EndPoint [] EndPointSet) {
        this.EndPointSet = EndPointSet;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Mounted PaaS service type. Values: `CLB`, `CDB`, `CRS` 
     * @return ServiceType Mounted PaaS service type. Values: `CLB`, `CDB`, `CRS`
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Mounted PaaS service type. Values: `CLB`, `CDB`, `CRS`
     * @param ServiceType Mounted PaaS service type. Values: `CLB`, `CDB`, `CRS`
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    public EndPointService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndPointService(EndPointService source) {
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ServiceOwner != null) {
            this.ServiceOwner = new String(source.ServiceOwner);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.ServiceInstanceId != null) {
            this.ServiceInstanceId = new String(source.ServiceInstanceId);
        }
        if (source.AutoAcceptFlag != null) {
            this.AutoAcceptFlag = new Boolean(source.AutoAcceptFlag);
        }
        if (source.EndPointCount != null) {
            this.EndPointCount = new Long(source.EndPointCount);
        }
        if (source.EndPointSet != null) {
            this.EndPointSet = new EndPoint[source.EndPointSet.length];
            for (int i = 0; i < source.EndPointSet.length; i++) {
                this.EndPointSet[i] = new EndPoint(source.EndPointSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ServiceOwner", this.ServiceOwner);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "ServiceInstanceId", this.ServiceInstanceId);
        this.setParamSimple(map, prefix + "AutoAcceptFlag", this.AutoAcceptFlag);
        this.setParamSimple(map, prefix + "EndPointCount", this.EndPointCount);
        this.setParamArrayObj(map, prefix + "EndPointSet.", this.EndPointSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

