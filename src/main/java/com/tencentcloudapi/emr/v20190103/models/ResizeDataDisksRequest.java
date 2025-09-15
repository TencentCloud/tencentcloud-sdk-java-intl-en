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

public class ResizeDataDisksRequest extends AbstractModel {

    /**
    * ID of the EMR cluster instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Scale-out value, which should be greater than the original capacity and a multiple of 10.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * ID list of nodes to be scaled out.
    */
    @SerializedName("CvmInstanceIds")
    @Expose
    private String [] CvmInstanceIds;

    /**
    * ID of the cloud disk to be scaled out.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Whether to scale out all cloud disks.
    */
    @SerializedName("ResizeAll")
    @Expose
    private Boolean ResizeAll;

    /**
     * Get ID of the EMR cluster instance. 
     * @return InstanceId ID of the EMR cluster instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the EMR cluster instance.
     * @param InstanceId ID of the EMR cluster instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Scale-out value, which should be greater than the original capacity and a multiple of 10. 
     * @return DiskSize Scale-out value, which should be greater than the original capacity and a multiple of 10.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Scale-out value, which should be greater than the original capacity and a multiple of 10.
     * @param DiskSize Scale-out value, which should be greater than the original capacity and a multiple of 10.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get ID list of nodes to be scaled out. 
     * @return CvmInstanceIds ID list of nodes to be scaled out.
     */
    public String [] getCvmInstanceIds() {
        return this.CvmInstanceIds;
    }

    /**
     * Set ID list of nodes to be scaled out.
     * @param CvmInstanceIds ID list of nodes to be scaled out.
     */
    public void setCvmInstanceIds(String [] CvmInstanceIds) {
        this.CvmInstanceIds = CvmInstanceIds;
    }

    /**
     * Get ID of the cloud disk to be scaled out. 
     * @return DiskIds ID of the cloud disk to be scaled out.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set ID of the cloud disk to be scaled out.
     * @param DiskIds ID of the cloud disk to be scaled out.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Whether to scale out all cloud disks. 
     * @return ResizeAll Whether to scale out all cloud disks.
     */
    public Boolean getResizeAll() {
        return this.ResizeAll;
    }

    /**
     * Set Whether to scale out all cloud disks.
     * @param ResizeAll Whether to scale out all cloud disks.
     */
    public void setResizeAll(Boolean ResizeAll) {
        this.ResizeAll = ResizeAll;
    }

    public ResizeDataDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResizeDataDisksRequest(ResizeDataDisksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.CvmInstanceIds != null) {
            this.CvmInstanceIds = new String[source.CvmInstanceIds.length];
            for (int i = 0; i < source.CvmInstanceIds.length; i++) {
                this.CvmInstanceIds[i] = new String(source.CvmInstanceIds[i]);
            }
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.ResizeAll != null) {
            this.ResizeAll = new Boolean(source.ResizeAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamArraySimple(map, prefix + "CvmInstanceIds.", this.CvmInstanceIds);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "ResizeAll", this.ResizeAll);

    }
}

