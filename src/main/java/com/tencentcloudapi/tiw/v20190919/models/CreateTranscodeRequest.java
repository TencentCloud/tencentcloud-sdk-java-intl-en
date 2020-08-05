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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTranscodeRequest extends AbstractModel{

    /**
    * SdkAppId of the customer
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Address of the file for transcoding
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Whether the PowerPoint file is static. The default value is False.
If IsStaticPPT is False, documents with the .ppt or .pptx extension will be dynamically transcoded to HTML5 pages, and documents with other extensions will be statically transcoded to images. If IsStaticPPT is True, documents with any extensions will be statically transcoded to images.
    */
    @SerializedName("IsStaticPPT")
    @Expose
    private Boolean IsStaticPPT;

    /**
    * Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

 
    */
    @SerializedName("MinResolution")
    @Expose
    private String MinResolution;

    /**
    * Resolution of the thumbnail generated for the dynamically transcoded PowerPoint file. If no value or null is specified for it or the resolution format is invalid, no thumbnail will be generated. The resolution format is the same as that of MinResolution.

For static transcoding, this parameter does not work.
    */
    @SerializedName("ThumbnailResolution")
    @Expose
    private String ThumbnailResolution;

    /**
    * Compression format of the transcoded file. If no value or null is specified for it or the specified format is invalid, no compression file will be generated. Currently, the following compression formats are supported:

`zip`: generates a .zip compression package.
`tar.gz: generates a .tar.gz compression package.
    */
    @SerializedName("CompressFileType")
    @Expose
    private String CompressFileType;

    /**
     * Get SdkAppId of the customer 
     * @return SdkAppId SdkAppId of the customer
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the customer
     * @param SdkAppId SdkAppId of the customer
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Address of the file for transcoding 
     * @return Url Address of the file for transcoding
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Address of the file for transcoding
     * @param Url Address of the file for transcoding
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Whether the PowerPoint file is static. The default value is False.
If IsStaticPPT is False, documents with the .ppt or .pptx extension will be dynamically transcoded to HTML5 pages, and documents with other extensions will be statically transcoded to images. If IsStaticPPT is True, documents with any extensions will be statically transcoded to images. 
     * @return IsStaticPPT Whether the PowerPoint file is static. The default value is False.
If IsStaticPPT is False, documents with the .ppt or .pptx extension will be dynamically transcoded to HTML5 pages, and documents with other extensions will be statically transcoded to images. If IsStaticPPT is True, documents with any extensions will be statically transcoded to images.
     */
    public Boolean getIsStaticPPT() {
        return this.IsStaticPPT;
    }

    /**
     * Set Whether the PowerPoint file is static. The default value is False.
If IsStaticPPT is False, documents with the .ppt or .pptx extension will be dynamically transcoded to HTML5 pages, and documents with other extensions will be statically transcoded to images. If IsStaticPPT is True, documents with any extensions will be statically transcoded to images.
     * @param IsStaticPPT Whether the PowerPoint file is static. The default value is False.
If IsStaticPPT is False, documents with the .ppt or .pptx extension will be dynamically transcoded to HTML5 pages, and documents with other extensions will be statically transcoded to images. If IsStaticPPT is True, documents with any extensions will be statically transcoded to images.
     */
    public void setIsStaticPPT(Boolean IsStaticPPT) {
        this.IsStaticPPT = IsStaticPPT;
    }

    /**
     * Get Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

  
     * @return MinResolution Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

 
     */
    public String getMinResolution() {
        return this.MinResolution;
    }

    /**
     * Set Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

 
     * @param MinResolution Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

 
     */
    public void setMinResolution(String MinResolution) {
        this.MinResolution = MinResolution;
    }

    /**
     * Get Resolution of the thumbnail generated for the dynamically transcoded PowerPoint file. If no value or null is specified for it or the resolution format is invalid, no thumbnail will be generated. The resolution format is the same as that of MinResolution.

For static transcoding, this parameter does not work. 
     * @return ThumbnailResolution Resolution of the thumbnail generated for the dynamically transcoded PowerPoint file. If no value or null is specified for it or the resolution format is invalid, no thumbnail will be generated. The resolution format is the same as that of MinResolution.

For static transcoding, this parameter does not work.
     */
    public String getThumbnailResolution() {
        return this.ThumbnailResolution;
    }

    /**
     * Set Resolution of the thumbnail generated for the dynamically transcoded PowerPoint file. If no value or null is specified for it or the resolution format is invalid, no thumbnail will be generated. The resolution format is the same as that of MinResolution.

For static transcoding, this parameter does not work.
     * @param ThumbnailResolution Resolution of the thumbnail generated for the dynamically transcoded PowerPoint file. If no value or null is specified for it or the resolution format is invalid, no thumbnail will be generated. The resolution format is the same as that of MinResolution.

For static transcoding, this parameter does not work.
     */
    public void setThumbnailResolution(String ThumbnailResolution) {
        this.ThumbnailResolution = ThumbnailResolution;
    }

    /**
     * Get Compression format of the transcoded file. If no value or null is specified for it or the specified format is invalid, no compression file will be generated. Currently, the following compression formats are supported:

`zip`: generates a .zip compression package.
`tar.gz: generates a .tar.gz compression package. 
     * @return CompressFileType Compression format of the transcoded file. If no value or null is specified for it or the specified format is invalid, no compression file will be generated. Currently, the following compression formats are supported:

`zip`: generates a .zip compression package.
`tar.gz: generates a .tar.gz compression package.
     */
    public String getCompressFileType() {
        return this.CompressFileType;
    }

    /**
     * Set Compression format of the transcoded file. If no value or null is specified for it or the specified format is invalid, no compression file will be generated. Currently, the following compression formats are supported:

`zip`: generates a .zip compression package.
`tar.gz: generates a .tar.gz compression package.
     * @param CompressFileType Compression format of the transcoded file. If no value or null is specified for it or the specified format is invalid, no compression file will be generated. Currently, the following compression formats are supported:

`zip`: generates a .zip compression package.
`tar.gz: generates a .tar.gz compression package.
     */
    public void setCompressFileType(String CompressFileType) {
        this.CompressFileType = CompressFileType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "IsStaticPPT", this.IsStaticPPT);
        this.setParamSimple(map, prefix + "MinResolution", this.MinResolution);
        this.setParamSimple(map, prefix + "ThumbnailResolution", this.ThumbnailResolution);
        this.setParamSimple(map, prefix + "CompressFileType", this.CompressFileType);

    }
}

