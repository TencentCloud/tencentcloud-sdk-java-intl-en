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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenDBInstanceEncryptionRequest extends AbstractModel {

    /**
    * Cloud database instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Custom key ID, the unique identifier of CMK. If left empty, the automatically generated key KMS-CDB by using Tencent Cloud will be used.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Storage region of the custom key. For example: ap-guangzhou. This parameter is required when KeyId is not empty.
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
     * Get Cloud database instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Cloud database instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cloud database instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Cloud database instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Custom key ID, the unique identifier of CMK. If left empty, the automatically generated key KMS-CDB by using Tencent Cloud will be used. 
     * @return KeyId Custom key ID, the unique identifier of CMK. If left empty, the automatically generated key KMS-CDB by using Tencent Cloud will be used.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Custom key ID, the unique identifier of CMK. If left empty, the automatically generated key KMS-CDB by using Tencent Cloud will be used.
     * @param KeyId Custom key ID, the unique identifier of CMK. If left empty, the automatically generated key KMS-CDB by using Tencent Cloud will be used.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Storage region of the custom key. For example: ap-guangzhou. This parameter is required when KeyId is not empty. 
     * @return KeyRegion Storage region of the custom key. For example: ap-guangzhou. This parameter is required when KeyId is not empty.
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set Storage region of the custom key. For example: ap-guangzhou. This parameter is required when KeyId is not empty.
     * @param KeyRegion Storage region of the custom key. For example: ap-guangzhou. This parameter is required when KeyId is not empty.
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    public OpenDBInstanceEncryptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenDBInstanceEncryptionRequest(OpenDBInstanceEncryptionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);

    }
}

