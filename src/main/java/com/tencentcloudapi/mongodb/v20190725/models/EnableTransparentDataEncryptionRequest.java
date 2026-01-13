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

public class EnableTransparentDataEncryptionRequest extends AbstractModel {

    /**
    * Instance ID. For example, cmgo-p8vn****. Log in to the[TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb) to copy the instance ID from the instance list. Currently, the supported general versions include 4.4 and 5.0, and Cloud Disk Edition is not supported.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    *  Region where the [Key Management Service (KMS)](https://www.tencentcloud.com/document/product/573/18809?from_cn_redirect=1) instance is located. For example, ap-shanghai.
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * Key ID. If the parameter is left unspecified, there is no specific key ID, Tencent Cloud will generate the key automatically.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
     * Get Instance ID. For example, cmgo-p8vn****. Log in to the[TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb) to copy the instance ID from the instance list. Currently, the supported general versions include 4.4 and 5.0, and Cloud Disk Edition is not supported. 
     * @return InstanceId Instance ID. For example, cmgo-p8vn****. Log in to the[TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb) to copy the instance ID from the instance list. Currently, the supported general versions include 4.4 and 5.0, and Cloud Disk Edition is not supported.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. For example, cmgo-p8vn****. Log in to the[TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb) to copy the instance ID from the instance list. Currently, the supported general versions include 4.4 and 5.0, and Cloud Disk Edition is not supported.
     * @param InstanceId Instance ID. For example, cmgo-p8vn****. Log in to the[TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb) to copy the instance ID from the instance list. Currently, the supported general versions include 4.4 and 5.0, and Cloud Disk Edition is not supported.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get  Region where the [Key Management Service (KMS)](https://www.tencentcloud.com/document/product/573/18809?from_cn_redirect=1) instance is located. For example, ap-shanghai. 
     * @return KmsRegion  Region where the [Key Management Service (KMS)](https://www.tencentcloud.com/document/product/573/18809?from_cn_redirect=1) instance is located. For example, ap-shanghai.
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set  Region where the [Key Management Service (KMS)](https://www.tencentcloud.com/document/product/573/18809?from_cn_redirect=1) instance is located. For example, ap-shanghai.
     * @param KmsRegion  Region where the [Key Management Service (KMS)](https://www.tencentcloud.com/document/product/573/18809?from_cn_redirect=1) instance is located. For example, ap-shanghai.
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    /**
     * Get Key ID. If the parameter is left unspecified, there is no specific key ID, Tencent Cloud will generate the key automatically. 
     * @return KeyId Key ID. If the parameter is left unspecified, there is no specific key ID, Tencent Cloud will generate the key automatically.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Key ID. If the parameter is left unspecified, there is no specific key ID, Tencent Cloud will generate the key automatically.
     * @param KeyId Key ID. If the parameter is left unspecified, there is no specific key ID, Tencent Cloud will generate the key automatically.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    public EnableTransparentDataEncryptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableTransparentDataEncryptionRequest(EnableTransparentDataEncryptionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

