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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamsRequest extends AbstractModel {

    /**
    * Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the parameter name and value to be modified. For details about the currently supported parameter names and the corresponding valid values, see [DescribeInstanceParams](https://www.tencentcloud.comom/document/product/240/65903?from_cn_redirect=1).
    */
    @SerializedName("InstanceParams")
    @Expose
    private ModifyMongoDBParamType [] InstanceParams;

    /**
    * Operation type. Valid values:
- IMMEDIATELY: immediate adjustment.
- DELAY: delayed adjustment. It is an optional field. The default value is immediate adjustment if this parameter is left unspecified.
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
     * Get Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
 
     * @return InstanceId Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

     * @param InstanceId Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the parameter name and value to be modified. For details about the currently supported parameter names and the corresponding valid values, see [DescribeInstanceParams](https://www.tencentcloud.comom/document/product/240/65903?from_cn_redirect=1). 
     * @return InstanceParams Specifies the parameter name and value to be modified. For details about the currently supported parameter names and the corresponding valid values, see [DescribeInstanceParams](https://www.tencentcloud.comom/document/product/240/65903?from_cn_redirect=1).
     */
    public ModifyMongoDBParamType [] getInstanceParams() {
        return this.InstanceParams;
    }

    /**
     * Set Specifies the parameter name and value to be modified. For details about the currently supported parameter names and the corresponding valid values, see [DescribeInstanceParams](https://www.tencentcloud.comom/document/product/240/65903?from_cn_redirect=1).
     * @param InstanceParams Specifies the parameter name and value to be modified. For details about the currently supported parameter names and the corresponding valid values, see [DescribeInstanceParams](https://www.tencentcloud.comom/document/product/240/65903?from_cn_redirect=1).
     */
    public void setInstanceParams(ModifyMongoDBParamType [] InstanceParams) {
        this.InstanceParams = InstanceParams;
    }

    /**
     * Get Operation type. Valid values:
- IMMEDIATELY: immediate adjustment.
- DELAY: delayed adjustment. It is an optional field. The default value is immediate adjustment if this parameter is left unspecified. 
     * @return ModifyType Operation type. Valid values:
- IMMEDIATELY: immediate adjustment.
- DELAY: delayed adjustment. It is an optional field. The default value is immediate adjustment if this parameter is left unspecified.
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Operation type. Valid values:
- IMMEDIATELY: immediate adjustment.
- DELAY: delayed adjustment. It is an optional field. The default value is immediate adjustment if this parameter is left unspecified.
     * @param ModifyType Operation type. Valid values:
- IMMEDIATELY: immediate adjustment.
- DELAY: delayed adjustment. It is an optional field. The default value is immediate adjustment if this parameter is left unspecified.
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    public ModifyInstanceParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceParamsRequest(ModifyInstanceParamsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceParams != null) {
            this.InstanceParams = new ModifyMongoDBParamType[source.InstanceParams.length];
            for (int i = 0; i < source.InstanceParams.length; i++) {
                this.InstanceParams[i] = new ModifyMongoDBParamType(source.InstanceParams[i]);
            }
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "InstanceParams.", this.InstanceParams);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);

    }
}

