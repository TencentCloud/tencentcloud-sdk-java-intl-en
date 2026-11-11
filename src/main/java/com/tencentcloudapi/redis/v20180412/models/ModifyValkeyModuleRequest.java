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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyValkeyModuleRequest extends AbstractModel {

    /**
    * <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Specify the extension module to be modified.</p><p>Enumeration values:</p><ul><li>ValkeyBloom: Refers to the Bloom module, which can efficiently judge whether an element exists in a collection.</li><li>ValkeyJSON: Refers to the JSON module, which allows Redis to natively support the JSON data format, facilitating the storage and manipulation of JSON Objects.</li><li>ValkeySearch: Refers to the Search module, which provides a full-text search feature, enabling efficient search operations on data stored in Redis.</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Set the enable status of the extension module. Only support setting to ON to enable the extension module.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Specify the extension module to be modified.</p><p>Enumeration values:</p><ul><li>ValkeyBloom: Refers to the Bloom module, which can efficiently judge whether an element exists in a collection.</li><li>ValkeyJSON: Refers to the JSON module, which allows Redis to natively support the JSON data format, facilitating the storage and manipulation of JSON Objects.</li><li>ValkeySearch: Refers to the Search module, which provides a full-text search feature, enabling efficient search operations on data stored in Redis.</li></ul> 
     * @return Name <p>Specify the extension module to be modified.</p><p>Enumeration values:</p><ul><li>ValkeyBloom: Refers to the Bloom module, which can efficiently judge whether an element exists in a collection.</li><li>ValkeyJSON: Refers to the JSON module, which allows Redis to natively support the JSON data format, facilitating the storage and manipulation of JSON Objects.</li><li>ValkeySearch: Refers to the Search module, which provides a full-text search feature, enabling efficient search operations on data stored in Redis.</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Specify the extension module to be modified.</p><p>Enumeration values:</p><ul><li>ValkeyBloom: Refers to the Bloom module, which can efficiently judge whether an element exists in a collection.</li><li>ValkeyJSON: Refers to the JSON module, which allows Redis to natively support the JSON data format, facilitating the storage and manipulation of JSON Objects.</li><li>ValkeySearch: Refers to the Search module, which provides a full-text search feature, enabling efficient search operations on data stored in Redis.</li></ul>
     * @param Name <p>Specify the extension module to be modified.</p><p>Enumeration values:</p><ul><li>ValkeyBloom: Refers to the Bloom module, which can efficiently judge whether an element exists in a collection.</li><li>ValkeyJSON: Refers to the JSON module, which allows Redis to natively support the JSON data format, facilitating the storage and manipulation of JSON Objects.</li><li>ValkeySearch: Refers to the Search module, which provides a full-text search feature, enabling efficient search operations on data stored in Redis.</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Set the enable status of the extension module. Only support setting to ON to enable the extension module.</p> 
     * @return Status <p>Set the enable status of the extension module. Only support setting to ON to enable the extension module.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Set the enable status of the extension module. Only support setting to ON to enable the extension module.</p>
     * @param Status <p>Set the enable status of the extension module. Only support setting to ON to enable the extension module.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyValkeyModuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyValkeyModuleRequest(ModifyValkeyModuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

