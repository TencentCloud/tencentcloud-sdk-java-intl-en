/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateDataKeyRequest extends AbstractModel{

    /**
    * Globally unique CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified.
    */
    @SerializedName("KeySpec")
    @Expose
    private String KeySpec;

    /**
    * Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified.
    */
    @SerializedName("NumberOfBytes")
    @Expose
    private Long NumberOfBytes;

    /**
    * JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted.
    */
    @SerializedName("EncryptionContext")
    @Expose
    private String EncryptionContext;

    /**
     * Get Globally unique CMK ID 
     * @return KeyId Globally unique CMK ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique CMK ID
     * @param KeyId Globally unique CMK ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified. 
     * @return KeySpec Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified.
     */
    public String getKeySpec() {
        return this.KeySpec;
    }

    /**
     * Set Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified.
     * @param KeySpec Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified.
     */
    public void setKeySpec(String KeySpec) {
        this.KeySpec = KeySpec;
    }

    /**
     * Get Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified. 
     * @return NumberOfBytes Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified.
     */
    public Long getNumberOfBytes() {
        return this.NumberOfBytes;
    }

    /**
     * Set Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified.
     * @param NumberOfBytes Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified.
     */
    public void setNumberOfBytes(Long NumberOfBytes) {
        this.NumberOfBytes = NumberOfBytes;
    }

    /**
     * Get JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted. 
     * @return EncryptionContext JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted.
     */
    public String getEncryptionContext() {
        return this.EncryptionContext;
    }

    /**
     * Set JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted.
     * @param EncryptionContext JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted.
     */
    public void setEncryptionContext(String EncryptionContext) {
        this.EncryptionContext = EncryptionContext;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeySpec", this.KeySpec);
        this.setParamSimple(map, prefix + "NumberOfBytes", this.NumberOfBytes);
        this.setParamSimple(map, prefix + "EncryptionContext", this.EncryptionContext);

    }
}

