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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteIngressRequest extends AbstractModel {

    /**
    * tem NamespaceId
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * EKS namespace name
    */
    @SerializedName("EksNamespace")
    @Expose
    private String EksNamespace;

    /**
    * Ingress rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Source channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get tem NamespaceId 
     * @return NamespaceId tem NamespaceId
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set tem NamespaceId
     * @param NamespaceId tem NamespaceId
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get EKS namespace name 
     * @return EksNamespace EKS namespace name
     */
    public String getEksNamespace() {
        return this.EksNamespace;
    }

    /**
     * Set EKS namespace name
     * @param EksNamespace EKS namespace name
     */
    public void setEksNamespace(String EksNamespace) {
        this.EksNamespace = EksNamespace;
    }

    /**
     * Get Ingress rule name 
     * @return Name Ingress rule name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Ingress rule name
     * @param Name Ingress rule name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Source channel 
     * @return SourceChannel Source channel
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set Source channel
     * @param SourceChannel Source channel
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    public DeleteIngressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIngressRequest(DeleteIngressRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.EksNamespace != null) {
            this.EksNamespace = new String(source.EksNamespace);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "EksNamespace", this.EksNamespace);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

