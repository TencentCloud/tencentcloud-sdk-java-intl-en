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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageSpriteTask2017 extends AbstractModel{

    /**
    * Image sprite generating task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * ID of generated image sprite file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Image sprite specification. For more information, please see [Image Sprite Generating Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Total number of subimages in image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Address of output image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageSpriteUrlSet")
    @Expose
    private String [] ImageSpriteUrlSet;

    /**
    * Address of WebVtt file for the position-time relationship among subimages in an image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebVttUrl")
    @Expose
    private String WebVttUrl;

    /**
     * Get Image sprite generating task ID. 
     * @return TaskId Image sprite generating task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Image sprite generating task ID.
     * @param TaskId Image sprite generating task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Message Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Message Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get ID of generated image sprite file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileId ID of generated image sprite file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set ID of generated image sprite file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileId ID of generated image sprite file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Image sprite specification. For more information, please see [Image Sprite Generating Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Definition Image sprite specification. For more information, please see [Image Sprite Generating Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Image sprite specification. For more information, please see [Image Sprite Generating Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Definition Image sprite specification. For more information, please see [Image Sprite Generating Template](https://cloud.tencent.com/document/product/266/33480#.E9.9B.AA.E7.A2.A7.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Total number of subimages in image sprite.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of subimages in image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of subimages in image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of subimages in image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Address of output image sprite.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ImageSpriteUrlSet Address of output image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getImageSpriteUrlSet() {
        return this.ImageSpriteUrlSet;
    }

    /**
     * Set Address of output image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ImageSpriteUrlSet Address of output image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setImageSpriteUrlSet(String [] ImageSpriteUrlSet) {
        this.ImageSpriteUrlSet = ImageSpriteUrlSet;
    }

    /**
     * Get Address of WebVtt file for the position-time relationship among subimages in an image sprite.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WebVttUrl Address of WebVtt file for the position-time relationship among subimages in an image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getWebVttUrl() {
        return this.WebVttUrl;
    }

    /**
     * Set Address of WebVtt file for the position-time relationship among subimages in an image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WebVttUrl Address of WebVtt file for the position-time relationship among subimages in an image sprite.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWebVttUrl(String WebVttUrl) {
        this.WebVttUrl = WebVttUrl;
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

