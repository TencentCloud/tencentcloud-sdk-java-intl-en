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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteKeyPairsRequest extends AbstractModel {

    /**
    * One or more key pair IDs to be operated. The maximum number of key pairs per request is 100.<br>You can obtain an available key pair ID in the following ways:<br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair ID.</li><br><li>Call the [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) API and obtain the key pair ID from the `KeyId` in the response.</li>
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
     * Get One or more key pair IDs to be operated. The maximum number of key pairs per request is 100.<br>You can obtain an available key pair ID in the following ways:<br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair ID.</li><br><li>Call the [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) API and obtain the key pair ID from the `KeyId` in the response.</li> 
     * @return KeyIds One or more key pair IDs to be operated. The maximum number of key pairs per request is 100.<br>You can obtain an available key pair ID in the following ways:<br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair ID.</li><br><li>Call the [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) API and obtain the key pair ID from the `KeyId` in the response.</li>
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set One or more key pair IDs to be operated. The maximum number of key pairs per request is 100.<br>You can obtain an available key pair ID in the following ways:<br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair ID.</li><br><li>Call the [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) API and obtain the key pair ID from the `KeyId` in the response.</li>
     * @param KeyIds One or more key pair IDs to be operated. The maximum number of key pairs per request is 100.<br>You can obtain an available key pair ID in the following ways:<br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair ID.</li><br><li>Call the [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) API and obtain the key pair ID from the `KeyId` in the response.</li>
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    public DeleteKeyPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteKeyPairsRequest(DeleteKeyPairsRequest source) {
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);

    }
}

