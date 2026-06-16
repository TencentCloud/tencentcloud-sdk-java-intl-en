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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiDatasourceConfig extends AbstractModel {

    /**
    * API data source parsing result
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FieldsJsonData")
    @Expose
    private String FieldsJsonData;

    /**
    * Connection Type 1: Direct Connection 2: Extraction
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectionType")
    @Expose
    private Long ConnectionType;

    /**
    * Extraction frequency configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FrequencyConfig")
    @Expose
    private FrequencyConfig FrequencyConfig;

    /**
    * Request URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 1:GET 2:POST
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestMethod")
    @Expose
    private Long RequestMethod;

    /**
    * Request headers
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestHeader")
    @Expose
    private String RequestHeader;

    /**
    * Request parameter
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestParams")
    @Expose
    private String RequestParams;

    /**
    * request body
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestBody")
    @Expose
    private String RequestBody;

    /**
    * Username.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Valid values: 1: no authentication; 2: BASIC_AUTH.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthorizationType")
    @Expose
    private Long AuthorizationType;

    /**
    * Table ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

    /**
    * Mapping path DbName
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JsonPathDbNameMap")
    @Expose
    private String JsonPathDbNameMap;

    /**
    * Authentication API
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthApi")
    @Expose
    private String AuthApi;

    /**
    * Application Key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * application key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppSecret")
    @Expose
    private String AppSecret;

    /**
    * Data Key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Data key initialization vector
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretIv")
    @Expose
    private String SecretIv;

    /**
     * Get API data source parsing result
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FieldsJsonData API data source parsing result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFieldsJsonData() {
        return this.FieldsJsonData;
    }

    /**
     * Set API data source parsing result
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FieldsJsonData API data source parsing result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFieldsJsonData(String FieldsJsonData) {
        this.FieldsJsonData = FieldsJsonData;
    }

    /**
     * Get Connection Type 1: Direct Connection 2: Extraction
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConnectionType Connection Type 1: Direct Connection 2: Extraction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set Connection Type 1: Direct Connection 2: Extraction
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConnectionType Connection Type 1: Direct Connection 2: Extraction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConnectionType(Long ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get Extraction frequency configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FrequencyConfig Extraction frequency configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FrequencyConfig getFrequencyConfig() {
        return this.FrequencyConfig;
    }

    /**
     * Set Extraction frequency configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FrequencyConfig Extraction frequency configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFrequencyConfig(FrequencyConfig FrequencyConfig) {
        this.FrequencyConfig = FrequencyConfig;
    }

    /**
     * Get Request URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url Request URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Request URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url Request URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 1:GET 2:POST
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestMethod 1:GET 2:POST
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set 1:GET 2:POST
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestMethod 1:GET 2:POST
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestMethod(Long RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get Request headers
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestHeader Request headers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set Request headers
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestHeader Request headers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestHeader(String RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get Request parameter
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestParams Request parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRequestParams() {
        return this.RequestParams;
    }

    /**
     * Set Request parameter
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestParams Request parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestParams(String RequestParams) {
        this.RequestParams = RequestParams;
    }

    /**
     * Get request body
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestBody request body
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRequestBody() {
        return this.RequestBody;
    }

    /**
     * Set request body
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestBody request body
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestBody(String RequestBody) {
        this.RequestBody = RequestBody;
    }

    /**
     * Get Username.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName Username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Password Password.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Password Password.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Valid values: 1: no authentication; 2: BASIC_AUTH.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthorizationType Valid values: 1: no authentication; 2: BASIC_AUTH.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAuthorizationType() {
        return this.AuthorizationType;
    }

    /**
     * Set Valid values: 1: no authentication; 2: BASIC_AUTH.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthorizationType Valid values: 1: no authentication; 2: BASIC_AUTH.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthorizationType(Long AuthorizationType) {
        this.AuthorizationType = AuthorizationType;
    }

    /**
     * Get Table ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableId Table ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableId Table ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Mapping path DbName
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JsonPathDbNameMap Mapping path DbName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJsonPathDbNameMap() {
        return this.JsonPathDbNameMap;
    }

    /**
     * Set Mapping path DbName
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JsonPathDbNameMap Mapping path DbName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJsonPathDbNameMap(String JsonPathDbNameMap) {
        this.JsonPathDbNameMap = JsonPathDbNameMap;
    }

    /**
     * Get Authentication API
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthApi Authentication API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthApi() {
        return this.AuthApi;
    }

    /**
     * Set Authentication API
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthApi Authentication API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthApi(String AuthApi) {
        this.AuthApi = AuthApi;
    }

    /**
     * Get Application Key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppKey Application Key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set Application Key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppKey Application Key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get application key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppSecret application key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppSecret() {
        return this.AppSecret;
    }

    /**
     * Set application key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppSecret application key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppSecret(String AppSecret) {
        this.AppSecret = AppSecret;
    }

    /**
     * Get Data Key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretKey Data Key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Data Key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretKey Data Key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Data key initialization vector
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretIv Data key initialization vector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretIv() {
        return this.SecretIv;
    }

    /**
     * Set Data key initialization vector
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretIv Data key initialization vector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretIv(String SecretIv) {
        this.SecretIv = SecretIv;
    }

    public ApiDatasourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiDatasourceConfig(ApiDatasourceConfig source) {
        if (source.FieldsJsonData != null) {
            this.FieldsJsonData = new String(source.FieldsJsonData);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new Long(source.ConnectionType);
        }
        if (source.FrequencyConfig != null) {
            this.FrequencyConfig = new FrequencyConfig(source.FrequencyConfig);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new Long(source.RequestMethod);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new String(source.RequestHeader);
        }
        if (source.RequestParams != null) {
            this.RequestParams = new String(source.RequestParams);
        }
        if (source.RequestBody != null) {
            this.RequestBody = new String(source.RequestBody);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.AuthorizationType != null) {
            this.AuthorizationType = new Long(source.AuthorizationType);
        }
        if (source.TableId != null) {
            this.TableId = new Long(source.TableId);
        }
        if (source.JsonPathDbNameMap != null) {
            this.JsonPathDbNameMap = new String(source.JsonPathDbNameMap);
        }
        if (source.AuthApi != null) {
            this.AuthApi = new String(source.AuthApi);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.AppSecret != null) {
            this.AppSecret = new String(source.AppSecret);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.SecretIv != null) {
            this.SecretIv = new String(source.SecretIv);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldsJsonData", this.FieldsJsonData);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamObj(map, prefix + "FrequencyConfig.", this.FrequencyConfig);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);
        this.setParamSimple(map, prefix + "RequestParams", this.RequestParams);
        this.setParamSimple(map, prefix + "RequestBody", this.RequestBody);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "AuthorizationType", this.AuthorizationType);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "JsonPathDbNameMap", this.JsonPathDbNameMap);
        this.setParamSimple(map, prefix + "AuthApi", this.AuthApi);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "AppSecret", this.AppSecret);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SecretIv", this.SecretIv);

    }
}

