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

public class EnableVpcEndPointConnectRequest extends AbstractModel{

    /**
    * Endpoint service ID
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * Endpoint ID
    */
    @SerializedName("EndPointId")
    @Expose
    private String [] EndPointId;

    /**
    * Whether to accept the request of connecting with an endpoint
    */
    @SerializedName("AcceptFlag")
    @Expose
    private Boolean AcceptFlag;

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
     * Get Endpoint ID 
     * @return EndPointId Endpoint ID
     */
    public String [] getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set Endpoint ID
     * @param EndPointId Endpoint ID
     */
    public void setEndPointId(String [] EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get Whether to accept the request of connecting with an endpoint 
     * @return AcceptFlag Whether to accept the request of connecting with an endpoint
     */
    public Boolean getAcceptFlag() {
        return this.AcceptFlag;
    }

    /**
     * Set Whether to accept the request of connecting with an endpoint
     * @param AcceptFlag Whether to accept the request of connecting with an endpoint
     */
    public void setAcceptFlag(Boolean AcceptFlag) {
        this.AcceptFlag = AcceptFlag;
    }

    public EnableVpcEndPointConnectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableVpcEndPointConnectRequest(EnableVpcEndPointConnectRequest source) {
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String[source.EndPointId.length];
            for (int i = 0; i < source.EndPointId.length; i++) {
                this.EndPointId[i] = new String(source.EndPointId[i]);
            }
        }
        if (source.AcceptFlag != null) {
            this.AcceptFlag = new Boolean(source.AcceptFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamArraySimple(map, prefix + "EndPointId.", this.EndPointId);
        this.setParamSimple(map, prefix + "AcceptFlag", this.AcceptFlag);

    }
}

