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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterConfigsRequest extends AbstractModel {

    /**
    * Cluster ID, for example, cdwch-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Configuration file modification information
    */
    @SerializedName("ModifyConfContext")
    @Expose
    private ConfigSubmitContext [] ModifyConfContext;

    /**
    * Reason for modification
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Cluster ID, for example, cdwch-xxxx 
     * @return InstanceId Cluster ID, for example, cdwch-xxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID, for example, cdwch-xxxx
     * @param InstanceId Cluster ID, for example, cdwch-xxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Configuration file modification information 
     * @return ModifyConfContext Configuration file modification information
     */
    public ConfigSubmitContext [] getModifyConfContext() {
        return this.ModifyConfContext;
    }

    /**
     * Set Configuration file modification information
     * @param ModifyConfContext Configuration file modification information
     */
    public void setModifyConfContext(ConfigSubmitContext [] ModifyConfContext) {
        this.ModifyConfContext = ModifyConfContext;
    }

    /**
     * Get Reason for modification 
     * @return Remark Reason for modification
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Reason for modification
     * @param Remark Reason for modification
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyClusterConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterConfigsRequest(ModifyClusterConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ModifyConfContext != null) {
            this.ModifyConfContext = new ConfigSubmitContext[source.ModifyConfContext.length];
            for (int i = 0; i < source.ModifyConfContext.length; i++) {
                this.ModifyConfContext[i] = new ConfigSubmitContext(source.ModifyConfContext[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ModifyConfContext.", this.ModifyConfContext);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

