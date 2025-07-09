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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTranscodeRequest extends AbstractModel {

    /**
    * SdkAppId of the customer
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * URL of the transcoded document after URL encoding. URL encoding converts characters into a format that can be transmitted over the Internet. For example, URL encoding can convert the document URL http://example.com/Test.pdf into http://example.com/%E6%B5%8B%E8%AF%95.pdf. To improve the success rate of URL parsing, use URL encoding.
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
    * Note: This parameter is disused. Use the MinScaleResolution parameter to pass in a resolution. For more information, see [CreateTranscode](https://intl.cloud.tencent.com/document/api/1137/40060?from_cn_redirect=1#SDK).

Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

Example: 1280x720. Note that the character between the numbers is the letter x.
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
    * Internal parameter.
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
    * Document transcoding priority. This parameter takes effect only for PowerPoint dynamic transcoding. Valid values:<br/>
- low: Low transcoding priority. The task can transcode at most 500 MB of data or a 2000-page document, with a download timeout no longer than 10 minutes. Due to resource limits, these tasks may have to queue for a long period of time. Consider this before you use this feature.
- null: Normal transcoding priority. The task can transcode at most 200 MB of data or a 500-page document, with a download timeout no longer than 2 minutes.
<br/>
Note: For static transcoding such as PDF transcoding, each task can transcode at most 200 MB of data regardless of the transcoding priority.
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.
Higher resolution brings clearer visual effect, but also means larger size of the transcoded image resources and longer loading time of the transcoded file. Set this parameter appropriately based on your actual scenario.

Example: 1280x720. Note that the character between the numbers is the letter x.
    */
    @SerializedName("MinScaleResolution")
    @Expose
    private String MinScaleResolution;

    /**
    * Specifies whether to enable auto handling of unsupported elements. By default, this feature is disabled.

If auto handling is enabled, the following processes are performed:
1. Inkblots: Remove unsupported inkblots, such as those drawn by using WPS.
2. Auto page flip: Clear the auto page clip settings in the PowerPoint file and set the page flip mode to mouse click.
3. Corrupted audio/videos: Remove the references to corrupted audio/videos in the PowerPoint file.
    */
    @SerializedName("AutoHandleUnsupportedElement")
    @Expose
    private Boolean AutoHandleUnsupportedElement;

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
     * Get URL of the transcoded document after URL encoding. URL encoding converts characters into a format that can be transmitted over the Internet. For example, URL encoding can convert the document URL http://example.com/Test.pdf into http://example.com/%E6%B5%8B%E8%AF%95.pdf. To improve the success rate of URL parsing, use URL encoding. 
     * @return Url URL of the transcoded document after URL encoding. URL encoding converts characters into a format that can be transmitted over the Internet. For example, URL encoding can convert the document URL http://example.com/Test.pdf into http://example.com/%E6%B5%8B%E8%AF%95.pdf. To improve the success rate of URL parsing, use URL encoding.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of the transcoded document after URL encoding. URL encoding converts characters into a format that can be transmitted over the Internet. For example, URL encoding can convert the document URL http://example.com/Test.pdf into http://example.com/%E6%B5%8B%E8%AF%95.pdf. To improve the success rate of URL parsing, use URL encoding.
     * @param Url URL of the transcoded document after URL encoding. URL encoding converts characters into a format that can be transmitted over the Internet. For example, URL encoding can convert the document URL http://example.com/Test.pdf into http://example.com/%E6%B5%8B%E8%AF%95.pdf. To improve the success rate of URL parsing, use URL encoding.
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
     * Get Note: This parameter is disused. Use the MinScaleResolution parameter to pass in a resolution. For more information, see [CreateTranscode](https://intl.cloud.tencent.com/document/api/1137/40060?from_cn_redirect=1#SDK).

Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

Example: 1280x720. Note that the character between the numbers is the letter x. 
     * @return MinResolution Note: This parameter is disused. Use the MinScaleResolution parameter to pass in a resolution. For more information, see [CreateTranscode](https://intl.cloud.tencent.com/document/api/1137/40060?from_cn_redirect=1#SDK).

Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

Example: 1280x720. Note that the character between the numbers is the letter x.
     */
    public String getMinResolution() {
        return this.MinResolution;
    }

    /**
     * Set Note: This parameter is disused. Use the MinScaleResolution parameter to pass in a resolution. For more information, see [CreateTranscode](https://intl.cloud.tencent.com/document/api/1137/40060?from_cn_redirect=1#SDK).

Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

Example: 1280x720. Note that the character between the numbers is the letter x.
     * @param MinResolution Note: This parameter is disused. Use the MinScaleResolution parameter to pass in a resolution. For more information, see [CreateTranscode](https://intl.cloud.tencent.com/document/api/1137/40060?from_cn_redirect=1#SDK).

Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.

Example: 1280x720. Note that the character between the numbers is the letter x.
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
     * Get Internal parameter. 
     * @return ExtraData Internal parameter.
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set Internal parameter.
     * @param ExtraData Internal parameter.
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Get Document transcoding priority. This parameter takes effect only for PowerPoint dynamic transcoding. Valid values:<br/>
- low: Low transcoding priority. The task can transcode at most 500 MB of data or a 2000-page document, with a download timeout no longer than 10 minutes. Due to resource limits, these tasks may have to queue for a long period of time. Consider this before you use this feature.
- null: Normal transcoding priority. The task can transcode at most 200 MB of data or a 500-page document, with a download timeout no longer than 2 minutes.
<br/>
Note: For static transcoding such as PDF transcoding, each task can transcode at most 200 MB of data regardless of the transcoding priority. 
     * @return Priority Document transcoding priority. This parameter takes effect only for PowerPoint dynamic transcoding. Valid values:<br/>
- low: Low transcoding priority. The task can transcode at most 500 MB of data or a 2000-page document, with a download timeout no longer than 10 minutes. Due to resource limits, these tasks may have to queue for a long period of time. Consider this before you use this feature.
- null: Normal transcoding priority. The task can transcode at most 200 MB of data or a 500-page document, with a download timeout no longer than 2 minutes.
<br/>
Note: For static transcoding such as PDF transcoding, each task can transcode at most 200 MB of data regardless of the transcoding priority.
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set Document transcoding priority. This parameter takes effect only for PowerPoint dynamic transcoding. Valid values:<br/>
- low: Low transcoding priority. The task can transcode at most 500 MB of data or a 2000-page document, with a download timeout no longer than 10 minutes. Due to resource limits, these tasks may have to queue for a long period of time. Consider this before you use this feature.
- null: Normal transcoding priority. The task can transcode at most 200 MB of data or a 500-page document, with a download timeout no longer than 2 minutes.
<br/>
Note: For static transcoding such as PDF transcoding, each task can transcode at most 200 MB of data regardless of the transcoding priority.
     * @param Priority Document transcoding priority. This parameter takes effect only for PowerPoint dynamic transcoding. Valid values:<br/>
- low: Low transcoding priority. The task can transcode at most 500 MB of data or a 2000-page document, with a download timeout no longer than 10 minutes. Due to resource limits, these tasks may have to queue for a long period of time. Consider this before you use this feature.
- null: Normal transcoding priority. The task can transcode at most 200 MB of data or a 500-page document, with a download timeout no longer than 2 minutes.
<br/>
Note: For static transcoding such as PDF transcoding, each task can transcode at most 200 MB of data regardless of the transcoding priority.
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.
Higher resolution brings clearer visual effect, but also means larger size of the transcoded image resources and longer loading time of the transcoded file. Set this parameter appropriately based on your actual scenario.

Example: 1280x720. Note that the character between the numbers is the letter x. 
     * @return MinScaleResolution Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.
Higher resolution brings clearer visual effect, but also means larger size of the transcoded image resources and longer loading time of the transcoded file. Set this parameter appropriately based on your actual scenario.

Example: 1280x720. Note that the character between the numbers is the letter x.
     */
    public String getMinScaleResolution() {
        return this.MinScaleResolution;
    }

    /**
     * Set Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.
Higher resolution brings clearer visual effect, but also means larger size of the transcoded image resources and longer loading time of the transcoded file. Set this parameter appropriately based on your actual scenario.

Example: 1280x720. Note that the character between the numbers is the letter x.
     * @param MinScaleResolution Minimum resolution of the transcoded document. If no value or null is specified for it or the resolution format is invalid, the original document resolution is used.
Higher resolution brings clearer visual effect, but also means larger size of the transcoded image resources and longer loading time of the transcoded file. Set this parameter appropriately based on your actual scenario.

Example: 1280x720. Note that the character between the numbers is the letter x.
     */
    public void setMinScaleResolution(String MinScaleResolution) {
        this.MinScaleResolution = MinScaleResolution;
    }

    /**
     * Get Specifies whether to enable auto handling of unsupported elements. By default, this feature is disabled.

If auto handling is enabled, the following processes are performed:
1. Inkblots: Remove unsupported inkblots, such as those drawn by using WPS.
2. Auto page flip: Clear the auto page clip settings in the PowerPoint file and set the page flip mode to mouse click.
3. Corrupted audio/videos: Remove the references to corrupted audio/videos in the PowerPoint file. 
     * @return AutoHandleUnsupportedElement Specifies whether to enable auto handling of unsupported elements. By default, this feature is disabled.

If auto handling is enabled, the following processes are performed:
1. Inkblots: Remove unsupported inkblots, such as those drawn by using WPS.
2. Auto page flip: Clear the auto page clip settings in the PowerPoint file and set the page flip mode to mouse click.
3. Corrupted audio/videos: Remove the references to corrupted audio/videos in the PowerPoint file.
     */
    public Boolean getAutoHandleUnsupportedElement() {
        return this.AutoHandleUnsupportedElement;
    }

    /**
     * Set Specifies whether to enable auto handling of unsupported elements. By default, this feature is disabled.

If auto handling is enabled, the following processes are performed:
1. Inkblots: Remove unsupported inkblots, such as those drawn by using WPS.
2. Auto page flip: Clear the auto page clip settings in the PowerPoint file and set the page flip mode to mouse click.
3. Corrupted audio/videos: Remove the references to corrupted audio/videos in the PowerPoint file.
     * @param AutoHandleUnsupportedElement Specifies whether to enable auto handling of unsupported elements. By default, this feature is disabled.

If auto handling is enabled, the following processes are performed:
1. Inkblots: Remove unsupported inkblots, such as those drawn by using WPS.
2. Auto page flip: Clear the auto page clip settings in the PowerPoint file and set the page flip mode to mouse click.
3. Corrupted audio/videos: Remove the references to corrupted audio/videos in the PowerPoint file.
     */
    public void setAutoHandleUnsupportedElement(Boolean AutoHandleUnsupportedElement) {
        this.AutoHandleUnsupportedElement = AutoHandleUnsupportedElement;
    }

    public CreateTranscodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTranscodeRequest(CreateTranscodeRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.IsStaticPPT != null) {
            this.IsStaticPPT = new Boolean(source.IsStaticPPT);
        }
        if (source.MinResolution != null) {
            this.MinResolution = new String(source.MinResolution);
        }
        if (source.ThumbnailResolution != null) {
            this.ThumbnailResolution = new String(source.ThumbnailResolution);
        }
        if (source.CompressFileType != null) {
            this.CompressFileType = new String(source.CompressFileType);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
        }
        if (source.MinScaleResolution != null) {
            this.MinScaleResolution = new String(source.MinScaleResolution);
        }
        if (source.AutoHandleUnsupportedElement != null) {
            this.AutoHandleUnsupportedElement = new Boolean(source.AutoHandleUnsupportedElement);
        }
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
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "MinScaleResolution", this.MinScaleResolution);
        this.setParamSimple(map, prefix + "AutoHandleUnsupportedElement", this.AutoHandleUnsupportedElement);

    }
}

