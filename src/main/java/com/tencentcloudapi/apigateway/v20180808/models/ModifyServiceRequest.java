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
    * Service name after modification.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Service description after modification.
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * Service frontend request type after modification, such as `http`, `https`, and `http&https`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER.
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
     * Get Service name after modification. 
     * @return ServiceName Service name after modification.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name after modification.
     * @param ServiceName Service name after modification.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Service description after modification. 
     * @return ServiceDesc Service description after modification.
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set Service description after modification.
     * @param ServiceDesc Service description after modification.
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get Service frontend request type after modification, such as `http`, `https`, and `http&https`. 
     * @return Protocol Service frontend request type after modification, such as `http`, `https`, and `http&https`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Service frontend request type after modification, such as `http`, `https`, and `http&https`.
     * @param Protocol Service frontend request type after modification, such as `http`, `https`, and `http&https`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER. 
     * @return NetTypes Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER.
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER.
     * @param NetTypes Network type list, which is used to specify the supported network types. INNER: private network access; OUTER: public network access. Default value: OUTER.
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    public ModifyServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceRequest(ModifyServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.NetTypes != null) {
            this.NetTypes = new String[source.NetTypes.length];
            for (int i = 0; i < source.NetTypes.length; i++) {
                this.NetTypes[i] = new String(source.NetTypes[i]);
            }
        }
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

