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

public class AigcVideoRedrawTaskInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileInfo")
    @Expose
    private AigcVideoRedrawTaskInputFileInfo FileInfo;

    /**
    * 
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcVideoRedrawOutputConfig OutputConfig;

    /**
     * Get  
     * @return FileInfo 
     */
    public AigcVideoRedrawTaskInputFileInfo getFileInfo() {
        return this.FileInfo;
    }

    /**
     * Set 
     * @param FileInfo 
     */
    public void setFileInfo(AigcVideoRedrawTaskInputFileInfo FileInfo) {
        this.FileInfo = FileInfo;
    }

    /**
     * Get  
     * @return OutputConfig 
     */
    public AigcVideoRedrawOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 
     * @param OutputConfig 
     */
    public void setOutputConfig(AigcVideoRedrawOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public AigcVideoRedrawTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoRedrawTaskInput(AigcVideoRedrawTaskInput source) {
        if (source.FileInfo != null) {
            this.FileInfo = new AigcVideoRedrawTaskInputFileInfo(source.FileInfo);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcVideoRedrawOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FileInfo.", this.FileInfo);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

