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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRelatedIngressesRequest extends AbstractModel {

    /**
    * Environment ID.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * EKS namespace.
    */
    @SerializedName("EksNamespace")
    @Expose
    private String EksNamespace;

    /**
    * Source channel.
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * Service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get Environment ID. 
     * @return NamespaceId Environment ID.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Environment ID.
     * @param NamespaceId Environment ID.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get EKS namespace. 
     * @return EksNamespace EKS namespace.
     */
    public String getEksNamespace() {
        return this.EksNamespace;
    }

    /**
     * Set EKS namespace.
     * @param EksNamespace EKS namespace.
     */
    public void setEksNamespace(String EksNamespace) {
        this.EksNamespace = EksNamespace;
    }

    /**
     * Get Source channel. 
     * @return SourceChannel Source channel.
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set Source channel.
     * @param SourceChannel Source channel.
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get Service ID. 
     * @return ServiceId Service ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID.
     * @param ServiceId Service ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public DescribeRelatedIngressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelatedIngressesRequest(DescribeRelatedIngressesRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.EksNamespace != null) {
            this.EksNamespace = new String(source.EksNamespace);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "EksNamespace", this.EksNamespace);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

