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

public class SPEKEDrm extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 
    */
    @SerializedName("KeyServerUrl")
    @Expose
    private String KeyServerUrl;

    /**
    * 
    */
    @SerializedName("Vector")
    @Expose
    private String Vector;

    /**
    * 
    */
    @SerializedName("EncryptionMethod")
    @Expose
    private String EncryptionMethod;

    /**
    * 
    */
    @SerializedName("EncryptionPreset")
    @Expose
    private String EncryptionPreset;

    /**
    * 
    */
    @SerializedName("KeyAcquireMode")
    @Expose
    private String KeyAcquireMode;

    /**
     * Get  
     * @return ResourceId 
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 
     * @param ResourceId 
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get  
     * @return KeyServerUrl 
     */
    public String getKeyServerUrl() {
        return this.KeyServerUrl;
    }

    /**
     * Set 
     * @param KeyServerUrl 
     */
    public void setKeyServerUrl(String KeyServerUrl) {
        this.KeyServerUrl = KeyServerUrl;
    }

    /**
     * Get  
     * @return Vector 
     */
    public String getVector() {
        return this.Vector;
    }

    /**
     * Set 
     * @param Vector 
     */
    public void setVector(String Vector) {
        this.Vector = Vector;
    }

    /**
     * Get  
     * @return EncryptionMethod 
     */
    public String getEncryptionMethod() {
        return this.EncryptionMethod;
    }

    /**
     * Set 
     * @param EncryptionMethod 
     */
    public void setEncryptionMethod(String EncryptionMethod) {
        this.EncryptionMethod = EncryptionMethod;
    }

    /**
     * Get  
     * @return EncryptionPreset 
     */
    public String getEncryptionPreset() {
        return this.EncryptionPreset;
    }

    /**
     * Set 
     * @param EncryptionPreset 
     */
    public void setEncryptionPreset(String EncryptionPreset) {
        this.EncryptionPreset = EncryptionPreset;
    }

    /**
     * Get  
     * @return KeyAcquireMode 
     */
    public String getKeyAcquireMode() {
        return this.KeyAcquireMode;
    }

    /**
     * Set 
     * @param KeyAcquireMode 
     */
    public void setKeyAcquireMode(String KeyAcquireMode) {
        this.KeyAcquireMode = KeyAcquireMode;
    }

    public SPEKEDrm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SPEKEDrm(SPEKEDrm source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.KeyServerUrl != null) {
            this.KeyServerUrl = new String(source.KeyServerUrl);
        }
        if (source.Vector != null) {
            this.Vector = new String(source.Vector);
        }
        if (source.EncryptionMethod != null) {
            this.EncryptionMethod = new String(source.EncryptionMethod);
        }
        if (source.EncryptionPreset != null) {
            this.EncryptionPreset = new String(source.EncryptionPreset);
        }
        if (source.KeyAcquireMode != null) {
            this.KeyAcquireMode = new String(source.KeyAcquireMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "KeyServerUrl", this.KeyServerUrl);
        this.setParamSimple(map, prefix + "Vector", this.Vector);
        this.setParamSimple(map, prefix + "EncryptionMethod", this.EncryptionMethod);
        this.setParamSimple(map, prefix + "EncryptionPreset", this.EncryptionPreset);
        this.setParamSimple(map, prefix + "KeyAcquireMode", this.KeyAcquireMode);

    }
}

