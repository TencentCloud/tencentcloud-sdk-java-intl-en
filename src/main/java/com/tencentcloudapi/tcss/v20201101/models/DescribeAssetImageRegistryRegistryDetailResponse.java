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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRegistryRegistryDetailResponse extends AbstractModel {

    /**
    * Repository name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Username
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Repository URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Repository type, which can be `harbor`.
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Repository version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * Network type, which can be `public` (public network).
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Region. Default value: `default`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * Speed limit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpeedLimit")
    @Expose
    private Long SpeedLimit;

    /**
    * Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Insecure")
    @Expose
    private Long Insecure;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Repository name 
     * @return Name Repository name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Repository name
     * @param Name Repository name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Username 
     * @return Username Username
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username
     * @param Username Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Password 
     * @return Password Password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password
     * @param Password Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Repository URL 
     * @return Url Repository URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Repository URL
     * @param Url Repository URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Repository type, which can be `harbor`. 
     * @return RegistryType Repository type, which can be `harbor`.
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Repository type, which can be `harbor`.
     * @param RegistryType Repository type, which can be `harbor`.
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Repository version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistryVersion Repository version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set Repository version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistryVersion Repository version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get Network type, which can be `public` (public network). 
     * @return NetType Network type, which can be `public` (public network).
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type, which can be `public` (public network).
     * @param NetType Network type, which can be `public` (public network).
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Region. Default value: `default`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistryRegion Region. Default value: `default`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set Region. Default value: `default`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistryRegion Region. Default value: `default`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get Speed limit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpeedLimit Speed limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSpeedLimit() {
        return this.SpeedLimit;
    }

    /**
     * Set Speed limit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpeedLimit Speed limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpeedLimit(Long SpeedLimit) {
        this.SpeedLimit = SpeedLimit;
    }

    /**
     * Get Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Insecure Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInsecure() {
        return this.Insecure;
    }

    /**
     * Set Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Insecure Valid values: `0` (secure mode with certificate verification, which is the default value); `1` (unsecure mode that skips certificate verification).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInsecure(Long Insecure) {
        this.Insecure = Insecure;
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

    public DescribeAssetImageRegistryRegistryDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryRegistryDetailResponse(DescribeAssetImageRegistryRegistryDetailResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.RegistryVersion != null) {
            this.RegistryVersion = new String(source.RegistryVersion);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.SpeedLimit != null) {
            this.SpeedLimit = new Long(source.SpeedLimit);
        }
        if (source.Insecure != null) {
            this.Insecure = new Long(source.Insecure);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "RegistryVersion", this.RegistryVersion);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "SpeedLimit", this.SpeedLimit);
        this.setParamSimple(map, prefix + "Insecure", this.Insecure);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

