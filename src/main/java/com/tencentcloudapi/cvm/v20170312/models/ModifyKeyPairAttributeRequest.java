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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyKeyPairAttributeRequest extends AbstractModel{

    /**
    * Key pair ID in the format of `skey-xxxxxxxx`. <br><br>You can obtain the available key pair IDs in two ways: <br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair IDs. <br><li>Call [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) and look for `KeyId` in the response.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * New key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * New key pair description. You can specify any name you like, but its length cannot exceed 60 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Key pair ID in the format of `skey-xxxxxxxx`. <br><br>You can obtain the available key pair IDs in two ways: <br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair IDs. <br><li>Call [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) and look for `KeyId` in the response. 
     * @return KeyId Key pair ID in the format of `skey-xxxxxxxx`. <br><br>You can obtain the available key pair IDs in two ways: <br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair IDs. <br><li>Call [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) and look for `KeyId` in the response.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Key pair ID in the format of `skey-xxxxxxxx`. <br><br>You can obtain the available key pair IDs in two ways: <br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair IDs. <br><li>Call [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) and look for `KeyId` in the response.
     * @param KeyId Key pair ID in the format of `skey-xxxxxxxx`. <br><br>You can obtain the available key pair IDs in two ways: <br><li>Log in to the [console](https://console.cloud.tencent.com/cvm/sshkey) to query the key pair IDs. <br><li>Call [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) and look for `KeyId` in the response.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get New key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters. 
     * @return KeyName New key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set New key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters.
     * @param KeyName New key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get New key pair description. You can specify any name you like, but its length cannot exceed 60 characters. 
     * @return Description New key pair description. You can specify any name you like, but its length cannot exceed 60 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set New key pair description. You can specify any name you like, but its length cannot exceed 60 characters.
     * @param Description New key pair description. You can specify any name you like, but its length cannot exceed 60 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

