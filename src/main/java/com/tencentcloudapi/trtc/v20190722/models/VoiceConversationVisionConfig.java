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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConversationVisionConfig extends AbstractModel {

    /**
    * <p>Whether to enable visual understanding.</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>Storage type.</p><p>Enumeration values:</p><ul><li>0: Do not store.</li><li>1: Specify cloud storage. In such cases, the CloudStorage parameter is required.</li></ul><p>Default value: 0</p>
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * <p>Third-party Cloud Storage archive configuration. After configuration, the backend will automatically upload I-frames received from the SDK to the designated cloud bucket for persistent storage.</p>
    */
    @SerializedName("CloudStorage")
    @Expose
    private CloudStorage CloudStorage;

    /**
     * Get <p>Whether to enable visual understanding.</p> 
     * @return Enable <p>Whether to enable visual understanding.</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Whether to enable visual understanding.</p>
     * @param Enable <p>Whether to enable visual understanding.</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Storage type.</p><p>Enumeration values:</p><ul><li>0: Do not store.</li><li>1: Specify cloud storage. In such cases, the CloudStorage parameter is required.</li></ul><p>Default value: 0</p> 
     * @return StorageType <p>Storage type.</p><p>Enumeration values:</p><ul><li>0: Do not store.</li><li>1: Specify cloud storage. In such cases, the CloudStorage parameter is required.</li></ul><p>Default value: 0</p>
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type.</p><p>Enumeration values:</p><ul><li>0: Do not store.</li><li>1: Specify cloud storage. In such cases, the CloudStorage parameter is required.</li></ul><p>Default value: 0</p>
     * @param StorageType <p>Storage type.</p><p>Enumeration values:</p><ul><li>0: Do not store.</li><li>1: Specify cloud storage. In such cases, the CloudStorage parameter is required.</li></ul><p>Default value: 0</p>
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Third-party Cloud Storage archive configuration. After configuration, the backend will automatically upload I-frames received from the SDK to the designated cloud bucket for persistent storage.</p> 
     * @return CloudStorage <p>Third-party Cloud Storage archive configuration. After configuration, the backend will automatically upload I-frames received from the SDK to the designated cloud bucket for persistent storage.</p>
     */
    public CloudStorage getCloudStorage() {
        return this.CloudStorage;
    }

    /**
     * Set <p>Third-party Cloud Storage archive configuration. After configuration, the backend will automatically upload I-frames received from the SDK to the designated cloud bucket for persistent storage.</p>
     * @param CloudStorage <p>Third-party Cloud Storage archive configuration. After configuration, the backend will automatically upload I-frames received from the SDK to the designated cloud bucket for persistent storage.</p>
     */
    public void setCloudStorage(CloudStorage CloudStorage) {
        this.CloudStorage = CloudStorage;
    }

    public VoiceConversationVisionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationVisionConfig(VoiceConversationVisionConfig source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.CloudStorage != null) {
            this.CloudStorage = new CloudStorage(source.CloudStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamObj(map, prefix + "CloudStorage.", this.CloudStorage);

    }
}

