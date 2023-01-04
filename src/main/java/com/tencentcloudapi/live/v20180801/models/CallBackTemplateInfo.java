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

public class CallBackTemplateInfo extends AbstractModel{

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Stream starting callback URL.
    */
    @SerializedName("StreamBeginNotifyUrl")
    @Expose
    private String StreamBeginNotifyUrl;

    /**
    * Stream mixing callback URL (disused)
    */
    @SerializedName("StreamMixNotifyUrl")
    @Expose
    private String StreamMixNotifyUrl;

    /**
    * Interruption callback URL.
    */
    @SerializedName("StreamEndNotifyUrl")
    @Expose
    private String StreamEndNotifyUrl;

    /**
    * Recording callback URL.
    */
    @SerializedName("RecordNotifyUrl")
    @Expose
    private String RecordNotifyUrl;

    /**
    * Screencapturing callback URL.
    */
    @SerializedName("SnapshotNotifyUrl")
    @Expose
    private String SnapshotNotifyUrl;

    /**
    * Porn detection callback URL.
    */
    @SerializedName("PornCensorshipNotifyUrl")
    @Expose
    private String PornCensorshipNotifyUrl;

    /**
    * Callback authentication key.
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * The push error callback URL.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PushExceptionNotifyUrl")
    @Expose
    private String PushExceptionNotifyUrl;

    /**
     * Get Template ID. 
     * @return TemplateId Template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID.
     * @param TemplateId Template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Template name. 
     * @return TemplateName Template name.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name.
     * @param TemplateName Template name.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Stream starting callback URL. 
     * @return StreamBeginNotifyUrl Stream starting callback URL.
     */
    public String getStreamBeginNotifyUrl() {
        return this.StreamBeginNotifyUrl;
    }

    /**
     * Set Stream starting callback URL.
     * @param StreamBeginNotifyUrl Stream starting callback URL.
     */
    public void setStreamBeginNotifyUrl(String StreamBeginNotifyUrl) {
        this.StreamBeginNotifyUrl = StreamBeginNotifyUrl;
    }

    /**
     * Get Stream mixing callback URL (disused) 
     * @return StreamMixNotifyUrl Stream mixing callback URL (disused)
     */
    public String getStreamMixNotifyUrl() {
        return this.StreamMixNotifyUrl;
    }

    /**
     * Set Stream mixing callback URL (disused)
     * @param StreamMixNotifyUrl Stream mixing callback URL (disused)
     */
    public void setStreamMixNotifyUrl(String StreamMixNotifyUrl) {
        this.StreamMixNotifyUrl = StreamMixNotifyUrl;
    }

    /**
     * Get Interruption callback URL. 
     * @return StreamEndNotifyUrl Interruption callback URL.
     */
    public String getStreamEndNotifyUrl() {
        return this.StreamEndNotifyUrl;
    }

    /**
     * Set Interruption callback URL.
     * @param StreamEndNotifyUrl Interruption callback URL.
     */
    public void setStreamEndNotifyUrl(String StreamEndNotifyUrl) {
        this.StreamEndNotifyUrl = StreamEndNotifyUrl;
    }

    /**
     * Get Recording callback URL. 
     * @return RecordNotifyUrl Recording callback URL.
     */
    public String getRecordNotifyUrl() {
        return this.RecordNotifyUrl;
    }

    /**
     * Set Recording callback URL.
     * @param RecordNotifyUrl Recording callback URL.
     */
    public void setRecordNotifyUrl(String RecordNotifyUrl) {
        this.RecordNotifyUrl = RecordNotifyUrl;
    }

    /**
     * Get Screencapturing callback URL. 
     * @return SnapshotNotifyUrl Screencapturing callback URL.
     */
    public String getSnapshotNotifyUrl() {
        return this.SnapshotNotifyUrl;
    }

    /**
     * Set Screencapturing callback URL.
     * @param SnapshotNotifyUrl Screencapturing callback URL.
     */
    public void setSnapshotNotifyUrl(String SnapshotNotifyUrl) {
        this.SnapshotNotifyUrl = SnapshotNotifyUrl;
    }

    /**
     * Get Porn detection callback URL. 
     * @return PornCensorshipNotifyUrl Porn detection callback URL.
     */
    public String getPornCensorshipNotifyUrl() {
        return this.PornCensorshipNotifyUrl;
    }

    /**
     * Set Porn detection callback URL.
     * @param PornCensorshipNotifyUrl Porn detection callback URL.
     */
    public void setPornCensorshipNotifyUrl(String PornCensorshipNotifyUrl) {
        this.PornCensorshipNotifyUrl = PornCensorshipNotifyUrl;
    }

    /**
     * Get Callback authentication key. 
     * @return CallbackKey Callback authentication key.
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set Callback authentication key.
     * @param CallbackKey Callback authentication key.
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get The push error callback URL.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PushExceptionNotifyUrl The push error callback URL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPushExceptionNotifyUrl() {
        return this.PushExceptionNotifyUrl;
    }

    /**
     * Set The push error callback URL.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PushExceptionNotifyUrl The push error callback URL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPushExceptionNotifyUrl(String PushExceptionNotifyUrl) {
        this.PushExceptionNotifyUrl = PushExceptionNotifyUrl;
    }

    public CallBackTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallBackTemplateInfo(CallBackTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StreamBeginNotifyUrl != null) {
            this.StreamBeginNotifyUrl = new String(source.StreamBeginNotifyUrl);
        }
        if (source.StreamMixNotifyUrl != null) {
            this.StreamMixNotifyUrl = new String(source.StreamMixNotifyUrl);
        }
        if (source.StreamEndNotifyUrl != null) {
            this.StreamEndNotifyUrl = new String(source.StreamEndNotifyUrl);
        }
        if (source.RecordNotifyUrl != null) {
            this.RecordNotifyUrl = new String(source.RecordNotifyUrl);
        }
        if (source.SnapshotNotifyUrl != null) {
            this.SnapshotNotifyUrl = new String(source.SnapshotNotifyUrl);
        }
        if (source.PornCensorshipNotifyUrl != null) {
            this.PornCensorshipNotifyUrl = new String(source.PornCensorshipNotifyUrl);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.PushExceptionNotifyUrl != null) {
            this.PushExceptionNotifyUrl = new String(source.PushExceptionNotifyUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StreamBeginNotifyUrl", this.StreamBeginNotifyUrl);
        this.setParamSimple(map, prefix + "StreamMixNotifyUrl", this.StreamMixNotifyUrl);
        this.setParamSimple(map, prefix + "StreamEndNotifyUrl", this.StreamEndNotifyUrl);
        this.setParamSimple(map, prefix + "RecordNotifyUrl", this.RecordNotifyUrl);
        this.setParamSimple(map, prefix + "SnapshotNotifyUrl", this.SnapshotNotifyUrl);
        this.setParamSimple(map, prefix + "PornCensorshipNotifyUrl", this.PornCensorshipNotifyUrl);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "PushExceptionNotifyUrl", this.PushExceptionNotifyUrl);

    }
}

