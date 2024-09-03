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

public class UpdateCoolDownRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether to enable. 0: disable; 1: enable.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Address of the COS bucket where the user stores layered hot and cold data
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether to enable. 0: disable; 1: enable. 
     * @return Enable Whether to enable. 0: disable; 1: enable.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable. 0: disable; 1: enable.
     * @param Enable Whether to enable. 0: disable; 1: enable.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Address of the COS bucket where the user stores layered hot and cold data 
     * @return Bucket Address of the COS bucket where the user stores layered hot and cold data
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Address of the COS bucket where the user stores layered hot and cold data
     * @param Bucket Address of the COS bucket where the user stores layered hot and cold data
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    public UpdateCoolDownRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCoolDownRequest(UpdateCoolDownRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);

    }
}

