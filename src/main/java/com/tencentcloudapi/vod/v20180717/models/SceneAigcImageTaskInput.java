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

public class SceneAigcImageTaskInput extends AbstractModel {

    /**
    * Scenario-based Image Generation Parameter Configuration.
    */
    @SerializedName("SceneInfo")
    @Expose
    private AigcImageSceneInfo SceneInfo;

    /**
    * File information of the input image.
    */
    @SerializedName("FileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] FileInfos;

    /**
    * Output media file configuration for the task.
    */
    @SerializedName("OutputConfig")
    @Expose
    private SceneAigcImageOutputConfig OutputConfig;

    /**
     * Get Scenario-based Image Generation Parameter Configuration. 
     * @return SceneInfo Scenario-based Image Generation Parameter Configuration.
     */
    public AigcImageSceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set Scenario-based Image Generation Parameter Configuration.
     * @param SceneInfo Scenario-based Image Generation Parameter Configuration.
     */
    public void setSceneInfo(AigcImageSceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Get File information of the input image. 
     * @return FileInfos File information of the input image.
     */
    public SceneAigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set File information of the input image.
     * @param FileInfos File information of the input image.
     */
    public void setFileInfos(SceneAigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Output media file configuration for the task. 
     * @return OutputConfig Output media file configuration for the task.
     */
    public SceneAigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Output media file configuration for the task.
     * @param OutputConfig Output media file configuration for the task.
     */
    public void setOutputConfig(SceneAigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public SceneAigcImageTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageTaskInput(SceneAigcImageTaskInput source) {
        if (source.SceneInfo != null) {
            this.SceneInfo = new AigcImageSceneInfo(source.SceneInfo);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new SceneAigcImageTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new SceneAigcImageTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new SceneAigcImageOutputConfig(source.OutputConfig);
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

