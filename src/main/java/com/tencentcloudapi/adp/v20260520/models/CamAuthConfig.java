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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CamAuthConfig extends AbstractModel {

    /**
    * <p>Role name.</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>Key location HEADER/QUERY</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Header authentication |<br>| 1 | Request information authentication |</p>
    */
    @SerializedName("KeyLocation")
    @Expose
    private Long KeyLocation;

    /**
    * <p>SecretId field name</p>
    */
    @SerializedName("SecretIdName")
    @Expose
    private String SecretIdName;

    /**
    * <p>SecretKey field name</p>
    */
    @SerializedName("SecretKeyName")
    @Expose
    private String SecretKeyName;

    /**
    * <p>CAM Access Key Field Configuration</p>
    */
    @SerializedName("ParamList")
    @Expose
    private AccessKeyParamConfig [] ParamList;

    /**
    * <p>Whether CAM role authorization is supported.</p>
    */
    @SerializedName("SupportRoleAuth")
    @Expose
    private Boolean SupportRoleAuth;

    /**
     * Get <p>Role name.</p> 
     * @return RoleName <p>Role name.</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>Role name.</p>
     * @param RoleName <p>Role name.</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>Key location HEADER/QUERY</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Header authentication |<br>| 1 | Request information authentication |</p> 
     * @return KeyLocation <p>Key location HEADER/QUERY</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Header authentication |<br>| 1 | Request information authentication |</p>
     */
    public Long getKeyLocation() {
        return this.KeyLocation;
    }

    /**
     * Set <p>Key location HEADER/QUERY</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Header authentication |<br>| 1 | Request information authentication |</p>
     * @param KeyLocation <p>Key location HEADER/QUERY</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Header authentication |<br>| 1 | Request information authentication |</p>
     */
    public void setKeyLocation(Long KeyLocation) {
        this.KeyLocation = KeyLocation;
    }

    /**
     * Get <p>SecretId field name</p> 
     * @return SecretIdName <p>SecretId field name</p>
     */
    public String getSecretIdName() {
        return this.SecretIdName;
    }

    /**
     * Set <p>SecretId field name</p>
     * @param SecretIdName <p>SecretId field name</p>
     */
    public void setSecretIdName(String SecretIdName) {
        this.SecretIdName = SecretIdName;
    }

    /**
     * Get <p>SecretKey field name</p> 
     * @return SecretKeyName <p>SecretKey field name</p>
     */
    public String getSecretKeyName() {
        return this.SecretKeyName;
    }

    /**
     * Set <p>SecretKey field name</p>
     * @param SecretKeyName <p>SecretKey field name</p>
     */
    public void setSecretKeyName(String SecretKeyName) {
        this.SecretKeyName = SecretKeyName;
    }

    /**
     * Get <p>CAM Access Key Field Configuration</p> 
     * @return ParamList <p>CAM Access Key Field Configuration</p>
     */
    public AccessKeyParamConfig [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>CAM Access Key Field Configuration</p>
     * @param ParamList <p>CAM Access Key Field Configuration</p>
     */
    public void setParamList(AccessKeyParamConfig [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get <p>Whether CAM role authorization is supported.</p> 
     * @return SupportRoleAuth <p>Whether CAM role authorization is supported.</p>
     */
    public Boolean getSupportRoleAuth() {
        return this.SupportRoleAuth;
    }

    /**
     * Set <p>Whether CAM role authorization is supported.</p>
     * @param SupportRoleAuth <p>Whether CAM role authorization is supported.</p>
     */
    public void setSupportRoleAuth(Boolean SupportRoleAuth) {
        this.SupportRoleAuth = SupportRoleAuth;
    }

    public CamAuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CamAuthConfig(CamAuthConfig source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.KeyLocation != null) {
            this.KeyLocation = new Long(source.KeyLocation);
        }
        if (source.SecretIdName != null) {
            this.SecretIdName = new String(source.SecretIdName);
        }
        if (source.SecretKeyName != null) {
            this.SecretKeyName = new String(source.SecretKeyName);
        }
        if (source.ParamList != null) {
            this.ParamList = new AccessKeyParamConfig[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new AccessKeyParamConfig(source.ParamList[i]);
            }
        }
        if (source.SupportRoleAuth != null) {
            this.SupportRoleAuth = new Boolean(source.SupportRoleAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "KeyLocation", this.KeyLocation);
        this.setParamSimple(map, prefix + "SecretIdName", this.SecretIdName);
        this.setParamSimple(map, prefix + "SecretKeyName", this.SecretKeyName);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "SupportRoleAuth", this.SupportRoleAuth);

    }
}

