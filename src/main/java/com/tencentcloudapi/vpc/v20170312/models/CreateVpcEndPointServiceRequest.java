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

public class CreateVpcEndPointServiceRequest extends AbstractModel{

    /**
    * VPC instance ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Endpoint service name
    */
    @SerializedName("EndPointServiceName")
    @Expose
    private String EndPointServiceName;

    /**
    * Whether to automatically accept
    */
    @SerializedName("AutoAcceptFlag")
    @Expose
    private Boolean AutoAcceptFlag;

    /**
    * Real server ID, such as `lb-xxx`.
    */
    @SerializedName("ServiceInstanceId")
    @Expose
    private String ServiceInstanceId;

    /**
    * Whether it is of the type `PassService`. Valid values: true: yes; false: no. Default value: false
    */
    @SerializedName("IsPassService")
    @Expose
    private Boolean IsPassService;

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
     * Get Endpoint service name 
     * @return EndPointServiceName Endpoint service name
     */
    public String getEndPointServiceName() {
        return this.EndPointServiceName;
    }

    /**
     * Set Endpoint service name
     * @param EndPointServiceName Endpoint service name
     */
    public void setEndPointServiceName(String EndPointServiceName) {
        this.EndPointServiceName = EndPointServiceName;
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
     * Get Real server ID, such as `lb-xxx`. 
     * @return ServiceInstanceId Real server ID, such as `lb-xxx`.
     */
    public String getServiceInstanceId() {
        return this.ServiceInstanceId;
    }

    /**
     * Set Real server ID, such as `lb-xxx`.
     * @param ServiceInstanceId Real server ID, such as `lb-xxx`.
     */
    public void setServiceInstanceId(String ServiceInstanceId) {
        this.ServiceInstanceId = ServiceInstanceId;
    }

    /**
     * Get Whether it is of the type `PassService`. Valid values: true: yes; false: no. Default value: false 
     * @return IsPassService Whether it is of the type `PassService`. Valid values: true: yes; false: no. Default value: false
     */
    public Boolean getIsPassService() {
        return this.IsPassService;
    }

    /**
     * Set Whether it is of the type `PassService`. Valid values: true: yes; false: no. Default value: false
     * @param IsPassService Whether it is of the type `PassService`. Valid values: true: yes; false: no. Default value: false
     */
    public void setIsPassService(Boolean IsPassService) {
        this.IsPassService = IsPassService;
    }

    public CreateVpcEndPointServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcEndPointServiceRequest(CreateVpcEndPointServiceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.EndPointServiceName != null) {
            this.EndPointServiceName = new String(source.EndPointServiceName);
        }
        if (source.AutoAcceptFlag != null) {
            this.AutoAcceptFlag = new Boolean(source.AutoAcceptFlag);
        }
        if (source.ServiceInstanceId != null) {
            this.ServiceInstanceId = new String(source.ServiceInstanceId);
        }
        if (source.IsPassService != null) {
            this.IsPassService = new Boolean(source.IsPassService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "EndPointServiceName", this.EndPointServiceName);
        this.setParamSimple(map, prefix + "AutoAcceptFlag", this.AutoAcceptFlag);
        this.setParamSimple(map, prefix + "ServiceInstanceId", this.ServiceInstanceId);
        this.setParamSimple(map, prefix + "IsPassService", this.IsPassService);

    }
}

