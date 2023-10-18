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

public class KeyMetadata extends AbstractModel {

    /**
    * Globally unique CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Alias that makes a key more recognizable and understandable
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Key creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * CMK description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived.
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * CMK purpose. Valid values: `ENCRYPT_DECRYPT`, `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, `ASYMMETRIC_SIGN_VERIFY_SM2`, `ASYMMETRIC_SIGN_VERIFY_RSA_2048`, and `ASYMMETRIC_SIGN_VERIFY_ECC`.
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * CMK type. 2: FIPS-compliant; 4: SM-CRYPTO
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Creator
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * Whether key rotation is enabled
    */
    @SerializedName("KeyRotationEnabled")
    @Expose
    private Boolean KeyRotationEnabled;

    /**
    * CMK creator. The value of this parameter is `user` if the CMK is created by the user, or the corresponding service name if it is created automatically by an authorized Tencent Cloud service.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Time of next rotation if key rotation is enabled
    */
    @SerializedName("NextRotateTime")
    @Expose
    private Long NextRotateTime;

    /**
    * Scheduled deletion time
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
    * Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

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
     * Get Alias that makes a key more recognizable and understandable 
     * @return Alias Alias that makes a key more recognizable and understandable
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias that makes a key more recognizable and understandable
     * @param Alias Alias that makes a key more recognizable and understandable
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Key creation time 
     * @return CreateTime Key creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Key creation time
     * @param CreateTime Key creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get CMK description 
     * @return Description CMK description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set CMK description
     * @param Description CMK description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived. 
     * @return KeyState CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived.
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived.
     * @param KeyState CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived.
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get CMK purpose. Valid values: `ENCRYPT_DECRYPT`, `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, `ASYMMETRIC_SIGN_VERIFY_SM2`, `ASYMMETRIC_SIGN_VERIFY_RSA_2048`, and `ASYMMETRIC_SIGN_VERIFY_ECC`. 
     * @return KeyUsage CMK purpose. Valid values: `ENCRYPT_DECRYPT`, `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, `ASYMMETRIC_SIGN_VERIFY_SM2`, `ASYMMETRIC_SIGN_VERIFY_RSA_2048`, and `ASYMMETRIC_SIGN_VERIFY_ECC`.
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set CMK purpose. Valid values: `ENCRYPT_DECRYPT`, `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, `ASYMMETRIC_SIGN_VERIFY_SM2`, `ASYMMETRIC_SIGN_VERIFY_RSA_2048`, and `ASYMMETRIC_SIGN_VERIFY_ECC`.
     * @param KeyUsage CMK purpose. Valid values: `ENCRYPT_DECRYPT`, `ASYMMETRIC_DECRYPT_RSA_2048`, `ASYMMETRIC_DECRYPT_SM2`, `ASYMMETRIC_SIGN_VERIFY_SM2`, `ASYMMETRIC_SIGN_VERIFY_RSA_2048`, and `ASYMMETRIC_SIGN_VERIFY_ECC`.
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get CMK type. 2: FIPS-compliant; 4: SM-CRYPTO 
     * @return Type CMK type. 2: FIPS-compliant; 4: SM-CRYPTO
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set CMK type. 2: FIPS-compliant; 4: SM-CRYPTO
     * @param Type CMK type. 2: FIPS-compliant; 4: SM-CRYPTO
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Creator 
     * @return CreatorUin Creator
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Creator
     * @param CreatorUin Creator
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Whether key rotation is enabled 
     * @return KeyRotationEnabled Whether key rotation is enabled
     */
    public Boolean getKeyRotationEnabled() {
        return this.KeyRotationEnabled;
    }

    /**
     * Set Whether key rotation is enabled
     * @param KeyRotationEnabled Whether key rotation is enabled
     */
    public void setKeyRotationEnabled(Boolean KeyRotationEnabled) {
        this.KeyRotationEnabled = KeyRotationEnabled;
    }

    /**
     * Get CMK creator. The value of this parameter is `user` if the CMK is created by the user, or the corresponding service name if it is created automatically by an authorized Tencent Cloud service. 
     * @return Owner CMK creator. The value of this parameter is `user` if the CMK is created by the user, or the corresponding service name if it is created automatically by an authorized Tencent Cloud service.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set CMK creator. The value of this parameter is `user` if the CMK is created by the user, or the corresponding service name if it is created automatically by an authorized Tencent Cloud service.
     * @param Owner CMK creator. The value of this parameter is `user` if the CMK is created by the user, or the corresponding service name if it is created automatically by an authorized Tencent Cloud service.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Time of next rotation if key rotation is enabled 
     * @return NextRotateTime Time of next rotation if key rotation is enabled
     */
    public Long getNextRotateTime() {
        return this.NextRotateTime;
    }

    /**
     * Set Time of next rotation if key rotation is enabled
     * @param NextRotateTime Time of next rotation if key rotation is enabled
     */
    public void setNextRotateTime(Long NextRotateTime) {
        this.NextRotateTime = NextRotateTime;
    }

    /**
     * Get Scheduled deletion time 
     * @return DeletionDate Scheduled deletion time
     */
    public Long getDeletionDate() {
        return this.DeletionDate;
    }

    /**
     * Set Scheduled deletion time
     * @param DeletionDate Scheduled deletion time
     */
    public void setDeletionDate(Long DeletionDate) {
        this.DeletionDate = DeletionDate;
    }

    /**
     * Get CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Origin CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Origin CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidTo It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidTo It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * Get Resource ID in the format of `creatorUin/$creatorUin/$keyId`. 
     * @return ResourceId Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
     * @param ResourceId Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return HsmClusterId ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param HsmClusterId ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    public KeyMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyMetadata(KeyMetadata source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KeyState != null) {
            this.KeyState = new String(source.KeyState);
        }
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new Long(source.CreatorUin);
        }
        if (source.KeyRotationEnabled != null) {
            this.KeyRotationEnabled = new Boolean(source.KeyRotationEnabled);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.NextRotateTime != null) {
            this.NextRotateTime = new Long(source.NextRotateTime);
        }
        if (source.DeletionDate != null) {
            this.DeletionDate = new Long(source.DeletionDate);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.ValidTo != null) {
            this.ValidTo = new Long(source.ValidTo);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "KeyRotationEnabled", this.KeyRotationEnabled);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "NextRotateTime", this.NextRotateTime);
        this.setParamSimple(map, prefix + "DeletionDate", this.DeletionDate);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);

    }
}

