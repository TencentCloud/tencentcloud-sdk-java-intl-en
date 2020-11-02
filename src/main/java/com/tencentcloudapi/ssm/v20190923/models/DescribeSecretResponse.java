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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecretResponse extends AbstractModel{

    /**
    * Name of the Secret.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Description of the Secret.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ID of the KMS CMK used for encryption.
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * Creator UIN.
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0.
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Name of the Secret. 
     * @return SecretName Name of the Secret.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of the Secret.
     * @param SecretName Name of the Secret.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Description of the Secret. 
     * @return Description Description of the Secret.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the Secret.
     * @param Description Description of the Secret.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ID of the KMS CMK used for encryption. 
     * @return KmsKeyId ID of the KMS CMK used for encryption.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set ID of the KMS CMK used for encryption.
     * @param KmsKeyId ID of the KMS CMK used for encryption.
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get Creator UIN. 
     * @return CreateUin Creator UIN.
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator UIN.
     * @param CreateUin Creator UIN.
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`. 
     * @return Status Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`.
     * @param Status Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0. 
     * @return DeleteTime Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0.
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0.
     * @param DeleteTime Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0.
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

