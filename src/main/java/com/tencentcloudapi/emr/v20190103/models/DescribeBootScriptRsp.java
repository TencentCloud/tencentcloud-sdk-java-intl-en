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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBootScriptRsp extends AbstractModel {

    /**
    * Custom script file when resource initialization ends.
    */
    @SerializedName("ResourceAfter")
    @Expose
    private PreExecuteFileSetting [] ResourceAfter;

    /**
    * Custom script file before cluster startup.
    */
    @SerializedName("ClusterBefore")
    @Expose
    private PreExecuteFileSetting [] ClusterBefore;

    /**
    * Custom script file after cluster startup.
    */
    @SerializedName("ClusterAfter")
    @Expose
    private PreExecuteFileSetting [] ClusterAfter;

    /**
    * Custom script before service decommissioning.
    */
    @SerializedName("ServiceBefore")
    @Expose
    private PreExecuteFileSetting [] ServiceBefore;

    /**
     * Get Custom script file when resource initialization ends. 
     * @return ResourceAfter Custom script file when resource initialization ends.
     */
    public PreExecuteFileSetting [] getResourceAfter() {
        return this.ResourceAfter;
    }

    /**
     * Set Custom script file when resource initialization ends.
     * @param ResourceAfter Custom script file when resource initialization ends.
     */
    public void setResourceAfter(PreExecuteFileSetting [] ResourceAfter) {
        this.ResourceAfter = ResourceAfter;
    }

    /**
     * Get Custom script file before cluster startup. 
     * @return ClusterBefore Custom script file before cluster startup.
     */
    public PreExecuteFileSetting [] getClusterBefore() {
        return this.ClusterBefore;
    }

    /**
     * Set Custom script file before cluster startup.
     * @param ClusterBefore Custom script file before cluster startup.
     */
    public void setClusterBefore(PreExecuteFileSetting [] ClusterBefore) {
        this.ClusterBefore = ClusterBefore;
    }

    /**
     * Get Custom script file after cluster startup. 
     * @return ClusterAfter Custom script file after cluster startup.
     */
    public PreExecuteFileSetting [] getClusterAfter() {
        return this.ClusterAfter;
    }

    /**
     * Set Custom script file after cluster startup.
     * @param ClusterAfter Custom script file after cluster startup.
     */
    public void setClusterAfter(PreExecuteFileSetting [] ClusterAfter) {
        this.ClusterAfter = ClusterAfter;
    }

    /**
     * Get Custom script before service decommissioning. 
     * @return ServiceBefore Custom script before service decommissioning.
     */
    public PreExecuteFileSetting [] getServiceBefore() {
        return this.ServiceBefore;
    }

    /**
     * Set Custom script before service decommissioning.
     * @param ServiceBefore Custom script before service decommissioning.
     */
    public void setServiceBefore(PreExecuteFileSetting [] ServiceBefore) {
        this.ServiceBefore = ServiceBefore;
    }

    public DescribeBootScriptRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBootScriptRsp(DescribeBootScriptRsp source) {
        if (source.ResourceAfter != null) {
            this.ResourceAfter = new PreExecuteFileSetting[source.ResourceAfter.length];
            for (int i = 0; i < source.ResourceAfter.length; i++) {
                this.ResourceAfter[i] = new PreExecuteFileSetting(source.ResourceAfter[i]);
            }
        }
        if (source.ClusterBefore != null) {
            this.ClusterBefore = new PreExecuteFileSetting[source.ClusterBefore.length];
            for (int i = 0; i < source.ClusterBefore.length; i++) {
                this.ClusterBefore[i] = new PreExecuteFileSetting(source.ClusterBefore[i]);
            }
        }
        if (source.ClusterAfter != null) {
            this.ClusterAfter = new PreExecuteFileSetting[source.ClusterAfter.length];
            for (int i = 0; i < source.ClusterAfter.length; i++) {
                this.ClusterAfter[i] = new PreExecuteFileSetting(source.ClusterAfter[i]);
            }
        }
        if (source.ServiceBefore != null) {
            this.ServiceBefore = new PreExecuteFileSetting[source.ServiceBefore.length];
            for (int i = 0; i < source.ServiceBefore.length; i++) {
                this.ServiceBefore[i] = new PreExecuteFileSetting(source.ServiceBefore[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResourceAfter.", this.ResourceAfter);
        this.setParamArrayObj(map, prefix + "ClusterBefore.", this.ClusterBefore);
        this.setParamArrayObj(map, prefix + "ClusterAfter.", this.ClusterAfter);
        this.setParamArrayObj(map, prefix + "ServiceBefore.", this.ServiceBefore);

    }
}

