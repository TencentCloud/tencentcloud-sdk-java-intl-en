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

public class SceneAigcVideoTaskInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SceneInfo")
    @Expose
    private AigcVideoSceneInfo SceneInfo;

    /**
    * 
    */
    @SerializedName("FileInfos")
    @Expose
    private SceneAigcVideoTaskInputFileInfo [] FileInfos;

    /**
    * 
    */
    @SerializedName("OutputConfig")
    @Expose
    private SceneAigcVideoOutputConfig OutputConfig;

    /**
     * Get  
     * @return SceneInfo 
     */
    public AigcVideoSceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set 
     * @param SceneInfo 
     */
    public void setSceneInfo(AigcVideoSceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Get  
     * @return FileInfos 
     */
    public SceneAigcVideoTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 
     * @param FileInfos 
     */
    public void setFileInfos(SceneAigcVideoTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get  
     * @return OutputConfig 
     */
    public SceneAigcVideoOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 
     * @param OutputConfig 
     */
    public void setOutputConfig(SceneAigcVideoOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public SceneAigcVideoTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcVideoTaskInput(SceneAigcVideoTaskInput source) {
        if (source.SceneInfo != null) {
            this.SceneInfo = new AigcVideoSceneInfo(source.SceneInfo);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new SceneAigcVideoTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new SceneAigcVideoTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new SceneAigcVideoOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SceneInfo.", this.SceneInfo);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

