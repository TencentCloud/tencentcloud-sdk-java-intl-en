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

public class ModelProviderBasic extends AbstractModel {

    /**
    * <p>Model provider alias</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>Model provider name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Model provider type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>Self-owned provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>Custom model provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>Third-party model provider</td></tr></table>
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
     * Get <p>Model provider alias</p> 
     * @return Alias <p>Model provider alias</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>Model provider alias</p>
     * @param Alias <p>Model provider alias</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>Model provider name</p> 
     * @return Name <p>Model provider name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Model provider name</p>
     * @param Name <p>Model provider name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Model provider type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>Self-owned provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>Custom model provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>Third-party model provider</td></tr></table> 
     * @return ProviderType <p>Model provider type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>Self-owned provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>Custom model provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>Third-party model provider</td></tr></table>
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set <p>Model provider type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>Self-owned provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>Custom model provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>Third-party model provider</td></tr></table>
     * @param ProviderType <p>Model provider type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>Self-owned provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>Custom model provider</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>Third-party model provider</td></tr></table>
     */
    public void setProviderType(Long ProviderType) {
        this.ProviderType = ProviderType;
    }

    public ModelProviderBasic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelProviderBasic(ModelProviderBasic source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProviderType != null) {
            this.ProviderType = new Long(source.ProviderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);

    }
}

