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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSSHKeyPairValueResponse extends AbstractModel {

    /**
    * ID of the SSH key.
    */
    @SerializedName("SSHKeyID")
    @Expose
    private String SSHKeyID;

    /**
    * Plaintext value of the Base64-encoded public key.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Plaintext value of the Base64-encoded private key.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * ID of the project to which the SSH key belongs.
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * Description of the SSH key.
The description can be modified in the CVM console.
    */
    @SerializedName("SSHKeyDescription")
    @Expose
    private String SSHKeyDescription;

    /**
    * Name of the SSH key.
The name can be modified in the CVM console.
    */
    @SerializedName("SSHKeyName")
    @Expose
    private String SSHKeyName;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID of the SSH key. 
     * @return SSHKeyID ID of the SSH key.
     */
    public String getSSHKeyID() {
        return this.SSHKeyID;
    }

    /**
     * Set ID of the SSH key.
     * @param SSHKeyID ID of the SSH key.
     */
    public void setSSHKeyID(String SSHKeyID) {
        this.SSHKeyID = SSHKeyID;
    }

    /**
     * Get Plaintext value of the Base64-encoded public key. 
     * @return PublicKey Plaintext value of the Base64-encoded public key.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Plaintext value of the Base64-encoded public key.
     * @param PublicKey Plaintext value of the Base64-encoded public key.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Plaintext value of the Base64-encoded private key. 
     * @return PrivateKey Plaintext value of the Base64-encoded private key.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set Plaintext value of the Base64-encoded private key.
     * @param PrivateKey Plaintext value of the Base64-encoded private key.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get ID of the project to which the SSH key belongs. 
     * @return ProjectID ID of the project to which the SSH key belongs.
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set ID of the project to which the SSH key belongs.
     * @param ProjectID ID of the project to which the SSH key belongs.
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get Description of the SSH key.
The description can be modified in the CVM console. 
     * @return SSHKeyDescription Description of the SSH key.
The description can be modified in the CVM console.
     */
    public String getSSHKeyDescription() {
        return this.SSHKeyDescription;
    }

    /**
     * Set Description of the SSH key.
The description can be modified in the CVM console.
     * @param SSHKeyDescription Description of the SSH key.
The description can be modified in the CVM console.
     */
    public void setSSHKeyDescription(String SSHKeyDescription) {
        this.SSHKeyDescription = SSHKeyDescription;
    }

    /**
     * Get Name of the SSH key.
The name can be modified in the CVM console. 
     * @return SSHKeyName Name of the SSH key.
The name can be modified in the CVM console.
     */
    public String getSSHKeyName() {
        return this.SSHKeyName;
    }

    /**
     * Set Name of the SSH key.
The name can be modified in the CVM console.
     * @param SSHKeyName Name of the SSH key.
The name can be modified in the CVM console.
     */
    public void setSSHKeyName(String SSHKeyName) {
        this.SSHKeyName = SSHKeyName;
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

    public GetSSHKeyPairValueResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSSHKeyPairValueResponse(GetSSHKeyPairValueResponse source) {
        if (source.SSHKeyID != null) {
            this.SSHKeyID = new String(source.SSHKeyID);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.SSHKeyDescription != null) {
            this.SSHKeyDescription = new String(source.SSHKeyDescription);
        }
        if (source.SSHKeyName != null) {
            this.SSHKeyName = new String(source.SSHKeyName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSHKeyID", this.SSHKeyID);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "SSHKeyDescription", this.SSHKeyDescription);
        this.setParamSimple(map, prefix + "SSHKeyName", this.SSHKeyName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

