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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCustomizedConfigForLoadBalancerRequest extends AbstractModel {

    /**
    * Operation type.
-ADD
- DELETE: delete.
-UPDATE: Modify
-BIND: bind
-UNBIND: unbound
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * This field is required except for creating custom configurations. Example: pz-1234abcd
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Personalized configuration content. This field is required when creating custom configuration or modifying the content of custom configuration.
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * This field is required when you create or modify the name of a custom configuration.
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * Load balancing instance ID. This field is required for bind/unbind.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Operation type.
-ADD
- DELETE: delete.
-UPDATE: Modify
-BIND: bind
-UNBIND: unbound 
     * @return OperationType Operation type.
-ADD
- DELETE: delete.
-UPDATE: Modify
-BIND: bind
-UNBIND: unbound
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Operation type.
-ADD
- DELETE: delete.
-UPDATE: Modify
-BIND: bind
-UNBIND: unbound
     * @param OperationType Operation type.
-ADD
- DELETE: delete.
-UPDATE: Modify
-BIND: bind
-UNBIND: unbound
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get This field is required except for creating custom configurations. Example: pz-1234abcd 
     * @return ConfigId This field is required except for creating custom configurations. Example: pz-1234abcd
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set This field is required except for creating custom configurations. Example: pz-1234abcd
     * @param ConfigId This field is required except for creating custom configurations. Example: pz-1234abcd
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Personalized configuration content. This field is required when creating custom configuration or modifying the content of custom configuration. 
     * @return ConfigContent Personalized configuration content. This field is required when creating custom configuration or modifying the content of custom configuration.
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set Personalized configuration content. This field is required when creating custom configuration or modifying the content of custom configuration.
     * @param ConfigContent Personalized configuration content. This field is required when creating custom configuration or modifying the content of custom configuration.
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get This field is required when you create or modify the name of a custom configuration. 
     * @return ConfigName This field is required when you create or modify the name of a custom configuration.
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set This field is required when you create or modify the name of a custom configuration.
     * @param ConfigName This field is required when you create or modify the name of a custom configuration.
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get Load balancing instance ID. This field is required for bind/unbind. 
     * @return LoadBalancerIds Load balancing instance ID. This field is required for bind/unbind.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set Load balancing instance ID. This field is required for bind/unbind.
     * @param LoadBalancerIds Load balancing instance ID. This field is required for bind/unbind.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public SetCustomizedConfigForLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetCustomizedConfigForLoadBalancerRequest(SetCustomizedConfigForLoadBalancerRequest source) {
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ConfigContent != null) {
            this.ConfigContent = new String(source.ConfigContent);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

