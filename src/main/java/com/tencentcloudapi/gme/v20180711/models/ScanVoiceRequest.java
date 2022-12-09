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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanVoiceRequest extends AbstractModel{

    /**
    * Application ID, which is obtained when you create an application in the [GME console - Service Management](https://console.cloud.tencent.com/gamegme).
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * Voice detection scenario. It must be `default`. See the <a href="#Label_Value">Label description</a> as the result.
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * Whether it is a live stream. Values: `false` (voice file), `true` (live stream).
    */
    @SerializedName("Live")
    @Expose
    private Boolean Live;

    /**
    * Voice detection task list. Up to 100 tasks can be added in the list. 
<li>`DataId`: Unique data ID</li>
<li>`Url`: URL-encoded data file URL, which is a pull address if the detected voice is a stream</li>
    */
    @SerializedName("Tasks")
    @Expose
    private Task [] Tasks;

    /**
    * Async callback address for detection result. For more information, please see the <a href="#Callback_Declare">Callback description</a> above. (Note: If this field is empty, the detection result can only be queried by calling the `DescribeScanResultList` API.)
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * Language. Chinese will be used if it is left empty.
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
     * Get Application ID, which is obtained when you create an application in the [GME console - Service Management](https://console.cloud.tencent.com/gamegme). 
     * @return BizId Application ID, which is obtained when you create an application in the [GME console - Service Management](https://console.cloud.tencent.com/gamegme).
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Application ID, which is obtained when you create an application in the [GME console - Service Management](https://console.cloud.tencent.com/gamegme).
     * @param BizId Application ID, which is obtained when you create an application in the [GME console - Service Management](https://console.cloud.tencent.com/gamegme).
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get Voice detection scenario. It must be `default`. See the <a href="#Label_Value">Label description</a> as the result. 
     * @return Scenes Voice detection scenario. It must be `default`. See the <a href="#Label_Value">Label description</a> as the result.
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set Voice detection scenario. It must be `default`. See the <a href="#Label_Value">Label description</a> as the result.
     * @param Scenes Voice detection scenario. It must be `default`. See the <a href="#Label_Value">Label description</a> as the result.
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get Whether it is a live stream. Values: `false` (voice file), `true` (live stream). 
     * @return Live Whether it is a live stream. Values: `false` (voice file), `true` (live stream).
     */
    public Boolean getLive() {
        return this.Live;
    }

    /**
     * Set Whether it is a live stream. Values: `false` (voice file), `true` (live stream).
     * @param Live Whether it is a live stream. Values: `false` (voice file), `true` (live stream).
     */
    public void setLive(Boolean Live) {
        this.Live = Live;
    }

    /**
     * Get Voice detection task list. Up to 100 tasks can be added in the list. 
<li>`DataId`: Unique data ID</li>
<li>`Url`: URL-encoded data file URL, which is a pull address if the detected voice is a stream</li> 
     * @return Tasks Voice detection task list. Up to 100 tasks can be added in the list. 
<li>`DataId`: Unique data ID</li>
<li>`Url`: URL-encoded data file URL, which is a pull address if the detected voice is a stream</li>
     */
    public Task [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Voice detection task list. Up to 100 tasks can be added in the list. 
<li>`DataId`: Unique data ID</li>
<li>`Url`: URL-encoded data file URL, which is a pull address if the detected voice is a stream</li>
     * @param Tasks Voice detection task list. Up to 100 tasks can be added in the list. 
<li>`DataId`: Unique data ID</li>
<li>`Url`: URL-encoded data file URL, which is a pull address if the detected voice is a stream</li>
     */
    public void setTasks(Task [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Async callback address for detection result. For more information, please see the <a href="#Callback_Declare">Callback description</a> above. (Note: If this field is empty, the detection result can only be queried by calling the `DescribeScanResultList` API.) 
     * @return Callback Async callback address for detection result. For more information, please see the <a href="#Callback_Declare">Callback description</a> above. (Note: If this field is empty, the detection result can only be queried by calling the `DescribeScanResultList` API.)
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set Async callback address for detection result. For more information, please see the <a href="#Callback_Declare">Callback description</a> above. (Note: If this field is empty, the detection result can only be queried by calling the `DescribeScanResultList` API.)
     * @param Callback Async callback address for detection result. For more information, please see the <a href="#Callback_Declare">Callback description</a> above. (Note: If this field is empty, the detection result can only be queried by calling the `DescribeScanResultList` API.)
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get Language. Chinese will be used if it is left empty. 
     * @return Lang Language. Chinese will be used if it is left empty.
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set Language. Chinese will be used if it is left empty.
     * @param Lang Language. Chinese will be used if it is left empty.
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    public ScanVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanVoiceRequest(ScanVoiceRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.Scenes != null) {
            this.Scenes = new String[source.Scenes.length];
            for (int i = 0; i < source.Scenes.length; i++) {
                this.Scenes[i] = new String(source.Scenes[i]);
            }
        }
        if (source.Live != null) {
            this.Live = new Boolean(source.Live);
        }
        if (source.Tasks != null) {
            this.Tasks = new Task[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new Task(source.Tasks[i]);
            }
        }
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);
        this.setParamSimple(map, prefix + "Live", this.Live);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "Lang", this.Lang);

    }
}

