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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveCallbackTemplateRequest extends AbstractModel{

    /**
    * Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Stream starting callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
    */
    @SerializedName("StreamBeginNotifyUrl")
    @Expose
    private String StreamBeginNotifyUrl;

    /**
    * Interruption callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
    */
    @SerializedName("StreamEndNotifyUrl")
    @Expose
    private String StreamEndNotifyUrl;

    /**
    * Recording callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
    */
    @SerializedName("RecordNotifyUrl")
    @Expose
    private String RecordNotifyUrl;

    /**
    * Screencapturing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
    */
    @SerializedName("SnapshotNotifyUrl")
    @Expose
    private String SnapshotNotifyUrl;

    /**
    * Porn detection callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32741?from_cn_redirect=1).
    */
    @SerializedName("PornCensorshipNotifyUrl")
    @Expose
    private String PornCensorshipNotifyUrl;

    /**
    * Callback key. The callback URL is public. For the callback signature, please see the event message notification document.
[Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * Stream mixing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
    */
    @SerializedName("StreamMixNotifyUrl")
    @Expose
    private String StreamMixNotifyUrl;

    /**
     * Get Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained. 
     * @return TemplateName Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     * @param TemplateName Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained. 
     * @return Description Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     * @param Description Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Stream starting callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1). 
     * @return StreamBeginNotifyUrl Stream starting callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public String getStreamBeginNotifyUrl() {
        return this.StreamBeginNotifyUrl;
    }

    /**
     * Set Stream starting callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     * @param StreamBeginNotifyUrl Stream starting callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public void setStreamBeginNotifyUrl(String StreamBeginNotifyUrl) {
        this.StreamBeginNotifyUrl = StreamBeginNotifyUrl;
    }

    /**
     * Get Interruption callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1). 
     * @return StreamEndNotifyUrl Interruption callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public String getStreamEndNotifyUrl() {
        return this.StreamEndNotifyUrl;
    }

    /**
     * Set Interruption callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     * @param StreamEndNotifyUrl Interruption callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public void setStreamEndNotifyUrl(String StreamEndNotifyUrl) {
        this.StreamEndNotifyUrl = StreamEndNotifyUrl;
    }

    /**
     * Get Recording callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1). 
     * @return RecordNotifyUrl Recording callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public String getRecordNotifyUrl() {
        return this.RecordNotifyUrl;
    }

    /**
     * Set Recording callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     * @param RecordNotifyUrl Recording callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public void setRecordNotifyUrl(String RecordNotifyUrl) {
        this.RecordNotifyUrl = RecordNotifyUrl;
    }

    /**
     * Get Screencapturing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1). 
     * @return SnapshotNotifyUrl Screencapturing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public String getSnapshotNotifyUrl() {
        return this.SnapshotNotifyUrl;
    }

    /**
     * Set Screencapturing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     * @param SnapshotNotifyUrl Screencapturing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public void setSnapshotNotifyUrl(String SnapshotNotifyUrl) {
        this.SnapshotNotifyUrl = SnapshotNotifyUrl;
    }

    /**
     * Get Porn detection callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32741?from_cn_redirect=1). 
     * @return PornCensorshipNotifyUrl Porn detection callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32741?from_cn_redirect=1).
     */
    public String getPornCensorshipNotifyUrl() {
        return this.PornCensorshipNotifyUrl;
    }

    /**
     * Set Porn detection callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32741?from_cn_redirect=1).
     * @param PornCensorshipNotifyUrl Porn detection callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32741?from_cn_redirect=1).
     */
    public void setPornCensorshipNotifyUrl(String PornCensorshipNotifyUrl) {
        this.PornCensorshipNotifyUrl = PornCensorshipNotifyUrl;
    }

    /**
     * Get Callback key. The callback URL is public. For the callback signature, please see the event message notification document.
[Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1). 
     * @return CallbackKey Callback key. The callback URL is public. For the callback signature, please see the event message notification document.
[Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set Callback key. The callback URL is public. For the callback signature, please see the event message notification document.
[Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     * @param CallbackKey Callback key. The callback URL is public. For the callback signature, please see the event message notification document.
[Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get Stream mixing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1). 
     * @return StreamMixNotifyUrl Stream mixing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public String getStreamMixNotifyUrl() {
        return this.StreamMixNotifyUrl;
    }

    /**
     * Set Stream mixing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     * @param StreamMixNotifyUrl Stream mixing callback URL,
Protocol document: [Event Message Notification](https://intl.cloud.tencent.com/document/product/267/32744?from_cn_redirect=1).
     */
    public void setStreamMixNotifyUrl(String StreamMixNotifyUrl) {
        this.StreamMixNotifyUrl = StreamMixNotifyUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StreamBeginNotifyUrl", this.StreamBeginNotifyUrl);
        this.setParamSimple(map, prefix + "StreamEndNotifyUrl", this.StreamEndNotifyUrl);
        this.setParamSimple(map, prefix + "RecordNotifyUrl", this.RecordNotifyUrl);
        this.setParamSimple(map, prefix + "SnapshotNotifyUrl", this.SnapshotNotifyUrl);
        this.setParamSimple(map, prefix + "PornCensorshipNotifyUrl", this.PornCensorshipNotifyUrl);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "StreamMixNotifyUrl", this.StreamMixNotifyUrl);

    }
}

