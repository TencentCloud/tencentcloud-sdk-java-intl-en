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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCustomizedConfigForLoadBalancerRequest extends AbstractModel {

    /**
    * Operation type: `ADD`, `DELETE`, `UPDATE`, `BIND`, `UNBIND`
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * This field is required except for creating custom configurations, such as "pz-1234abcd".
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
    * This field is required when creating or modifying custom configurations.
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * This field is required when creating or renaming custom configurations.
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * This field is required when binding/unbinding resources.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
     * Get Operation type: `ADD`, `DELETE`, `UPDATE`, `BIND`, `UNBIND` 
     * @return OperationType Operation type: `ADD`, `DELETE`, `UPDATE`, `BIND`, `UNBIND`
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Operation type: `ADD`, `DELETE`, `UPDATE`, `BIND`, `UNBIND`
     * @param OperationType Operation type: `ADD`, `DELETE`, `UPDATE`, `BIND`, `UNBIND`
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get This field is required except for creating custom configurations, such as "pz-1234abcd". 
     * @return UconfigId This field is required except for creating custom configurations, such as "pz-1234abcd".
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set This field is required except for creating custom configurations, such as "pz-1234abcd".
     * @param UconfigId This field is required except for creating custom configurations, such as "pz-1234abcd".
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    /**
     * Get This field is required when creating or modifying custom configurations. 
     * @return ConfigContent This field is required when creating or modifying custom configurations.
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set This field is required when creating or modifying custom configurations.
     * @param ConfigContent This field is required when creating or modifying custom configurations.
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get This field is required when creating or renaming custom configurations. 
     * @return ConfigName This field is required when creating or renaming custom configurations.
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set This field is required when creating or renaming custom configurations.
     * @param ConfigName This field is required when creating or renaming custom configurations.
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get This field is required when binding/unbinding resources. 
     * @return LoadBalancerIds This field is required when binding/unbinding resources.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set This field is required when binding/unbinding resources.
     * @param LoadBalancerIds This field is required when binding/unbinding resources.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
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
        if (source.UconfigId != null) {
            this.UconfigId = new String(source.UconfigId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "UconfigId", this.UconfigId);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);

    }
}

