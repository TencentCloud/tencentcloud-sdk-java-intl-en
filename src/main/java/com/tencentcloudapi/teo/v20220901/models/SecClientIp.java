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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecClientIp extends AbstractModel{

    /**
    * IP of the client.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Maximum QPS.
    */
    @SerializedName("RequestMaxQps")
    @Expose
    private Long RequestMaxQps;

    /**
    * Number of requests.
    */
    @SerializedName("RequestNum")
    @Expose
    private Long RequestNum;

    /**
     * Get IP of the client. 
     * @return ClientIp IP of the client.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set IP of the client.
     * @param ClientIp IP of the client.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Maximum QPS. 
     * @return RequestMaxQps Maximum QPS.
     */
    public Long getRequestMaxQps() {
        return this.RequestMaxQps;
    }

    /**
     * Set Maximum QPS.
     * @param RequestMaxQps Maximum QPS.
     */
    public void setRequestMaxQps(Long RequestMaxQps) {
        this.RequestMaxQps = RequestMaxQps;
    }

    /**
     * Get Number of requests. 
     * @return RequestNum Number of requests.
     */
    public Long getRequestNum() {
        return this.RequestNum;
    }

    /**
     * Set Number of requests.
     * @param RequestNum Number of requests.
     */
    public void setRequestNum(Long RequestNum) {
        this.RequestNum = RequestNum;
    }

    public SecClientIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecClientIp(SecClientIp source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.RequestMaxQps != null) {
            this.RequestMaxQps = new Long(source.RequestMaxQps);
        }
        if (source.RequestNum != null) {
            this.RequestNum = new Long(source.RequestNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "RequestMaxQps", this.RequestMaxQps);
        this.setParamSimple(map, prefix + "RequestNum", this.RequestNum);

    }
}

