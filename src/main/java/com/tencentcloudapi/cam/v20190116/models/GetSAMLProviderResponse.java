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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSAMLProviderResponse extends AbstractModel{

    /**
    * SAML identity provider name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * SAML identity provider description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Time SAML identity provider created
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Time SAML identity provider last modified
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * SAML identity provider metadata document
    */
    @SerializedName("SAMLMetadata")
    @Expose
    private String SAMLMetadata;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SAML identity provider name 
     * @return Name SAML identity provider name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set SAML identity provider name
     * @param Name SAML identity provider name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get SAML identity provider description 
     * @return Description SAML identity provider description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set SAML identity provider description
     * @param Description SAML identity provider description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Time SAML identity provider created 
     * @return CreateTime Time SAML identity provider created
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Time SAML identity provider created
     * @param CreateTime Time SAML identity provider created
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Time SAML identity provider last modified 
     * @return ModifyTime Time SAML identity provider last modified
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Time SAML identity provider last modified
     * @param ModifyTime Time SAML identity provider last modified
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get SAML identity provider metadata document 
     * @return SAMLMetadata SAML identity provider metadata document
     */
    public String getSAMLMetadata() {
        return this.SAMLMetadata;
    }

    /**
     * Set SAML identity provider metadata document
     * @param SAMLMetadata SAML identity provider metadata document
     */
    public void setSAMLMetadata(String SAMLMetadata) {
        this.SAMLMetadata = SAMLMetadata;
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "SAMLMetadata", this.SAMLMetadata);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

