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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverwriteWhiteBoxDeviceFingerprintsRequest extends AbstractModel {

    /**
    * White-box key ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Device fingerprint list. If the list is empty, it means to delete all fingerprint information corresponding to the key. There can be up to 200 entries in the list.
    */
    @SerializedName("DeviceFingerprints")
    @Expose
    private DeviceFingerprint [] DeviceFingerprints;

    /**
     * Get White-box key ID 
     * @return KeyId White-box key ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set White-box key ID
     * @param KeyId White-box key ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Device fingerprint list. If the list is empty, it means to delete all fingerprint information corresponding to the key. There can be up to 200 entries in the list. 
     * @return DeviceFingerprints Device fingerprint list. If the list is empty, it means to delete all fingerprint information corresponding to the key. There can be up to 200 entries in the list.
     */
    public DeviceFingerprint [] getDeviceFingerprints() {
        return this.DeviceFingerprints;
    }

    /**
     * Set Device fingerprint list. If the list is empty, it means to delete all fingerprint information corresponding to the key. There can be up to 200 entries in the list.
     * @param DeviceFingerprints Device fingerprint list. If the list is empty, it means to delete all fingerprint information corresponding to the key. There can be up to 200 entries in the list.
     */
    public void setDeviceFingerprints(DeviceFingerprint [] DeviceFingerprints) {
        this.DeviceFingerprints = DeviceFingerprints;
    }

    public OverwriteWhiteBoxDeviceFingerprintsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverwriteWhiteBoxDeviceFingerprintsRequest(OverwriteWhiteBoxDeviceFingerprintsRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.DeviceFingerprints != null) {
            this.DeviceFingerprints = new DeviceFingerprint[source.DeviceFingerprints.length];
            for (int i = 0; i < source.DeviceFingerprints.length; i++) {
                this.DeviceFingerprints[i] = new DeviceFingerprint(source.DeviceFingerprints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamArrayObj(map, prefix + "DeviceFingerprints.", this.DeviceFingerprints);

    }
}

