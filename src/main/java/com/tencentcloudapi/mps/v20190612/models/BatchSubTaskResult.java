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

public class BatchSubTaskResult extends AbstractModel {

    /**
    * 
    */
    @SerializedName("InputInfos")
    @Expose
    private MediaInputInfo [] InputInfos;

    /**
    * 
    */
    @SerializedName("Metadatas")
    @Expose
    private MediaMetaData [] Metadatas;

    /**
    * 
    */
    @SerializedName("SmartSubtitlesTaskResult")
    @Expose
    private BatchSmartSubtitlesResult SmartSubtitlesTaskResult;

    /**
     * Get  
     * @return InputInfos 
     */
    public MediaInputInfo [] getInputInfos() {
        return this.InputInfos;
    }

    /**
     * Set 
     * @param InputInfos 
     */
    public void setInputInfos(MediaInputInfo [] InputInfos) {
        this.InputInfos = InputInfos;
    }

    /**
     * Get  
     * @return Metadatas 
     */
    public MediaMetaData [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set 
     * @param Metadatas 
     */
    public void setMetadatas(MediaMetaData [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    /**
     * Get  
     * @return SmartSubtitlesTaskResult 
     */
    public BatchSmartSubtitlesResult getSmartSubtitlesTaskResult() {
        return this.SmartSubtitlesTaskResult;
    }

    /**
     * Set 
     * @param SmartSubtitlesTaskResult 
     */
    public void setSmartSubtitlesTaskResult(BatchSmartSubtitlesResult SmartSubtitlesTaskResult) {
        this.SmartSubtitlesTaskResult = SmartSubtitlesTaskResult;
    }

    public BatchSubTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchSubTaskResult(BatchSubTaskResult source) {
        if (source.InputInfos != null) {
            this.InputInfos = new MediaInputInfo[source.InputInfos.length];
            for (int i = 0; i < source.InputInfos.length; i++) {
                this.InputInfos[i] = new MediaInputInfo(source.InputInfos[i]);
            }
        }
        if (source.Metadatas != null) {
            this.Metadatas = new MediaMetaData[source.Metadatas.length];
            for (int i = 0; i < source.Metadatas.length; i++) {
                this.Metadatas[i] = new MediaMetaData(source.Metadatas[i]);
            }
        }
        if (source.SmartSubtitlesTaskResult != null) {
            this.SmartSubtitlesTaskResult = new BatchSmartSubtitlesResult(source.SmartSubtitlesTaskResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InputInfos.", this.InputInfos);
        this.setParamArrayObj(map, prefix + "Metadatas.", this.Metadatas);
        this.setParamObj(map, prefix + "SmartSubtitlesTaskResult.", this.SmartSubtitlesTaskResult);

    }
}

