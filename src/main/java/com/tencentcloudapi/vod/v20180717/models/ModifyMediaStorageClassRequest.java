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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaStorageClassRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("RestoreTier")
    @Expose
    private String RestoreTier;

    /**
     * Get  
     * @return FileIds 
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 
     * @param FileIds 
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get  
     * @return StorageClass 
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set 
     * @param StorageClass 
     */
    public void setStorageClass(String StorageClass) {
        this.StorageClass = StorageClass;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return RestoreTier 
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set 
     * @param RestoreTier 
     */
    public void setRestoreTier(String RestoreTier) {
        this.RestoreTier = RestoreTier;
    }

    public ModifyMediaStorageClassRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaStorageClassRequest(ModifyMediaStorageClassRequest source) {
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.StorageClass != null) {
            this.StorageClass = new String(source.StorageClass);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RestoreTier != null) {
            this.RestoreTier = new String(source.RestoreTier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "StorageClass", this.StorageClass);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RestoreTier", this.RestoreTier);

    }
}

