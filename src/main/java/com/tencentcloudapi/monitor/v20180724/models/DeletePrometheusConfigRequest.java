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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePrometheusConfigRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cluster type
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * List of names of the service monitors to be deleted
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private String [] ServiceMonitors;

    /**
    * List of names of the pod monitors to be deleted
    */
    @SerializedName("PodMonitors")
    @Expose
    private String [] PodMonitors;

    /**
    * List of names of the raw jobs to be deleted
    */
    @SerializedName("RawJobs")
    @Expose
    private String [] RawJobs;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Cluster type 
     * @return ClusterType Cluster type
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type
     * @param ClusterType Cluster type
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

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
     * Get List of names of the service monitors to be deleted 
     * @return ServiceMonitors List of names of the service monitors to be deleted
     */
    public String [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set List of names of the service monitors to be deleted
     * @param ServiceMonitors List of names of the service monitors to be deleted
     */
    public void setServiceMonitors(String [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get List of names of the pod monitors to be deleted 
     * @return PodMonitors List of names of the pod monitors to be deleted
     */
    public String [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set List of names of the pod monitors to be deleted
     * @param PodMonitors List of names of the pod monitors to be deleted
     */
    public void setPodMonitors(String [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get List of names of the raw jobs to be deleted 
     * @return RawJobs List of names of the raw jobs to be deleted
     */
    public String [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set List of names of the raw jobs to be deleted
     * @param RawJobs List of names of the raw jobs to be deleted
     */
    public void setRawJobs(String [] RawJobs) {
        this.RawJobs = RawJobs;
    }

    public DeletePrometheusConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrometheusConfigRequest(DeletePrometheusConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ServiceMonitors != null) {
            this.ServiceMonitors = new String[source.ServiceMonitors.length];
            for (int i = 0; i < source.ServiceMonitors.length; i++) {
                this.ServiceMonitors[i] = new String(source.ServiceMonitors[i]);
            }
        }
        if (source.PodMonitors != null) {
            this.PodMonitors = new String[source.PodMonitors.length];
            for (int i = 0; i < source.PodMonitors.length; i++) {
                this.PodMonitors[i] = new String(source.PodMonitors[i]);
            }
        }
        if (source.RawJobs != null) {
            this.RawJobs = new String[source.RawJobs.length];
            for (int i = 0; i < source.RawJobs.length; i++) {
                this.RawJobs[i] = new String(source.RawJobs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "ServiceMonitors.", this.ServiceMonitors);
        this.setParamArraySimple(map, prefix + "PodMonitors.", this.PodMonitors);
        this.setParamArraySimple(map, prefix + "RawJobs.", this.RawJobs);

    }
}

