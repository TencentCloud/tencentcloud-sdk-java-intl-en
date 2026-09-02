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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRegistryConnectivityTaskRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Mirror repository name.</p>
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * <p>region where the mirror repository is located</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>Image repository type</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>Mirror repository API version</p>
    */
    @SerializedName("ApiVersion")
    @Expose
    private String ApiVersion;

    /**
    * <p>Account</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Password</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Mirror repository url.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Link check parameters</p>
    */
    @SerializedName("Params")
    @Expose
    private ImageRegistryDetectionHostParam [] Params;

    /**
    * <p>Repository id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * <p>Repository instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Mirror repository name.</p> 
     * @return RegistryName <p>Mirror repository name.</p>
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set <p>Mirror repository name.</p>
     * @param RegistryName <p>Mirror repository name.</p>
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get <p>region where the mirror repository is located</p> 
     * @return RegistryRegion <p>region where the mirror repository is located</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>region where the mirror repository is located</p>
     * @param RegistryRegion <p>region where the mirror repository is located</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>Image repository type</p> 
     * @return RegistryType <p>Image repository type</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>Image repository type</p>
     * @param RegistryType <p>Image repository type</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>Mirror repository API version</p> 
     * @return ApiVersion <p>Mirror repository API version</p>
     */
    public String getApiVersion() {
        return this.ApiVersion;
    }

    /**
     * Set <p>Mirror repository API version</p>
     * @param ApiVersion <p>Mirror repository API version</p>
     */
    public void setApiVersion(String ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

    /**
     * Get <p>Account</p> 
     * @return UserName <p>Account</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Account</p>
     * @param UserName <p>Account</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Password</p> 
     * @return Password <p>Password</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Password</p>
     * @param Password <p>Password</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Mirror repository url.</p> 
     * @return Url <p>Mirror repository url.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Mirror repository url.</p>
     * @param Url <p>Mirror repository url.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Link check parameters</p> 
     * @return Params <p>Link check parameters</p>
     */
    public ImageRegistryDetectionHostParam [] getParams() {
        return this.Params;
    }

    /**
     * Set <p>Link check parameters</p>
     * @param Params <p>Link check parameters</p>
     */
    public void setParams(ImageRegistryDetectionHostParam [] Params) {
        this.Params = Params;
    }

    /**
     * Get <p>Repository id</p> 
     * @return RegistryId <p>Repository id</p>
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>Repository id</p>
     * @param RegistryId <p>Repository id</p>
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Repository instance id</p> 
     * @return InstanceId <p>Repository instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Repository instance id</p>
     * @param InstanceId <p>Repository instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public CreateImageRegistryConnectivityTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRegistryConnectivityTaskRequest(CreateImageRegistryConnectivityTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.ApiVersion != null) {
            this.ApiVersion = new String(source.ApiVersion);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Params != null) {
            this.Params = new ImageRegistryDetectionHostParam[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ImageRegistryDetectionHostParam(source.Params[i]);
            }
        }
        if (source.RegistryId != null) {
            this.RegistryId = new Long(source.RegistryId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "ApiVersion", this.ApiVersion);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

