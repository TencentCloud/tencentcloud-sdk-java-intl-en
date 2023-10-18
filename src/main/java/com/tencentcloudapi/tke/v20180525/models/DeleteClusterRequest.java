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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteClusterRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Policy used to delete an instance in the cluster: terminate (terminates the instance. Only available for instances on pay-as-you-go CVMs); retain (only removes it from the cluster. The instance will be retained.)
    */
    @SerializedName("InstanceDeleteMode")
    @Expose
    private String InstanceDeleteMode;

    /**
    * Specifies the policy to deal with resources in the cluster when the cluster is deleted. It only supports CBS now. The default policy is to retain CBS disks.
    */
    @SerializedName("ResourceDeleteOptions")
    @Expose
    private ResourceDeleteOption [] ResourceDeleteOptions;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Policy used to delete an instance in the cluster: terminate (terminates the instance. Only available for instances on pay-as-you-go CVMs); retain (only removes it from the cluster. The instance will be retained.) 
     * @return InstanceDeleteMode Policy used to delete an instance in the cluster: terminate (terminates the instance. Only available for instances on pay-as-you-go CVMs); retain (only removes it from the cluster. The instance will be retained.)
     */
    public String getInstanceDeleteMode() {
        return this.InstanceDeleteMode;
    }

    /**
     * Set Policy used to delete an instance in the cluster: terminate (terminates the instance. Only available for instances on pay-as-you-go CVMs); retain (only removes it from the cluster. The instance will be retained.)
     * @param InstanceDeleteMode Policy used to delete an instance in the cluster: terminate (terminates the instance. Only available for instances on pay-as-you-go CVMs); retain (only removes it from the cluster. The instance will be retained.)
     */
    public void setInstanceDeleteMode(String InstanceDeleteMode) {
        this.InstanceDeleteMode = InstanceDeleteMode;
    }

    /**
     * Get Specifies the policy to deal with resources in the cluster when the cluster is deleted. It only supports CBS now. The default policy is to retain CBS disks. 
     * @return ResourceDeleteOptions Specifies the policy to deal with resources in the cluster when the cluster is deleted. It only supports CBS now. The default policy is to retain CBS disks.
     */
    public ResourceDeleteOption [] getResourceDeleteOptions() {
        return this.ResourceDeleteOptions;
    }

    /**
     * Set Specifies the policy to deal with resources in the cluster when the cluster is deleted. It only supports CBS now. The default policy is to retain CBS disks.
     * @param ResourceDeleteOptions Specifies the policy to deal with resources in the cluster when the cluster is deleted. It only supports CBS now. The default policy is to retain CBS disks.
     */
    public void setResourceDeleteOptions(ResourceDeleteOption [] ResourceDeleteOptions) {
        this.ResourceDeleteOptions = ResourceDeleteOptions;
    }

    public DeleteClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteClusterRequest(DeleteClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceDeleteMode != null) {
            this.InstanceDeleteMode = new String(source.InstanceDeleteMode);
        }
        if (source.ResourceDeleteOptions != null) {
            this.ResourceDeleteOptions = new ResourceDeleteOption[source.ResourceDeleteOptions.length];
            for (int i = 0; i < source.ResourceDeleteOptions.length; i++) {
                this.ResourceDeleteOptions[i] = new ResourceDeleteOption(source.ResourceDeleteOptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceDeleteMode", this.InstanceDeleteMode);
        this.setParamArrayObj(map, prefix + "ResourceDeleteOptions.", this.ResourceDeleteOptions);

    }
}

