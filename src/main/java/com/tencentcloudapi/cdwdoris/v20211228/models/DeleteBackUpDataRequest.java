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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBackUpDataRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Task ID
    */
    @SerializedName("BackUpJobId")
    @Expose
    private Long BackUpJobId;

    /**
    * Whether to delete all instances
    */
    @SerializedName("IsDeleteAll")
    @Expose
    private Boolean IsDeleteAll;

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
     * Get Task ID 
     * @return BackUpJobId Task ID
     */
    public Long getBackUpJobId() {
        return this.BackUpJobId;
    }

    /**
     * Set Task ID
     * @param BackUpJobId Task ID
     */
    public void setBackUpJobId(Long BackUpJobId) {
        this.BackUpJobId = BackUpJobId;
    }

    /**
     * Get Whether to delete all instances 
     * @return IsDeleteAll Whether to delete all instances
     */
    public Boolean getIsDeleteAll() {
        return this.IsDeleteAll;
    }

    /**
     * Set Whether to delete all instances
     * @param IsDeleteAll Whether to delete all instances
     */
    public void setIsDeleteAll(Boolean IsDeleteAll) {
        this.IsDeleteAll = IsDeleteAll;
    }

    public DeleteBackUpDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBackUpDataRequest(DeleteBackUpDataRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackUpJobId != null) {
            this.BackUpJobId = new Long(source.BackUpJobId);
        }
        if (source.IsDeleteAll != null) {
            this.IsDeleteAll = new Boolean(source.IsDeleteAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackUpJobId", this.BackUpJobId);
        this.setParamSimple(map, prefix + "IsDeleteAll", this.IsDeleteAll);

    }
}

