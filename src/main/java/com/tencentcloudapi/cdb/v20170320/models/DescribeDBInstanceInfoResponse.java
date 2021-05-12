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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceInfoResponse extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Whether encryption is enabled. YES: enabled, NO: not enabled.
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * Encryption key ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key region.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * The default region of the KMS service currently used by the TencentDB backend service.
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("DefaultKmsRegion")
    @Expose
    private String DefaultKmsRegion;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Whether encryption is enabled. YES: enabled, NO: not enabled. 
     * @return Encryption Whether encryption is enabled. YES: enabled, NO: not enabled.
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set Whether encryption is enabled. YES: enabled, NO: not enabled.
     * @param Encryption Whether encryption is enabled. YES: enabled, NO: not enabled.
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get Encryption key ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyId Encryption key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Encryption key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyId Encryption key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Key region.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyRegion Key region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set Key region.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyRegion Key region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get The default region of the KMS service currently used by the TencentDB backend service.
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return DefaultKmsRegion The default region of the KMS service currently used by the TencentDB backend service.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getDefaultKmsRegion() {
        return this.DefaultKmsRegion;
    }

    /**
     * Set The default region of the KMS service currently used by the TencentDB backend service.
Note: this field may return `null`, indicating that no valid value can be found.
     * @param DefaultKmsRegion The default region of the KMS service currently used by the TencentDB backend service.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setDefaultKmsRegion(String DefaultKmsRegion) {
        this.DefaultKmsRegion = DefaultKmsRegion;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBInstanceInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceInfoResponse(DescribeDBInstanceInfoResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
        if (source.DefaultKmsRegion != null) {
            this.DefaultKmsRegion = new String(source.DefaultKmsRegion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "DefaultKmsRegion", this.DefaultKmsRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

