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
    * Authentication key, length limited to [1, 128].
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
    * Authentication username, length limited to [1, 128].
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Authentication password, length limited to [1, 128].
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * The destination type for relay. Available values: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. Default: Standard. AWS_AmazonS3 or COS is supported when FrameCapture group is selected.
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * Forward the Aws S3 address information.
    */
    @SerializedName("AmazonS3Settings")
    @Expose
    private AmazonS3Settings AmazonS3Settings;

    /**
    * Forward COS address information.
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
     * Get Authentication key, length limited to [1, 128]. 
     * @return AuthKey Authentication key, length limited to [1, 128].
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set Authentication key, length limited to [1, 128].
     * @param AuthKey Authentication key, length limited to [1, 128].
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * Get Authentication username, length limited to [1, 128]. 
     * @return Username Authentication username, length limited to [1, 128].
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Authentication username, length limited to [1, 128].
     * @param Username Authentication username, length limited to [1, 128].
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Authentication password, length limited to [1, 128]. 
     * @return Password Authentication password, length limited to [1, 128].
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Authentication password, length limited to [1, 128].
     * @param Password Authentication password, length limited to [1, 128].
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get The destination type for relay. Available values: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. Default: Standard. AWS_AmazonS3 or COS is supported when FrameCapture group is selected. 
     * @return DestinationType The destination type for relay. Available values: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. Default: Standard. AWS_AmazonS3 or COS is supported when FrameCapture group is selected.
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set The destination type for relay. Available values: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. Default: Standard. AWS_AmazonS3 or COS is supported when FrameCapture group is selected.
     * @param DestinationType The destination type for relay. Available values: Standard, AWS_MediaPackageV1, AWS_MediaPackageV2. Default: Standard. AWS_AmazonS3 or COS is supported when FrameCapture group is selected.
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get Forward the Aws S3 address information. 
     * @return AmazonS3Settings Forward the Aws S3 address information.
     */
    public AmazonS3Settings getAmazonS3Settings() {
        return this.AmazonS3Settings;
    }

    /**
     * Set Forward the Aws S3 address information.
     * @param AmazonS3Settings Forward the Aws S3 address information.
     */
    public void setAmazonS3Settings(AmazonS3Settings AmazonS3Settings) {
        this.AmazonS3Settings = AmazonS3Settings;
    }

    /**
     * Get Forward COS address information. 
     * @return CosSettings Forward COS address information.
     */
    public CosSettings getCosSettings() {
        return this.CosSettings;
    }

    /**
     * Set Forward COS address information.
     * @param CosSettings Forward COS address information.
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

