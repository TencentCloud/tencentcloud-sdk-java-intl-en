/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MicroService extends AbstractModel {

    /**
    * Microservice cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Microservice namespace ID.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Microservice name.
    */
    @SerializedName("MicroServiceName")
    @Expose
    private String MicroServiceName;

    /**
     * Get Microservice cluster ID. 
     * @return ClusterId Microservice cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Microservice cluster ID.
     * @param ClusterId Microservice cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Microservice namespace ID. 
     * @return NamespaceId Microservice namespace ID.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Microservice namespace ID.
     * @param NamespaceId Microservice namespace ID.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Microservice name. 
     * @return MicroServiceName Microservice name.
     */
    public String getMicroServiceName() {
        return this.MicroServiceName;
    }

    /**
     * Set Microservice name.
     * @param MicroServiceName Microservice name.
     */
    public void setMicroServiceName(String MicroServiceName) {
        this.MicroServiceName = MicroServiceName;
    }

    public MicroService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MicroService(MicroService source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.MicroServiceName != null) {
            this.MicroServiceName = new String(source.MicroServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "MicroServiceName", this.MicroServiceName);

    }
}

