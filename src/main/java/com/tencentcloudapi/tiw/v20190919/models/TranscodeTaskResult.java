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

public class TranscodeTaskResult extends AbstractModel{

    /**
    * Transcoding result URL.
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * Target resolution.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Title (usually the document name).
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Number of transcoded pages.
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * URL prefix of the thumbnail. If the URL prefix is `http://example.com/g0jb42ps49vtebjshilb/`, the thumbnail URL for the first page of the dynamically transcoded PowerPoint file is
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`, and so on.

If the document transcoding request carries the ThumbnailResolution parameter and the transcoding type is dynamic transcoding, this parameter is not null. In other cases, this parameter is null.
    */
    @SerializedName("ThumbnailUrl")
    @Expose
    private String ThumbnailUrl;

    /**
    * Resolution of the thumbnail generated for dynamic transcoding
    */
    @SerializedName("ThumbnailResolution")
    @Expose
    private String ThumbnailResolution;

    /**
    * URL for downloading the transcoded and compressed file. If `CompressFileType` carried in the document transcoding request is null or is not a supported compression format, this parameter is null.
    */
    @SerializedName("CompressFileUrl")
    @Expose
    private String CompressFileUrl;

    /**
    * Task execution error code.
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Task execution error message.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get Transcoding result URL. 
     * @return ResultUrl Transcoding result URL.
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set Transcoding result URL.
     * @param ResultUrl Transcoding result URL.
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
    }

    /**
     * Get Target resolution. 
     * @return Resolution Target resolution.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Target resolution.
     * @param Resolution Target resolution.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Title (usually the document name). 
     * @return Title Title (usually the document name).
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Title (usually the document name).
     * @param Title Title (usually the document name).
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Number of transcoded pages. 
     * @return Pages Number of transcoded pages.
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set Number of transcoded pages.
     * @param Pages Number of transcoded pages.
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get URL prefix of the thumbnail. If the URL prefix is `http://example.com/g0jb42ps49vtebjshilb/`, the thumbnail URL for the first page of the dynamically transcoded PowerPoint file is
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`, and so on.

If the document transcoding request carries the ThumbnailResolution parameter and the transcoding type is dynamic transcoding, this parameter is not null. In other cases, this parameter is null. 
     * @return ThumbnailUrl URL prefix of the thumbnail. If the URL prefix is `http://example.com/g0jb42ps49vtebjshilb/`, the thumbnail URL for the first page of the dynamically transcoded PowerPoint file is
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`, and so on.

If the document transcoding request carries the ThumbnailResolution parameter and the transcoding type is dynamic transcoding, this parameter is not null. In other cases, this parameter is null.
     */
    public String getThumbnailUrl() {
        return this.ThumbnailUrl;
    }

    /**
     * Set URL prefix of the thumbnail. If the URL prefix is `http://example.com/g0jb42ps49vtebjshilb/`, the thumbnail URL for the first page of the dynamically transcoded PowerPoint file is
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`, and so on.

If the document transcoding request carries the ThumbnailResolution parameter and the transcoding type is dynamic transcoding, this parameter is not null. In other cases, this parameter is null.
     * @param ThumbnailUrl URL prefix of the thumbnail. If the URL prefix is `http://example.com/g0jb42ps49vtebjshilb/`, the thumbnail URL for the first page of the dynamically transcoded PowerPoint file is
`http://example.com/g0jb42ps49vtebjshilb/1.jpg`, and so on.

If the document transcoding request carries the ThumbnailResolution parameter and the transcoding type is dynamic transcoding, this parameter is not null. In other cases, this parameter is null.
     */
    public void setThumbnailUrl(String ThumbnailUrl) {
        this.ThumbnailUrl = ThumbnailUrl;
    }

    /**
     * Get Resolution of the thumbnail generated for dynamic transcoding 
     * @return ThumbnailResolution Resolution of the thumbnail generated for dynamic transcoding
     */
    public String getThumbnailResolution() {
        return this.ThumbnailResolution;
    }

    /**
     * Set Resolution of the thumbnail generated for dynamic transcoding
     * @param ThumbnailResolution Resolution of the thumbnail generated for dynamic transcoding
     */
    public void setThumbnailResolution(String ThumbnailResolution) {
        this.ThumbnailResolution = ThumbnailResolution;
    }

    /**
     * Get URL for downloading the transcoded and compressed file. If `CompressFileType` carried in the document transcoding request is null or is not a supported compression format, this parameter is null. 
     * @return CompressFileUrl URL for downloading the transcoded and compressed file. If `CompressFileType` carried in the document transcoding request is null or is not a supported compression format, this parameter is null.
     */
    public String getCompressFileUrl() {
        return this.CompressFileUrl;
    }

    /**
     * Set URL for downloading the transcoded and compressed file. If `CompressFileType` carried in the document transcoding request is null or is not a supported compression format, this parameter is null.
     * @param CompressFileUrl URL for downloading the transcoded and compressed file. If `CompressFileType` carried in the document transcoding request is null or is not a supported compression format, this parameter is null.
     */
    public void setCompressFileUrl(String CompressFileUrl) {
        this.CompressFileUrl = CompressFileUrl;
    }

    /**
     * Get Task execution error code. 
     * @return ErrorCode Task execution error code.
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Task execution error code.
     * @param ErrorCode Task execution error code.
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Task execution error message. 
     * @return ErrorMsg Task execution error message.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Task execution error message.
     * @param ErrorMsg Task execution error message.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public TranscodeTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTaskResult(TranscodeTaskResult source) {
        if (source.ResultUrl != null) {
            this.ResultUrl = new String(source.ResultUrl);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.ThumbnailUrl != null) {
            this.ThumbnailUrl = new String(source.ThumbnailUrl);
        }
        if (source.ThumbnailResolution != null) {
            this.ThumbnailResolution = new String(source.ThumbnailResolution);
        }
        if (source.CompressFileUrl != null) {
            this.CompressFileUrl = new String(source.CompressFileUrl);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "ThumbnailUrl", this.ThumbnailUrl);
        this.setParamSimple(map, prefix + "ThumbnailResolution", this.ThumbnailResolution);
        this.setParamSimple(map, prefix + "CompressFileUrl", this.CompressFileUrl);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

