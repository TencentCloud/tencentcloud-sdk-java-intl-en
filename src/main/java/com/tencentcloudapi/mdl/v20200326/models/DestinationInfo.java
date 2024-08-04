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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestinationInfo extends AbstractModel {

    /**
    * Relay destination address. Length limit: [1,512].
    */
    @SerializedName("OutputUrl")
    @Expose
    private String OutputUrl;

    /**
    * Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
    * Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * The destination type of the retweet. Currently available values are: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. The default is: Standard. When the output group type is FRAME_CAPTURE, valid values are: AWS_AmazonS3, COS.
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * Aws S3 destination setting.
    */
    @SerializedName("AmazonS3Settings")
    @Expose
    private AmazonS3Settings AmazonS3Settings;

    /**
    * Cos destination setting.
    */
    @SerializedName("CosSettings")
    @Expose
    private CosSettings CosSettings;

    /**
     * Get Relay destination address. Length limit: [1,512]. 
     * @return OutputUrl Relay destination address. Length limit: [1,512].
     */
    public String getOutputUrl() {
        return this.OutputUrl;
    }

    /**
     * Set Relay destination address. Length limit: [1,512].
     * @param OutputUrl Relay destination address. Length limit: [1,512].
     */
    public void setOutputUrl(String OutputUrl) {
        this.OutputUrl = OutputUrl;
    }

    /**
     * Get Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthKey Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthKey Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * Get Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Username Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Username Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Password Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Password Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get The destination type of the retweet. Currently available values are: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. The default is: Standard. When the output group type is FRAME_CAPTURE, valid values are: AWS_AmazonS3, COS. 
     * @return DestinationType The destination type of the retweet. Currently available values are: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. The default is: Standard. When the output group type is FRAME_CAPTURE, valid values are: AWS_AmazonS3, COS.
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set The destination type of the retweet. Currently available values are: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. The default is: Standard. When the output group type is FRAME_CAPTURE, valid values are: AWS_AmazonS3, COS.
     * @param DestinationType The destination type of the retweet. Currently available values are: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. The default is: Standard. When the output group type is FRAME_CAPTURE, valid values are: AWS_AmazonS3, COS.
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get Aws S3 destination setting. 
     * @return AmazonS3Settings Aws S3 destination setting.
     */
    public AmazonS3Settings getAmazonS3Settings() {
        return this.AmazonS3Settings;
    }

    /**
     * Set Aws S3 destination setting.
     * @param AmazonS3Settings Aws S3 destination setting.
     */
    public void setAmazonS3Settings(AmazonS3Settings AmazonS3Settings) {
        this.AmazonS3Settings = AmazonS3Settings;
    }

    /**
     * Get Cos destination setting. 
     * @return CosSettings Cos destination setting.
     */
    public CosSettings getCosSettings() {
        return this.CosSettings;
    }

    /**
     * Set Cos destination setting.
     * @param CosSettings Cos destination setting.
     */
    public void setCosSettings(CosSettings CosSettings) {
        this.CosSettings = CosSettings;
    }

    public DestinationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestinationInfo(DestinationInfo source) {
        if (source.OutputUrl != null) {
            this.OutputUrl = new String(source.OutputUrl);
        }
        if (source.AuthKey != null) {
            this.AuthKey = new String(source.AuthKey);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.DestinationType != null) {
            this.DestinationType = new String(source.DestinationType);
        }
        if (source.AmazonS3Settings != null) {
            this.AmazonS3Settings = new AmazonS3Settings(source.AmazonS3Settings);
        }
        if (source.CosSettings != null) {
            this.CosSettings = new CosSettings(source.CosSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputUrl", this.OutputUrl);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "DestinationType", this.DestinationType);
        this.setParamObj(map, prefix + "AmazonS3Settings.", this.AmazonS3Settings);
        this.setParamObj(map, prefix + "CosSettings.", this.CosSettings);

    }
}

