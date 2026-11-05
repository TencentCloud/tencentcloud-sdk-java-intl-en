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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBSpec extends AbstractModel {

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>ES configuration</p>
    */
    @SerializedName("EsConfig")
    @Expose
    private ESConfig EsConfig;

    /**
    * <p>Model configuration</p>
    */
    @SerializedName("ModelConfig")
    @Expose
    private KBModelConfig ModelConfig;

    /**
    * <p>Knowledge base name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Owner ID</p>
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>ES configuration</p> 
     * @return EsConfig <p>ES configuration</p>
     */
    public ESConfig getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set <p>ES configuration</p>
     * @param EsConfig <p>ES configuration</p>
     */
    public void setEsConfig(ESConfig EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get <p>Model configuration</p> 
     * @return ModelConfig <p>Model configuration</p>
     */
    public KBModelConfig getModelConfig() {
        return this.ModelConfig;
    }

    /**
     * Set <p>Model configuration</p>
     * @param ModelConfig <p>Model configuration</p>
     */
    public void setModelConfig(KBModelConfig ModelConfig) {
        this.ModelConfig = ModelConfig;
    }

    /**
     * Get <p>Knowledge base name</p> 
     * @return Name <p>Knowledge base name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Knowledge base name</p>
     * @param Name <p>Knowledge base name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Owner ID</p> 
     * @return OwnerId <p>Owner ID</p>
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set <p>Owner ID</p>
     * @param OwnerId <p>Owner ID</p>
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public KBSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBSpec(KBSpec source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EsConfig != null) {
            this.EsConfig = new ESConfig(source.EsConfig);
        }
        if (source.ModelConfig != null) {
            this.ModelConfig = new KBModelConfig(source.ModelConfig);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "EsConfig.", this.EsConfig);
        this.setParamObj(map, prefix + "ModelConfig.", this.ModelConfig);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);

    }
}

