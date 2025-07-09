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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIngressesRequest extends AbstractModel {

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Environment namespace
    */
    @SerializedName("ClusterNamespace")
    @Expose
    private String ClusterNamespace;

    /**
    * Source channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * Ingress rule name list
    */
    @SerializedName("IngressNames")
    @Expose
    private String [] IngressNames;

    /**
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Environment namespace 
     * @return ClusterNamespace Environment namespace
     */
    public String getClusterNamespace() {
        return this.ClusterNamespace;
    }

    /**
     * Set Environment namespace
     * @param ClusterNamespace Environment namespace
     */
    public void setClusterNamespace(String ClusterNamespace) {
        this.ClusterNamespace = ClusterNamespace;
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

    /**
     * Get Ingress rule name list 
     * @return IngressNames Ingress rule name list
     */
    public String [] getIngressNames() {
        return this.IngressNames;
    }

    /**
     * Set Ingress rule name list
     * @param IngressNames Ingress rule name list
     */
    public void setIngressNames(String [] IngressNames) {
        this.IngressNames = IngressNames;
    }

    public DescribeIngressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIngressesRequest(DescribeIngressesRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ClusterNamespace != null) {
            this.ClusterNamespace = new String(source.ClusterNamespace);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.IngressNames != null) {
            this.IngressNames = new String[source.IngressNames.length];
            for (int i = 0; i < source.IngressNames.length; i++) {
                this.IngressNames[i] = new String(source.IngressNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ClusterNamespace", this.ClusterNamespace);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamArraySimple(map, prefix + "IngressNames.", this.IngressNames);

    }
}

