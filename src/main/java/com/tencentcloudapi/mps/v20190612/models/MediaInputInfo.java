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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInputInfo extends AbstractModel {

    /**
    * Type of input source object. valid values:.
<Li>COS: specifies the cos origin.</li>
<Li>URL: the url source.</li>
<Li>AWS-S3: aws source. currently only supports transcoding tasks.</li>
<Li>VOD: video-on-demand pro edition (VOD Pro). </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The information of the COS object to process. This parameter is valid and required when `Type` is `COS`.
    */
    @SerializedName("CosInputInfo")
    @Expose
    private CosInputInfo CosInputInfo;

    /**
    * The URL of the object to process. This parameter is valid and required when `Type` is `URL`.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UrlInputInfo")
    @Expose
    private UrlInputInfo UrlInputInfo;

    /**
    * The information of the AWS S3 object processed. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("S3InputInfo")
    @Expose
    private S3InputInfo S3InputInfo;

    /**
    * The information of the VOD Pro object processed. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VODInputInfo")
    @Expose
    private VODInputInfo VODInputInfo;

    /**
     * Get Type of input source object. valid values:.
<Li>COS: specifies the cos origin.</li>
<Li>URL: the url source.</li>
<Li>AWS-S3: aws source. currently only supports transcoding tasks.</li>
<Li>VOD: video-on-demand pro edition (VOD Pro). </li> 
     * @return Type Type of input source object. valid values:.
<Li>COS: specifies the cos origin.</li>
<Li>URL: the url source.</li>
<Li>AWS-S3: aws source. currently only supports transcoding tasks.</li>
<Li>VOD: video-on-demand pro edition (VOD Pro). </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of input source object. valid values:.
<Li>COS: specifies the cos origin.</li>
<Li>URL: the url source.</li>
<Li>AWS-S3: aws source. currently only supports transcoding tasks.</li>
<Li>VOD: video-on-demand pro edition (VOD Pro). </li>
     * @param Type Type of input source object. valid values:.
<Li>COS: specifies the cos origin.</li>
<Li>URL: the url source.</li>
<Li>AWS-S3: aws source. currently only supports transcoding tasks.</li>
<Li>VOD: video-on-demand pro edition (VOD Pro). </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The information of the COS object to process. This parameter is valid and required when `Type` is `COS`. 
     * @return CosInputInfo The information of the COS object to process. This parameter is valid and required when `Type` is `COS`.
     */
    public CosInputInfo getCosInputInfo() {
        return this.CosInputInfo;
    }

    /**
     * Set The information of the COS object to process. This parameter is valid and required when `Type` is `COS`.
     * @param CosInputInfo The information of the COS object to process. This parameter is valid and required when `Type` is `COS`.
     */
    public void setCosInputInfo(CosInputInfo CosInputInfo) {
        this.CosInputInfo = CosInputInfo;
    }

    /**
     * Get The URL of the object to process. This parameter is valid and required when `Type` is `URL`.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UrlInputInfo The URL of the object to process. This parameter is valid and required when `Type` is `URL`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public UrlInputInfo getUrlInputInfo() {
        return this.UrlInputInfo;
    }

    /**
     * Set The URL of the object to process. This parameter is valid and required when `Type` is `URL`.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UrlInputInfo The URL of the object to process. This parameter is valid and required when `Type` is `URL`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUrlInputInfo(UrlInputInfo UrlInputInfo) {
        this.UrlInputInfo = UrlInputInfo;
    }

    /**
     * Get The information of the AWS S3 object processed. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return S3InputInfo The information of the AWS S3 object processed. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public S3InputInfo getS3InputInfo() {
        return this.S3InputInfo;
    }

    /**
     * Set The information of the AWS S3 object processed. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param S3InputInfo The information of the AWS S3 object processed. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setS3InputInfo(S3InputInfo S3InputInfo) {
        this.S3InputInfo = S3InputInfo;
    }

    /**
     * Get The information of the VOD Pro object processed. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VODInputInfo The information of the VOD Pro object processed. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public VODInputInfo getVODInputInfo() {
        return this.VODInputInfo;
    }

    /**
     * Set The information of the VOD Pro object processed. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VODInputInfo The information of the VOD Pro object processed. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVODInputInfo(VODInputInfo VODInputInfo) {
        this.VODInputInfo = VODInputInfo;
    }

    public MediaInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInputInfo(MediaInputInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosInputInfo != null) {
            this.CosInputInfo = new CosInputInfo(source.CosInputInfo);
        }
        if (source.UrlInputInfo != null) {
            this.UrlInputInfo = new UrlInputInfo(source.UrlInputInfo);
        }
        if (source.S3InputInfo != null) {
            this.S3InputInfo = new S3InputInfo(source.S3InputInfo);
        }
        if (source.VODInputInfo != null) {
            this.VODInputInfo = new VODInputInfo(source.VODInputInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosInputInfo.", this.CosInputInfo);
        this.setParamObj(map, prefix + "UrlInputInfo.", this.UrlInputInfo);
        this.setParamObj(map, prefix + "S3InputInfo.", this.S3InputInfo);
        this.setParamObj(map, prefix + "VODInputInfo.", this.VODInputInfo);

    }
}

