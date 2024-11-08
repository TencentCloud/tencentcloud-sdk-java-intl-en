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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEndPointAndEndPointServiceRequest extends AbstractModel {

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Whether automatic forwarding is supported.
    */
    @SerializedName("AutoAcceptFlag")
    @Expose
    private Boolean AutoAcceptFlag;

    /**
    * Backend service ID.
    */
    @SerializedName("ServiceInstanceId")
    @Expose
    private String ServiceInstanceId;

    /**
    * Endpoint name.
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * Endpoint region, which should be consistent with the region of the endpoint service.
    */
    @SerializedName("EndPointRegion")
    @Expose
    private String EndPointRegion;

    /**
    * Endpoint service name.
    */
    @SerializedName("EndPointServiceName")
    @Expose
    private String EndPointServiceName;

    /**
    * Mounted PaaS service type. Valid values: CLB, CDB, and CRS.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Number of endpoint IP addresses.
    */
    @SerializedName("IpNum")
    @Expose
    private Long IpNum;

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
     * Get Whether automatic forwarding is supported. 
     * @return AutoAcceptFlag Whether automatic forwarding is supported.
     */
    public Boolean getAutoAcceptFlag() {
        return this.AutoAcceptFlag;
    }

    /**
     * Set Whether automatic forwarding is supported.
     * @param AutoAcceptFlag Whether automatic forwarding is supported.
     */
    public void setAutoAcceptFlag(Boolean AutoAcceptFlag) {
        this.AutoAcceptFlag = AutoAcceptFlag;
    }

    /**
     * Get Backend service ID. 
     * @return ServiceInstanceId Backend service ID.
     */
    public String getServiceInstanceId() {
        return this.ServiceInstanceId;
    }

    /**
     * Set Backend service ID.
     * @param ServiceInstanceId Backend service ID.
     */
    public void setServiceInstanceId(String ServiceInstanceId) {
        this.ServiceInstanceId = ServiceInstanceId;
    }

    /**
     * Get Endpoint name. 
     * @return EndPointName Endpoint name.
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set Endpoint name.
     * @param EndPointName Endpoint name.
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get Endpoint region, which should be consistent with the region of the endpoint service. 
     * @return EndPointRegion Endpoint region, which should be consistent with the region of the endpoint service.
     */
    public String getEndPointRegion() {
        return this.EndPointRegion;
    }

    /**
     * Set Endpoint region, which should be consistent with the region of the endpoint service.
     * @param EndPointRegion Endpoint region, which should be consistent with the region of the endpoint service.
     */
    public void setEndPointRegion(String EndPointRegion) {
        this.EndPointRegion = EndPointRegion;
    }

    /**
     * Get Endpoint service name. 
     * @return EndPointServiceName Endpoint service name.
     */
    public String getEndPointServiceName() {
        return this.EndPointServiceName;
    }

    /**
     * Set Endpoint service name.
     * @param EndPointServiceName Endpoint service name.
     */
    public void setEndPointServiceName(String EndPointServiceName) {
        this.EndPointServiceName = EndPointServiceName;
    }

    /**
     * Get Mounted PaaS service type. Valid values: CLB, CDB, and CRS. 
     * @return ServiceType Mounted PaaS service type. Valid values: CLB, CDB, and CRS.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Mounted PaaS service type. Valid values: CLB, CDB, and CRS.
     * @param ServiceType Mounted PaaS service type. Valid values: CLB, CDB, and CRS.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Number of endpoint IP addresses. 
     * @return IpNum Number of endpoint IP addresses.
     */
    public Long getIpNum() {
        return this.IpNum;
    }

    /**
     * Set Number of endpoint IP addresses.
     * @param IpNum Number of endpoint IP addresses.
     */
    public void setIpNum(Long IpNum) {
        this.IpNum = IpNum;
    }

    public CreateEndPointAndEndPointServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEndPointAndEndPointServiceRequest(CreateEndPointAndEndPointServiceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.AutoAcceptFlag != null) {
            this.AutoAcceptFlag = new Boolean(source.AutoAcceptFlag);
        }
        if (source.ServiceInstanceId != null) {
            this.ServiceInstanceId = new String(source.ServiceInstanceId);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointRegion != null) {
            this.EndPointRegion = new String(source.EndPointRegion);
        }
        if (source.EndPointServiceName != null) {
            this.EndPointServiceName = new String(source.EndPointServiceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.IpNum != null) {
            this.IpNum = new Long(source.IpNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "AutoAcceptFlag", this.AutoAcceptFlag);
        this.setParamSimple(map, prefix + "ServiceInstanceId", this.ServiceInstanceId);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointRegion", this.EndPointRegion);
        this.setParamSimple(map, prefix + "EndPointServiceName", this.EndPointServiceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "IpNum", this.IpNum);

    }
}

