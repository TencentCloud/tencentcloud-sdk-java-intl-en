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
    * Type of the input source object. Supported values:
<li>COS: COS origin</li>
<li> URL: URL source</li>
<li> AWS-S3: AWS source, currently only support transcoding task </li>
<li> VOD: VOD Pro Edition </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Required when `Type` is `COS`. It represents the COS object information for media processing.
    */
    @SerializedName("CosInputInfo")
    @Expose
    private CosInputInfo CosInputInfo;

    /**
    * 
    */
    @SerializedName("UrlInputInfo")
    @Expose
    private UrlInputInfo UrlInputInfo;

    /**
    * 
    */
    @SerializedName("S3InputInfo")
    @Expose
    private S3InputInfo S3InputInfo;

    /**
    * 
    */
    @SerializedName("VODInputInfo")
    @Expose
    private VODInputInfo VODInputInfo;

    /**
     * Get Type of the input source object. Supported values:
<li>COS: COS origin</li>
<li> URL: URL source</li>
<li> AWS-S3: AWS source, currently only support transcoding task </li>
<li> VOD: VOD Pro Edition </li> 
     * @return Type Type of the input source object. Supported values:
<li>COS: COS origin</li>
<li> URL: URL source</li>
<li> AWS-S3: AWS source, currently only support transcoding task </li>
<li> VOD: VOD Pro Edition </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the input source object. Supported values:
<li>COS: COS origin</li>
<li> URL: URL source</li>
<li> AWS-S3: AWS source, currently only support transcoding task </li>
<li> VOD: VOD Pro Edition </li>
     * @param Type Type of the input source object. Supported values:
<li>COS: COS origin</li>
<li> URL: URL source</li>
<li> AWS-S3: AWS source, currently only support transcoding task </li>
<li> VOD: VOD Pro Edition </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Required when `Type` is `COS`. It represents the COS object information for media processing. 
     * @return CosInputInfo Required when `Type` is `COS`. It represents the COS object information for media processing.
     */
    public CosInputInfo getCosInputInfo() {
        return this.CosInputInfo;
    }

    /**
     * Set Required when `Type` is `COS`. It represents the COS object information for media processing.
     * @param CosInputInfo Required when `Type` is `COS`. It represents the COS object information for media processing.
     */
    public void setCosInputInfo(CosInputInfo CosInputInfo) {
        this.CosInputInfo = CosInputInfo;
    }

    /**
     * Get  
     * @return UrlInputInfo 
     */
    public UrlInputInfo getUrlInputInfo() {
        return this.UrlInputInfo;
    }

    /**
     * Set 
     * @param UrlInputInfo 
     */
    public void setUrlInputInfo(UrlInputInfo UrlInputInfo) {
        this.UrlInputInfo = UrlInputInfo;
    }

    /**
     * Get  
     * @return S3InputInfo 
     */
    public S3InputInfo getS3InputInfo() {
        return this.S3InputInfo;
    }

    /**
     * Set 
     * @param S3InputInfo 
     */
    public void setS3InputInfo(S3InputInfo S3InputInfo) {
        this.S3InputInfo = S3InputInfo;
    }

    /**
     * Get  
     * @return VODInputInfo 
     */
    public VODInputInfo getVODInputInfo() {
        return this.VODInputInfo;
    }

    /**
     * Set 
     * @param VODInputInfo 
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

