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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServiceRequest extends AbstractModel{

    /**
    * Unique ID of the service to be modified.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Modified service name.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Modified service description.
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * Modified service frontend request type, such as `http`, `https`, and `http&https`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Network type list, which is used to specify the supported network types. `INNER` indicates access over private network, and `OUTER` indicates access over public network. The default value is `OUTER`.
    */
    @SerializedName("NetTypes")
    @Expose
    private String [] NetTypes;

    /**
     * Get Unique ID of the service to be modified. 
     * @return ServiceId Unique ID of the service to be modified.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique ID of the service to be modified.
     * @param ServiceId Unique ID of the service to be modified.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Modified service name. 
     * @return ServiceName Modified service name.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Modified service name.
     * @param ServiceName Modified service name.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Modified service description. 
     * @return ServiceDesc Modified service description.
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set Modified service description.
     * @param ServiceDesc Modified service description.
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get Modified service frontend request type, such as `http`, `https`, and `http&https`. 
     * @return Protocol Modified service frontend request type, such as `http`, `https`, and `http&https`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Modified service frontend request type, such as `http`, `https`, and `http&https`.
     * @param Protocol Modified service frontend request type, such as `http`, `https`, and `http&https`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Network type list, which is used to specify the supported network types. `INNER` indicates access over private network, and `OUTER` indicates access over public network. The default value is `OUTER`. 
     * @return NetTypes Network type list, which is used to specify the supported network types. `INNER` indicates access over private network, and `OUTER` indicates access over public network. The default value is `OUTER`.
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set Network type list, which is used to specify the supported network types. `INNER` indicates access over private network, and `OUTER` indicates access over public network. The default value is `OUTER`.
     * @param NetTypes Network type list, which is used to specify the supported network types. `INNER` indicates access over private network, and `OUTER` indicates access over public network. The default value is `OUTER`.
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "NetTypes.", this.NetTypes);

    }
}

