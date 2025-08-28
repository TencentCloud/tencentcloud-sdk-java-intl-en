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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSSLRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Operation type. enable - enable SSL; disable - disable SSL; renew - update the validity period of the certificate.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Operation settings. 0 - execute immediately; 1 - execute within the maintenance time. The default value is 0.
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * Whether it is protected through KMS encryption. 0 - no; 1 - yes. The default value is 0.
    */
    @SerializedName("IsKMS")
    @Expose
    private Long IsKMS;

    /**
    * This parameter is required when the value of IsKMS is 1.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * This parameter is required when the value of IsKMS is 1.
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Operation type. enable - enable SSL; disable - disable SSL; renew - update the validity period of the certificate. 
     * @return Type Operation type. enable - enable SSL; disable - disable SSL; renew - update the validity period of the certificate.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Operation type. enable - enable SSL; disable - disable SSL; renew - update the validity period of the certificate.
     * @param Type Operation type. enable - enable SSL; disable - disable SSL; renew - update the validity period of the certificate.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Operation settings. 0 - execute immediately; 1 - execute within the maintenance time. The default value is 0. 
     * @return WaitSwitch Operation settings. 0 - execute immediately; 1 - execute within the maintenance time. The default value is 0.
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set Operation settings. 0 - execute immediately; 1 - execute within the maintenance time. The default value is 0.
     * @param WaitSwitch Operation settings. 0 - execute immediately; 1 - execute within the maintenance time. The default value is 0.
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get Whether it is protected through KMS encryption. 0 - no; 1 - yes. The default value is 0. 
     * @return IsKMS Whether it is protected through KMS encryption. 0 - no; 1 - yes. The default value is 0.
     */
    public Long getIsKMS() {
        return this.IsKMS;
    }

    /**
     * Set Whether it is protected through KMS encryption. 0 - no; 1 - yes. The default value is 0.
     * @param IsKMS Whether it is protected through KMS encryption. 0 - no; 1 - yes. The default value is 0.
     */
    public void setIsKMS(Long IsKMS) {
        this.IsKMS = IsKMS;
    }

    /**
     * Get This parameter is required when the value of IsKMS is 1. 
     * @return KeyId This parameter is required when the value of IsKMS is 1.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set This parameter is required when the value of IsKMS is 1.
     * @param KeyId This parameter is required when the value of IsKMS is 1.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get This parameter is required when the value of IsKMS is 1. 
     * @return KeyRegion This parameter is required when the value of IsKMS is 1.
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set This parameter is required when the value of IsKMS is 1.
     * @param KeyRegion This parameter is required when the value of IsKMS is 1.
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    public ModifyDBInstanceSSLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSSLRequest(ModifyDBInstanceSSLRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
        if (source.IsKMS != null) {
            this.IsKMS = new Long(source.IsKMS);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamSimple(map, prefix + "IsKMS", this.IsKMS);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);

    }
}

