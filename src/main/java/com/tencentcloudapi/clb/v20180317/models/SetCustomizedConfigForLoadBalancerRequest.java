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
    * Operation type.
-ADD. specifies the creation.
- DELETE: DELETE.
-UPDATE: modify.
-BIND: specifies the binding status.
-UNBIND: unbind.
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * Personalized configuration ID. this field is required except when creating a custom configuration, for example: pz-1234abcd.
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
    * Specifies the personalized configuration content. this field is required when creating or modifying custom configuration.
Specifies specific restrictions. view layer-7 personalized configuration (https://www.tencentcloud.com/document/product/214/15171?from_cn_redirect=1).
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * Custom configuration name. specifies the name when creating or modifying a custom configuration. this field is required.
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * CLB instance ID. this field is required for bind/unbind operations.
Can be queried through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) api.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
     * Get Operation type.
-ADD. specifies the creation.
- DELETE: DELETE.
-UPDATE: modify.
-BIND: specifies the binding status.
-UNBIND: unbind. 
     * @return OperationType Operation type.
-ADD. specifies the creation.
- DELETE: DELETE.
-UPDATE: modify.
-BIND: specifies the binding status.
-UNBIND: unbind.
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Operation type.
-ADD. specifies the creation.
- DELETE: DELETE.
-UPDATE: modify.
-BIND: specifies the binding status.
-UNBIND: unbind.
     * @param OperationType Operation type.
-ADD. specifies the creation.
- DELETE: DELETE.
-UPDATE: modify.
-BIND: specifies the binding status.
-UNBIND: unbind.
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get Personalized configuration ID. this field is required except when creating a custom configuration, for example: pz-1234abcd. 
     * @return UconfigId Personalized configuration ID. this field is required except when creating a custom configuration, for example: pz-1234abcd.
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set Personalized configuration ID. this field is required except when creating a custom configuration, for example: pz-1234abcd.
     * @param UconfigId Personalized configuration ID. this field is required except when creating a custom configuration, for example: pz-1234abcd.
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    /**
     * Get Specifies the personalized configuration content. this field is required when creating or modifying custom configuration.
Specifies specific restrictions. view layer-7 personalized configuration (https://www.tencentcloud.com/document/product/214/15171?from_cn_redirect=1). 
     * @return ConfigContent Specifies the personalized configuration content. this field is required when creating or modifying custom configuration.
Specifies specific restrictions. view layer-7 personalized configuration (https://www.tencentcloud.com/document/product/214/15171?from_cn_redirect=1).
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set Specifies the personalized configuration content. this field is required when creating or modifying custom configuration.
Specifies specific restrictions. view layer-7 personalized configuration (https://www.tencentcloud.com/document/product/214/15171?from_cn_redirect=1).
     * @param ConfigContent Specifies the personalized configuration content. this field is required when creating or modifying custom configuration.
Specifies specific restrictions. view layer-7 personalized configuration (https://www.tencentcloud.com/document/product/214/15171?from_cn_redirect=1).
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get Custom configuration name. specifies the name when creating or modifying a custom configuration. this field is required. 
     * @return ConfigName Custom configuration name. specifies the name when creating or modifying a custom configuration. this field is required.
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Custom configuration name. specifies the name when creating or modifying a custom configuration. this field is required.
     * @param ConfigName Custom configuration name. specifies the name when creating or modifying a custom configuration. this field is required.
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get CLB instance ID. this field is required for bind/unbind operations.
Can be queried through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) api. 
     * @return LoadBalancerIds CLB instance ID. this field is required for bind/unbind operations.
Can be queried through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) api.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set CLB instance ID. this field is required for bind/unbind operations.
Can be queried through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) api.
     * @param LoadBalancerIds CLB instance ID. this field is required for bind/unbind operations.
Can be queried through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) api.
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

