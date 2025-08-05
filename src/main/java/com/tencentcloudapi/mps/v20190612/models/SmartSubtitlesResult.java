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

public class SmartSubtitlesResult extends AbstractModel {

    /**
    * Task type. Valid values:
<li>AsrFullTextRecognition: full speech recognition</li>
<li>TransTextRecognition: speech translation</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private SmartSubtitleTaskAsrFullTextResult AsrFullTextTask;

    /**
    * Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TransTextTask")
    @Expose
    private SmartSubtitleTaskTransTextResult TransTextTask;

    /**
     * Get Task type. Valid values:
<li>AsrFullTextRecognition: full speech recognition</li>
<li>TransTextRecognition: speech translation</li> 
     * @return Type Task type. Valid values:
<li>AsrFullTextRecognition: full speech recognition</li>
<li>TransTextRecognition: speech translation</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values:
<li>AsrFullTextRecognition: full speech recognition</li>
<li>TransTextRecognition: speech translation</li>
     * @param Type Task type. Valid values:
<li>AsrFullTextRecognition: full speech recognition</li>
<li>TransTextRecognition: speech translation</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AsrFullTextTask Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartSubtitleTaskAsrFullTextResult getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AsrFullTextTask Full speech recognition result. When Type is
 set to AsrFullTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAsrFullTextTask(SmartSubtitleTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TransTextTask Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartSubtitleTaskTransTextResult getTransTextTask() {
        return this.TransTextTask;
    }

    /**
     * Set Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TransTextTask Translation result. When Type is

 set to TransTextRecognition, this parameter takes effect.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTransTextTask(SmartSubtitleTaskTransTextResult TransTextTask) {
        this.TransTextTask = TransTextTask;
    }

    public SmartSubtitlesResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitlesResult(SmartSubtitlesResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AsrFullTextTask != null) {
            this.AsrFullTextTask = new SmartSubtitleTaskAsrFullTextResult(source.AsrFullTextTask);
        }
        if (source.TransTextTask != null) {
            this.TransTextTask = new SmartSubtitleTaskTransTextResult(source.TransTextTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "AsrFullTextTask.", this.AsrFullTextTask);
        this.setParamObj(map, prefix + "TransTextTask.", this.TransTextTask);

    }
}

