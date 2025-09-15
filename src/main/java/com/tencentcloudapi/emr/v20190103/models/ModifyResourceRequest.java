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

public class ModifyResourceRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Billing type.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Resized CPU.
    */
    @SerializedName("NewCpu")
    @Expose
    private Long NewCpu;

    /**
    * Resized memory.
    */
    @SerializedName("NewMem")
    @Expose
    private Long NewMem;

    /**
    * Token
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Resized machine specifications.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Node ID List.
    */
    @SerializedName("ResourceIdList")
    @Expose
    private String [] ResourceIdList;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Billing type. 
     * @return PayMode Billing type.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing type.
     * @param PayMode Billing type.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Resized CPU. 
     * @return NewCpu Resized CPU.
     */
    public Long getNewCpu() {
        return this.NewCpu;
    }

    /**
     * Set Resized CPU.
     * @param NewCpu Resized CPU.
     */
    public void setNewCpu(Long NewCpu) {
        this.NewCpu = NewCpu;
    }

    /**
     * Get Resized memory. 
     * @return NewMem Resized memory.
     */
    public Long getNewMem() {
        return this.NewMem;
    }

    /**
     * Set Resized memory.
     * @param NewMem Resized memory.
     */
    public void setNewMem(Long NewMem) {
        this.NewMem = NewMem;
    }

    /**
     * Get Token 
     * @return ClientToken Token
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Token
     * @param ClientToken Token
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Resized machine specifications. 
     * @return InstanceType Resized machine specifications.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Resized machine specifications.
     * @param InstanceType Resized machine specifications.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Node ID List. 
     * @return ResourceIdList Node ID List.
     */
    public String [] getResourceIdList() {
        return this.ResourceIdList;
    }

    /**
     * Set Node ID List.
     * @param ResourceIdList Node ID List.
     */
    public void setResourceIdList(String [] ResourceIdList) {
        this.ResourceIdList = ResourceIdList;
    }

    public ModifyResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceRequest(ModifyResourceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.NewCpu != null) {
            this.NewCpu = new Long(source.NewCpu);
        }
        if (source.NewMem != null) {
            this.NewMem = new Long(source.NewMem);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ResourceIdList != null) {
            this.ResourceIdList = new String[source.ResourceIdList.length];
            for (int i = 0; i < source.ResourceIdList.length; i++) {
                this.ResourceIdList[i] = new String(source.ResourceIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "NewCpu", this.NewCpu);
        this.setParamSimple(map, prefix + "NewMem", this.NewMem);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "ResourceIdList.", this.ResourceIdList);

    }
}

