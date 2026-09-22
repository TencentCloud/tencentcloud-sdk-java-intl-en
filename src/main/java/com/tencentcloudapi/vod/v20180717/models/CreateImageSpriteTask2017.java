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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageSpriteTask2017 extends AbstractModel {

    /**
    * <p>Screenshot image sprite task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Error code</p><li>0: Successful;</li><li>Other values: Failed.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>Error message.</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>Capture the file ID of CSS sprites.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Image sprite specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">image sprite screenshot template</a>.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Total number of small images in the sprite sheet.</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Capture the domain names or IP addresses output by CSS sprites.</p>
    */
    @SerializedName("ImageSpriteUrlSet")
    @Expose
    private String [] ImageSpriteUrlSet;

    /**
    * <p>Sprite sheet sub-image position and temporal relationship WebVtt file address.</p>
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * Get <p>Screenshot image sprite task ID.</p> 
     * @return TaskId <p>Screenshot image sprite task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Screenshot image sprite task ID.</p>
     * @param TaskId <p>Screenshot image sprite task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Error code</p><li>0: Successful;</li><li>Other values: Failed.</li> 
     * @return ErrCode <p>Error code</p><li>0: Successful;</li><li>Other values: Failed.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code</p><li>0: Successful;</li><li>Other values: Failed.</li>
     * @param ErrCode <p>Error code</p><li>0: Successful;</li><li>Other values: Failed.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Error message.</p> 
     * @return Message <p>Error message.</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Error message.</p>
     * @param Message <p>Error message.</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>Capture the file ID of CSS sprites.</p> 
     * @return FileId <p>Capture the file ID of CSS sprites.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Capture the file ID of CSS sprites.</p>
     * @param FileId <p>Capture the file ID of CSS sprites.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Image sprite specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">image sprite screenshot template</a>.</p> 
     * @return Definition <p>Image sprite specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">image sprite screenshot template</a>.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Image sprite specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">image sprite screenshot template</a>.</p>
     * @param Definition <p>Image sprite specification. See <a href="https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF">image sprite screenshot template</a>.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Total number of small images in the sprite sheet.</p> 
     * @return TotalCount <p>Total number of small images in the sprite sheet.</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total number of small images in the sprite sheet.</p>
     * @param TotalCount <p>Total number of small images in the sprite sheet.</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Capture the domain names or IP addresses output by CSS sprites.</p> 
     * @return ImageSpriteUrlSet <p>Capture the domain names or IP addresses output by CSS sprites.</p>
     */
    public String [] getImageSpriteUrlSet() {
        return this.ImageSpriteUrlSet;
    }

    /**
     * Set <p>Capture the domain names or IP addresses output by CSS sprites.</p>
     * @param ImageSpriteUrlSet <p>Capture the domain names or IP addresses output by CSS sprites.</p>
     */
    public void setImageSpriteUrlSet(String [] ImageSpriteUrlSet) {
        this.ImageSpriteUrlSet = ImageSpriteUrlSet;
    }

    /**
     * Get <p>Sprite sheet sub-image position and temporal relationship WebVtt file address.</p> 
     * @return WebVttUrl <p>Sprite sheet sub-image position and temporal relationship WebVtt file address.</p>
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * Set <p>Sprite sheet sub-image position and temporal relationship WebVtt file address.</p>
     * @param WebVttUrl <p>Sprite sheet sub-image position and temporal relationship WebVtt file address.</p>
     */
    public void setWebVttUrl(String WebVttUrl) {
        this.WebVttUrl = WebVttUrl;
    }

    public CreateImageSpriteTask2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageSpriteTask2017(CreateImageSpriteTask2017 source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ImageSpriteUrlSet != null) {
            this.ImageSpriteUrlSet = new String[source.ImageSpriteUrlSet.length];
            for (int i = 0; i < source.ImageSpriteUrlSet.length; i++) {
                this.ImageSpriteUrlSet[i] = new String(source.ImageSpriteUrlSet[i]);
            }
        }
        if (source.WebVttUrl != null) {
            this.WebVttUrl = new String(source.WebVttUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "ImageSpriteUrlSet.", this.ImageSpriteUrlSet);
        this.setParamSimple(map, prefix + "WebVttUrl", this.WebVttUrl);

    }
}

