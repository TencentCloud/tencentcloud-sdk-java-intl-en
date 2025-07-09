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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProductSecretRequest extends AbstractModel {

    /**
    * Credential name, which must be unique in the same region. It can contain 128 bytes of letters, digits, hyphens, and underscores and must begin with a letter or digit.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Prefix of the user account name, which is specified by you and can contain up to 8 characters.
Supported character sets include:
Digits: [0, 9].
Lowercase letters: [a, z].
Uppercase letters: [A, Z].
Special symbols: underscore.
The prefix must begin with a letter.
    */
    @SerializedName("UserNamePrefix")
    @Expose
    private String UserNamePrefix;

    /**
    * Name of the Tencent Cloud service bound to the credential, such as `Mysql`. The `DescribeSupportedProducts` API can be used to get the names of the supported Tencent Cloud services.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Tencent Cloud service instance ID.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Domain name of the account in the form of IP. You can enter `%`.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * List of permissions that need to be granted when the credential is bound to a Tencent Cloud service.
    */
    @SerializedName("PrivilegesList")
    @Expose
    private ProductPrivilegeUnit [] PrivilegesList;

    /**
    * Description, which is used to describe the purpose in detail and can contain up to 2,048 bytes.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Specifies the KMS CMK that encrypts the credential.
If this parameter is left empty, the CMK created by Secrets Manager by default will be used for encryption.
You can also specify a custom KMS CMK created in the same region for encryption.
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * List of tags.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * User-Defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `True`, this parameter is required.
    */
    @SerializedName("RotationBeginTime")
    @Expose
    private String RotationBeginTime;

    /**
    * Specifies whether to enable rotation
True - enable
False - do not enable
If this parameter is not specified, `False` will be used by default.
    */
    @SerializedName("EnableRotation")
    @Expose
    private Boolean EnableRotation;

    /**
    * Rotation frequency in days. Default value: 1 day.
    */
    @SerializedName("RotationFrequency")
    @Expose
    private Long RotationFrequency;

    /**
     * Get Credential name, which must be unique in the same region. It can contain 128 bytes of letters, digits, hyphens, and underscores and must begin with a letter or digit. 
     * @return SecretName Credential name, which must be unique in the same region. It can contain 128 bytes of letters, digits, hyphens, and underscores and must begin with a letter or digit.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Credential name, which must be unique in the same region. It can contain 128 bytes of letters, digits, hyphens, and underscores and must begin with a letter or digit.
     * @param SecretName Credential name, which must be unique in the same region. It can contain 128 bytes of letters, digits, hyphens, and underscores and must begin with a letter or digit.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Prefix of the user account name, which is specified by you and can contain up to 8 characters.
Supported character sets include:
Digits: [0, 9].
Lowercase letters: [a, z].
Uppercase letters: [A, Z].
Special symbols: underscore.
The prefix must begin with a letter. 
     * @return UserNamePrefix Prefix of the user account name, which is specified by you and can contain up to 8 characters.
Supported character sets include:
Digits: [0, 9].
Lowercase letters: [a, z].
Uppercase letters: [A, Z].
Special symbols: underscore.
The prefix must begin with a letter.
     */
    public String getUserNamePrefix() {
        return this.UserNamePrefix;
    }

    /**
     * Set Prefix of the user account name, which is specified by you and can contain up to 8 characters.
Supported character sets include:
Digits: [0, 9].
Lowercase letters: [a, z].
Uppercase letters: [A, Z].
Special symbols: underscore.
The prefix must begin with a letter.
     * @param UserNamePrefix Prefix of the user account name, which is specified by you and can contain up to 8 characters.
Supported character sets include:
Digits: [0, 9].
Lowercase letters: [a, z].
Uppercase letters: [A, Z].
Special symbols: underscore.
The prefix must begin with a letter.
     */
    public void setUserNamePrefix(String UserNamePrefix) {
        this.UserNamePrefix = UserNamePrefix;
    }

    /**
     * Get Name of the Tencent Cloud service bound to the credential, such as `Mysql`. The `DescribeSupportedProducts` API can be used to get the names of the supported Tencent Cloud services. 
     * @return ProductName Name of the Tencent Cloud service bound to the credential, such as `Mysql`. The `DescribeSupportedProducts` API can be used to get the names of the supported Tencent Cloud services.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Name of the Tencent Cloud service bound to the credential, such as `Mysql`. The `DescribeSupportedProducts` API can be used to get the names of the supported Tencent Cloud services.
     * @param ProductName Name of the Tencent Cloud service bound to the credential, such as `Mysql`. The `DescribeSupportedProducts` API can be used to get the names of the supported Tencent Cloud services.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Tencent Cloud service instance ID. 
     * @return InstanceID Tencent Cloud service instance ID.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Tencent Cloud service instance ID.
     * @param InstanceID Tencent Cloud service instance ID.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Domain name of the account in the form of IP. You can enter `%`. 
     * @return Domains Domain name of the account in the form of IP. You can enter `%`.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Domain name of the account in the form of IP. You can enter `%`.
     * @param Domains Domain name of the account in the form of IP. You can enter `%`.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get List of permissions that need to be granted when the credential is bound to a Tencent Cloud service. 
     * @return PrivilegesList List of permissions that need to be granted when the credential is bound to a Tencent Cloud service.
     */
    public ProductPrivilegeUnit [] getPrivilegesList() {
        return this.PrivilegesList;
    }

    /**
     * Set List of permissions that need to be granted when the credential is bound to a Tencent Cloud service.
     * @param PrivilegesList List of permissions that need to be granted when the credential is bound to a Tencent Cloud service.
     */
    public void setPrivilegesList(ProductPrivilegeUnit [] PrivilegesList) {
        this.PrivilegesList = PrivilegesList;
    }

    /**
     * Get Description, which is used to describe the purpose in detail and can contain up to 2,048 bytes. 
     * @return Description Description, which is used to describe the purpose in detail and can contain up to 2,048 bytes.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description, which is used to describe the purpose in detail and can contain up to 2,048 bytes.
     * @param Description Description, which is used to describe the purpose in detail and can contain up to 2,048 bytes.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Specifies the KMS CMK that encrypts the credential.
If this parameter is left empty, the CMK created by Secrets Manager by default will be used for encryption.
You can also specify a custom KMS CMK created in the same region for encryption. 
     * @return KmsKeyId Specifies the KMS CMK that encrypts the credential.
If this parameter is left empty, the CMK created by Secrets Manager by default will be used for encryption.
You can also specify a custom KMS CMK created in the same region for encryption.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set Specifies the KMS CMK that encrypts the credential.
If this parameter is left empty, the CMK created by Secrets Manager by default will be used for encryption.
You can also specify a custom KMS CMK created in the same region for encryption.
     * @param KmsKeyId Specifies the KMS CMK that encrypts the credential.
If this parameter is left empty, the CMK created by Secrets Manager by default will be used for encryption.
You can also specify a custom KMS CMK created in the same region for encryption.
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get List of tags. 
     * @return Tags List of tags.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags.
     * @param Tags List of tags.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get User-Defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `True`, this parameter is required. 
     * @return RotationBeginTime User-Defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `True`, this parameter is required.
     */
    public String getRotationBeginTime() {
        return this.RotationBeginTime;
    }

    /**
     * Set User-Defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `True`, this parameter is required.
     * @param RotationBeginTime User-Defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `True`, this parameter is required.
     */
    public void setRotationBeginTime(String RotationBeginTime) {
        this.RotationBeginTime = RotationBeginTime;
    }

    /**
     * Get Specifies whether to enable rotation
True - enable
False - do not enable
If this parameter is not specified, `False` will be used by default. 
     * @return EnableRotation Specifies whether to enable rotation
True - enable
False - do not enable
If this parameter is not specified, `False` will be used by default.
     */
    public Boolean getEnableRotation() {
        return this.EnableRotation;
    }

    /**
     * Set Specifies whether to enable rotation
True - enable
False - do not enable
If this parameter is not specified, `False` will be used by default.
     * @param EnableRotation Specifies whether to enable rotation
True - enable
False - do not enable
If this parameter is not specified, `False` will be used by default.
     */
    public void setEnableRotation(Boolean EnableRotation) {
        this.EnableRotation = EnableRotation;
    }

    /**
     * Get Rotation frequency in days. Default value: 1 day. 
     * @return RotationFrequency Rotation frequency in days. Default value: 1 day.
     */
    public Long getRotationFrequency() {
        return this.RotationFrequency;
    }

    /**
     * Set Rotation frequency in days. Default value: 1 day.
     * @param RotationFrequency Rotation frequency in days. Default value: 1 day.
     */
    public void setRotationFrequency(Long RotationFrequency) {
        this.RotationFrequency = RotationFrequency;
    }

    public CreateProductSecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProductSecretRequest(CreateProductSecretRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.UserNamePrefix != null) {
            this.UserNamePrefix = new String(source.UserNamePrefix);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.PrivilegesList != null) {
            this.PrivilegesList = new ProductPrivilegeUnit[source.PrivilegesList.length];
            for (int i = 0; i < source.PrivilegesList.length; i++) {
                this.PrivilegesList[i] = new ProductPrivilegeUnit(source.PrivilegesList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RotationBeginTime != null) {
            this.RotationBeginTime = new String(source.RotationBeginTime);
        }
        if (source.EnableRotation != null) {
            this.EnableRotation = new Boolean(source.EnableRotation);
        }
        if (source.RotationFrequency != null) {
            this.RotationFrequency = new Long(source.RotationFrequency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "UserNamePrefix", this.UserNamePrefix);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArrayObj(map, prefix + "PrivilegesList.", this.PrivilegesList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RotationBeginTime", this.RotationBeginTime);
        this.setParamSimple(map, prefix + "EnableRotation", this.EnableRotation);
        this.setParamSimple(map, prefix + "RotationFrequency", this.RotationFrequency);

    }
}

