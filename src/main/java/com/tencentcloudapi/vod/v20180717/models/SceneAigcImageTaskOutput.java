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

public class SceneAigcImageTaskOutput extends AbstractModel {

    /**
    * File information of the out image for the AIGC image generation task.
    */
    @SerializedName("FileInfos")
    @Expose
    private SceneAigcImageTaskOutputFileInfo [] FileInfos;

    /**
     * Get File information of the out image for the AIGC image generation task. 
     * @return FileInfos File information of the out image for the AIGC image generation task.
     */
    public SceneAigcImageTaskOutputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set File information of the out image for the AIGC image generation task.
     * @param FileInfos File information of the out image for the AIGC image generation task.
     */
    public void setFileInfos(SceneAigcImageTaskOutputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    public SceneAigcImageTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageTaskOutput(SceneAigcImageTaskOutput source) {
        if (source.FileInfos != null) {
            this.FileInfos = new SceneAigcImageTaskOutputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new SceneAigcImageTaskOutputFileInfo(source.FileInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);

    }
}

