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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInstanceRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Whether to delete the bucket. Default value: false.
    */
    @SerializedName("DeleteBucket")
    @Expose
    private Boolean DeleteBucket;

    /**
    * Whether to enable the `dryRun` mode. Default value: false.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Whether to delete the bucket. Default value: false. 
     * @return DeleteBucket Whether to delete the bucket. Default value: false.
     */
    public Boolean getDeleteBucket() {
        return this.DeleteBucket;
    }

    /**
     * Set Whether to delete the bucket. Default value: false.
     * @param DeleteBucket Whether to delete the bucket. Default value: false.
     */
    public void setDeleteBucket(Boolean DeleteBucket) {
        this.DeleteBucket = DeleteBucket;
    }

    /**
     * Get Whether to enable the `dryRun` mode. Default value: false. 
     * @return DryRun Whether to enable the `dryRun` mode. Default value: false.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to enable the `dryRun` mode. Default value: false.
     * @param DryRun Whether to enable the `dryRun` mode. Default value: false.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public DeleteInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteInstanceRequest(DeleteInstanceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.DeleteBucket != null) {
            this.DeleteBucket = new Boolean(source.DeleteBucket);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "DeleteBucket", this.DeleteBucket);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

