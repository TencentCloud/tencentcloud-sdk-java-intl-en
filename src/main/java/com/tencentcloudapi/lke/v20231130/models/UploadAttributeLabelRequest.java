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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadAttributeLabelRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Filename.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Cos path.
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * Verify the consistency of files uploaded to the cloud and local files by validating the crc64 encoding in the x-cos-hash-crc64ecma header.
    */
    @SerializedName("CosHash")
    @Expose
    private String CosHash;

    /**
    * File size.
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * Login to user's root account (required in integrator mode).
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * Login to user's sub-account (required in integrator mode).
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Filename. 
     * @return FileName Filename.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename.
     * @param FileName Filename.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Cos path. 
     * @return CosUrl Cos path.
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set Cos path.
     * @param CosUrl Cos path.
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get Verify the consistency of files uploaded to the cloud and local files by validating the crc64 encoding in the x-cos-hash-crc64ecma header. 
     * @return CosHash Verify the consistency of files uploaded to the cloud and local files by validating the crc64 encoding in the x-cos-hash-crc64ecma header.
     */
    public String getCosHash() {
        return this.CosHash;
    }

    /**
     * Set Verify the consistency of files uploaded to the cloud and local files by validating the crc64 encoding in the x-cos-hash-crc64ecma header.
     * @param CosHash Verify the consistency of files uploaded to the cloud and local files by validating the crc64 encoding in the x-cos-hash-crc64ecma header.
     */
    public void setCosHash(String CosHash) {
        this.CosHash = CosHash;
    }

    /**
     * Get File size. 
     * @return Size File size.
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set File size.
     * @param Size File size.
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get Login to user's root account (required in integrator mode). 
     * @return LoginUin Login to user's root account (required in integrator mode).
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set Login to user's root account (required in integrator mode).
     * @param LoginUin Login to user's root account (required in integrator mode).
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get Login to user's sub-account (required in integrator mode). 
     * @return LoginSubAccountUin Login to user's sub-account (required in integrator mode).
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set Login to user's sub-account (required in integrator mode).
     * @param LoginSubAccountUin Login to user's sub-account (required in integrator mode).
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public UploadAttributeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadAttributeLabelRequest(UploadAttributeLabelRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.CosHash != null) {
            this.CosHash = new String(source.CosHash);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "CosHash", this.CosHash);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

